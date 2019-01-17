import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class DataEvaluator {
    
   public String[][] ReadingFromFile() {
        File dataFile = new File("Data.csv");
        Scanner sc2 = null;
        try{
            sc2 = new Scanner(dataFile);
            } catch(FileNotFoundException e) {
                System.out.println("Vérmalac" + e.getMessage());
            }
        int z = 0;
        while(sc2.hasNextLine()) {
            z++;
            sc2.nextLine();
        }
        sc2.close();
        Scanner scr2 = null;
        try {
            scr2 = new Scanner(dataFile);
        } catch(FileNotFoundException e) {
            System.out.println("Vérmalac " + e.getMessage());
        }
        String[][] raceData = new String[z][8];
        for(int y=0;y<z;y++){
            String line = scr2.nextLine();
            raceData[y] = line.split(",");
        }
        return raceData; 
        
    }
    public ArrayList<String> onlyBrands(String[][] data){
        ArrayList<String> brandList = new ArrayList<String>();
        for(int i = 0; i < data.length; i++) {
            brandList.add(data[i][1]);
        }
        return brandList;
    }
    public String countOfBrands(ArrayList<String> brandsList){
        String counts = null;
        for (int i = 0; i < brandsList.size(); i++) {
            
            counts = "Freq of" + i + ":"  + Collections.frequency(brandsList, i);
            
        }
        return counts;
    }

}