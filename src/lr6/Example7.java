package lr6;

public class Example7 {
    public static int[] getCharCodes(char[] c){
        int[] codes = new int[c.length];

        for(int i=0;i<c.length;i++){
            codes[i] = c[i];
        }

        return codes;
    }
}

//Напишите программу со статическим методом, аргументом которому передастся
//символьный массив, а результатом возвращается ссылка на целочисленным массив,
//состоящий из кодов символов из массива- аргумента.