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
        
        CarsAndDrivers racer1 = new CarsAndDrivers("Májkül Sumaher", -1, -1, -1, -1, -1, "default", -1);
        CarsAndDrivers racer2 = new CarsAndDrivers("Lújisz Hemilton", -1, -1, -1, -1, -1, "default", -1);
        CarsAndDrivers racer3 = new CarsAndDrivers("Szebásztián Fettel", -1, -1, -1, -1, -1, "default", -1);
        CarsAndDrivers racer4 = new CarsAndDrivers("Kimi Rájkőnen", -1, -1, -1, -1, -1, "default", -1);
        CarsAndDrivers racer5 = new CarsAndDrivers("Dzsenzon Bátön", -1, -1, -1, -1, -1, "default", -1);
        CarsAndDrivers racer6 = new CarsAndDrivers("Fernándó Álonzó", -1, -1, -1, -1, -1, "default", -1);
        CarsAndDrivers racer7 = new CarsAndDrivers("Rúbensz Bárikelló", -1, -1, -1, -1, -1, "default", -1);
        CarsAndDrivers racer8 = new CarsAndDrivers("Máksz Fersztáppen", -1, -1, -1, -1, -1, "default", -1);
        CarsAndDrivers racer9 = new CarsAndDrivers("Szebásztián Lőb", -1, -1, -1, -1, -1, "default", -1);
        CarsAndDrivers racer10 = new CarsAndDrivers("Kolin Mekrí", -1, -1, -1, -1, -1, "default", -1);
        double score1;
        double score2;
        double score3;
        double score4;
        double score5;
        double score6;
        double score7;
        double score8;
        double score9;
        double score10;

        score1 = racer1.getHorsePower() + racer1.getWeight() + racer1.getZeroToHundred() + racer1.getluckCar() + racer1.getluckDriver() + racer1.getSkill();
        score2 = racer2.getHorsePower() + racer2.getWeight() + racer2.getZeroToHundred() + racer2.getluckCar() + racer2.getluckDriver() + racer2.getSkill();
        score3 = racer3.getHorsePower() + racer3.getWeight() + racer3.getZeroToHundred() + racer3.getluckCar() + racer3.getluckDriver() + racer3.getSkill();
        score4 = racer4.getHorsePower() + racer4.getWeight() + racer4.getZeroToHundred() + racer4.getluckCar() + racer4.getluckDriver() + racer4.getSkill();
        score5 = racer5.getHorsePower() + racer5.getWeight() + racer5.getZeroToHundred() + racer5.getluckCar() + racer5.getluckDriver() + racer5.getSkill();
        score6 = racer6.getHorsePower() + racer6.getWeight() + racer6.getZeroToHundred() + racer6.getluckCar() + racer6.getluckDriver() + racer6.getSkill();
        score7 = racer7.getHorsePower() + racer7.getWeight() + racer7.getZeroToHundred() + racer7.getluckCar() + racer7.getluckDriver() + racer7.getSkill();
        score8 = racer8.getHorsePower() + racer8.getWeight() + racer8.getZeroToHundred() + racer8.getluckCar() + racer8.getluckDriver() + racer8.getSkill();
        score9 = racer9.getHorsePower() + racer9.getWeight() + racer9.getZeroToHundred() + racer9.getluckCar() + racer9.getluckDriver() + racer9.getSkill();
        score10 = racer10.getHorsePower() + racer10.getWeight() + racer10.getZeroToHundred() + racer10.getluckCar() + racer10.getluckDriver() + racer10.getSkill();
        


        List <CarsAndDrivers> racers = new ArrayList<>();
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
    // public CarsAndDrivers winner(List <CarsAndDrivers> racers){
    //     double scoreMax = 1000000000;
    //     for (int i = 0; i < 10; i++) {

            
    //     }

    // }
    
}