package EstruturaDeDados;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        // type[] varName = new(instance) type[(quantityOfMemoryToBeReserved)]
        String[] ninjas = new String[4];
        int[] age = new int[3];

        // The first (1) element of an array always start at index 0
        // index 0 - element 1; index 1 - element 2; index 2 - element 3.
        ninjas[0] = "Naruto Uzumaki";
        ninjas[1] = "Sasuke Uchiha";
        ninjas[2] = "Sakura Haruno";
        ninjas[3] = "Hinata Hyuga";

        System.out.println(ninjas);
        // > [Ljava.lang.String;@15aeb7ab --- WHY??????
        /*
        * Hypothesis: memory addresses are given in hexadecimal (just for human readability, everything is binary)
        * @15aeb7ab is the memory address of the "base of the array"
        * when we give it an index e.g. ninjas[2] or @15aeb7ab[2]
        * we give to it a place to look for an element dynamically
        * we are specifying the next memory address by >>reference<<
        * */
        System.out.println(Arrays.toString(ninjas));

        /*String ninja1 = "Naruto Uzumaki";
        String ninja2 = "Sasuke Uchiha";
        String ninja3 = "Sakura Haruno";
        System.out.println(ninja1);
        System.out.println(ninja2);
        System.out.println(ninja3);*/
    }

}
