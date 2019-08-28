package Inharitance;

class Vehicle{
    private int passengers;
    private int fuelcap;
    private int mpg;

    //Конструктор
    Vehicle(int p, int f, int m){
        passengers = p;
        fuelcap = f;
        mpg = m;
    }
    //Возвратить дальность поездки ТС
    int range(){
        return mpg * fuelcap;
    }
    //Обьем топлива для заданого пути
    double fuelneeded(int miles){
        return (double) miles / mpg;
    }
    int getPassengers(){
        return passengers;
    }
    int getFuelcap(){
        return fuelcap;
    }
    int getMpg(){
        return mpg;
    }
    void setPassengers(int p){
        passengers = p;
    }
    void setFuelcap(int f){
        fuelcap = f;
    }
    void setMpg(int m){
        mpg = m;
    }
}
class Truck extends Vehicle{
    private int cargocap; //грузоподьемность

    //Конструктор класса Truck
    Truck(int p, int f, int m, int c){
        super(p, f, m);
        cargocap = c;
    }
    int getCargocap(){
        return cargocap;
    }
    void setCargocap(int c){
        cargocap = c;
    }
}

public class VehicleInh {
    public static void main(String[] args) {
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);

        double gallons;
        int dist = 252;

        gallons = semi.fuelneeded(dist);

        System.out.println("Грузовик может перевезти " + semi.getCargocap() +
                "фунтов");
        System.out.println("Для преодоления " + dist + " миль грузовику требуется " +
                gallons + " галлонов топлива\n");

        gallons = pickup.fuelneeded(dist);

        System.out.println("Пикап может перевезти " + pickup.getCargocap() +
                "фунтов");
        System.out.println("Для преодоления " + dist + " миль пикапу требуется " +
                gallons + " галлонов топлива");

    }

}
