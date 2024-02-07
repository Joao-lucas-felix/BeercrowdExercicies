package Beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1011 {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(3.14159);
        Scanner scanner = new Scanner(System.in);
        list.add(scanner.nextDouble());
        list.stream()
                .reduce((n1 , n2) -> (4.0/3) * (n1 * (n2*n2*n2)))
                .ifPresent(n -> System.out.printf("VOLUME = %.3f\n", n));
    }
}
