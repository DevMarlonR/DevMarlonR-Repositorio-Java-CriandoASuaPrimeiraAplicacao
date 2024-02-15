import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int numeroSorteado = ran.nextInt(100);

        System.out.println("Adivinhe o numero sorteado (0 a 100) (5 tentativas)");
        System.out.println("---------------------------------------------------");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "a tentativa: ");
            int number = sc.nextInt();

            if (number == numeroSorteado) {
                System.out.println("Parabéns, você acertou!");
                break;
            } else if (number > numeroSorteado) {
                System.out.println("Errou! Digite um número menor.");
            } else {
                System.out.println("Errou! Digite um número maior.");
            }

        }

        System.out.println("Número sorteado = " + numeroSorteado);

    }
}