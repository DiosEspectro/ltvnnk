package lr6;

import java.util.Arrays;

public class Example3 {
    public static int getMax(int ... v){
        Arrays.sort(v);
        return v[v.length-1];
    }

    public static int getMin(int ... v){
        Arrays.sort(v);
        return v[0];
    }

    public static float getAvg(int ... v){
        int sum = 0;
        float avg = 0;

        if(v.length > 0) {
            for (int i = 0; i < v.length; i++) sum += v[i];
            avg = (float) sum / v.length;
        }

        return avg;
    }
}

//Напишите программу с классом, в котором есть статические методы, которым
//можно передавать произвольное количество целочисленных аргументов (или
//целочисленный массив). Методы, на основании переданных аргументов или массива,
//позволяют вычислить: наибольшее значение, наименьшее значение, а также среднее
//значение из набора чисел.