import java.util.Random;

public class Driver extends Main {

    private int position;
    private double skill;
    private double luck;

    public Driver(double position, double skill, double luck) {
        Random r = new Random();
        this.position = 1 + (10 - 0) * r.nextInt();
        this.skill = 1 + (10 - 0) * r.nextDouble();
        this.luck = 1 + (10 - 0) * r.nextDouble();
    }

    public double getPostion() {
        return position;
    }

    public double getSkill() {
        return skill;
    }

    public double getLuck() {
        return luck;
    }

}