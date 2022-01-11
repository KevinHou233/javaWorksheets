package Pr28;

public class pr28 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i <= 1000000; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                //System.out.println(i);
                counter++;
            }
        }
        System.out.println(counter);
    }
}

