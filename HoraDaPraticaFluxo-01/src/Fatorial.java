import java.util.Scanner;


public class Fatorial {
    public static void main(String[] args) {
        System.out.println("Digite um número : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fatorial = 1;

        for (int i = n; i > 1; i--) {
            fatorial *= i;
        }

        System.out.println(n + "! == " + fatorial);

    }
}
