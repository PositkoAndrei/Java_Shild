package Static;

class SDemo {
    int x; //обычная переменная экземпляра
    static int y; //статическая переменная

    //Возвратить сумму значенийпеременной экземпляра х и
    //статической переменной у

    int sum(){
        return x + y;
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        SDemo ob1 = new SDemo();
        SDemo ob2 = new SDemo();

        //У каждого обьекта имеется своя копия
        //переменной экземпляра
        ob1.x = 10;
        ob2.x = 20;
        System.out.println("Разумеется, ob1.x and ob2.x " + " независимы");
        System.out.println("ob1.x: " + ob1.x +
                            "\nob2.x: " + ob2.x);
        System.out.println();

        //Все обьекты совместно используют одну общую
        //копию статической переменной
        System.out.println("Статическая переменная у - общая");
        SDemo.y = 19;
        System.out.println("Присвоить SDemo.y значение 19");

        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();

        SDemo.y = 100;
        System.out.println("Изменить значение SDemo.y на 100");

        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();
    }

}
