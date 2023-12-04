package cf_striver;

import java.util.Scanner;
import java.util.*;

public class boyOrGirl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        boolean isFemale = isFemaleUsername(username);
        if (isFemale) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
    private static boolean isFemaleUsername(String username) {
        Set<Character> uniqueChars = new HashSet<>();
        for (char ch : username.toCharArray()) {
            uniqueChars.add(ch);
        }return uniqueChars.size() % 2 == 0;
    }
    }

