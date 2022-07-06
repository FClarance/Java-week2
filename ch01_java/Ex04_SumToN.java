package ch01_java;
import java.util.Scanner;
public class Ex04_SumToN {
    public static void main(String[] args) {
        int total = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the no: ");

        final int sumMax = scanner.nextInt();
        System.out.println("Summing Up to:  " +sumMax + "!");

        for (int i=1; i<=sumMax; i++) {
            total +=i;
            System.out.println(total);
        }
        scanner.close();
    }
}
