package Beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Float> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(scanner.nextFloat());
        }
        double rectangleT = (list.get(0)* list.get(2))/2;
        double circle = Math.pow(list.get(2), 2.0) * 3.14159;
        double trapezium = ((list.get(0) + list.get(1)) * list.get(2))/2;
        double square = Math.pow(list.get(1), 2);
        double rectangle = list.get(0)* list.get(1);

        System.out.printf(
                "TRIANGULO: %.3f\n" +
                "CIRCULO: %.3f\n" +
                "TRAPEZIO: %.3f\n" +
                "QUADRADO: %.3f\n" +
                "RETANGULO: %.3f\n",
                rectangleT, circle, trapezium, square, rectangle
        );
    }
}
