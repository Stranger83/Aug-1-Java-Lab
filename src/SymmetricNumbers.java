import java.util.Scanner;

public class SymmetricNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            boolean isSymmetric = true;
            String currentNum = Integer.toString(i);
            for (int j = 0; j < currentNum.length()/2; j++) {
                if (currentNum.charAt(j) != currentNum.charAt(currentNum.length()-1-j)){
                    isSymmetric = false;
                    break;
                }
            }
            if (isSymmetric){
                sb.append(currentNum + " ");
            }
        }
        System.out.println(sb);
    }
}
