package src;

import java.util.Scanner;

class Exercises1{
    Scanner scanner = new Scanner(System.in);
    public void one(){
        String myName = "Minh Vo";
        System.out.println("***********");
        System.out.println("* " + myName + " *");
        System.out.println("***********");
    }

    public void two(){
        int x = -10;
        int y = -20;
        int number = x;
        x = y;
        y = number;
        System.out.println(x);
        System.out.println(y);
    }

    public void three(){
        System.out.println("Input your secound: ");
        int S = scanner.nextInt();

        int h = 0;
        int m = 0;
        int s = 0;

        h = S / 3600;
        m = S % 3600 / 60;
        s = S % 3600 % 60;

        System.out.println(h + ":" + m + ":" + s);

    }

    public void four(){
        System.out.println("Input Ax: ");
        double Ax = scanner.nextDouble();
        System.out.println("Input Ay: ");
        double Ay = scanner.nextDouble();
        System.out.println("Input Bx: ");
        double Bx = scanner.nextDouble();
        System.out.println("Input By: ");
        double By = scanner.nextDouble();

        double AB = Math.pow(Ax - Bx, 2) + Math.pow(Ay - By, 2);
        AB = Math.sqrt(AB);

        System.out.println(AB);

        double  circumference = AB * 4;

        double area = Math.pow(AB, 2);

        System.out.println(circumference + "And " + area);
    }

    public void eight(){
        int n = 1;
        while(n > 0){
            System.out.print("Enter a positive interger: ");
            n = scanner.nextInt();
            if(n % 5 == 0 && n % 6 == 0 && n > 0){
                System.out.println(n + " is divisible by both 5 and 6");
            } else if (n % 5 == 0 && n > 0 || n % 6 == 0 && n > 0) {
                System.out.println(n + " is divisible by both 5 or 6, but not both");
            } else if (n % 5 != 0 && n % 6 != 0 && n > 0) {
                System.out.println(n + " is neither divisible by both 5 nor 6");
            }
        }
        System.out.println("Cya");
    }
}
public class W1 {
    public static void main(String[] args){
        Exercises1 exercises1 = new Exercises1();

        //Exercise 1
        exercises1.one();

        //Exercise 2
        exercises1.two();

       //Exercise 3
        exercises1.three();

        //Exercise 4
        exercises1.four();

        //Exercise 8
        exercises1.eight();

    }
}
