package src;

import java.util.Scanner;

public class section1 {
    public static void main(String[] args){
        //Exercise 1
        String myName = "Minh Vo";
        System.out.println("***********");
        System.out.println("* " + myName + " *");
        System.out.println("***********");

        //Exercise 2

        //Exercise 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your secound: ");
        int S = scanner.nextInt();

        int h = 0;
        int m = 0;
        int s = 0;

        h = S / 3600;
        m = S % 3600 / 60;
        s = S % 3600 % 60;

        System.out.println(h + ":" + m + ":" + s);
        //Exercise 4



        //Exercise 5
        //Exercise 6
        //Exercise 7
        //Exercise 8
    }
}
