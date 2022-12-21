package lr5;

public class Example1 {
    private char s;

    public void setS(char s) {
        this.s = s;
    }

    public int getSCode(){
        return (int)this.s;
    }

    public void getSToConsole(){
        System.out.println("Символ и его код: " + this.s + " (" + this.getSCode() + ")");
    }
}

//Напишите программу с классом, в котором есть закрытое символьное поле
//и три открытых метода. Один из методов позволяет присвоить значение полю.
//Еще один метод при вызове возвращает результатом код символа. Третий
//метод позволяет вывести в консольное окно символ (значение поля) и его код.