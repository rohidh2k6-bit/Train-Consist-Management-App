import java.util.*;

public class TrainConsistApp {
    public static void main(String[] args) {
        System.out.println("=== UC2 ===");

        List<String> bogies = new ArrayList<>();
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        System.out.println("After add: " + bogies);

        bogies.remove("AC Chair");
        System.out.println("After remove: " + bogies);

        System.out.println("Contains Sleeper? " + bogies.contains("Sleeper"));
    }
}