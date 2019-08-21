package ConditionalOp;

public class ContinueDemo {
    public static void main(String[] args) {
        int i;

        //Выести четные числа в пределах от 0 до 100
        for (i = 0; i <= 100; i++) {
            if ((i % 2) != 0) continue;
            System.out.println(i);
        }
    }


}
