import java.util.Random;

public class Driver extends CarsAndDrivers {

    // private String name;
    // private double skill;
    // private double luck1;

    public Driver(double skill, double luck1, String name) {
        super(skill, luck1, name);
        String[] nameList = {"Májkül Sumaher", "Lújisz Hemilton", "Szebásztián Fettel", "Kimi Rájkőnen", "Dzsenzon Bátön", 
            "Fernándó Álonzó", "Rúbensz Bárikelló", "Szebásztián Lőb", "Máksz Fersztáppen", "Kolin Mekrí"};
        Random r = new Random();
        name = nameList[r.nextInt(nameList.length)];
        skill = 1 + (10 - 0) * r.nextDouble();
        luck1 = 1 + (10 - 0) * r.nextDouble();
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