package Condicoes;

public class IfElse {

    /*
    * Objective:  Promote the ninja rank according to the number of missions completed
    * */

    public static void main(String[] args) {

        // Ninja Naruto
        String name = "Naruto";
        String rank;
        byte age = 15; //max 255
        short missionsCompleted = 20;
        boolean isHokage = false;

        if (missionsCompleted >= 10 && age > 15) { // T ^ F
            System.out.println("Rank: Chunnin");
        } else if (missionsCompleted >= 20) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennin");
        }
    }
}
