package Day4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;



public class Day4Part1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/Day4/input.txt");

		//Construct BufferedReader from InputStreamReader
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		int correct = 0;
		String line;
		boolean good = true;

		while ((line = br.readLine()) != null) {
			good = true;
			String[] passphrase = line.split(" ");;
			for (int i = 0; i < passphrase.length; i++){
				for (int j = 0; j < passphrase.length; j++){
					if ((i != j) && (passphrase[i].equals(passphrase[j]) == true)){
						good = false;
					}
				}
			}
			if (good == true){
				correct = correct + 1;
			}
		}

		System.out.println("Correct: " + correct);
	}
}
