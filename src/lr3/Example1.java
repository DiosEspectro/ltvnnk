package lr3;

import java.util.Scanner;

//Напишите программу, в которой пользователь вводит целое число
//в диапазоне от 1 до 7, а программа определяет по этому числу день недели.
//Если введенное пользователем число выходит за допустимый диапазон,
//выводится сообщение о том, что введено некорректное значение. Используйте
//оператор выбора switch.

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите номер дня недели:");
        int dayNum = in.nextInt();
        String dayName = "";
        boolean outOfBounds = false;

        switch(dayNum)
        {
            case 1: dayName = "Понедельник"; break;
            case 2: dayName = "Вторник"; break;
            case 3: dayName = "Среда"; break;
            case 4: dayName = "Четверг"; break;
            case 5: dayName = "Пятница"; break;
            case 6: dayName = "Суббота"; break;
            case 7: dayName = "Воскресенье"; break;
            default: outOfBounds = true; break;
        }

        System.out.println((outOfBounds ? "Введено некорректное значение" : "Это - " + dayName));
    }
}
