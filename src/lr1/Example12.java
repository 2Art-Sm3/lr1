package lr1;

import java.util.Scanner;
public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите возраст");
        int age = in.nextInt();

        System.out.println("Год рождения: " + (2023 - age));
        in.close();
    }
}
