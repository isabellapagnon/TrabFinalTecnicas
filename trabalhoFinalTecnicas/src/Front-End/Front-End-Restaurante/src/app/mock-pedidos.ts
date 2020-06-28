import { Pedido } from './pedido';
import { Prato } from './prato';
import { PratoDetailComponent } from './prato-detail/prato-detail.component';
import { PratoService } from './prato.service';

export const PEDIDOS: Pedido[] = [
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