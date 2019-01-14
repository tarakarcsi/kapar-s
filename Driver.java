import java.util.Random;

public class Driver extends Main {

    private String name;
    private int position;
    private double skill;
    private double luck;

    public Driver(double position, double skill, double luck) {
        String[] nameList = {"Májkül Sumaher", "Lújisz Hemilton", "Szebásztián Fettel", "Kimi Rájkőnen", "Dzsenzon Bátön", 
            "Fernándó Álonzó", "Rúbensz Bárikelló", "Szebásztián Lőb", "Máksz Fersztáppen", "Kolin Mekrí"};
        Random r = new Random();
        name = nameList[r.nextInt(nameList.length)];
        this.position = 1 + (10 - 0) * r.nextInt();
        this.skill = 1 + (10 - 0) * r.nextDouble();
        this.luck = 1 + (10 - 0) * r.nextDouble();
    }

    public String getName() {
        return name;
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