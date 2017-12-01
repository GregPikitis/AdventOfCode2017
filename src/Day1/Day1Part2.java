package Day1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day1Part2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/Day1/input.txt");

        //Construct BufferedReader from InputStreamReader
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String input = br.readLine();
        int finalSum = 0;
        int num1;
        int num2;
        int step = input.length() / 2;

         for (int i = 0; i < input.length(); i++){
             num1 = Character.getNumericValue(input.charAt(i));

             try{
                 num2 = Character.getNumericValue(input.charAt(i + step));
             }catch(StringIndexOutOfBoundsException ref){
                 num2 = Character.getNumericValue(input.charAt(step - (input.length() - i)));
             }

             if (num1 == num2){
                 finalSum = finalSum + num1;
             }
         }

        System.out.print("Final sum is " + finalSum);
        br.close();
    }
}