import java.util.*;

public class TrainConsistApp {
    public static void main(String[] args) {
        System.out.println("=== UC3 ===");

        Set<String> ids = new HashSet<>();
        ids.add("BG101");
        ids.add("BG102");
        ids.add("BG101"); // duplicate

        System.out.println("Unique IDs: " + ids);
    }
}