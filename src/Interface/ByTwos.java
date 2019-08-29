package Interface;

class Realiz implements Series {

    int start;
    int val;
    int prev;

    Realiz(){
        start = 0;
        val = 0;
        prev = -2;
    }

    public int getNext(){
        prev = val;
        val += 2;
        return val;
    }

    public void reset(){
        start = 0;
        val = 0;
        prev = -2;
    }

    public void setStart(int x){
        start = x;
        val = x;
        prev = x - 2;
    }
    int getPrevious(){
        return prev;
    }
}
public class ByTwos{
    public static void main(String[] args) {
        Realiz ob = new Realiz();

        for (int i = 0; i < 5; i++){
            System.out.println("Следующее значение " +
                    ob.getNext());
        }
        System.out.println("\nСброс");

        ob.reset();

        for (int i = 0; i < 5; i++){
            System.out.println("Следующее значение " +
                    ob.getNext());
        }
        System.out.println("\nНачальное значение: 100");

        ob.setStart(100);

        for (int i = 0; i < 5; i++){
            System.out.println("Следующее значение " +
                    ob.getNext());
        }
        ob.getPrevious();
        System.out.println("Предыдущее значение " + ob.getPrevious());
    }
}

