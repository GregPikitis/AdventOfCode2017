package Day4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Day4Part2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/Day4/input.txt");

		//Construct BufferedReader from InputStreamReader
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		int correct = 0;
		boolean good = true;
		String line;

		while ((line = br.readLine()) != null) {
			good = true;
			String[] passphrase = line.split(" ");
			for (int pass = 0; pass < passphrase.length; pass++) {
				passphrase[pass] = sortString(passphrase, pass);
			}

			for(int i = 0; i < passphrase.length; i++){
				for (int j = 0; j < passphrase.length; j++){
					if ((i != j) && (passphrase[i].equals(passphrase[j]))){
						good = false;
						break;
					}
				}
			}
			if (good == true){
				correct = correct + 1;
			}
		}

		System.out.println("Correct: " + correct);
	}

	public static String sortString(String[] passphrase,int index){
		// convert input string to char array
		char tempArray[] = passphrase[index].toCharArray();

		// sort tempArray
		Arrays.sort(tempArray);

		String sorted = new String(tempArray);

		// return new sorted string
		return sorted;
	}

}
