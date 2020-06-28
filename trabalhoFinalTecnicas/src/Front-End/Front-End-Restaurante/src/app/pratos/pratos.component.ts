import { Component, OnInit } from '@angular/core';

import { Prato } from '../prato';
import { PratoService } from '../prato.service';

@Component({
  selector: 'app-pratos',
  templateUrl: './pratos.component.html',
  styleUrls: ['./pratos.component.css']
})
export class PratosComponent implements OnInit {
  pratos: Prato[];

  constructor(private pratoService: PratoService) { }

  ngOnInit() {
    this.getPratos();
  }

  getPratos(): void {
    this.pratoService.getPratos()
    .subscribe(pratos => this.pratos = pratos);
  }

  add(nome: string): void {
    nome = nome.trim();
    if (!nome) { return; }
    this.pratoService.addPrato({ nome } as Prato)
      .subscribe(prato => {
        this.pratos.push(prato);
      });
  }

  delete(prato: Prato): void {
    this.pratos = this.pratos.filter(p => p !== prato);
    this.pratoService.deletePrato(prato).subscribe();
  }

}
