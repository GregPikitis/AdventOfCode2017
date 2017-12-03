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
            	System.out.println("i: " + i);
                int focusNum = Integer.parseInt(nums[i]);
                System.out.println("Focusnum is: " + focusNum);

                for (int j = 0; j < nums.length; j++) {
                	int testNum = Integer.parseInt(nums[j]);
                	System.out.println("testnum: " + testNum);

                	if ((focusNum % testNum == 0) && j != i){
                		System.out.println("nums divided equally");
                		finalSum = finalSum + (focusNum / testNum);
                		System.out.println("Final sum is now " + finalSum);
					} else {
                		System.out.println("nums dont divide equally");
					}
				}
			}
        }
        System.out.println("The final sum is: " + finalSum);
        System.out.println("I love you! <3");
    }
}