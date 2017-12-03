package Day2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day2Part1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/Day2/input.txt");

        //Construct BufferedReader from InputStreamReader
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String line;
        int checkSum = 0;

        while ((line = br.readLine()) != null) {
            int highNum = 0;
            int lowNum = 65536;

            String[] nums = line.split("\t");

            for (int i = 0; i < nums.length; i++){
            	System.out.println("i: " + i);
                if (Integer.parseInt(nums[i]) > highNum){
                	System.out.println("Num is higher than current high num.");
                    highNum = Integer.parseInt(nums[i]);
                    System.out.println("High num is now " + highNum);
                }
                if (Integer.parseInt(nums[i]) < lowNum){
					System.out.println("Num is lower than current low num.");
					lowNum = Integer.parseInt(nums[i]);
					System.out.println("lowNum is now: " + lowNum);
                }
            }
			System.out.println("Adding current checksum to difference,");
            checkSum = checkSum + (highNum - lowNum);
            System.out.println("Checksum is now: " + checkSum);
        }
        System.out.println("The Checksum is: " + checkSum);
    }
}