import java.util.Random;

public class Driver {

    private double position;
    private double skill;
    private double luck;

    public Driver(double position, double skill, double luck) {
        Random r = new Random();
        this.position = 1 + (11 - 1) * r.nextDouble();
        this.skill = 1 + (11 - 1) * r.nextDouble();
        this.luck = 1 + (11 - 1) * r.nextDouble();
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