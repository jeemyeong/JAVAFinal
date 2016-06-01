package fileManagerPac;

import java.io.BufferedReader;
import java.io.FileReader;

import configPac.Config;

public class FileManager {
	char[][] map = new char[Config.mapRow][Config.mapCol];
	public void loadMap(String name){
		try{
	        BufferedReader br = new BufferedReader(new FileReader(name));
	        String line = null;
	        int cnt = 0;
	        while((line = br.readLine())!=null) {
	            for(int i=0;i<line.length();i++){
	            	map[cnt][i] = line.charAt(i);
	            }
	            cnt++;
	        }
	        br.close();	
        }
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public char[][] buildMap(){
		return map;
	}
}
