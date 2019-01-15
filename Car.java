import java.util.Random;

public class Car extends CarsAndDrivers {

    // private String brand;
    // private int position;
    // private double horsePower;
    // private double zeroToHundred;
    // private double weight;
    // private double luck2;

    
    public Car(double position, double horsePower, double zeroToHundred, double weight, double luck2) {
        String[] brandList = {"Aszton Martin", "Béjemvé", "Dodzs", "Kilya", "Mázerátti", "Dzsipp", "Kőnigszeg", "Micubicsi", "Krájzler", "Bentli"};
        Random r = new Random();
        brand = brandList[r.nextInt(brandList.length)];
        this.position = 1 + (10 - 0) * r.nextInt();
        this.horsePower = 1 + (10 - 0) * r.nextDouble();
        this.zeroToHundred = 1 + (10 - 0) * r.nextDouble();
        this.weight = 1 + (10 - 0) * r.nextDouble();
        this.luck2 = 1 + (10 - 0) * r.nextDouble();
    }

    public String getBrand() {
        return brand;
    }

    public double getPosition() {
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

    public double getLuck2() {
        return luck2;
    }
}