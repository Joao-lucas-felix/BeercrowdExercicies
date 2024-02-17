package Beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1015 {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            list.add(scanner.nextDouble());
        }
        double d1 =list.get(2)  -  list. get(0);
        double d2 =list.get(3)  -  list. get(1);
        double d = d1*d1 + d2*d2;
        System.out.printf("%.4f\n", Math.sqrt(d));
    }
}
