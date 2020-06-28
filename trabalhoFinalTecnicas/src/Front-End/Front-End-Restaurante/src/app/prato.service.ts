import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Observable, of } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';

import { Prato } from './prato';
import { MessageService } from './message.service';

@Injectable({ providedIn: 'root' })
export class PratoService {

    private pratosUrl = 'api/pratos';

    httpOptions = {
        headers: new HttpHeaders({ 'Content-Type': 'application/json' })
      };

    constructor (private http: HttpClient, private messageService: MessageService) { }


    getPratos(): Observable<Prato[]> {
        return this.http.get < Prato[] > (this.pratosUrl)
        .pipe(
            tap(_ => this.log('fetched pratos')),
        catchError(this.handleError<Prato[]>('getPratos', []))
        );
    }

    searchPratos(term: string): Observable<Prato[]> {
        if (!term.trim()) {
        
          return of([]);
        }
        ///Troquei name por nome
        return this.http.get<Prato[]>(`${this.pratosUrl}/?nome=${term}`)
        .pipe(
          tap(x => x.length ?
             this.log(`found pratos matching "${term}"`) :
             this.log(`no pratos matching "${term}"`)),
          catchError(this.handleError<Prato[]>('searchPratos', []))
        );
      }

      getPrato(id: number): Observable<Prato> {
        const url = `${this.pratosUrl}/${id}`;
        return this.http.get<Prato>(url)
        .pipe(
          tap(_ => this.log(`fetched prato id=${id}`)),
          catchError(this.handleError<Prato>(`getPrato id=${id}`))
        );
      }

      addPrato(prato: Prato): Observable<Prato> {
        return this.http.post<Prato>(this.pratosUrl, prato, this.httpOptions).pipe(
          tap((newPrato: Prato) => this.log(`added prato w/ id=${newPrato.id}`)),
          catchError(this.handleError<Prato>('addPrato'))
        );
      }
    
      deletePrato(prato: Prato | number): Observable<Prato> {
        const id = typeof prato === 'number' ? prato : prato.id;
        const url = `${this.pratosUrl}/${id}`;
    
        return this.http.delete<Prato>(url, this.httpOptions).pipe(
          tap(_ => this.log(`deleted prato id=${id}`)),
          catchError(this.handleError<Prato>('deletePrato'))
        );
      }

      updatePrato(prato: Prato): Observable<any> {
        return this.http.put(this.pratosUrl, prato, this.httpOptions).pipe(
          tap(_ => this.log(`updated prato id=${prato.id}`)),
          catchError(this.handleError<any>('updatePrato'))
        );
      }

      private handleError<T>(operation = 'operation', result?: T) {
        return (error: any): Observable<T> => {
    
          // TODO: send the error to remote logging infrastructure
          console.error(error); // log to console instead
    
          // TODO: better job of transforming error for user consumption
          this.log(`${operation} failed: ${error.message}`);
    
          // Let the app keep running by returning an empty result.
          return of(result as T);
        };
      }

      private log(message: string) {
        this.messageService.add(`PratoService: ${message}`);
      }
}