package lr5;

public class Example2 {
    private char a, b;

    public Example2(char a, char b){
        this.a = a;
        this.b = b;
    }

    public String getAllCharsBetween(){
        int ai = this.a;
        int bi = this.b;
        char tmp;
        int start, finish;
        String ret = "";

        if(ai <= bi){
            start = ai;
            finish = bi;
        }
        else {
            start = bi;
            finish = ai;
            tmp = this.b;
            this.b = this.a;
            this.a = tmp;
        }

        for(int i=start+1;i<=finish-1;i++){
            ret += (char)i + (i<finish-1?",":"");
        }

        return ret;
    }

    public void show()
    {
        System.out.print("Символы \"Между\" символами '" + this.a + "' и '" + this.b + "': " + this.getAllCharsBetween());
    }
}

//Напишите программу с классом, у которого есть два символьных поля и
//метод. Он возвращает результат, и у него нет аргументов. При вызове метод
//выводит в консольное окно все символы из кодовой таблицы, которые
//находятся «между» символами, являющимися значениями полей объекта (из
//которого вызывается метод). Например, если полям объекта присвоены
//значения ‘A’ и ‘D’, то при вызове метода в консольное окно должны
//выводиться все символы от ‘A’ до ‘D’ включительно.