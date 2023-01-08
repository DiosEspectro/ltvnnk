package task_1297;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        int maxLen = 0;
        String res = "";

        for(int i=0; i<line.length(); i++) {
            for (int j = line.length(); j > i; j--) {
                String check = line.substring(i, j);
                if (check.equals(reverseString(check))) {
                    if (maxLen < check.length()) {
                        maxLen = check.length();
                        res = check;
                        break;
                    }
                }
            }
        }

        if(res.isEmpty()) res = line.substring(0, 0);
        System.out.println(res);
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
