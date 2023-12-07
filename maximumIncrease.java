package cf_striver;

import java.util.Scanner;

public class maximumIncrease {

        public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);

                    int n = sc.nextInt();
                    int pRead = sc.nextInt();
                    int cLength = 0;
                    int mLength = 0;

                    for (int i = 1; i < n; i++) {
                        int cRead = sc.nextInt();

                        if (pRead < cRead) {
                            cLength++;
                            mLength = Math.max(cLength, mLength);
                        } else {
                            cLength = 0;
                        }

                        pRead = cRead;
                    }

                    System.out.println(mLength + 1);
                }
            }




