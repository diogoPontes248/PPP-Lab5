public class PagamentoBoleto extends PagamentoStrategy{

    public void pagar(CarrinhoDeCompra carrinho){
        System.out.println("Pagamento de R$" + carrinho.calculaTotal() + " com frete usando a forma de pagamento Boleto.");
    }
}
