package Beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1008 {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for(int i =0; i <3; i++){
            list.add(scanner.nextDouble());
        }
        System.out.printf("NUMBER = %.0f\n", list.get(0));
        System.out.printf("SALARY = U$ %.2f\n", list.get(1) * list.get(2));
    }
}
