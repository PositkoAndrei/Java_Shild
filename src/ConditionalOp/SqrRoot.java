package ConditionalOp;

public class SqrRoot {
    public static void main(String[] args) {
        double num, sroot, serr;

        for (num = 1.0; num < 100.0; num++){
            sroot = Math.sqrt(num);
            System.out.println("Корень квадратный из " +
                    num + " равен " + sroot);

            serr = num - (sroot * sroot);
            System.out.println("Ошибка округления " + serr);
            System.out.println();
        }
    }
}
