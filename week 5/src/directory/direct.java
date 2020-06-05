package directory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class direct {
	public static void main(String args[]) throws IOException
	{
		String DirName = "/home/krishna";
		File f = new File(DirName);
		String[] files = f.list();
		for (int i = 0; i < files.length; i++) { 
           System.out.println(files[i]); 
       } 
	}
}
