package org.exercicio03;

import java.util.Arrays;
import java.util.List;

public class Main {
    static void main() {
        List<String> names = Arrays.asList("ana", "joao", "maria");

        List<String> capsLock = names.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println("Strings em maiúsculas: " + capsLock);
    }
}
