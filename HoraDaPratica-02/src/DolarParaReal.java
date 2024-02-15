public class DolarParaReal {

    public static void main(String[] args) {
        /*
        Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
        Considere que o valor de 1 dólar é equivalente a 4.94 reais.
        Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
        */

        double valorEmDolares = 20.50;
        double valorEmREais = valorEmDolares * 4.94;

        System.out.printf("$%.2f em Reais R$%.2f", valorEmDolares, valorEmREais);

    }

}
