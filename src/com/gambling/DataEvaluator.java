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
                System.out.println("error message" + e.getMessage());
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
            System.out.println("error message" + e.getMessage());
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
        String winner = "";
        for(int i = 0; i < data.length; i++) {
            brandList.add(data[i][1]);
        }
        int countLekszusz = 0;
        for (int i = 0; i < brandList.size(); i++) {
            if (brandList.get(i).equals("Lekszusz")) {
                countLekszusz += 1;
            }
        }
        int countBéjemvé = 0;
        for (int i = 0; i < brandList.size(); i++) {
            if (brandList.get(i).equals("Béjemvé")) {
                countBéjemvé += 1;
            }
        }
        int countDodzs = 0;
        for (int i = 0; i < brandList.size(); i++) {
            if (brandList.get(i).equals("Dodzs")) {
                countDodzs += 1;
            }
        }
        int countKilya = 0;
        for (int i = 0; i < brandList.size(); i++) {
            if (brandList.get(i).equals("Kilya")) {
                countKilya += 1;
            }
        }
        int countPözsó = 0;
        for (int i = 0; i < brandList.size(); i++) {
            if (brandList.get(i).equals("Pözsó")) {
                countPözsó += 1;
            }
        }
        int countDzsipp = 0;
        for (int i = 0; i < brandList.size(); i++) {
            if (brandList.get(i).equals("Dzsipp")) {
                countDzsipp += 1;
            }
        }
        int countKőnigszeg = 0;
        for (int i = 0; i < brandList.size(); i++) {
            if (brandList.get(i).equals("Kőnigszeg")) {
                countKőnigszeg += 1;
            }
        }
        int countMicubicsi = 0;
        for (int i = 0; i < brandList.size(); i++) {
            if (brandList.get(i).equals("Micubicsi")) {
                countMicubicsi += 1;
            }
        }
        int countKrájzler = 0;
        for (int i = 0; i < brandList.size(); i++) {
            if (brandList.get(i).equals("Krájzler")) {
                countKrájzler += 1;
            }
        }
        int countRojszRojsz = 0;
        for (int i = 0; i < brandList.size(); i++) {
            if (brandList.get(i).equals("Rojsz Rojsz")) {
                countRojszRojsz += 1;
            }
        }
        if (countLekszusz >= ((countBéjemvé +
            countDodzs + 
            countDzsipp + 
            countKilya + 
            countKrájzler +
            countKőnigszeg + 
            countMicubicsi +
            countPözsó +
            countRojszRojsz) / 9)) {
            CarsAndDrivers carsAndDrivers = new CarsAndDrivers("Kolin Mekrí", 1, 1, 1, 1, 1, 1);
            winner = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\" Most races are won by the brand: " + "Lekszusz "
            + "\n and driver: "  + carsAndDrivers.getName();
        } if (countBéjemvé >= ((countLekszusz +
            countDodzs + 
            countDzsipp + 
            countKilya + 
            countKrájzler +
            countKőnigszeg + 
            countMicubicsi +
            countPözsó +
            countRojszRojsz) / 9)) {
            CarsAndDrivers carsAndDrivers = new CarsAndDrivers("Kimi Rájkőnen", 1, 1, 1, 1, 1, 1);
            winner = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\" Most races are won by the brand: " + "Béjemvé "
            + "\n and driver: "  + carsAndDrivers.getName();
        } if (countDodzs >= ((countLekszusz +
            countDodzs + 
            countDzsipp + 
            countKilya + 
            countKrájzler +
            countKőnigszeg + 
            countMicubicsi +
            countPözsó +
            countRojszRojsz) / 9)) {
            CarsAndDrivers carsAndDrivers = new CarsAndDrivers("Májkül Sumaher", 1, 1, 1, 1, 1, 1);
            winner = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\" Most races are won by the brand: " + "Dodzs "
            + "\n and driver: "  + carsAndDrivers.getName();
        } if (countKilya >= ((countBéjemvé +
            countDodzs + 
            countDzsipp + 
            countLekszusz + 
            countKrájzler +
            countKőnigszeg + 
            countMicubicsi +
            countPözsó +
            countRojszRojsz) / 9)){
            CarsAndDrivers carsAndDrivers = new CarsAndDrivers("Fernándó Álonzó", 1, 1, 1, 1, 1, 1);
            winner = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\" Most races are won by the brand: " + "Kilya "
            + "\n and driver: " + carsAndDrivers.getName();
        } if (countPözsó >= ((countBéjemvé +
            countDodzs + 
            countDzsipp + 
            countKilya + 
            countKrájzler +
            countKőnigszeg + 
            countMicubicsi +
            countLekszusz +
            countRojszRojsz) / 9)) {
            CarsAndDrivers carsAndDrivers = new CarsAndDrivers("Rúbensz Bárikelló", 1, 1, 1, 1, 1, 1);
            winner = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\" Most races are won by the brand: " + "Pözsó "
            + "\n and driver: "  + carsAndDrivers.getName();
        } if (countDzsipp >= ((countBéjemvé +
            countDodzs +
            countLekszusz +
            countKilya +
            countKrájzler +
            countKőnigszeg + 
            countMicubicsi +
            countPözsó +
            countRojszRojsz) / 9)) {
            CarsAndDrivers carsAndDrivers = new CarsAndDrivers("Szebásztián Fettel", 1, 1, 1, 1, 1, 1);
            winner = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\" Most races are won by the brand: " + "Dzsipp "
            + "\n and driver: "  + carsAndDrivers.getName();
        } if (countKőnigszeg >= ((countBéjemvé +
            countDodzs +
            countDzsipp +
            countKilya + 
            countKrájzler +
            countLekszusz +
            countMicubicsi +
            countPözsó +
            countRojszRojsz) / 9)) {
            CarsAndDrivers carsAndDrivers = new CarsAndDrivers("Máksz Fersztáppen", 1, 1, 1, 1, 1, 1);
            winner = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\" Most races are won by the brand: " + "Kőnigszeg "
            + "\n and driver: "  + carsAndDrivers.getName();
        } if (countMicubicsi >= ((countBéjemvé +
            countDodzs +
            countDzsipp +
            countKilya + 
            countKrájzler +
            countKőnigszeg +
            countLekszusz +
            countPözsó +
            countRojszRojsz) / 9)) {
            CarsAndDrivers carsAndDrivers = new CarsAndDrivers("Szebásztián Lőb", 1, 1, 1, 1, 1, 1);
            winner = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\" Most races are won by the brand: " + "Micubicsi "
            + "\n and driver: " + carsAndDrivers.getName();
        } if (countKrájzler >= ((countBéjemvé +
            countDodzs +
            countDzsipp +
            countKilya + 
            countLekszusz +
            countKőnigszeg +
            countMicubicsi +
            countPözsó +
            countRojszRojsz) / 9)) {
            CarsAndDrivers carsAndDrivers = new CarsAndDrivers("Lújisz Hemilton", 1, 1, 1, 1, 1, 1);
            winner = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\" Most races are won by the brand: " + "Krájzler "
            + "\n and driver: " + carsAndDrivers.getName();
        } if (countRojszRojsz >= ((countBéjemvé +
            countDodzs + 
            countDzsipp +
            countKilya +
            countKrájzler +
            countKőnigszeg + 
            countMicubicsi +
            countPözsó +
            countLekszusz) / 9)) {
            CarsAndDrivers carsAndDrivers = new CarsAndDrivers("Dzsenzon Bátön", 1, 1, 1, 1, 1, 1);
            winner = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\" Most races are won by the brand: " + "Rojsz Rojsz " 
            + "\n and driver: " + carsAndDrivers.getName();
        }
        brandList.add(winner);
        return brandList;
    }
    // public String countOfBrands(ArrayList<String> brandsList){
        
    // }

}