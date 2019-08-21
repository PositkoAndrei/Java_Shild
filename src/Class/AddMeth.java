package Class;

class Vehicle2 {
    int passengers;
    int fuelcap;
    int mpg;

    //Отобразит дальность поездки транспортного средства
    void range() {
        System.out.println("Дальность - " + fuelcap * mpg + " миль!");
    }
}

public class AddMeth {
    public static void main(String[] args) {
        Vehicle2 minivan = new Vehicle2();
        Vehicle2 sportscar = new Vehicle2();

        int range1, range2;

        //Присвоить значениям полям в обьекте minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //Присвоить значение в обьекте sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        System.out.print("Мини фургон может перевезти " +
                minivan.passengers + " пассажиров. ");
        minivan.range();

        System.out.print("Спортивный автомобиль может перевезти " +
                sportscar.passengers + " пассажиров. ");
        sportscar.range();

    }
}
