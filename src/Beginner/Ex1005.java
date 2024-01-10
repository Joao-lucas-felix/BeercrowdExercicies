package Beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1005 {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for(int i =0; i <2; i++){
            list.add(scanner.nextDouble());
        }
        list.stream().reduce((n1, n2) -> ( (n1*3.5 + n2*7.5)/11 ))
                .ifPresent( (media) -> System.out.printf("MEDIA = %.5f\n", media));
    }
}
