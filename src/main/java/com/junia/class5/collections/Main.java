package com.junia.class5.collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<String> names = new ArrayList<>();

        names.add("A");
        names.add("B");
        names.add("C");

        names.remove("D");
        names.remove("B");

        names.forEach(name -> System.out.print(name));

        System.out.println(names.contains("Alice"));

    }
}
