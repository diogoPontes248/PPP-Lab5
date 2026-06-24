public class Investidor implements Observador{

    AcaoBroker corretor;
    double valormin;
    double valormax;
    Boolean comprado = false;

    public Investidor(double valormin, double valormax){
        corretor = new AcaoBroker();
        this.valormin = valormin;
        this.valormax = valormax;
    }

    public void update(Acao a){
        double preco = a.getPreco();
        if(preco >= valormax && comprado){
            corretor.venderAcao(a);
        }
        else if(preco <= valormin){
            corretor.comprarAcao(a);
            comprado = true;
        }
    }
}
