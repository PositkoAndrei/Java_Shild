package Class;

class Vehicle1 {
    int passengers;
    int fuelcap;
    int mpg;
}

public class TwoVehicles {
    public static void main(String[] args) {
        Vehicle1 minivan = new Vehicle1();
        Vehicle1 sportscar = new Vehicle1();

        int range1, range2;

        //Присвоить значениям полям в обьекте minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //Присвоить значение в обьекте sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        //расчитать дальность поездки при полном баке
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;

        System.out.println("Мини фургон может перевезти " +
                minivan.passengers + " пассажиров на расстояние " +
                range1 + " миль");
        System.out.println("Спортивный автомобиль может перевезти " +
                sportscar.passengers + " пассажиров на расстояние " +
                range2 + " миль");
    }

}
