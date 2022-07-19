package src.W2;
import java.util.*;

public class W2 {
    class Exercise2{
        Scanner scanner = new Scanner(System.in);
        public void one(){
            System.out.println("Input exercise 1 number: ");
            int n1 = scanner.nextInt();
            for(int i = 0; i < n1; i++){
                System.out.println("*****");
            }
        }
        public void two(){
            System.out.println("Input exercise 2 number: ");
            int n2 = scanner.nextInt();
            System.out.println("*****");
            for(int i = 0; i < n2 - 2; i++){
                System.out.println("*   *");
            }
            System.out.println("*****");
        }
        public void three(){
            System.out.println("Input your number:");
            double N = scanner.nextDouble();
            double min = 1, max = N;
            double avg = (min + max) / 2;
            if (Math.pow(avg,2) > N){
                System.out.println("avg is too big, make it smaller");
                max = avg;
            }
            else if (Math.pow(avg,2) < N){
                System.out.println("avg is too small, make it bigger");
                min = avg;
            }
            else {
                System.out.println("avg is the result");
                System.out.println(avg);
            }
        }
    }
    public void main(String[] args){
        Exercise2 exercise2 = new Exercise2();
        //Exercise 1
        exercise2.one();
        //Exercise 2
        exercise2.two();
        //Exercise 3

        
        //Exercise 4
        //Exercise 5
    }
}
