package Class;

class Ret {
    void myMeth() {
        int i;
        for (i = 0; i < 10; i++) {
            if (i == 5) return;
            System.out.println(i);

        }
    }
}

public class Return {
    public static void main(String[] args) {
        Ret my = new Ret();
        my.myMeth();
        System.out.println();

    }

}


