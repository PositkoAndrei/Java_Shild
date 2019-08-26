package MethodObj;

public class TimeMachCat {

    public void goToFuture(Cat cat){
        cat.age +=10;
    }
    public void goToPast(Cat cat){
        cat.age -= 10;
    }
    public static class Cat{
        int age;

        public Cat(int age){
            this.age = age;
        }
    }

    public static void main(String[] args) {
        TimeMachCat timeMachine = new TimeMachCat();
        Cat barsik = new Cat(5);

        System.out.println("Сколько лет Барсику в начале работы проги?");
        System.out.println(barsik.age);

        timeMachine.goToFuture(barsik);
        System.out.println("А теперь?");
        System.out.println(barsik.age);

        System.out.println("Барсик постарел на 10 лет. Вернуть обратно!");

        timeMachine.goToPast(barsik);
        System.out.println("Получилось? Мы вернули коту его изначальный возраст?");
        System.out.println(barsik.age);

    }
}
