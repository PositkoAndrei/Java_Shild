import java.util.Scanner;

public class WeightOnTheMoon {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш вес:");
        System.out.println("Ваш вес на Луне составит: " + scanner.nextDouble() * 0.17);
    }
}
