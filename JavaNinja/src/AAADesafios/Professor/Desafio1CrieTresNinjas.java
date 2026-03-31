package AAADesafios.Professor;

public class Desafio1CrieTresNinjas {

    public static void main(String[] args) {
        // Ninja 1
        String nomeNinja1 = "Naruto Uzumaki";
        int idade = 14;
        String missao = "Encontrar o bandido";
        String statusDaMissao = "Em andamento";
        char nivelDaMissao = 'A';

        System.out.println("Nome do ninja: " + nomeNinja1);
        System.out.println("Idade do ninja: " + idade);
        System.out.println("Missao do ninja: " + missao);
        System.out.println("Nível da missão: " + nivelDaMissao);

        // Verificar nível da missão e idade do ninja
        if (idade < 15) {
            if (nivelDaMissao == 'C' || nivelDaMissao == 'D') {
                statusDaMissao = "Concluída";
            } else {
                statusDaMissao = "Não concluída: idade insuficiente";
            }
        } else {
            statusDaMissao = "Concluída";
        }
        System.out.println("Status da missão: " + statusDaMissao);
        System.out.println("-------------------------------------------");


        // Ninja 2
        String nomeNinja2 = "Sasuke Uchiha";
        int idade2 = 19;
        String missao2 = "Reconhecimento da aldeia";
        String statusDaMissao2 = "Em andamento";
        char nivelDaMissao2 = 'S';

        System.out.println("Nome do ninja: " + nomeNinja2);
        System.out.println("Idade do ninja: " + idade2);
        System.out.println("Missao do ninja: " + missao2);
        System.out.println("Nível da missão: " + nivelDaMissao2);

        if (idade2 < 15) {
            if (nivelDaMissao2 == 'C' || nivelDaMissao2 == 'D') {
                statusDaMissao2 = "Concluída";
            } else {
                statusDaMissao2 = "Não concluída: idade insuficiente";
            }
        } else {
            statusDaMissao2 = "Concluída";
        }
        System.out.println("Status da missão: " + statusDaMissao2);
        System.out.println("-------------------------------------------");

        // Ninja 3
        String nomeNinja3 = "Sakura Haruno";
        int idade3 = 16;
        String missao3 = "Curar feridos da guerra";
        String statusDaMissao3 = "Concluído";
        char nivelDaMissao3 = 'D';

        System.out.println("Nome do ninja: " + nomeNinja3);
        System.out.println("Idade do ninja: " + idade3);
        System.out.println("Missao do ninja: " + missao3);
        System.out.println("Status da missão: " + statusDaMissao3);
        System.out.println("Nível da missão: " + nivelDaMissao3);

        if (idade3 < 15) {
            if (nivelDaMissao3 == 'C' || nivelDaMissao3 == 'D') {
                statusDaMissao3 = "Concluída";
            } else {
                statusDaMissao3 = "Não concluída: idade insuficiente";
            }
        } else {
            statusDaMissao3 = "Concluída";
        }
        System.out.println("Status da missão: " + statusDaMissao3);

        System.out.println("-------------------------------------------");
    }
}
