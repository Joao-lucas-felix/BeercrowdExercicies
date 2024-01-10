package Beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1007 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for(int i =0; i <4; i++){
            list.add(scanner.nextInt());
        }
        int diff = ( list.get(0)* list.get(1) ) - ( list.get(2) * list.get(3) );
        System.out.printf("DIFERENCA = %d\n", diff);
    }
}
