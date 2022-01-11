package Pr31;

import javax.swing.*;
import java.util.Scanner;

public class pr31 {
    public static void main(String[] args) {

        int x = 0;

        do {

            Scanner scanner = new Scanner(System.in);
            x = scanner.nextInt();
        }
        while (x <= 0 || x > 100 || x % 2 != 0);
        System.out.println("Thank you");


    }
}