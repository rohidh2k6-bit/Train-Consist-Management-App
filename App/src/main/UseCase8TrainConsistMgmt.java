package main;

import java.util.*;

public class UseCase8TrainConsistMgmt {

    // 🔥 Make this PUBLIC
    public static class Bogie {
        public String name;
        public int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static List<Bogie> filterBogies(List<Bogie> list) {
        return list.stream()
                .filter(b -> b.capacity > 60)
                .toList();
    }
}