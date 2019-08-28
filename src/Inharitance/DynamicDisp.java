package Inharitance;

class Sup {
    void who(){
        System.out.println("who() в Sup");
    }
}
class Sup1 extends Sup{
    void who(){
        System.out.println("who() в Sup1");
    }
}
class Sup2 extends Sup{
    void who(){
        System.out.println("who в Sup2");
    }
}

public class DynamicDisp {
    public static void main(String[] args) {

        Sup superOb = new Sup();
        Sup1 subOb1 = new Sup1();
        Sup2 subOb2 = new Sup2();

        Sup supRef;

        supRef = superOb;
        supRef.who();

        supRef = subOb1;
        supRef.who();

        supRef = subOb2;
        supRef.who();

    }
}