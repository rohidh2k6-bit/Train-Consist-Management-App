import java.util.*;

public class TrainConsistApp {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        set.add("Engine");
        set.add("Sleeper");
        set.add("Cargo");
        set.add("Guard");
        set.add("Sleeper");

        System.out.println(set);
    }
}