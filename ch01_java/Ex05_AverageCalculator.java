package ch01_java;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ex05_AverageCalculator {
    Scanner sc = new Scanner(System.in);
    String input ="";
    ArrayList<Double> numList = new ArrayList<Double>();

    System.out.println("Enter the number");
    input = sc.next();

    while(!input.equals("=")) {
        Double nextNum = Double.parseDouble(input);
        numList.add(nextNum);
        System.out.println("Enter a numner : ");
        input = sc.next();
}
    double sum = 0;
    double average = 0;
    for (double i : numList) {
        sum +=i;
    }
    average = sum/numList.size();
    System.out.println("Yourage average is %.2f%n");
    sc.close();
}




 