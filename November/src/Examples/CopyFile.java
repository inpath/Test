package Examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyFile {

	public static void main(String [] args){
		
	File sourceFile = new File("C:/Users/Venkata/Desktop/demo.txt");
	File targetFile = new File("C:/Users/Venkata/Desktop/demonew.txt");
		
	BufferedReader br ;
	PrintWriter pw;
	String line;
	
	try{
		if (targetFile.createNewFile()|| !targetFile.createNewFile()){
			br = new BufferedReader(new FileReader(sourceFile));
			pw = new PrintWriter(new FileWriter(targetFile));
		
		while ((line = br.readLine())!=null){
			pw.println(line);
		}
		br.close();
		pw.close();
		}
		
	}catch(IOException e){
		System.out.println("I could not copy the file.");
	}		
		
	}
	
}
