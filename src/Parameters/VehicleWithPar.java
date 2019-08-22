package Parameters;

class Vehicle3 {
    int passengers;
    int fuelcap;
    int mpg;

    //Отобразит дальность поездки транспортного средства
    int range() {
        return fuelcap * mpg; //Возвратит дальность поездки для заданного ТЗ
    }

        //Расчитать обьем топлива, необходимого ТЗ для преодоленя расстояния
        double fuelneeded ( int miles){
            return (double) miles / mpg;
        }
    }


public class VehicleWithPar {
        public static void main(String[] args) {
            Vehicle3 minivan = new Vehicle3();
            Vehicle3 sportscar = new Vehicle3();

            double gallons;
            int dist = 252;

            //Присвоить значениям полям в обьекте minivan
            minivan.passengers = 7;
            minivan.fuelcap = 16;
            minivan.mpg = 21;

            //Присвоить значение в обьекте sportscar
            sportscar.passengers = 2;
            sportscar.fuelcap = 14;
            sportscar.mpg = 12;

            gallons = minivan.fuelneeded(dist);

            System.out.println("Для преодоления " + dist +
                    " миль мини фургону требуется " +
                    gallons + " галлонов топлива!");

            gallons = sportscar.fuelneeded(dist);

            System.out.println("Для преодоления " + dist +
                    " миль спорткару требуется " +
                    gallons + " галлонов топлива!");
            }


        }







