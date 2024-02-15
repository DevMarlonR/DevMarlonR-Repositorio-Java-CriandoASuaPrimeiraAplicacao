public class Main {
    public static void main(String[] args) {

        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento : " + anoDeLancamento);
        boolean includoNoPlano = true;
        double notaDoFilmePaulo = 6.3;
        double notaDoFilmeJacqueline = 9.8;

        double media = (notaDoFilmePaulo + notaDoFilmeJacqueline) / 2;

        String sinopse = """
                
                Filme: Tal
                Sinopse: bla bla bla bla
                Ano de lançamento:
                """ + anoDeLancamento;

        System.out.println(sinopse);

    }
}