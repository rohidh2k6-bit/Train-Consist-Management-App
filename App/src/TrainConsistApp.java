import java.util.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String n, int c) {
        name = n;
        capacity = c;
    }
}

public class TrainConsistApp {
    public static void main(String[] args) {
        List<Bogie> list = new ArrayList<>();

        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC", 56));
        list.add(new Bogie("First", 40));

        list.sort(Comparator.comparingInt(b -> b.capacity));

        for (Bogie b : list) {
            System.out.println(b.name + " " + b.capacity);
        }
    }
}