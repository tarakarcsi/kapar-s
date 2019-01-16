/**
 * CarsAndDrivers
 */
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;
import java.util.List;

public class CarsAndDrivers extends Main {

    private String brand;
    private String name;
    private double horsePower;
    private double zeroToHundred;
    private double weight;
    private double luckCar;
    private double skill;
    private double luckDriver;

    public CarsAndDrivers(String name, double skill, double luckDriver, double horsePower, double zeroToHundred, double weight,String brand, double luckCar) {
        // String[] nameList = {"Májkül Sumaher", "Lújisz Hemilton", "Szebásztián Fettel", "Kimi Rájkőnen", "Dzsenzon Bátön", 
        //     "Fernándó Álonzó", "Rúbensz Bárikelló", "Szebásztián Lőb", "Máksz Fersztáppen", "Kolin Mekrí"};
        Random r = new Random();
        // name = nameList[r.nextInt(nameList.length)];
        skill = (10 - 0) * r.nextDouble();
        luckDriver = (10 - 0) * r.nextDouble();
        String[] brandList = {"Lekszusz", "Béjemvé", "Dodzs", "Kilya", "Pözsó", "Dzsipp", "Kőnigszeg", "Micubicsi", "Krájzler", "Rojsz Rojsz"};
        brand = brandList[r.nextInt(brandList.length)];
        // this.position = ThreadLocalRandom.current().nextInt(1, 10 + 1);
        switch (brand) {
            case "Lekszusz":
                this.horsePower = 4;
                this.weight = 4;
                this.zeroToHundred = 3;
                break;

            case "Béjemvé":
                this.horsePower = 8;
                this.weight = 2;
                this.zeroToHundred = 8;
                break;

            case "Dodzs":
                this.horsePower = 7;
                this.weight = 8;
                this.zeroToHundred = 6;
                break;

            case "Kilya":
                this.horsePower = 10;
                this.weight = 1;
                this.zeroToHundred = 10;
                break;

            case "Pözsó":
                this.horsePower = 5;
                this.weight = 5;
                this.zeroToHundred = 2;
                break;

            case "Dzsipp":
                this.horsePower = 6;
                this.weight = 10;
                this.zeroToHundred = 7;
                break;

            case "Kőnigszeg":
                this.horsePower = 1;
                this.weight = 6;
                this.zeroToHundred = 1;
                break;

            case "Micubicsi":
                this.horsePower = 9;
                this.weight = 3;
                this.zeroToHundred = 9;
                break;

            case "Krájzler":
                this.horsePower = 3;
                this.weight = 9;
                this.zeroToHundred = 4;
                break;

            case "Rojsz Rojsz":
                this.horsePower = 2;
                this.weight = 7;
                this.zeroToHundred = 5;
                break;

        }
        
        this.luckCar = (10 - 0) * r.nextDouble();
        this.brand = brand;
        this.name = name;
        this.skill = skill;
        this.luckDriver = luckDriver;
    }
    
    public String getBrand() {
        return brand;
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
        double newVariable1 = Math.abs(skill - 10);
        double newVariable2 = Math.abs(luckDriver - 10);
        double newVariable3 = Math.abs(luckCar - 10);
        return "\n" + "Driver's name: " + name + "\n" + "The car's name: " + brand + "\n" + 
        "\n" + "The car's horsepower: " + horsePower + "\n" + 
        "Zero to hundred speed: " + zeroToHundred + "\n" + "The car's weight " + weight + "\n" + 
        "The driver's skill: " + newVariable1 + " / 10" + "\n" + "Driver's luck: " + newVariable2 + " / 10" + "\n" + 
        "Car's luck: " + newVariable3 + " / 10" + "\n";
    }
}