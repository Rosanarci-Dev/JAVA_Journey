import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Escreva o seu nome");
        // LÊ dados do teclado entrada de dados//
        Scanner entrada = new Scanner(System.in);
        // variavel que coleta oq o usuário escreveu e guarda//
        String nome = entrada.nextLine();
        // saída do que o usuário escreveu//

        // Campo usuário saber oq enviar//
        System.out.println("Digite a sua idade");
        // coletar o que o usuário escreveu//

        // guardar o numero que o usuário escreveu//
        int idade = entrada.nextInt();
        System.out.println("The name of the user is: " + nome);
        System.out.println("The age of the user is: " + idade);
        entrada.close();

    }

}