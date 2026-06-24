public class PagamentoCartao extends PagamentoStrategy{

    public void pagar(CarrinhoDeCompra carrinho){
        System.out.println("Pagamento de R$" + carrinho.calculaTotal() + " usando a forma de pagamento cartão.");
    }
}
