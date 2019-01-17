import java.io.BufferedReader;
import java.io.FileReader;

import java.util.Arrays;
import java.util.Scanner;

public class DataEvaluator {
   public String[][] ReadingFromFile() {
    try {
      Scanner sc = new Scanner(new BufferedReader(new FileReader("Data.csv")));
      int rows = 4;
      int columns = 4;
      String [][] myArray = new String[rows][columns];
      while(sc.hasNextLine()) {
         for (int i=0; i<myArray.length; i++) {
            String[] line = sc.nextLine().trim().split(" ");
            for (int j=0; j<line.length; j++) {
               myArray[i][j] = line[j];
            }
         }
      }
      System.out.println(Arrays.deepToString(myArray));
        return myArray;
    } catch (Exception e) {
        System.out.println("error");
        return null;
    } finally {
        System.out.println("error");
        return null;
    }
   }
}