import { Component, OnInit, Input } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';

import { Pedido } from '../pedido';
import { PedidoService } from '../pedido.service';

@Component({
  selector: 'app-pedido-detail',
  templateUrl: './pedido-detail.component.html',
  styleUrls: ['./pedido-detail.component.css']
})
export class PedidoDetailComponent implements OnInit {
  @Input() pedido: Pedido;

  constructor(private route: ActivatedRoute,
    private pedidoService: PedidoService,
    private location: Location) { }

  ngOnInit() {
    this.getPedido();
  }

  getPedido(): void {
    const id = +this.route.snapshot.paramMap.get('id');
    this.pedidoService.getPedido(id)
      .subscribe(pedido => this.pedido = pedido);
  }

  goBack(): void {
    this.location.back();
  }

  save(): void {
    this.pedidoService.updatePedido(this.pedido)
      .subscribe(() => this.goBack());
  }

}
