package lr7.n1;

public class Main {
    public static void main(String[] args) {
        SuperClassTest sc = new SuperClassTest("передал в конструктор суперкласса");
        String className = sc.toString();
        System.out.println(className);

        SubClassTest subc1 =  new SubClassTest("передал в конструктор подкласса");
        String subClassName1 = subc1.toString();
        System.out.println(subClassName1);

        SubClassTest subc2 = new SubClassTest("передал в конструктор подкласса", "где два параметра");
        String subClassName2 = subc2.toString();
        System.out.println(subClassName2);
    }
}

//Напишите программу, в которой есть суперкласс с приватным текстовым полем,
//конструктором с текстовым параметром и где переопределен метод toString (). На основе
//суперкласса путем наследования создается подкласс. У него появляется еще одно
//приватное текстовое ноле. Также подкласс должен иметь версии конструктора с одним и
//двумя текстовыми аргументами, а еще в нем должен быть переопределен метод toString ().
//В обоих классах метод toString () переопределяется так, что он возвращает строку с
//названием класса и значение текстового поля или текстовых полей.