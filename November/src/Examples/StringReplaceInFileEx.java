package Examples;
import java.io.*;
public class StringReplaceInFileEx {

	
	// incomplete
	
	public static void main(String [] args)throws IOException{
		String str="";
		String [] words;
		String str1="good";
		//String strwrite="";
		String fileToRead = "c:/users/venkata/desktop/demo.txt";
		String fileToWrite = "c:/users/venkata/desktop/demonew.txt";
		FileReader fr = new FileReader(fileToRead);
		
		FileWriter fw = new FileWriter(fileToWrite);
		fw.write(fileToWrite);
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		
			try{
			while((str=br.readLine())!=null){
				words=str.split(" ");
			for (int i=0;i<words.length;i++){
			if (words[i].equalsIgnoreCase(str1)){
			words[i]=str.replaceAll("good","best");	
			
			System.out.println(words[i]);
			}
				}	
			bw.close();	
		}
		br.close();	
		fr.ready();
		
		
		}catch(Exception e){
			System.out.println("Error copy");
		//System.out.print(e.printStackTrace());
		}
	}
	
		
}
