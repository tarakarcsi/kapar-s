/**
 * CarsAndDrivers
 */
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class CarsAndDrivers extends Main {

    private String brand;
    private int position;
    private double horsePower;
    private double zeroToHundred;
    private double weight;
    private double luckCar;
    private String name;
    private double skill;
    private double luckDriver;



    public CarsAndDrivers(String name, double skill, double luckDriver, int position, double horsePower, double zeroToHundred, double weight,String brand, double luckCar) {
        String[] nameList = {"Májkül Sumaher", "Lújisz Hemilton", "Szebásztián Fettel", "Kimi Rájkőnen", "Dzsenzon Bátön", 
            "Fernándó Álonzó", "Rúbensz Bárikelló", "Szebásztián Lőb", "Máksz Fersztáppen", "Kolin Mekrí"};
        Random r = new Random();
        name = nameList[r.nextInt(nameList.length)];
        skill = (10 - 0) * r.nextDouble();
        luckDriver = (10 - 0) * r.nextDouble();
        String[] brandList = {"Aszton Martin", "Béjemvé", "Dodzs", "Kilya", "Mázerátti", "Dzsipp", "Kőnigszeg", "Micubicsi", "Krájzler", "Bentli"};
        brand = brandList[r.nextInt(brandList.length)];
        this.position = ThreadLocalRandom.current().nextInt(1, 10 + 1);
        this.horsePower = (10 - 0) * r.nextDouble();
        this.zeroToHundred = (10 - 0) * r.nextDouble();
        this.weight = (10 - 0) * r.nextDouble();
        this.luckCar = (10 - 0) * r.nextDouble();
        this.brand = brand;
        this.luckCar = luckCar;
        this.name = name;
        this.skill = skill;
        this.luckDriver = luckDriver;
    }
    
    public String getBrand() {
        return brand;
    }

    public int getPosition() {
        return position;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public double getZeroToHundred() {
        return zeroToHundred;
    }

    public double getWeight() {
        return weight;
    }

    public double getluckCar() {
        return luckCar;
    }

    public String getName() {
        return name;
    }

    public double getSkill() {
        return skill;
    }

    public double getluckDriver() {
        return luckDriver;
    }

    @Override
    public String toString() {
        return "\n" + "Driver's name: " + name + "\n" + "The car's name: " + brand + "\n" + 
        "The starting position: " + position + "\n" + "The car's horsepower: " + horsePower * 25 + "\n" + 
        "Zero to hundred speed: " + zeroToHundred / 2 + " seconds" + "\n" + "The car's weight " + weight * 175 + "\n" + 
        "The driver's skill: " + skill + " / 10" + "\n";
    }
}