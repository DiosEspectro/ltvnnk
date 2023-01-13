package lr7.n3;

public class Main {
    public static void main(String[] args) {
        SuperClassN3 sup = new SuperClassN3(99);
        System.out.println(sup.toString());
        sup.setValue(199);
        System.out.println(sup.toString());

        SubClassN31 sub1 = new SubClassN31(11, 's');
        System.out.println(sub1.toString());
        sub1.setValue(12, 'S');
        System.out.println(sub1.toString());

        SubClassN32 sub2 = new SubClassN32(21, 'v', "с доп полем");
        System.out.println(sub2.toString());
        sub2.setValue(22, 'V', "с доп полем!!!");
        System.out.println(sub2.toString());
    }
}

//    Напишите программу, в которой на основе суперкласса создается подкласс, а на
//        основе этого подкласса создается еще один подкласс (цепочка наследования из трех
//        классов). В первом суперклассе есть открытое целочисленное поле, метод с одним
//        параметром для присваивания значения полю и конструктор с одним параметром. Во
//        втором классе появляется открытое символьное поле, метод с двумя параметрами для
//        присваивания значения полям (перегрузка метода из суперкласса) и конструктор с двумя
//        параметрами. В третьем классе появляется открытое текстовое ноле, метод с тремя
//        аргументами для присваивания значений полям (перегрузка метода из суперкласса) и
//        конструктор с тремя параметрами. Для каждого класса определите метод toString () так,
//        чтобы он возвращал строку с названием класса и значениями всех полей объекта.