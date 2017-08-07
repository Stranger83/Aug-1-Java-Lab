import java.util.Scanner;

public class ThreeIntegersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int[] intArr = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            intArr[i] = Integer.parseInt(input[i]);
        }

        int num1 = intArr[0];
        int num2 = intArr[1];
        int num3 = intArr[2];

        if (!checkNumbers(num1, num2, num3) &&
                !checkNumbers(num2, num3, num1) &&
                !checkNumbers(num1, num3, num2)) {
            System.out.println("No");
        }
    }

    private static boolean checkNumbers(int num1, int num2, int num3) {
        if (num1 + num2 != num3) {
            return false;
        }
        System.out.printf("%d + %d = %d", Math.min(num1, num2), Math.max(num1, num2), num3);
        return true;
    }
}
