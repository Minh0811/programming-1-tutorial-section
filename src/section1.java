package src;

import java.util.Scanner;
import java.util.*;
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
        System.out.println("Input Ax: ");
        double Ax = scanner.nextInt();
        System.out.println("Input Ay: ");
        double Ay = scanner.nextInt();
        System.out.println("Input Bx: ");
        double Bx = scanner.nextInt();
        System.out.println("Input By: ");
        double By = scanner.nextInt();

        double AB = Math.pow(Ax - Bx, 2) + Math.pow(Ay - By, 2);
        AB = Math.sqrt(AB);

        double  circumference = AB * 4;

        double area = Math.pow(AB, 2);

        System.out.println(circumference + "And " + area);
        //Exercise 5
        //Exercise 6
        //Exercise 7
        //Exercise 8
    }
}
