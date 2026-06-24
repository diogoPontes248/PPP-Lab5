public class Main {
    public static void main(String[] args) {
        Acao a1 = new Acao("PTR4", 39.46);
        //neste exemplo, o primeiro investidor não comprará a ação por estar mais cara que o valor minimo
        //consequentemente, ele não irá vender também.
        a1.addObservador(new Investidor(34.5, 60.50));
        //já o segundo investidor irá comprar e vender quando o valor da ação atingir um valor maior ou igual a R$130.89
        a1.addObservador(new Investidor(50.34, 130.89));

        a1.setPreco(50.0);
        a1.setPreco(70.0);
        a1.setPreco(130.89);
    }
}