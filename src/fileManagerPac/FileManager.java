package fileManagerPac;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileManager {
	
	void loadMap(){
		try{
			
	        BufferedReader br = new BufferedReader(new FileReader("c:/out.txt"));
	        String line = null;
	        while((line = br.readLine())!=null) {
	            System.out.println(line);
	        }
        }
		catch(Exception e){
			e.printStackTrace();
		}
        br.close();	
	}
	void buildMap(){
		
	}
	// 지도 파일은 반드시 c:\oop\map.dat 에서 로드할 것 
}
