import { Component, OnInit } from '@angular/core';
import { Prato } from '../prato';
import { PratoService } from '../prato.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  pratos: Prato[] = [];

  constructor(private pratoService: PratoService) { }

  ngOnInit() {
    this.getPratos();
  }

  getPratos(): void{
    this.pratoService.getPratos().subscribe(pratos => this.pratos = pratos.slice(1, 5));
  }

}
