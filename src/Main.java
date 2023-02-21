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


        //define an array of Monster objects
        Monster[] list = new Monster[50];

        System.out.println(Arrays.toString(list));
        list[0] = new Monster();
        list[1] = new Monster(33);
        list[2] = new Monster(3,4);
        list[3] = new Monster(10,10);
        System.out.println(Arrays.toString(list));
        list[1].setAge(45);
        System.out.println(Arrays.toString(list));

    }
}