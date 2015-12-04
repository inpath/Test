package Examples;

import java.io.*;

public class CountWordsEx {

	public static void main (String [] args) {
		
		String [] words=null;
		String str="";
		int total=0;
		try{
	String fileToRead = "C:/Users/Venkata/Desktop/demo.txt";
	FileReader fr = new FileReader(fileToRead);
	fr.ready();
	BufferedReader br = new BufferedReader(fr);
	
	while ((str = br.readLine())!=null){
		 words = str.split(" ");
		 total = total+(words.length);
		}
		System.out.println(total);
			br.close();
		}catch(IOException e){
			e.printStackTrace();
		}

	}
		
	}
	
	
	
