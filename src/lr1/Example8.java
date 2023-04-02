package lr1;

import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите текущий день недели");
        String a = in.nextLine();

        System.out.println("Введите название текущего месяца");
        String b = in.nextLine();

        System.out.println("Введите текущее число");
        int c = in.nextInt();

        System.out.println("Текущая дата: " + a + ", " + c + ", " + b);
        in.close();
    }
}
