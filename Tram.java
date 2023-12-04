import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int currentCapacity = 0;
        int maxCapacity = 0;

        for (int i = 0; i < n; i++) {
            
            int exiting = sc.nextInt();
            int entering = sc.nextInt();

            currentCapacity = currentCapacity - exiting + entering;

            // Update the maximum capacity if the current capacity is greater
            if (currentCapacity > maxCapacity) {
                maxCapacity = currentCapacity;
            }
        }

        System.out.println(maxCapacity);

        sc.close();
    }
}
