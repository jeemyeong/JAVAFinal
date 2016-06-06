package fileManagerPac;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;

import configPac.Config;

public class FileManager {
	Vector<String> vector = new Vector<String>();
	public void loadMap(String name){
		int row = 0;
		int col = 0;
		try{
	        BufferedReader br = new BufferedReader(new FileReader(name));
	        String line = null;
	        while((line = br.readLine())!=null) {
	        	vector.add(line);
	        	if (line.length()>col) col=line.length();
	            row++;
	        }
	        br.close();	
        }
		catch(Exception e){
			e.printStackTrace();
		}
		Config.mapCol = col;
		Config.mapRow = row;
			
	}
	public char[][] buildMap(){
		char[][] map = new char[Config.mapRow][Config.mapCol];
		for(int i=0;i<Config.mapRow;i++)
			for(int j=0;j<Config.mapCol;j++)
				map[i][j] = vector.get(i).charAt(j);
		return map;
		
	}
}
