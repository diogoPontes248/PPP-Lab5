public class Main {
    public static void main(String[] args) {

        UmidadeRelativaAr cetUmidade = new UmidadeRelativaAr();
        VelocidadeVento cetVelocidade = new VelocidadeVento();

        cetUmidade.addObserver(new PrefUberlandia());
        cetVelocidade.addObserver(new AeroportoUberlandia());

        cetUmidade.setUmidadeRelativa(75);
        cetVelocidade.setVelocidadeVento(28);

    }
}