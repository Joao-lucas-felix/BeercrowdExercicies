package Beginner;

import java.util.*;
import java.util.stream.Collectors;

public class Ex1010 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i < 2; i++){
            list.add(scanner.nextLine());
        }

        List<Double> valores = list.stream()
                .map(s -> s.split(" "))
                .flatMap(strings -> Arrays.stream(strings).map(String::toString))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        double total = valores.get(1) * valores.get(2) + valores.get(4)* valores.get(5);

        System.out.printf("VALOR A PAGAR: %s %.2f\n",

                Currency.getInstance(new Locale("pt", "BR")).getSymbol()

                , total );
    }
}
