public class AcaoBroker {

    public void comprarAcao(Acao a){
        System.out.println("Comprando a ação " + a.getNome() + " pelo preço de: " + a.getPreco() + "R$");
    }

    public void venderAcao(Acao a){
        System.out.println("Vendendo a ação " + a.getNome() + " pelo preço de: " + a.getPreco() + "R$");
    }
}
