package lr1;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class Example4 {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        System.out.println("Input a number:");
        int num = Sc.nextInt();

        System.out.println("Your number: " + num);
        Sc.close();
    }
}
