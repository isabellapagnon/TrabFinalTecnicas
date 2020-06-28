import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { ReactiveFormsModule } from '@angular/forms';
import { FormsModule }    from '@angular/forms';
import { HttpClientModule }    from '@angular/common/http';
import { HttpClientInMemoryWebApiModule } from 'angular-in-memory-web-api';
import { InMemoryDataService }  from './in-memory-data-service';
//import { InMemoryDataService2 } from './in-memory-data-2-service';

import { AppRoutingModule }     from './app-routing.module';

import { AppComponent } from './app.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { PratoDetailComponent } from './prato-detail/prato-detail.component';
import { PratoSearchComponent } from './prato-search/prato-search.component';
import { PratosComponent } from './pratos/pratos.component';
import { MessagesComponent } from './messages/messages.component';
import { PedidoDetailComponent } from './pedido-detail/pedido-detail.component';
import { PedidosComponent } from './pedidos/pedidos.component';

@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    PratoDetailComponent,
    PratoSearchComponent,
    PratosComponent,
    MessagesComponent,
    PedidoDetailComponent,
    PedidosComponent
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule,

    HttpClientInMemoryWebApiModule.forRoot(
      InMemoryDataService, { dataEncapsulation: false }
    )

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
