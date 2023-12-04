package cf_striver;

import java.util.Scanner;

public class softDrinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input values
        int n = sc.nextInt(); // Number of friends
        int k = sc.nextInt(); // Number of bottles
        int l = sc.nextInt(); // Millilite
        // rs per bottle
        int c = sc.nextInt(); // Number of limes
        int d = sc.nextInt(); // Slices per lime
        int p = sc.nextInt(); // Grams of salt
        int nl = sc.nextInt(); // Milliliters per toast
        int np = sc.nextInt(); // Grams of salt per toast

        // Calculate the maximum number of toasts for each resource
        int toastsFromDrinks = (k * l) / (n * nl);
        int toastsFromLimes = (c * d) / n;
        int toastsFromSalt = p / (n * np);

        // Find the minimum of the above three values
        int minToasts = Math.min(toastsFromDrinks, Math.min(toastsFromLimes, toastsFromSalt));

        // Output the result
        System.out.println(minToasts);


    }
}
