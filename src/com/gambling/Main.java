/**
 * Main
 */

import java.util.Scanner;


import java.util.Arrays;
import java.util.List;

import javax.xml.crypto.Data;

import java.util.ArrayList;

public class Main {

    public String generateHistoricalDatas(int round){
        HistoricalDatas racingData = new HistoricalDatas();
        String result = null;
        for (int i = 0; i < round; i++) {
            result = racingData.winnerteam();
            racingData.generateData();
            
        }
        return result;
    }
    public static void main(String[] args) {
        // try {
        System.out.println("\n Each car has a horsepower, a 0 to 100 kph speed, weight, \n and the driver has skill. Each value is ranked from 1 to 10.\n");
            // Thread.sleep(3000);
        System.out.println(" The car that has the best (in our case the lowest) values wins.\n");
            // Thread.sleep(2000);
        System.out.println(" Enter the amount of rounds you wish to generate: \n");
        // } catch (InterruptedException a) {
        //     System.out.println("error message");
        // }
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        CarsAndDrivers carAndDriver = new CarsAndDrivers("default", -1, -1, -1, -1,-1, -1);
        HistoricalDatas historicalDatas = new HistoricalDatas();
        historicalDatas.generateHistoricalDatas(i);
        DataEvaluator dataEvaluator = new DataEvaluator();
        String[][] a = dataEvaluator.ReadingFromFile();
        // System.out.println(Arrays.deepToString(a));
        System.out.println(dataEvaluator.onlyBrands(a));
        // System.out.println(dataEvaluator.countOfBrands(a));
    

    
}
}
