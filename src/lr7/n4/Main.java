package lr7.n4;

public class Main {
    public static void main(String[] args) {
        SuperClassN4 sup = new SuperClassN4('A');
        System.out.println(sup.toString());

        SubClassN41 sub1 = new SubClassN41('B', "SUB1");
        System.out.println(sub1.toString());

        SubClassN42 sub2 = new SubClassN42('C', "SUB2", 666);
        System.out.println(sub2.toString());

        SubClassN42 sub2copy = new SubClassN42(sub2);
        System.out.println(sub2copy.toString());
    }
}

//    Напишите программу, в которой использована цепочка наследования из трех
//    классов. В первом классе есть открытое символьное поле. Во втором классе появляется
//    открытое текстовое поле. В третьем классе появляется открытое целочисленное поле. В
//        каждом из классов должен быть конструктор, позволяющий создавать объект на основе
//        значений полей, переданных аргументами конструктору, а также конструктор создания
//        копии.