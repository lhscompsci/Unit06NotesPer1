import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Arrays
        // creating an array of integers named dave with 23 total spots
        // numbered from 0 .. 22
        int[] dave = new int[23];
        System.out.println(dave);   // prints out memory address
        System.out.println(Arrays.toString(dave));  //uses utility class to display everything with []s and ", "s
        System.out.println(dave[4]);    // only prints out the value in spot #4
        for(int i = 0; i < dave.length; i++)    //dave.length give the value of how many total spots there are
            dave[i] = i;
        System.out.println(Arrays.toString(dave));
       // System.out.println(dave[23]);     //causes an ArrayIndexOutOfBoundsException for reaching outside the range

    }
}