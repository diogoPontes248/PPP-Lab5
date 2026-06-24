public class Temperatura extends CET {

    private double temperatura;

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        notificarObservadores();
    }
}
