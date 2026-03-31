package TiposDeDados;

/*
 * Dados Primitivos
 * Boolean - Boolean
 * Character - char
 * Integer - byte, short, int, long
 *   byte (8 bits: 1 bit sinal + 7 magnitude: range -127, ..., 127)
 *   short (16 bits: 1 bit sinal + 15 magnitude: range -32767, ..., 32767)
 *   int (32 bits: 1 bit sinal + 31 magnitude: range -2147483647, ..., 2147483647)
 *   long (64 bits: 1 bit sinal + 63 magnitude: range -9223372036854775807, ..., 9223372036854775807)
 * Float - float, double
 * */

public class DadosPrimitivos {
    public static void main(String[] args) {

        /*
        * Objective: Create a Ninja
        * */

        int age = 16;
        double height = 1.65;
        char initial = 'N';
        boolean isAlive = true;
        Long bankBalance = 748932487232938L;

        System.out.print(age+"\n"); // Comando para mostrar para o usuário
        System.out.println("bankBalance is " + bankBalance);
        System.out.println("My age is: " + age);
    }
}
