package Array;
import java.util.Arrays;

public class Bubble2 {
    public static void main(String[] args) {
        int[] mass = {225, 45, 1 ,89 ,96, 5, 896, 785, 2, 85247};

        boolean isSoted = false;
        int currentNumber;

        while (!isSoted) {
            isSoted = true;
            for (int i = 0; i < mass.length - 1; i++){
                if (mass[i] > mass[i + 1]){
                    isSoted = false;

                    currentNumber = mass[i];
                    mass[i] = mass[i + 1];
                    mass[i + 1] = currentNumber;
                }
            }

        }
        System.out.println(Arrays.toString(mass));


    }
}
