/**
 * HistoricalDatas
 */



import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class HistoricalDatas extends Main{
    private String brand;
    private int position;
    private double horsePower;
    private double zeroToHundred;
    private double weight;
    private double luckCar;
    private String name;
    private double skill;
    private double luckDriver;

    public List<CarsAndDrivers> createRacer() {
        
        CarsAndDrivers racer1 = new CarsAndDrivers("default", -1, -1, -1, -1, -1, -1, "default", -1);
        CarsAndDrivers racer2 = new CarsAndDrivers("default", -1, -1, -1, -1, -1, -1, "default", -1);
        CarsAndDrivers racer3 = new CarsAndDrivers("default", -1, -1, -1, -1, -1, -1, "default", -1);
        CarsAndDrivers racer4 = new CarsAndDrivers("default", -1, -1, -1, -1, -1, -1, "default", -1);
        CarsAndDrivers racer5 = new CarsAndDrivers("default", -1, -1, -1, -1, -1, -1, "default", -1);
        CarsAndDrivers racer6 = new CarsAndDrivers("default", -1, -1, -1, -1, -1, -1, "default", -1);
        CarsAndDrivers racer7 = new CarsAndDrivers("default", -1, -1, -1, -1, -1, -1, "default", -1);
        CarsAndDrivers racer8 = new CarsAndDrivers("default", -1, -1, -1, -1, -1, -1, "default", -1);
        CarsAndDrivers racer9 = new CarsAndDrivers("default", -1, -1, -1, -1, -1, -1, "default", -1);
        CarsAndDrivers racer10 = new CarsAndDrivers("default", -1, -1, -1, -1, -1, -1, "default", -1);


        List <CarsAndDrivers> liszt = new ArrayList<>();
        for (int i = 0; i < 10 / 10; i++) {
            liszt.add(racer1);
            liszt.add(racer2);
            liszt.add(racer3);
            liszt.add(racer4);
            liszt.add(racer5);
            liszt.add(racer6);
            liszt.add(racer7);
            liszt.add(racer8);
            liszt.add(racer9);
            liszt.add(racer10);    
        }
        return liszt;
    }
    
}