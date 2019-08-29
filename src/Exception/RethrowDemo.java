package Exception;

class Rethrow {

    public static void genException() {
        int[] number = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < number.length; i++) {

            try {
                System.out.println(number[i] + " / " +
                        denom[i] + " равно " +
                        number[i] / denom[i]);

            } catch (ArithmeticException exc) {
                System.out.println("Попытка деления на нуль");

            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Соответствующий элемент не найден!");

                throw exc;//Повторно сгенерировать исключение
            }
        }
    }
}

class RethrowDemo {
    public static void main(String[] args) {
        try {
            Rethrow.genException();
        } catch (ArrayIndexOutOfBoundsException exc) { //Перехват повторно сгенерированого исключения
            System.out.println("Фатальная ошибка! Выполнение программы прервано!");
        }

    }
}
