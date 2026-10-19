import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // SCANNER OBJECT//
        Scanner enter = new Scanner(System.in);

        int campo;

        do {
            System.out.println("Instruçôes: ");
            System.out.println("1-Confirmar Idade\n 2-Confirmar numero\n 0-Cancelar");

            campo = enter.nextInt();
            switch (campo) {
                case 1:
                    System.out.println("Digite a sua idade");
                    int idade = enter.nextInt();
                    if (idade < 18) {
                        System.out.println("Menor de idade");
                    } else {
                        System.out.println("Maior de idade");
                    }
                    break;
                case 2:
                    System.out.println("Escreva o seu número de telefone");
                    
                     String tel = enter.next();
                    if (tel.length() == 8) {
                        System.out.println("Número confirmado");
                    } else {
                        System.out.println("Digite um número com 8 dígitos");
                    }
                    break;
                case 0:
                    System.out.println("Programa encerrado ");
                    break;
                default:
                    System.out.println("Escreva os números de acordo com a instrução");
            }

        } while (campo != 0);
        enter.close();

    }

}
