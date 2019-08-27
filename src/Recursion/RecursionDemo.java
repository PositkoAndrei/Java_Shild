package Recursion;

class Ex {

    public int factLoop(int n) {
        int result = 1;

        if (n == 1 || n == 0) {
            return result;
        }

        result = n * factLoop(n - 1);
        return result;
    }
}

public class RecursionDemo {
    public static void main(String[] args) {
        Ex ob = new Ex();
        System.out.println(ob.factLoop(5));

    }
}


