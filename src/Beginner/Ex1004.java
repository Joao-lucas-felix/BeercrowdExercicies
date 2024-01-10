package Beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1004 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for(int i =0; i <= 1; i++){
            list.add(scanner.nextInt());
        }

        list.stream().reduce((integer, integer2) -> integer * integer2)
                .ifPresent((i)-> System.out.printf("PROD = %d\n", i));

    }

}
