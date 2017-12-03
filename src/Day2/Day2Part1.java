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

			for (String num : nums) {
				if (Integer.parseInt(num) > highNum) {
					highNum = Integer.parseInt(num);
				}
				if (Integer.parseInt(num) < lowNum) {
					lowNum = Integer.parseInt(num);
				}
			}
            checkSum = checkSum + (highNum - lowNum);
        }
        System.out.println("Checksum: " + checkSum);
    }
}