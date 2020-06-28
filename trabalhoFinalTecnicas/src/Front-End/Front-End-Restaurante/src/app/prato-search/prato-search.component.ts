import { Component, OnInit } from '@angular/core';
import { Observable, Subject } from 'rxjs';
import { debounceTime, distinctUntilChanged, switchMap } from 'rxjs/operators';

import { Prato } from '../prato';
import { PratoService } from '../prato.service';

@Component({
  selector: 'app-prato-search',
  templateUrl: './prato-search.component.html',
  styleUrls: ['./prato-search.component.css']
})
export class PratoSearchComponent implements OnInit {
  pratos$: Observable<Prato[]>;
  private searchTerms = new Subject<string>();

  constructor(private pratoSevice: PratoService) { }

  search(term: string): void {
    this.searchTerms.next(term);
  }

  ngOnInit(): void {
    this.pratos$ = this.searchTerms.pipe(
      // wait 300ms after each keystroke before considering the term
      debounceTime(300),

      // ignore new term if same as previous term
      distinctUntilChanged(),

      // switch to new search observable each time the term changes
      switchMap((term: string) => this.pratoSevice.searchPratos(term)),
    );
  }

}
