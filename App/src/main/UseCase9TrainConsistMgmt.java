package main;

import java.util.*;
import java.util.stream.*;

public class UseCase9TrainConsistMgmt {

    // ✅ FIX: make it PUBLIC STATIC
    public static class Bogie {
        public String name;
        public int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static Map<String, List<Bogie>> groupBogies(List<Bogie> list) {
        return list.stream()
                .collect(Collectors.groupingBy(b -> b.name));
    }
}