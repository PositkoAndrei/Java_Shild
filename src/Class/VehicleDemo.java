package Class;

    class Vehicle {
    int passengers; //количество пассажиров
    int fuelcap; //емкость топливного бака
    int mpg;//потребность топлива в милях на галон
}
    //В этом классе обьявляется обьект типа Vehicle
    class VehicleDemo {
        public static void main(String[] args) {
            Vehicle minivan = new Vehicle();
            int range;

            //присвоить значениям полям в обьекте minivan
            minivan.passengers = 7;
            minivan.fuelcap = 16;
            minivan.mpg = 21;

            //расчитать дальность поездки при полном баке
            range = minivan.fuelcap * minivan.mpg;
            System.out.println("Мини фургон может перевести " +
                    minivan.passengers + " пассажиров на расстояние " +
                    range + " миль!");
        }
    }



