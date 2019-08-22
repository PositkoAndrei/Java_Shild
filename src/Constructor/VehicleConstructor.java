package Constructor;

class Vehicle3 {
    int passengers;
    int fuelcap;
    int mpg;

    Vehicle3(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    int range() {
        return mpg * fuelcap;
    }

    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}

public class VehicleConstructor {
    public static void main(String[] args) {
        Vehicle3 minivan = new Vehicle3(7, 16, 21);
        Vehicle3 sportscar = new Vehicle3(2, 14, 12);
        double gallons;
        int dist = 252;
        int range1, range2;

        gallons = minivan.fuelneeded(dist);


        System.out.println("Для преодоления " + dist +
                " миль мини фургону требуется " +
                gallons + " галлонов топлива!");
        range1 = minivan.range();
        System.out.println("Минивен проедет " + range1 + " миль!");


        gallons = sportscar.fuelneeded(dist);

        System.out.println("Для преодоления " + dist +
                " миль спорткару требуется " +
                gallons + " галлонов топлива!");

        range2 = sportscar.range();
        System.out.println("Спорткар проедет " + range2 + " миль!");

    }

}
