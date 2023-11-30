package Beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1001 {
    public static void main(String[] args) {
        // A soma de dois numeros, com entrada no teclado:
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        nums.add(scanner.nextInt());
        nums.add(scanner.nextInt());
        nums.stream()
                .reduce(Integer::sum).ifPresent((s)->System.out.println("X = "+s));
    }
}
