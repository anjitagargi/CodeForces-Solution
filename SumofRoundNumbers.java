import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumofRoundNumbers {

    public static List<Integer> representAsRoundNumbers(int n) {
        List<Integer> roundNumbers = new ArrayList<>();
        String nStr = Integer.toString(n);
        for (int i = 0; i < nStr.length(); i++) {
            int digit = Character.getNumericValue(nStr.charAt(i));
            if (digit != 0) {
                roundNumbers.add(digit * (int) Math.pow(10, nStr.length() - i - 1));
            }
        }
        return roundNumbers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            List<Integer> roundNumbers = representAsRoundNumbers(n);
            
            System.out.println(roundNumbers.size());
            for (int num : roundNumbers) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
