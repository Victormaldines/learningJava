package Condicoes;

public class Ternarios {

    public static void main(String[] args) {

        /*
        * Ternários é uma syntax suggar para ifElse's
        *
        * var = (condition) ? ifTrue : IfFalse
        *
        * equivalente a:
        * if (condition) {
        *   var = ifTrue;
        * } else {
        *   var = ifFalse;
        * }
        * */

        short age = 15;
        short missionsCompleted = 50;

        // implementando a lógica do programa Condições/IfElse.java utilizando operadores ternários
        String ninjaRank = (missionsCompleted >= 20 && age > 15) ? "Chunnin" : (missionsCompleted >= 10) ? "Jounnin" : "Gennin";
        System.out.printf("Sei la %s", ninjaRank);
    }
}
