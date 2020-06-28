import { Prato } from './prato';

export interface Pedido{

    id: number;
    //pratos: Prato;
    precoPrato: number;
    precoFrete: number;
    nomeCliente: String;
    rua: String;
    numero:String;
    bairro: String;
    formaDePagamento: String;
}