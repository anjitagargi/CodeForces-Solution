import java.util.Scanner;

public class FoxAndSnake{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Output
        int x=0;
 
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i%2==0)
                    System.out.print("#");
                else if(i%2==1 &&  x==0){
                    if(j<m-1)
                        System.out.print(".");
                    else{
                        x =1;
                        System.out.print("#");
                    }
                }
                else if(i%2==1 && x==1){
                    if(j==0)
                        System.out.print("#");
                    else
                        System.out.print(".");
                    if(j==m-1)
                        x=0;
                }
            }
            System.out.println("");
    }
}
}