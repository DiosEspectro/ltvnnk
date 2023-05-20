package timus_tasks_2.task_1877;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String first = in.nextLine();
        String second = in.nextLine();
        String[] codes = new String[]{first, second};
        int code = 0;
        int i = 0;
        boolean success = false;

        while(i<10000){
            if(getCodeByInt(i).equals(codes[code])){
                success = true;
                break;
            }
            i++;
            code = code == 0 ? 1 : 0;
        }

        System.out.println(success ? "yes" : "no");
    }

    static String getCodeByInt(int num){
        String ret = "";

        if(num < 10) ret = "000";
            else if(num < 100) ret = "00";
                else if(num < 1000) ret = "0";

        return ret + num;
    }
}
