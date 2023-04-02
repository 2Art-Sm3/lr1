package lr1;

import java.util.Scanner;
public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число");
        float a = in.nextFloat();

        System.out.println("Введите второе число");
        float b = in.nextFloat();

        System.out.println("Сумма чисел a + b = " + (a + b));
        in.close();
    }
}
