/**
 * Main
 */



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
        CarsAndDrivers carAndDriver = new CarsAndDrivers("default", -1, -1, -1, -1,-1, -1);
        HistoricalDatas historicalDatas = new HistoricalDatas();
        historicalDatas.generateHistoricalDatas(1000);
        DataEvaluator dataEvaluator = new DataEvaluator();
        String[][] a = dataEvaluator.ReadingFromFile();
        System.out.println(Arrays.deepToString(a));
        // System.out.println(result);
        
    

    
}
}
