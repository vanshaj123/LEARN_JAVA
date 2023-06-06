package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			fileOpen("/");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void fileOpen(String path) throws FileNotFoundException {
		
		FileReader f = new FileReader(path);
		BufferedReader b = new BufferedReader(f);
	}

}
