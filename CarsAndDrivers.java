/**
 * CarsAndDrivers
 */
public class CarsAndDrivers extends Main {

    private String brand;
    private int position;
    private double horsePower;
    private double zeroToHundred;
    private double weight;
    private double luck2;
    private String name;
    private double skill;
    private double luck1;


    Driver driver = new Driver(skill, luck1, name);
    Car car = new Car(position, horsePower, zeroToHundred, weight, luck2);

    public CarsAndDrivers(double skill, double luck1, String name) {
        this.skill = skill;
        this.luck1 = luck1;
        this.name = name;
    }

    public CarsAndDrivers(int position, double horsePower, double zeroToHundred, double weight, double luck2) {
        this.position = position;
        this.horsePower = horsePower;
        this.zeroToHundred = zeroToHundred;
        this.weight = weight;
        this.luck2 = luck2;
    }


    // public CarsAndDrivers(String name, double skill, double luck1, int position, double horsePower, double zeroToHundred, double weight, double luck2) {
    //     this.brand = brand;
    //     this.position = position;
    //     this.horsePower = horsePower;
    //     this.zeroToHundred = zeroToHundred;
    //     this.weight = weight;
    //     this.luck2 = luck2;
    //     this.name = name;
    //     this.skill = skill;
    //     this.luck1 = luck1;
    // }
    
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

    public double getLuck2() {
        return luck2;
    }

    public String getName() {
        return name;
    }

    public double getSkill() {
        return skill;
    }

    public double getLuck1() {
        return luck1;
    }
}