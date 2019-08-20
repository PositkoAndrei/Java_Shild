package Assingment;

public class Ex {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            for (int b = 2; b < i; b++ )
           if (i % b == 0)
            System.out.println(i);
        }
    }
}


