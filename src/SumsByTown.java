import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SumsByTown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        TreeMap<String, Double> towns = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\|");
            String town = tokens[0].trim();
            double income = Double.parseDouble(tokens[1].trim());

            if (towns.containsKey(town)) {
                towns.put(town, towns.get(town) + income);
            } else {
                towns.put(town, income);
            }
        }
        for (Map.Entry<String, Double> entry : towns.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}