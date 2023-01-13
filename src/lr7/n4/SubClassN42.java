package lr7.n4;

public class SubClassN42 extends SubClassN41 {
    public int subint;

    SubClassN42(char supercharEx, String substringEx, int subintEx){
        super(supercharEx, substringEx);
        this.subint = subintEx;
    }

    SubClassN42(SubClassN42 copyClass){
        super(copyClass.superchar, copyClass.substring);
        this.subint = copyClass.subint;
    }

    @Override
    public String toString() {
        return "SubClassN42{" +
                "subint=" + subint +
                ", substring='" + substring + '\'' +
                ", superchar=" + superchar +
                '}';
    }
}

//    Напишите программу, в которой использована цепочка наследования из трех
//    классов. В первом классе есть открытое символьное поле. Во втором классе появляется
//    открытое текстовое поле. В третьем классе появляется открытое целочисленное поле. В
//        каждом из классов должен быть конструктор, позволяющий создавать объект на основе
//        значений полей, переданных аргументами конструктору, а также конструктор создания
//        копии.