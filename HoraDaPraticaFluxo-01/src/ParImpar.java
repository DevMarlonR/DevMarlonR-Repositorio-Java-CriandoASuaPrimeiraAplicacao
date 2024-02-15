import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " é PAR.");
        } else {
            System.out.println(n + " é ÍMPAR.");
        }

    }
}
