package Day1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day1Part1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/Day1/input.txt");

        //Construct BufferedReader from InputStreamReader
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String input = br.readLine();
        int finalSum = 0;
        int num1;
        int num2;
        int firstnum = Character.getNumericValue(input.charAt(0));

         for (int i = 0; i < input.length(); i++){
             num1 = Character.getNumericValue(input.charAt(i));
             if (i + 1 < input.length()){
                 num2 = Character.getNumericValue(input.charAt(i+1));
                 if (num1 == num2){
                     finalSum = finalSum + num1;
                 }
             } else {
                 if (num1 == firstnum){
                     finalSum = finalSum + firstnum;
                 }
             }
         }
        System.out.print("Final sum is " + finalSum);
        br.close();
    }
}