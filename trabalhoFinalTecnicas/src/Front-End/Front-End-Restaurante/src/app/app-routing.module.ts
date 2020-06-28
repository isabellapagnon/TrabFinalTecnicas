import { NgModule }             from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { DashboardComponent }   from './dashboard/dashboard.component';
import { PratosComponent }      from './pratos/pratos.component';
import { PratoDetailComponent }  from './prato-detail/prato-detail.component';
import { PedidosComponent } from './pedidos/pedidos.component';
import { PedidoDetailComponent } from './pedido-detail/pedido-detail.component';

const routes: Routes = [
  { path: '', redirectTo: '/dashboard', pathMatch: 'full' },
  { path: 'dashboard', component: DashboardComponent },
  { path: 'detail/:id', component: PratoDetailComponent },
  { path: 'pratos', component: PratosComponent },
  { path: 'pedidos', component: PedidosComponent},
  { path: 'pedidos/:id', component: PedidoDetailComponent}
];

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule {}