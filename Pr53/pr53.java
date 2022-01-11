package Pr53;

public class pr53 {

    public static void main(String[] args) {
        double j = 1;

        double t = 0;

        double digit=1;
        int m=0;
        for (int i = 0; i < 10000; i++) {
            t =t+ digit*(1 / j);
            System.out.println(t);
            j =j+2;

            digit=digit*(-1);
            m++;

        }
        System.out.println("π="+4*t);
        System.out.println("π/4="+t);
        System.out.println("total is" +t);
        ;
    }
}

