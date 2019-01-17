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
    private double horsePower2;
    private double zeroToHundred2;
    private double weight2;

    public CarsAndDrivers(String name, double skill, double luckDriver, double horsePower, double zeroToHundred, double weight, double luckCar) {
        
        Random r = new Random();
        String[] brandList = {"Lekszusz", "Béjemvé", "Dodzs", "Kilya", "Pözsó", "Dzsipp", "Kőnigszeg", "Micubicsi", "Krájzler", "Rojsz Rojsz"};
        int carIndex = r.nextInt(brandList.length-1);
        
        String brand = brandList[carIndex];
        
        switch (brand) {
            case "Lekszusz":
            horsePower2 = 4;
            weight2 = 4;
            zeroToHundred2 = 3;
            break;
            
            case "Béjemvé":
            horsePower2 = 8;
            weight2 = 2;
            zeroToHundred2 = 8;
            break;
            
            case "Dodzs":
            horsePower2 = 7;
            weight2 = 8;
            zeroToHundred2 = 6;
            break;
            
            case "Kilya":
            horsePower2 = 10;
            weight2 = 1;
            zeroToHundred2 = 10;
            break;
            
            case "Pözsó":
            horsePower2 = 5;
            weight2 = 5;
            zeroToHundred2 = 2;
            break;
            
            case "Dzsipp":
            horsePower2 = 6;
            weight2 = 10;
            zeroToHundred2 = 7;
            break;
            
            case "Kőnigszeg":
            horsePower2 = 1;
            weight2 = 6;
            zeroToHundred2 = 1;
            break;
            
            case "Micubicsi":
            horsePower2 = 9;
            weight2 = 3;
            zeroToHundred2 = 9;
            break;
            
            case "Krájzler":
            horsePower2 = 3;
            weight2 = 9;
            zeroToHundred2 = 4;
            break;
            
            case "Rojsz Rojsz":
            horsePower2 = 2;
            weight2 = 7;
            zeroToHundred2 = 5;
            break;
            
        }
        this.brand = brandList[r.nextInt(brandList.length)];
        this.skill = (10 - 0) * r.nextDouble();
        this.luckDriver = (10 - 0) * r.nextDouble();
        this.luckCar = (10 - 0) * r.nextDouble();
        this.name = name;
        this.horsePower = horsePower2;
        this.weight = weight2;
        this.zeroToHundred = zeroToHundred2;
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

        double skillFlipped = Math.abs(skill - 10);
        double luckDriverFlipped = Math.abs(luckDriver - 10);
        double luckCarFlipped = Math.abs(luckCar - 10);

        return "\n" + "Driver's name: " + name + "\n" + "The car's name: " + brand + "\n" + 
        "\n" + "The car's horsepower: " + horsePower + "\n" + 
        "Zero to hundred speed: " + zeroToHundred + "\n" + "The car's weight " + weight + "\n" + 
        "The driver's skill: " + skillFlipped + " / 10" + "\n" + "Driver's luck: " + luckDriverFlipped + " / 10" + "\n" + 
        "Car's luck: " + luckCarFlipped + " / 10" + "\n";
    }
}