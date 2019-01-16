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
        String[] nameList = {"Májkül Sumaher", "Lújisz Hemilton", "Szebásztián Fettel", "Kimi Rájkőnen", "Dzsenzon Bátön", 
            "Fernándó Álonzó", "Rúbensz Bárikelló", "Szebásztián Lőb", "Máksz Fersztáppen", "Kolin Mekrí"};
        Random r = new Random();
        skill = (10 - 0) * r.nextDouble();
        luckDriver = (10 - 0) * r.nextDouble();
        String[] brandList = {"Lekszusz", "Béjemvé", "Dodzs", "Kilya", "Pözsó", "Dzsipp", "Kőnigszeg", "Micubicsi", "Krájzler", "Rojsz Rojsz"};
        this.position = ThreadLocalRandom.current().nextInt(1, 10 + 1);
        List <Integer> positions = new ArrayList<>();
        List <String> names = new ArrayList<>();
        brand = brandList[r.nextInt(brandList.length)];
        name = nameList[r.nextInt(nameList.length)];
        CarsAndDrivers racer1 = new CarsAndDrivers("asd", 12.0, 12.0, 1, 2, 2, 2, "Lekszusz", 2);
        // CarsAndDrivers racer2 = new CarsAndDrivers(name, skill, luckDriver, position, horsePower, zeroToHundred, weight, brand, luckCar);
        // CarsAndDrivers racer3 = new CarsAndDrivers(name, skill, luckDriver, position, horsePower, zeroToHundred, weight, brand, luckCar);
        // CarsAndDrivers racer4 = new CarsAndDrivers(name, skill, luckDriver, position, horsePower, zeroToHundred, weight, brand, luckCar);
        // CarsAndDrivers racer5 = new CarsAndDrivers(name, skill, luckDriver, position, horsePower, zeroToHundred, weight, brand, luckCar);
        // CarsAndDrivers racer6 = new CarsAndDrivers(name, skill, luckDriver, position, horsePower, zeroToHundred, weight, brand, luckCar);
        // CarsAndDrivers racer7 = new CarsAndDrivers(name, skill, luckDriver, position, horsePower, zeroToHundred, weight, brand, luckCar);
        // CarsAndDrivers racer8 = new CarsAndDrivers(name, skill, luckDriver, position, horsePower, zeroToHundred, weight, brand, luckCar);
        // CarsAndDrivers racer9 = new CarsAndDrivers(name, skill, luckDriver, position, horsePower, zeroToHundred, weight, brand, luckCar);
        // CarsAndDrivers racer10 = new CarsAndDrivers(name, skill, luckDriver, position, horsePower, zeroToHundred, weight, brand, luckCar);

        List <CarsAndDrivers> liszt = new ArrayList<>();
        liszt.add(racer1);
        // liszt.add(racer2);
        // liszt.add(racer3);
        // liszt.add(racer4);
        // liszt.add(racer5);
        // liszt.add(racer6);
        // liszt.add(racer7);
        // liszt.add(racer8);
        // liszt.add(racer9);
        // liszt.add(racer10);

        return liszt;
    }
    
}