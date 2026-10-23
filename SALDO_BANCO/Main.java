import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        saldo(input);

    };

    public static void saldo(Scanner saidaSaldo) {
        // SWITCH USER//
        int opcoes;
        double saldo;
        saldo = 510.00;
        do {
            System.out.print("Digite o que quer fazer: \n");
            System.out.print(
                    "1-REALIZAR SAQUE.\n 2-VER SALDO \nDISPONÍVEL. 0-Encerrar\n");

            // SCANNER INFO//
            opcoes = saidaSaldo.nextInt();
            // Saldo disponível//

            switch (opcoes) {

                case 1:
                    // SAQUE//
                    System.out.println("Digite o valor do saque");
                    double saque = saidaSaldo.nextDouble();
                    // SISTEMA DE COMPARACAO SAQUE//
                    if (saque <= saldo) {
                        double subtracaoSaldo = saldo - saque;
                        saldo = subtracaoSaldo;
                        System.out.println("Saque de: " + saque + " realizado com sucesso");
                    } else {
                        System.out.println("Saldo insuficiente, saque não realizado");
                    }
                    break;
                case 2:
                    System.out.println("Saldo disponível: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado ");
                    break;
                default:
                    System.out.println("Digite o numero certo ");
                    break;

            }
        } while (opcoes != 0);

    }
}
