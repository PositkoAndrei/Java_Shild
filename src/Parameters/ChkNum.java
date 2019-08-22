package Parameters;

class EvenNum {
    boolean isEven(int x) {
        if ((x % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}


public class ChkNum {
    public static void main(String[] args) {
        EvenNum e = new EvenNum();

        if (e.isEven(10)) System.out.println("10 - is even number");
        if (e.isEven(9)) System.out.println("9 - is even number");
        if (e.isEven(8)) System.out.println("8 - is even number");
    }

}
