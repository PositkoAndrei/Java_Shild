package ConditionalOp;

public class GameGuess {
    public static void main(String[] args)
        throws java.io.IOException {
            char ch, answer = 'S';

            System.out.println("Задуманная буква из диапазона A-Z.");
            System.out.println("Попытайтесь ее угадать: ");

            ch = (char) System.in.read();

            if (ch == answer) {
                System.out.println("Правильно!)");
            }else{
                System.out.print("...Извините, нужная буква находится ");
                if (ch < answer) {
                    System.out.println("ближе к концу алфавита");
                }else{
                    System.out.println("ближе к началу алфавита");
                }
                }


        }

    }

