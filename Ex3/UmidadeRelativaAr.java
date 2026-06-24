public class UmidadeRelativaAr extends CET{

    private double umidadeRelativa;

    public double getUmidadeRelativa(){
        return umidadeRelativa;
    }

    public void setUmidadeRelativa(double umidadeRelativa){
        this.umidadeRelativa = umidadeRelativa;
        notificarObservadores();
    }

}
