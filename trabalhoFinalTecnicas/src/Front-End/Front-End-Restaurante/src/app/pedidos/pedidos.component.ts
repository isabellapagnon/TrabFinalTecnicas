import { Component, OnInit, Input } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';

import { Pedido } from '../pedido';
import { PedidoService } from '../pedido.service';

@Component({
  selector: 'app-pedidos',
  templateUrl: './pedidos.component.html',
  styleUrls: ['./pedidos.component.css']
})
export class PedidosComponent implements OnInit {
  pedido: Pedido[];

  constructor(private pedidoService: PedidoService) { }

  ngOnInit() {
  }

}
