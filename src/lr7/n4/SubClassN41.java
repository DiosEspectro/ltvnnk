package lr7.n4;

public class SubClassN41 extends SuperClassN4{
    public String substring;

    SubClassN41(char supercharEx, String substringEx){
        super(supercharEx);
        this.substring = substringEx;
    }

    SubClassN41(SubClassN41 copyClass){
        super(copyClass.superchar);
        this.substring = copyClass.substring;
    }

    @Override
    public String toString() {
        return "SubClassN41{" +
                "substring='" + substring + '\'' +
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