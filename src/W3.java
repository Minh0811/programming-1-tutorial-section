package src;


import java.util.Random;
import java.util.Scanner;
class Exercise3{
    Scanner scanner = new Scanner(System.in);
    public void one(){
        System.out.println("Enter a random number: ");
        int n = scanner.nextInt();
        Random rd = new Random();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = rd.nextInt();
            System.out.println(arr[i]);
        }
//        System.out.println(arr[0]);
    }

    public void getIndexMin(int[] numbers) {
        int minNumber = numbers[0];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (minNumber > numbers[i]) {
                minNumber = numbers[i];
                index = i;
            }
        }
        System.out.println("The index is:");
        System.out.println(index);
        System.out.println("The number is: ");
        System.out.println(minNumber);
    }


}
public class W3 {
    public static void main(String[] args) {
        Exercise3 exercise3 = new Exercise3();
//        exercise3.one();

        int[] arr = {1, 1, 9, 2};
        exercise3.getIndexMin(arr);


    }
}
