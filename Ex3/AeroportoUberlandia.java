public class AeroportoUberlandia implements Observador{

    public void update(CET s){
        double vento = ((VelocidadeVento) s).getVelocidadeVento();
        System.out.println("Velocidade da rajada de vento: " + vento + "km/h");
    }
}
