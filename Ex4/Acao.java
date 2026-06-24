import java.util.ArrayList;

public class Acao {

    private String nome;
    private double preco;
    private ArrayList<Observador> observadores;

    public Acao(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.observadores = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
        notificarObservadores();
    }

    public void addObservador(Observador o){
        observadores.add(o);
    }

    public void removerObservador(Observador o){
        observadores.remove(o);
    }

    public void notificarObservadores(){
        for(Observador o : observadores){
            o.update(this);
        }
    }

}
