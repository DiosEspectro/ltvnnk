package timus_tasks_2.task_1785;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int monsters = in.nextInt();
        String howmany = "legion";

        if(isBetween(monsters, 1, 4)) howmany = "few";
            else if(isBetween(monsters, 5, 9)) howmany = "several";
                else if(isBetween(monsters, 10, 19)) howmany = "pack";
                    else if(isBetween(monsters, 20, 49)) howmany = "lots";
                        else if(isBetween(monsters, 50, 99)) howmany = "horde";
                            else if(isBetween(monsters, 100, 249)) howmany = "throng";
                                else if(isBetween(monsters, 250, 499)) howmany = "swarm";
                                    else if(isBetween(monsters, 500, 999)) howmany = "zounds";

        System.out.println(howmany);
    }

    static boolean isBetween(int what, int from, int to){
        return (what >= from && what <= to);
    }
}
