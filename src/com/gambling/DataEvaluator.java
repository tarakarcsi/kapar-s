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
            if (brandList.get(i).equals(" Lekszusz")) {
                countLekszusz += 1;
            }
        }
        int countBéjemvé = 0;
        for (int i = 0; i < brandList.size(); i++) {
            if (brandList.get(i).equals(" Béjemvé")) {
                countBéjemvé += 1;
            }
        }
        int countDodzs = 0;
        for (int i = 0; i < brandList.size(); i++) {
            if (brandList.get(i).equals(" Dodzs")) {
                countDodzs += 1;
            }
        }
        int countKilya = 0;
        for (int i = 0; i < brandList.size(); i++) {
            if (brandList.get(i).equals(" Kilya")) {
                countKilya += 1;
            }
        }
        int countPözsó = 0;
        for (int i = 0; i < brandList.size(); i++) {
            if (brandList.get(i).equals(" Pözsó")) {
                countPözsó += 1;
            }
        }
        int countDzsipp = 0;
        for (int i = 0; i < brandList.size(); i++) {
            if (brandList.get(i).equals(" Dzsipp")) {
                countDzsipp += 1;
            }
        }
        int countKőnigszeg = 0;
        for (int i = 0; i < brandList.size(); i++) {
            if (brandList.get(i).equals(" Kőnigszeg")) {
                countKőnigszeg += 1;
            }
        }
        int countMicubicsi = 0;
        for (int i = 0; i < brandList.size(); i++) {
            if (brandList.get(i).equals(" Micubicsi")) {
                countMicubicsi += 1;
            }
        }
        int countKrájzler = 0;
        for (int i = 0; i < brandList.size(); i++) {
            if (brandList.get(i).equals(" Krájzler")) {
                countKrájzler += 1;
            }
        }
        int countRojszRojsz = 0;
        for (int i = 0; i < brandList.size(); i++) {
            if (brandList.get(i).equals(" Rojsz Rojsz")) {
                countRojszRojsz += 1;
            }
        }
        if (countLekszusz >= countBéjemvé &&
        countLekszusz >= countDodzs && 
        countLekszusz >= countDzsipp && 
        countLekszusz >= countKilya && 
        countLekszusz >= countKrájzler &&
        countLekszusz >= countKőnigszeg && 
        countLekszusz >= countMicubicsi &&
        countLekszusz >= countPözsó &&
        countLekszusz >= countRojszRojsz) {
            CarsAndDrivers carsAndDrivers = new CarsAndDrivers("Kimi Rájkőnen", 1, 1, 1, 1, 1, 1);
            winner = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\" Most races are won by the brand: " + "Lekszusz "
            + carsAndDrivers.getName();
        } else if (countBéjemvé >= countLekszusz &&
        countBéjemvé >= countDodzs && 
        countBéjemvé >= countDzsipp && 
        countBéjemvé >= countKilya && 
        countBéjemvé >= countKrájzler &&
        countBéjemvé >= countKőnigszeg && 
        countBéjemvé >= countMicubicsi &&
        countBéjemvé >= countPözsó &&
        countBéjemvé >= countRojszRojsz) {
            CarsAndDrivers carsAndDrivers = new CarsAndDrivers("Májkül Sumaher", 1, 1, 1, 1, 1, 1);
            winner = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\" Most races are won by the brand: " + "Béjemvé "
            + carsAndDrivers.getName();
        } else if (countDodzs >= countLekszusz &&
        countDodzs >= countDodzs && 
        countDodzs >= countDzsipp && 
        countDodzs >= countKilya && 
        countDodzs >= countKrájzler &&
        countDodzs >= countKőnigszeg && 
        countDodzs >= countMicubicsi &&
        countDodzs >= countPözsó &&
        countDodzs >= countRojszRojsz) {
            CarsAndDrivers carsAndDrivers = new CarsAndDrivers("Fernándó Álonzó", 1, 1, 1, 1, 1, 1);
            winner = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\" Most races are won by the brand: " + "Dodzs "
            + carsAndDrivers.getName();
        } else if (countKilya >= countBéjemvé &&
        countKilya >= countDodzs && 
        countKilya >= countDzsipp && 
        countKilya >= countLekszusz && 
        countKilya >= countKrájzler &&
        countKilya >= countKőnigszeg && 
        countKilya >= countMicubicsi &&
        countKilya >= countPözsó &&
        countKilya >= countRojszRojsz) {
            CarsAndDrivers carsAndDrivers = new CarsAndDrivers("Rúbensz Bárikelló", 1, 1, 1, 1, 1, 1);
            winner = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\" Most races are won by the brand: " + "Kilya "
            + carsAndDrivers.getName();
        } else if (countPözsó >= countBéjemvé &&
        countPözsó >= countDodzs && 
        countPözsó >= countDzsipp && 
        countPözsó >= countKilya && 
        countPözsó >= countKrájzler &&
        countPözsó >= countKőnigszeg && 
        countPözsó >= countMicubicsi &&
        countPözsó >= countLekszusz &&
        countPözsó >= countRojszRojsz) {
            CarsAndDrivers carsAndDrivers = new CarsAndDrivers("Szebásztián Fettel", 1, 1, 1, 1, 1, 1);
            winner = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\" Most races are won by the brand: " + "Pözsó "
            + carsAndDrivers.getName();
        } else if (countDzsipp >= countBéjemvé &&
        countDzsipp >= countDodzs && 
        countDzsipp >= countLekszusz && 
        countDzsipp >= countKilya && 
        countDzsipp >= countKrájzler &&
        countDzsipp >= countKőnigszeg && 
        countDzsipp >= countMicubicsi &&
        countDzsipp >= countPözsó &&
        countDzsipp >= countRojszRojsz) {
            CarsAndDrivers carsAndDrivers = new CarsAndDrivers("Máksz Fersztáppen", 1, 1, 1, 1, 1, 1);
            winner = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\" Most races are won by the brand: " + "Dzsipp "
            + carsAndDrivers.getName();
        } else if (countKőnigszeg >= countBéjemvé &&
        countKőnigszeg >= countDodzs && 
        countKőnigszeg >= countDzsipp && 
        countKőnigszeg >= countKilya && 
        countKőnigszeg >= countKrájzler &&
        countKőnigszeg >= countLekszusz && 
        countKőnigszeg >= countMicubicsi &&
        countKőnigszeg >= countPözsó &&
        countKőnigszeg >= countRojszRojsz) {
            CarsAndDrivers carsAndDrivers = new CarsAndDrivers("Szebásztián Lőb", 1, 1, 1, 1, 1, 1);
            winner = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\" Most races are won by the brand: " + "Kőnigszeg "
            + carsAndDrivers.getName();
        } else if (countMicubicsi >= countBéjemvé &&
        countMicubicsi >= countDodzs && 
        countMicubicsi >= countDzsipp && 
        countMicubicsi >= countKilya && 
        countMicubicsi >= countKrájzler &&
        countMicubicsi >= countKőnigszeg && 
        countMicubicsi >= countLekszusz &&
        countMicubicsi >= countPözsó &&
        countMicubicsi >= countRojszRojsz) {
            CarsAndDrivers carsAndDrivers = new CarsAndDrivers("Dzsenzon Bátön", 1, 1, 1, 1, 1, 1);
            winner = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\" Most races are won by the brand: " + "Micubicsi "
            + carsAndDrivers.getName();
        } else if (countKrájzler >= countBéjemvé &&
        countKrájzler >= countDodzs && 
        countKrájzler >= countDzsipp && 
        countKrájzler >= countKilya && 
        countKrájzler >= countLekszusz &&
        countKrájzler >= countKőnigszeg && 
        countKrájzler >= countMicubicsi &&
        countKrájzler >= countPözsó &&
        countKrájzler >= countRojszRojsz) {
            CarsAndDrivers carsAndDrivers = new CarsAndDrivers("Kolin Mekrí", 1, 1, 1, 1, 1, 1);
            winner = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\" Most races are won by the brand: " + "Krájzler "
            + carsAndDrivers.getName();
        } else if (countRojszRojsz >= countBéjemvé &&
        countRojszRojsz >= countDodzs && 
        countRojszRojsz >= countDzsipp && 
        countRojszRojsz >= countKilya && 
        countRojszRojsz >= countKrájzler &&
        countRojszRojsz >= countKőnigszeg && 
        countRojszRojsz >= countMicubicsi &&
        countRojszRojsz >= countPözsó &&
        countRojszRojsz >= countLekszusz) {
            CarsAndDrivers carsAndDrivers = new CarsAndDrivers("Lújisz Hemilton", 1, 1, 1, 1, 1, 1);
            winner = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\" Most races are won by the brand: " + "Rojsz Rojsz " 
            + carsAndDrivers.getName();
        }
        brandList.add(winner);
        return brandList;
    }
    // public String countOfBrands(ArrayList<String> brandsList){
        
    // }

}