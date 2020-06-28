import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Observable, of } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';

import { Prato } from './prato';
import { Pedido } from './pedido';
import { MessageService } from './message.service';

@Injectable({ providedIn: 'root' })
export class PedidoService {

    private pedidosUrl = 'api/pedido';

    httpOptions = {
        headers: new HttpHeaders({ 'Content-Type': 'application/json' })
      };

    constructor (private http: HttpClient, private messageService: MessageService) { }


    getPedidos(): Observable<Pedido[]> {
        return this.http.get < Pedido[] > (this.pedidosUrl)
        .pipe(
            tap(_ => this.log('fetched pedidos')),
        catchError(this.handleError<Pedido[]>('getPedidos', []))
        );
    }

      getPedido(id: number): Observable<Pedido> {
        const url = `${this.pedidosUrl}/${id}`;
        return this.http.get<Pedido>(url)
        .pipe(
          tap(_ => this.log(`fetched pedido id=${id}`)),
          catchError(this.handleError<Pedido>(`getPedido id=${id}`))
        );
      }

      updatePedido(pedido: Pedido): Observable<any> {
        return this.http.put(this.pedidosUrl, pedido, this.httpOptions).pipe(
          tap(_ => this.log(`updated pedido id=${pedido.id}`)),
          catchError(this.handleError<any>('updatePedido'))
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