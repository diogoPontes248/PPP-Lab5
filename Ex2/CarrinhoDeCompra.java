import java.util.ArrayList;

public class CarrinhoDeCompra {

    private ArrayList<Item> listaDeItens;
    private PagamentoStrategy formaDePagamento;
    private FreteStrategy formaDeFrete;

    public CarrinhoDeCompra() {
        listaDeItens = new ArrayList<>();
        formaDePagamento = new PagamentoPix();
        formaDeFrete = new FreteNormal();
    }

    public void imprimirCarrinho(){
        for(Item item : listaDeItens){
            System.out.println(item.getNome() + ": R$" + item.getValor());
        }
        System.out.println("Valor do frete " + formaDeFrete.formaDeFrete() + ": R$" + formaDeFrete.getValor());
        System.out.println("Preço total: R$" + this.calculaTotal());
    }

    public void adicionaItem(Item item){
        listaDeItens.add(item);
    }

    public void removerItem(Item item){
        listaDeItens.remove(item);
    }

    public double calcularFrete(){
        return formaDeFrete.getValor();
    }

    public double calculaTotal(){
        double total = 0.0;
        for(Item item : listaDeItens){
            total += item.getValor();
        }
        total += calcularFrete();
        return total;
    }

    public void setFormaPagamento(PagamentoStrategy formaDePagamento){
        this.formaDePagamento = formaDePagamento;
    }

    public void setFormaDeFrete(FreteStrategy formaDeFrete){
        this.formaDeFrete = formaDeFrete;
    }

    public void realizaPagamento(){
        formaDePagamento.pagar(this);
    }
}
