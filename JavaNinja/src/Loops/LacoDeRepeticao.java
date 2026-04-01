package Loops;

public class LacoDeRepeticao {
    public static void main(String[] args) {
        /*
        *Laços de repetição
        *Blocos de código que repetirão até que determinada condição seja falsa
        *
        * While e For
        * */

        /*
        * While loop
        *
        * while(condition) { ifTrue }
        * */

        short numberOfClones = 0;
        short maximumNumberOfClones = 20;
        while(numberOfClones <= maximumNumberOfClones) {
            System.out.printf("while - clone number %d was invoked!\n", numberOfClones);
            numberOfClones++;
        }

        /*
        * For loop
        *
        * for (acc; condition; pass) { ifTrue }
        * */

        numberOfClones = 0;
        for (int i = 0; i <= maximumNumberOfClones; i++) {
            System.out.printf("for - clone number %d was invoked!\n", i);
        }
    }
}
