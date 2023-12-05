package cf_striver;
import java.util.*;

public class helpfulMaths {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();
                scanner.close();

                // Check if the input contains only one number
                if (!input.contains("+")) {
                    System.out.println(input);
                    return;
                }

                // Split the input string by '+'
                String[] summands = input.split("\\+");

                // Convert the summands to an array of integers
                int[] numbers = new int[summands.length];
                for (int i = 0; i < summands.length; i++) {
                    numbers[i] = Integer.parseInt(summands[i]);
                }

                // Sort the array of integers
                Arrays.sort(numbers);

                // Print the sorted summands with '+'
                System.out.println(String.join("+", Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new)));
            }
        }


