package Examples;

import java.io.File;

public class FilesCount {

	public static void main(String [] args){
		
		String str="C:\\Users\\Venkata\\Desktop\\java";
		File file = new File(str);
		File [] files =file.listFiles();
				
		for(File f : files ){
			System.out.println(f.getName());
		    
		}
			
	}
	
}
