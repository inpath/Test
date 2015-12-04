package Examples;
import java.io.*;

public class WordOccur {

	public static void main (String [] args){
		String [] words=null;
		String str="";
		String str1="good";
		int count=0;
		
	try{
	String fileToRead = "c:/users/venkata/desktop/demo.txt";
	FileReader fr = new FileReader(fileToRead);
	fr.ready();
	BufferedReader br = new BufferedReader(fr);
	while((str=br.readLine())!=null){
		words = str.split(" ");
		
		for(int i=0;i<words.length;i++){
		if (words[i].equalsIgnoreCase(str1)){
			count++;
		}
	}
	}	
	br.close();
	System.out.println(count);
	}catch(Exception e){
	e.printStackTrace();
	}
	
	}
	
	}
	
	
	
