package lr5;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        Example1 ex1 = new Example1();
        ex1.setS('b');
        System.out.println(ex1.getSCode());
        ex1.getSToConsole();

        System.out.println();

        // Задание 2
        Example2 ex2 = new Example2('g', 'a');
        ex2.show();

        System.out.println();

        // Задание 3
        Example3 ex3_1 = new Example3();
        Example3 ex3_2 = new Example3(5);
        Example3 ex3_3 = new Example3(5, 10);

        System.out.println();

        // Задание 4
        Example4 ex4 = new Example4(66.963314);

        System.out.println();

        // Задание 5
        Example5 ex5 = new Example5(99);
        ex5.checkI();
        ex5 = new Example5(9999);
        ex5.checkI();
        ex5 = new Example5(11);
        ex5.setI();
        ex5.checkI();

        System.out.println();

        // Задание 6
        Example6 ex6 = new Example6(1);
        ex6.showMinMax();
        ex6.setVal(3, 0);
        ex6.showMinMax();
        ex6.setVal(-1, 10);
        ex6.showMinMax();

        System.out.println();

        ex6 = new Example6(0, 4);
        ex6.showMinMax();
        ex6.setVal(100);
        ex6.showMinMax();
        ex6.setVal(-33,33);
        ex6.showMinMax();

        System.out.println();
    }
}
