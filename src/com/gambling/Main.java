/**
 * Main
 */



import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public String generateHistoricalDatas(int round){
        HistoricalDatas racingData = new HistoricalDatas();
        String result = null;
        for (int i = 0; i < round; i++) {
            result = racingData.winnerteam();
            // racingData.generateData();
            
        }
        return result;
    }
    public static void main(String[] args) {
        CarsAndDrivers carAndDriver = new CarsAndDrivers("default", -1, -1, -1, -1,-1,"default", -1);



        // System.out.println(result);
        
    

    
}
}
