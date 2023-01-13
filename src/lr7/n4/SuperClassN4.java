package lr7.n4;

public class SuperClassN4 {
    public char superchar;

    SuperClassN4(){}

    SuperClassN4(char supercharEx){
        this.superchar = supercharEx;
    }

    SuperClassN4(SuperClassN4 copyClass){
        this.superchar = copyClass.superchar;
    }

    @Override
    public String toString() {
        return "SuperClassN4{" +
                "superchar=" + superchar +
                '}';
    }
}

//    Напишите программу, в которой использована цепочка наследования из трех
//    классов. В первом классе есть открытое символьное поле. Во втором классе появляется
//    открытое текстовое поле. В третьем классе появляется открытое целочисленное поле. В
//        каждом из классов должен быть конструктор, позволяющий создавать объект на основе
//        значений полей, переданных аргументами конструктору, а также конструктор создания
//        копии.