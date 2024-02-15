import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número :");
        int n = leitor.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(n + " * " + i + " == " + (n*i));
        }

    }

}
