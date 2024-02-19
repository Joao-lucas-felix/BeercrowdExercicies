package Beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        list.add(scanner.nextInt());
        list.forEach(
                n -> System.out.printf("%d minutos\n",n*2)
        );
    }
}
