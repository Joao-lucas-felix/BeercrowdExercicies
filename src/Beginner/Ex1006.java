package Beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1006 {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for(int i =0; i <3; i++){
            list.add(scanner.nextDouble());
        }
        double media = (list.get(0)*2 + list.get(1)*3 + list.get(2)*5)/10;
        System.out.printf("MEDIA = %.1f\n", media);

    }
}