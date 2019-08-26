package MethodObj;

public class ParametTimeMach {

    public void goToFuture(int currentYear){
        currentYear = currentYear + 10;
    }
    public void goToPast(int currentYear) {
        currentYear = currentYear - 10;
        System.out.println(currentYear);
    }

    public static void main(String[] args) {

        ParametTimeMach timeMachine = new ParametTimeMach();
        int currentYear = 2018;

        System.out.println("Какой сейчас год?");
        System.out.println(currentYear);

        timeMachine.goToPast(currentYear);
        System.out.println("А сейчас?");
        System.out.println(currentYear);
    }
}
