package org.exercicio04;

import java.util.Arrays;
import java.util.List;

public class Main {
    static void main() {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Soma dos números: " + sum);
    }
}
