public class ValorDoProduto {
    public static void main(String[] args) {
        /*
         Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
         Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
         */
        int quantidade = 2;
        double valorProduto = 3.99;
        double preco = valorProduto * quantidade;

        System.out.printf("Na compra de %d produtos fica no total de R$%.2f", quantidade, ( valorProduto * quantidade ));
    }
}
