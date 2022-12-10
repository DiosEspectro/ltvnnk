package lr3;

import java.util.Scanner;

//Напишите программу, которая выводит последовательность чисел
//Фибоначчи. Первые два числа в этой последовательности равны 1, а каждое
//следующее число равно сумме двух предыдущих (получается
//последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее). Количество чисел
//в последовательности вводится пользователем. Предложите версии
//программы, использующие разные операторы цикла.

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество чисел последовательности чисел Фибоначчи: ");
        int size = in.nextInt();

        withFor(size);
        withWhile(size);
    }

    // Версия с циклом for
    static void withFor(int size)
    {
        int[] fbnc = new int[size];

        for(int i=0;i<size;i++)
        {
            int value;
            value = (i<2 ? 1 : fbnc[i-1] + fbnc[i-2]);
            fbnc[i] = value;
            System.out.print(value + (i < size-1 ? ", ": ""));
        }
    }

    // Версия с циклом while
    static void withWhile(int size)
    {
        int[] fbnc = new int[size];
        int j = 0;
        System.out.println(" ");
        while(j < size) {
            int value;
            value = (j<2 ? 1 : fbnc[j-1] + fbnc[j-2]);
            fbnc[j] = value;
            System.out.print(value + (j < size-1 ? ", ": ""));
            j++;
        }
    }
}
