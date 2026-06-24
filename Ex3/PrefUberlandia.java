public class PrefUberlandia implements Observador {

    public void update(CET s){
        double umidade = ((UmidadeRelativaAr) s).getUmidadeRelativa();
        System.out.println("Temperatura: " + umidade + "%");
    }
}
