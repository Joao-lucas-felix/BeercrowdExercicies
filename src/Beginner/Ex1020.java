package Beginner;

import java.util.Scanner;

public class Ex1020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageInDays = scanner.nextInt();
        int years = ageInDays / 365;
        ageInDays = ageInDays - years*365;
        int mounths =  ageInDays/30;
        ageInDays = ageInDays - mounths*30;
        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", years,mounths,ageInDays);
    }
}
