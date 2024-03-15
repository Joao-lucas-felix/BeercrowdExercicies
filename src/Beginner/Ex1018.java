package Beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1018 {
    public static void main(String[] args) {
        int i = new Scanner(System.in).nextInt();
        System.out.println(i);
        List<Integer> list  = new ArrayList<>(List.of(100, 50, 20, 10, 5, 2, 1));

        for (Integer integer : list) {
            System.out.printf("%d nota(s) de R$ %d,00\n", i / integer, integer);
            i = i % integer;
        }
    }
}
