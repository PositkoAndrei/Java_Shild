public class InchToMeter{
    public static void main(String[] args) {
        double inches, meters;
        int counter;

        counter = 0;
        for (inches = 1; inches <= 100; inches++){
            meters = inches * 0.0254;
            System.out.println(inches + " дюймам соответствует " + meters + " метров");
            counter++;
            if (counter == 12){
                System.out.println();
                counter = 0;
            }
        }
    }
}

