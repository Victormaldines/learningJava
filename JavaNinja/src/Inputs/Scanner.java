package Inputs;

public class Scanner {

    public static void main(String[] args) {

        /*
         * Scanner = é um jeito de trazer o usuário para dentro da aplicação
         * Objetivo: o usuário vai criar um ninja e o sistema deverá validar os dados
         * */

        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Receber o nome do ninja
        System.out.println("Type the NAME of the ninja");
        String ninjaName = sc.nextLine();

        // Receber a idade do ninja
        System.out.println("Type the AGE of the ninja");
        int age = sc.nextInt();

        // Tratamento de Dados
        if (age >= 18) {
            System.out.println("Esse ninja já é maior de idade e pode ir para missões fora da aldeia");
        } else {
            System.out.println("Esse ninja é muito novo ainda. Precisa treinar mais antes de sair da vila");
        }

        // Saída
        System.out.println("the ninja name is: " + ninjaName);
        System.out.println("A idade do ninja é: " + age);

        // Fechar sempre o Scanner
        sc.close();
    }
}
