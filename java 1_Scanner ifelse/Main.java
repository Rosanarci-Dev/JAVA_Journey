import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // BOOLEAN//
        boolean bloqueado = false;
        // if (bloqueado) {
        //     System.out.println("Acesso negado");
        // } else {
        //     System.out.println("Acesso permitido");
        // }

        // Scanner //
        Scanner entrada = new Scanner(System.in);
        // CONFERIR IDADE//
        System.out.println("Digite a sua idade");
        int idade = entrada.nextInt();
        // filtro IDADE//
        if ((idade < 18) ) {
            System.out.println("Você é menor de idade ");}
            else if(bloqueado==true){
                System.out.println("Você tem acesso negado");
            }
         else {
            System.out.println("Acesso permitido");
        }
    }
}