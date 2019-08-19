public class ScopeDemo {
    public static void main(String[] args) {
        int x;
        x = 10;

         if (x == 10){ //Область видимости для х и для у!
             int y = 20;

             System.out.println("x and y: " + x + " " + y);
             x = y * 2;
         }
        // y = 100; Эта переменная недоступна
        System.out.println("x is :" + x);
    }
}
