package Beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> entrada = new ArrayList<>(List.of(3.14159));
        entrada.add(scanner.nextDouble());
        entrada.stream()
                .reduce((n,r) -> n *(r*r))
                .ifPresent(s -> System.out.printf("A=%.4f%n",s));

    }
}
