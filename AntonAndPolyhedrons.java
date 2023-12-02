
import java.util.Scanner;

public class AntonAndPolyhedrons {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of polyhedrons
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        int totalFaces = 0;

        // Process each polyhedron
        for (int i = 0; i < n; i++) {
            String polyhedron = scanner.nextLine();

            // Add the corresponding number of faces based on the type of polyhedron
            switch (polyhedron) {
                case "Tetrahedron":
                    totalFaces += 4;
                    break;
                case "Cube":
                    totalFaces += 6;
                    break;
                case "Octahedron":
                    totalFaces += 8;
                    break;
                case "Dodecahedron":
                    totalFaces += 12;
                    break;
                case "Icosahedron":
                    totalFaces += 20;
                    break;
                default:
                    // Handle unexpected input
                    System.out.println("Invalid polyhedron type");
                    return;
            }
        }

        // Output the total number of faces
        System.out.println(totalFaces);
    }
}
