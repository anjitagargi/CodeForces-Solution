package cf_striver;

import java.util.Scanner;

public class vanyaAndCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = 0, i = 1, m = 1;
        while(m <= n){

            m = ((i*i) + i) / 2;

            if(m > n) break;

            n = n - m;

            cnt++;

            i++;
        }

        System.out.println(cnt);
    }
}



