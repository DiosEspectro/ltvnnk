package lr7.n1;

public class SubClassTest extends SuperClassTest{
    private String strSub1;
    private String strSub2;

    SubClassTest(String strEx){
        super(strEx);
    }

    SubClassTest(String strSubEx1, String strSubEx2){
        this.strSub1 = strSubEx1;
        this.strSub2 = strSubEx2;
    }

    public String toString(){
        return this.getClass().getSimpleName() + ": str1 = " + this.getStr1() + ", strSub1 = " + this.strSub1 + ", strSub2 = " + this.strSub2;
    }

    public String getStrSub1() {
        return strSub1;
    }

    public void setStrSub1(String strSub1) {
        this.strSub1 = strSub1;
    }

    public String getStrSub2() {
        return strSub2;
    }

    public void setStrSub2(String strSub2) {
        this.strSub2 = strSub2;
    }
}

//Напишите программу, в которой есть суперкласс с приватным текстовым полем,
//конструктором с текстовым параметром и где переопределен метод toString (). На основе
//суперкласса путем наследования создается подкласс. У него появляется еще одно
//приватное текстовое ноле. Также подкласс должен иметь версии конструктора с одним и
//двумя текстовыми аргументами, а еще в нем должен быть переопределен метод toString ().
//В обоих классах метод toString () переопределяется так, что он возвращает строку с
//названием класса и значение текстового поля или текстовых полей.