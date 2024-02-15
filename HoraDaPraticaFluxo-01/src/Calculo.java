import java.util.Scanner;

import static java.lang.Math.pow;

public class Calculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String msg = """
                Escolha uma opção: 
                    1 - Calcular área de um Quadrado
                    2 - Calcular área de um Circulo
                """;
        System.out.println(msg);
        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Digite o lado do quadrado: ");
                int lado = sc.nextInt();
                System.out.println("Área do quadrado = " + (lado * lado));
                break;
            case 2:
                final double PI = 3.1415;
                System.out.println("Escreva o raio do Circulo: ");
                int r = sc.nextInt();
                System.out.printf("Área do circulo = %.2f\n", (PI * pow(r, 2)) );
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }


    }
}
