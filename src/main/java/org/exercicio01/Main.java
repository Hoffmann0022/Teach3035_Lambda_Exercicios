package org.exercicio01;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> pares = numbers.stream()
                .filter(numero -> numero % 2 == 0)
                .toList();

        System.out.println("Números pares: " + pares);
    }
}
