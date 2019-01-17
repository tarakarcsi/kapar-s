/**
 * Main
 */



import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        CarsAndDrivers carAndDriver = new CarsAndDrivers("default", -1, -1, -1, -1,-1,"default", -1);
        HistoricalDatas racingData = new HistoricalDatas();
        List<CarsAndDrivers> result = racingData.createRacer();
        System.out.println(result.get(1).getBrand());
        
    }

    
}