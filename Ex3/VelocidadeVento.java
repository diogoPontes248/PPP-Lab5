public class VelocidadeVento extends CET{

    private double velocidadeVento;

    public double getVelocidadeVento(){
        return velocidadeVento;
    }

    public void setVelocidadeVento(double velocidadeVento){
        this.velocidadeVento = velocidadeVento;
        notificarObservadores();
    }
}
