package Class;

class Vehicle3 {
    int passengers;
    int fuelcap;
    int mpg;

    //Отобразит дальность поездки транспортного средства
    int range() {
        return fuelcap * mpg; //Возвратит дальность поездки для заданного ТЗ

        //System.out.println("Дальность - " + fuelcap * mpg + " миль!");
    }
}
class RetMethVehicle {
    public static void main(String[] args) {
        Vehicle3 minivan = new Vehicle3();
        Vehicle3 sportscar = new Vehicle3();

        int range1, range2;

        //Присвоить значениям полям в обьекте minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //Присвоить значение в обьекте sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        //Получить дальность поездки для разных транспортных средств
        //range1 = minivan.range();
        //range2 = sportscar.range();

        System.out.println("Мини фургон может перевезти " +
                minivan.passengers + " пассажиров " + " на расстояние " +
                minivan.range() + " миль!");


        System.out.println("Спортивный автомобиль может перевезти " +
                sportscar.passengers + " пассажиров " + " на расстояние " +
                sportscar.range() + " миль!");

        if (minivan.range() > sportscar.range()) {
            System.out.println("Минивет проедет дальше за спорткар");
        }else {
            System.out.println("Спорткар проедет дальше!");
        }


    }
}




