package Pr54;

public class pr54 {

    public static void main(String[] args) {
        double x = 1;
        double y = 1;
        int a = 1;
        int b = 3;

        while(y>1e-15){
            y = y*a/b;
            x += y;
            a++;
            b += 2;
        }
        System.out.println(x*2);
    }
}

