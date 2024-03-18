package Beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1019 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        list.add(scanner.nextInt());
        System.out.printf("%d:%d:%d\n"
                , list.get(0)/3600
                , (list.get(0) % 3600)/ 60
                , ((list.get(0) % 3600)%60)
        );
    }
}
