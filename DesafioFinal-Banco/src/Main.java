import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String nome = "Marlon Rodrigues";
        String tipoDeConta = "Corrente";
        double saldo = 2500.00;

        String primeiraMensagem = """
                ----------------------------------------
                Dados iniciais do Cliente:
                
                Nome: %s
                Tipo de Conta: %s
                Saldo Inicial: R$ %.2f
                ----------------------------------------
                """.formatted(nome, tipoDeConta, saldo);
        String menu = """
                Operações:
                    1- Consultar saldos
                    2- Receber Pix
                    3- Fazer Pix
                    4- Sair
                    
                Digite a opção desejada: """;
        System.out.println(primeiraMensagem);
        int op;
        do {
            System.out.println(menu);
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.printf("Saldo: %.2f\n", saldo);
                    break;
                case 2:
                    System.out.println("Valor a ser recebido: ");
                    double valorPix = sc.nextDouble();
                    if (valorPix > 0) {
                        saldo += valorPix;
                        System.out.println("Pix recebido com Sucesso!");
                        System.out.println("Novo saldo: " + saldo);
                    } else {
                        System.out.println("Valor inválido para Pix.");
                    }
                    break;
                case 3:
                    System.out.println("Digite o valor Desejado para o Pix");
                    double receberPix = sc.nextDouble();
                    if (receberPix <= saldo) {
                        saldo -= receberPix;
                        System.out.println("Pix realizado com Sucesso!");
                        System.out.println("Novo saldo: " + saldo);
                    } else {
                        System.out.println("Valor insuficiente.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo... Volte sempre!1");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (op != 4);

    }
}