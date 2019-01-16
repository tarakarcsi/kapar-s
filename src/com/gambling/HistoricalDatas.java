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

    private String brand;
    private int position;
    private double horsePower;
    private double zeroToHundred;
    private double weight;
    private double luckCar;
    private String name;
    private double skill;
    private double luckDriver;

    public List<CarsAndDrivers> createRacer() {
        
        CarsAndDrivers racer1 = new CarsAndDrivers("default", -1, -1, -1, -1, -1, -1, "default", -1);
        CarsAndDrivers racer2 = new CarsAndDrivers("default", -1, -1, -1, -1, -1, -1, "default", -1);
        CarsAndDrivers racer3 = new CarsAndDrivers("default", -1, -1, -1, -1, -1, -1, "default", -1);
        CarsAndDrivers racer4 = new CarsAndDrivers("default", -1, -1, -1, -1, -1, -1, "default", -1);
        CarsAndDrivers racer5 = new CarsAndDrivers("default", -1, -1, -1, -1, -1, -1, "default", -1);
        CarsAndDrivers racer6 = new CarsAndDrivers("default", -1, -1, -1, -1, -1, -1, "default", -1);
        CarsAndDrivers racer7 = new CarsAndDrivers("default", -1, -1, -1, -1, -1, -1, "default", -1);
        CarsAndDrivers racer8 = new CarsAndDrivers("default", -1, -1, -1, -1, -1, -1, "default", -1);
        CarsAndDrivers racer9 = new CarsAndDrivers("default", -1, -1, -1, -1, -1, -1, "default", -1);
        CarsAndDrivers racer10 = new CarsAndDrivers("default", -1, -1, -1, -1, -1, -1, "default", -1);

        List <CarsAndDrivers> liszt = new ArrayList<>();
            liszt.add(racer1);
            liszt.add(racer2);
            liszt.add(racer3);
            liszt.add(racer4);
            liszt.add(racer5);
            liszt.add(racer6);
            liszt.add(racer7);
            liszt.add(racer8);
            liszt.add(racer9);
            liszt.add(racer10);    

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
			

        return liszt;
    }
    
}