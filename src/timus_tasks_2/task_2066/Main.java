package timus_tasks_2.task_2066;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                int cur = 0;
                switch(j){
                    case 0: cur = b + c; break; // Сложение
                    case 1: cur = b - c; break; // Вычитание
                    case 2: cur = b * c; break; // Умножение
                }

                switch(i){
                    case 0: cur = a + cur; break; // Сложение
                    case 1: cur = a - cur; break; // Вычитание
                    case 2: cur = a * cur; break; // Умножение
                }

                if(cur < min) min = cur;
            }
        }

        System.out.println(min);
    }
}
