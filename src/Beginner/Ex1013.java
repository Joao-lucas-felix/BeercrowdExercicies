package Beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1013 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
           list.add(scanner.nextInt());
        }
        list.stream()
                .max(Integer::compareTo)
                .ifPresent((integer) -> System.out.printf("%d eh o maior\n", integer));
    }
}
