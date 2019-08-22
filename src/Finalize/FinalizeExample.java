package Finalize;

class FDemo {
    int x;
     FDemo (int i) {
         x = i;
     }
     //Вызывается при удалении обьекта
    protected void finalize() {
        System.out.println("Финализация " + x);
    }
    //Генерируется обьект, который сразу уничтожается
    void generator (int i) {
         FDemo obj = new FDemo(i);
    }
}
public class FinalizeExample {
    public static void main(String[] args) {
        int count;

        FDemo object = new FDemo(0);
        /*Генерируется большое количество обьектов.
        В какой то момент времени должна начаться сборка мусора.
        Примечание: возможно, для того чтобы активизировать
        систему сборки мусора, количество генерируемых обьектов
        придется увеличить.*/
        for (count = 1; count < 100000; count++)
            object.generator(count);
    }


}
