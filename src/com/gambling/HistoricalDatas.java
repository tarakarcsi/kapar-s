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


public class HistoricalDatas extends Main{

    private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";


    public List<CarsAndDrivers> createRacer() {
        
        CarsAndDrivers racer4 = new CarsAndDrivers("Kimi Rájkőnen", -1, -1, -1, -1, -1, "default", -1);
        CarsAndDrivers racer1 = new CarsAndDrivers("Májkül Sumaher", -1, -1, -1, -1, -1, "default", -1);
        CarsAndDrivers racer6 = new CarsAndDrivers("Fernándó Álonzó", -1, -1, -1, -1, -1, "default", -1);
        CarsAndDrivers racer7 = new CarsAndDrivers("Rúbensz Bárikelló", -1, -1, -1, -1, -1, "default", -1);
        CarsAndDrivers racer3 = new CarsAndDrivers("Szebásztián Fettel", -1, -1, -1, -1, -1, "default", -1);
        CarsAndDrivers racer8 = new CarsAndDrivers("Máksz Fersztáppen", -1, -1, -1, -1, -1, "default", -1);
        CarsAndDrivers racer9 = new CarsAndDrivers("Szebásztián Lőb", -1, -1, -1, -1, -1, "default", -1);
        CarsAndDrivers racer2 = new CarsAndDrivers("Lújisz Hemilton", -1, -1, -1, -1, -1, "default", -1);
        CarsAndDrivers racer5 = new CarsAndDrivers("Dzsenzon Bátön", -1, -1, -1, -1, -1, "default", -1);
        CarsAndDrivers racer10 = new CarsAndDrivers("Kolin Mekrí", -1, -1, -1, -1, -1, "default", -1);
        
        List <CarsAndDrivers> racers = new ArrayList<>();
        List <CarsAndDrivers> winner = new ArrayList<>();

        
        double maxscore = 10000;
        double score;
        String winnerteam = null;
        
        for (int i = 0; i < racers.size(); i++) {
            score = racers.get(i).getSkill() + racers.get(i).getHorsePower() + racers.get(i).getluckCar() + 
            racers.get(i).getluckDriver() + racers.get(i).getZeroToHundred() + racers.get(i).getWeight();
            
            if(score < maxscore){
                
                maxscore = score;
                winnerteam = racers.get(i).getName() +
                "\n" + racers.get(i).getBrand() +
                "\n" + racers.get(i).getluckCar() +
                "\n" + racers.get(i).getluckDriver() +
                "\n" + racers.get(i).getSkill() +
                "\n" + racers.get(i).getHorsePower() +
                "\n" + racers.get(i).getZeroToHundred() +
                "\n" + racers.get(i).getWeight();
                winner.add(racers.get(i));
            }

        }

        System.out.println(winner);
        
        
        
        // FileWriter fileWriter = new FileWriter("Data.csv");
        // //Add a new line separator after the header
        // fileWriter.append(NEW_LINE_SEPARATOR);
        // //Write a new student object list to the CSV file
        // for (int i = 0; i < 10 / 10; i++) {
            // 	fileWriter.append(String.valueOf(CarsAndDrivers.getName()));
			// 	fileWriter.append(COMMA_DELIMITER);
			// 	fileWriter.append(String.valueOf(student.getAge()));
			// 	fileWriter.append(NEW_LINE_SEPARATOR);
			// }
            
			
			
			// System.out.println("CSV file was created successfully !!!");
			
            
            return racers;
        }
    }