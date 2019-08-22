package Parameters;

class IsFact {
    boolean fact(int a, int b){
        if ((b % a) == 0) {
            return true;
        }else{
            return false;
        }
    }
}

public class Factor {
    public static void main(String[] args) {
    IsFact x = new IsFact();

    if(x.fact(2, 20)) System.out.println("2 - делитель");
    if (x.fact(3, 20)) System.out.println("Эта строка не будет выведена");
    }
}
