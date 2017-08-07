import java.util.Scanner;

public class SumTwoNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());

        double sum = num1 + num2;
        System.out.printf("%.2f", sum);
    }
}
