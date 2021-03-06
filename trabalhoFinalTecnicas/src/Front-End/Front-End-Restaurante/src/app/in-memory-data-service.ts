import { Injectable } from '@angular/core';
import { InMemoryDbService } from 'angular-in-memory-web-api';
import { Prato } from './prato';

@Injectable({
  providedIn: 'root',
})
export class InMemoryDataService implements InMemoryDbService {
  createDb() {
    const pratos = [
        { id: 11, nome: 'Frango à Parmegiana', preco: 49.99},
        { id: 12, nome: 'Fettuccine aos quatro queijos', preco: 32.99},
        { id: 13, nome: 'Camarão ao modo de nata', preco: 49.99},
        { id: 14, nome: 'Sorretino de queijo mussarela', preco: 45.99},
        { id: 15, nome: 'Risoto de cebola caramelizada', preco: 39.99},
        { id: 16, nome: 'Sopa de cappeletti', preco: 29.99}
    ];
    return {pratos};
  }

  createDb2() {
    const pedido = [
        {
            id: 100,
          //  pratos: [11,'Frango à Parmegiana', 49.99],
            precoPrato: 49.99,
            precoFrete: 15,
            nomeCliente: 'John Smith',
            rua: 'Rua1',
            numero: '1780',
            bairro: 'Bairro1',
            formaDePagamento: 'Cartão'
        }
    ];
    return {pedido};
  }

  genId(pratos: Prato[]): number {
    return pratos.length > 0 ? Math.max(...pratos.map(prato => prato.id)) + 1 : 11;
  }
}


