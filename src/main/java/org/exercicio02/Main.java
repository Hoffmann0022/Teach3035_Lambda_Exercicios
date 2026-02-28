package org.exercicio02;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Main {
    static void main() {
        Predicate<Integer> primo = num -> {
            if (num <= 1) return false;

            return IntStream.rangeClosed(2, (int) Math.sqrt(num))
                    .noneMatch(i -> num % i == 0);
        };

        int num = 7;

        if (primo.test(num)) {
            System.out.println(num + " é primo.");
        } else {
            System.out.println(num + " não é primo.");
        }
    }
}
