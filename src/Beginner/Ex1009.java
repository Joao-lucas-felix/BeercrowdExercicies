package Beginner;

import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class Ex1009 {
    public static void main(String[] args) {
        class Employe{

            private String name;
            private double salary;
            private double productsSold;

            public void setName(String name) {
                this.name = name;
            }

            public void setSalary(double salary) {
                this.salary = salary;
            }

            public void setProductsSold(double productsSold) {
                this.productsSold = productsSold;
            }

            public void printTotalSalary(){
                System.out.printf("TOTAL = %s %.2f\n",

                        Currency.getInstance(new Locale("pt", "BR")).getSymbol(),

                        (this.salary + (this.productsSold * 0.15)));
            }
        }
        Scanner scanner = new Scanner(System.in);
        Employe employe = new Employe();
        employe.setName(scanner.nextLine());
        employe.setSalary(scanner.nextDouble());
        employe.setProductsSold(scanner.nextDouble());
        employe.printTotalSalary();
    }
}
