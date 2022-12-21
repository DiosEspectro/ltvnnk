package lr5;

import java.util.Random;

public class Example3 {
    private int a;
    private int b;

    public Example3(){
        Random random = new Random();
        this.a = random.nextInt();
        this.b = random.nextInt();
    }

    public Example3(int x){
        this.a = x;
        this.b = x;
    }

    public Example3(int x, int y){
        this.a = x;
        this.b = y;
    }
}

//Напишите программу с классом, у которого есть два целочисленных поля.
//В классе должны быть описаны конструкторы, позволяющие создавать
//объекты без передачи аргументов, с передачей одного аргумента и с передачей
//двух аргументов.