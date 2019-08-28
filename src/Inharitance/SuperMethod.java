package Inharitance;

class A {
    int i;
}
class B extends A{
    int i;//эта переменная i скрывает переменную i из класса A

    B(int a, int b){
        super.i = a;//переменная i из класса А
        i = b;//переменная i из класса В
    }
    void show(){
        System.out.println("i в суперклассе - " + super.i);
        System.out.println("i в подклассе - " + i);
    }
}
public class SuperMethod {
    public static void main(String[] args) {
        B ob = new B(5, 10);

        ob.show();
    }

}
