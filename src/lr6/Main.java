package lr6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Example 1
        System.out.println("Example1:");

        Example1 e1 = new Example1();

        e1.setValue('a');
        e1.setValue("b");
        e1.showValues();

        char[] c = new char[]{'a', 'b', 'c'};
        e1.setValue(c);
        c = new char[]{'m'};
        e1.setValue(c);
        e1.showValues();

        // Example 2
        System.out.println("\nExample2:");
        Example2.showA();
        Example2.showA();
        Example2.showA();
        Example2.showA();
        Example2.showA();
        Example2.showA();

        // Example 3
        System.out.println("\nExample3:");
        System.out.println("Max: " + Example3.getMax(12, 43, 22, 1, 123, 2));
        System.out.println("Min: " + Example3.getMin(12, 43, 22, 1, 123, 2));
        System.out.println("Avg: " + Example3.getAvg(12, 43, 22, 1, 123, 2));

        // Example 4
        System.out.println("\nExample4:");
        Example4.doubleFactorial(5);
        Example4.doubleFactorial(10);
        Example4.doubleFactorial(11);

        // Example 5
        System.out.println("\nExample5:");
        Example5.quadSummator(2);
        Example5.quadSummator(3);
        Example5.quadSummator(4);

        // Example 6
        System.out.println("\nExample6:");
        int[] a = new int[]{10, 44, 12, 1, 55, 32, 23};
        int[] b = Example6.getArrCopy(a, 3);
        System.out.println(Arrays.toString(b));
        b = Example6.getArrCopy(a, 5);
        System.out.println(Arrays.toString(b));
        b = Example6.getArrCopy(a, 100);
        System.out.println(Arrays.toString(b));

        // Example 7
        System.out.println("\nExample7:");
        c = new char[]{'a', 'b', 'q', 'd', 'n'};
        System.out.println(Arrays.toString(Example7.getCharCodes(c)));

        // Example 8
        System.out.println("\nExample8:");
        a = new int[]{ 1, 2, 3, 4, 5, 6};
        System.out.println("Среднее: " + Example8.getArrAvg(a));

        // Example 9
        System.out.println("\nExample9:");
        a = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(a));
        a = Example9.replaceElements(a);
        System.out.println(Arrays.toString(a));

        // Example 10
        System.out.println("\nExample10:");
        System.out.println(Arrays.toString(Example10.getMinMax(100, 12, 23, 43, 699, 299)));
    }
}
