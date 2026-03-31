package AAADesafios;

public class Desafio1CrieTresNinjas {
    public static void main(String[] args) {
        Ninja ninja1 = new Ninja("Naruto", 14);
        Ninja ninja2 = new Ninja("Sasuke", 16);
        Ninja ninja3 = new Ninja("Sakura", 15);
        Mission mission1 = new Mission("Do something", 3);
        Mission mission2 = new Mission("Do something", 3);
        Mission mission3 = new Mission("Do something else", 1);

        System.out.println("mission 1 - ninja 1: " + mission1.missionStatus());
        mission1.completeMission(ninja1);
        System.out.println(mission1.missionStatus());
        System.out.println("//--------------------------------------------//");
        System.out.println("mission 2 - ninja 2: " + mission2.missionStatus());
        mission2.completeMission(ninja2);
        System.out.println(mission2.missionStatus());
        System.out.println("//--------------------------------------------//");
        System.out.println("mission 3 - ninja 3: " + mission3.missionStatus());
        mission3.completeMission(ninja3);
        System.out.println(mission3.missionStatus());


    }
}

class Ninja {
    String name;
    int age;

    public Ninja(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Mission {
    String name;
    int difficultyLevel;
    boolean isDone = false;

    public Mission(String name, int difficultyLevel) {
        this.name = name;
        this.difficultyLevel = difficultyLevel;
    }

    public void completeMission(Ninja chosenNinja) {
        this.isDone = chosenNinja.age >= 15 || this.difficultyLevel <= 1;
    }

    public boolean missionStatus() {
        return isDone;
    }
}
