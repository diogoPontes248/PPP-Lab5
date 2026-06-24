public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompra carrinho = new  CarrinhoDeCompra();

        carrinho.adicionaItem(new Item("Arroz branco", 24.90));
        carrinho.adicionaItem(new Item("Arroz branco", 8.50));
        carrinho.adicionaItem(new Item("Arroz branco", 6));
        carrinho.adicionaItem(new Item("Arroz branco", 4.50));
        carrinho.adicionaItem(new Item("Arroz branco", 8.50));

        Item itemASerRemovido = new Item("Será removido", 10.50);

        carrinho.adicionaItem(itemASerRemovido);

        carrinho.imprimirCarrinho();

        carrinho.removerItem(itemASerRemovido);

        System.out.println("\nApós remover o Item\n");

        carrinho.imprimirCarrinho();

        System.out.println("\nRealizando pagametno de diferentes formas:\n");

        carrinho.realizaPagamento();

        carrinho.setFormaPagamento(new PagamentoBoleto());

        carrinho.realizaPagamento();

        carrinho.setFormaPagamento(new PagamentoCartao());

        carrinho.realizaPagamento();
    }
}