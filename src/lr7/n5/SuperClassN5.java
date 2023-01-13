package lr7.n5;

public class SuperClassN5 {
    protected String str;

    SuperClassN5(String strEx){
        this.str = strEx;
    }

    public void getInfo(){
        System.out.println(getClass().getSimpleName() + ": str = " + this.str);
    }
}

//    Напишите программу, в которой есть суперкласс с защищенным текстовым полем,
//        конструктор с текстовым параметром и метод, при вызове которого в консольном окне
//        отображается название класса и значение поля. На основе суперкласса создаются два
//        подкласса (оба на основе одного и того же суперкласса). В одном из классов появляется
//        защищенное целочисленное поле, там есть конструктор с двумя параметрами и
//        переопределен метод для отображения значений полей объекта и названия класса. Во
//        втором подклассе появляется защищенное символьное поле, конструктор с двумя
//        параметрами и переопределен метод, отображающий в консоли название класса и значения
//        полей. В главном методе создайте объекты каждого из классов. Проверьте работу метода,
//        отображающего значения полей объектов, для каждого из объектов. Вызовите этот же
//        метод через объектную переменную суперкласса, которая ссылается на объект
//        производного класса.