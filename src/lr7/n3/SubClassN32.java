package lr7.n3;

public class SubClassN32 extends SubClassN31{
    public String substring2;

    SubClassN32(int valueExInt, char valueExChar1, String valueExStr2){
        this.setValue(valueExInt, valueExChar1, valueExStr2);
    }

    public void setValue(int valueExInt, char valueExChar1, String valueExStr2) {
        this.substring2 = valueExStr2;
        super.setValue(valueExInt, valueExChar1);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": superint = " + superint + ", substring1 = '" + subchar1 +"'" + ", substring2 = '" + substring2 +"'";
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