import java.util.Random;

public class Car {

    private String brand;
    private int position;
    private double horsePower;
    private double zeroToHundred;
    private double weight;
    private double luck;

    // public double generateLuck(double n) {
    //     Random rand = new Random();
    //     n = rand.nextInt(10) + 1;
    //     return n;
    // }

    public Car(double position, double horsePower, double zeroToHundred, double weight, double luck) {
        String[] brandList = {"Aszton Martin", "Béjemvé", "Dodzs", "Kilya", "Mázerátti", "Dzsipp", "Kőnigszeg", "Micubicsi", "Krájzler", "Bentli"};
        Random r = new Random();
        brand = brandList[r.nextInt(brandList.length)];
        this.position = 1 + (10 - 0) * r.nextInt();
        this.horsePower = 1 + (10 - 0) * r.nextDouble();
        this.zeroToHundred = 1 + (10 - 0) * r.nextDouble();
        this.weight = 1 + (10 - 0) * r.nextDouble();
        this.luck = 1 + (10 - 0) * r.nextDouble();
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

    public double getLuck() {
        return luck;
    }
}