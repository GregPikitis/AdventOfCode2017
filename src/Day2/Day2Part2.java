package Day2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day2Part2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/Day2/input.txt");

        //Construct BufferedReader from InputStreamReader
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String line;
        int finalSum = 0;

        while ((line = br.readLine()) != null) {

            String[] nums = line.split("\t");

            for (int i = 0; i < nums.length; i++){
                int focusNum = Integer.parseInt(nums[i]);

                for (int j = 0; j < nums.length; j++) {
                	int testNum = Integer.parseInt(nums[j]);

                	if ((focusNum % testNum == 0) && j != i){
                		finalSum = finalSum + (focusNum / testNum);
					} else {
					}
				}
			}
        }
        System.out.println("The final sum is: " + finalSum);
    }
}