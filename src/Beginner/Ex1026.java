package Beginner;

import java.io.IOException;
import java.util.Scanner;

public class Ex1026 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long x, y, soma;
        while (sc.hasNext()) {
          x = sc.nextLong();
          y = sc.nextLong();
          soma = x^y;
          System.out.println(soma);
        }
    }
}
