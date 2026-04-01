package Condicoes;

import java.util.Scanner;

public class SwitchCases {

    public static void main(String[] args) {

        /*
        * SwitchCases: Que servem para gerar casos específicos
        * Objetivo: Pedir para o usuário escolher o ninja
        * */

        Scanner sc = new Scanner(System.in);

        // stdout - opções ao usuário
        System.out.println("Chose a character: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        // stdin - escolha de personagem
        int selectedNumber = sc.nextInt();

        // reação ao escolher um personagem
        switch(selectedNumber) {
            case 1:
                System.out.println("User picked Naruto Uzumaki.");
                break;
            case 2:
                System.out.println("User picked escolheu Sasuke Uchiha");
                break;
            case 3:
                System.out.println("User picked escolheu Sakura Haruno");
                break;
            default:
                System.out.println("Number must be a integer between 1 and 3 inclusive");
        }

        sc.close();
    }
}
