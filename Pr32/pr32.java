package Pr32;

import java.util.Scanner;

public class pr32 {
    public static void main(String[] args) {
        int x=1;
        int i=0;
        Scanner scanner= new Scanner(System.in);
        String str2 = scanner.nextLine();
        do
        { i++;
        } while (x % i != 0);
        System.out.println(x + " is divisible by " + i);
    }

}
