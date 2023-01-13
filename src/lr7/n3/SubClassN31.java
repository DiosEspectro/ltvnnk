package lr7.n3;

public class SubClassN31 extends SuperClassN3{
    public char subchar1;

    SubClassN31(){}

    SubClassN31(int valueExInt, char valueExStr) {
        this.setValue(valueExInt, valueExStr);
    }

    public void setValue(int valueExInt, char valueExStr) {
        this.subchar1 = valueExStr;
        super.setValue(valueExInt);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": superint = " + superint + ", subchar1 = '" + subchar1 +"'";
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