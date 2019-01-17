/**
 * HistoricalDatas
 */

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class HistoricalDatas extends Main{

    public String winnerteam() {
        
        CarsAndDrivers racer1 = new CarsAndDrivers("Kimi Rájkőnen", -1, -1, -1, -1, -1, -1);
        CarsAndDrivers racer2 = new CarsAndDrivers("Májkül Sumaher", -1, -1, -1, -1, -1, -1);
        CarsAndDrivers racer3 = new CarsAndDrivers("Fernándó Álonzó", -1, -1, -1, -1, -1, -1);
        CarsAndDrivers racer4 = new CarsAndDrivers("Rúbensz Bárikelló", -1, -1, -1, -1, -1, -1);
        CarsAndDrivers racer5 = new CarsAndDrivers("Szebásztián Fettel", -1, -1, -1, -1, -1, -1);
        CarsAndDrivers racer6 = new CarsAndDrivers("Máksz Fersztáppen", -1, -1, -1, -1, -1, -1);
        CarsAndDrivers racer7 = new CarsAndDrivers("Szebásztián Lőb", -1, -1, -1, -1, -1, -1);
        CarsAndDrivers racer8 = new CarsAndDrivers("Lújisz Hemilton", -1, -1, -1, -1, -1, -1);
        CarsAndDrivers racer9 = new CarsAndDrivers("Dzsenzon Bátön", -1, -1, -1, -1, -1, -1);
        CarsAndDrivers racer10 = new CarsAndDrivers("Kolin Mekrí", -1, -1, -1, -1, -1, -1);

        
        List <CarsAndDrivers> racers = new ArrayList<>();
        List <String> winner = new ArrayList<>();

        racers.add(racer1);
        racers.add(racer2);
        racers.add(racer3);
        racers.add(racer4);
        racers.add(racer5);
        racers.add(racer6);
        racers.add(racer7);
        racers.add(racer8);
        racers.add(racer9);
        racers.add(racer10);

        double maxscore = 10000;
        double score;
        String winnerteam = null;
        
        for (int i = 0; i < racers.size(); i++) {
            score = racers.get(i).getSkill() + racers.get(i).getHorsePower() + racers.get(i).getluckCar() + 
            racers.get(i).getluckDriver() + racers.get(i).getZeroToHundred() + racers.get(i).getWeight();
            
            if(score < maxscore){
                
                maxscore = score;
                winnerteam = racers.get(i).getName() +
                ", " + racers.get(i).getBrand() +
                ", " + racers.get(i).getluckCar() +
                ", " + racers.get(i).getluckDriver() +
                ", " + racers.get(i).getSkill() +
                ", " + racers.get(i).getHorsePower() +
                ", " + racers.get(i).getZeroToHundred() +
                ", " + racers.get(i).getWeight() + "\n";
                
            }
            
        }
            winner.add(winnerteam);

            return winnerteam;
        }

        public void generateData(){
            try{
                PrintWriter pw = new PrintWriter(new FileWriter(("Data.csv"), true));
                PrintWriter pw2 = new PrintWriter(new FileWriter("SingleRace.csv"));
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                sb.append(winnerteam());
                sb2.append(winnerteam());
                pw.append(sb.toString());
                pw2.append(sb.toString());
                pw.close();
                pw2.close();
            }catch(Exception e) {
                System.out.println("file not found exception");
            }
        }

    }