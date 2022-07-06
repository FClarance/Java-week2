package ch01_java;
import java.util.Scanner;
public class Ex01_CountToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the no: ");

        int max = scanner.nextInt();
        System.out.println("Now Counting...");
        

        for (Integer i=0; i<=max; i++) {
            System.out.println(i);
    
        }
    }
}
