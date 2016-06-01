package worldMapPac;

import configPac.Config;
import entityPac.*;

public class WorldMap {
	
	Entity[][] arrayMap = new Entity[Config.mapRow][Config.mapCol];
	Player player;
	
	public void insertEntity(char type, int i, int j){
		//Entity를 map에 삽입
		switch (type){
		case '#' : arrayMap[i][j] = new Wall(); break;
		case 'F' : arrayMap[i][j] = new Food(); break;
		case 'M' : arrayMap[i][j] = new Monster(); break;
		case 'R' : arrayMap[i][j] = new Rock(); break;
		case 'W' : arrayMap[i][j] = new Weapon(); break;
		}
	}
	
	public void deleteEntity(){
		//Entity를 Map에서 삭제
	}
	public void initialize(char[][] map){
		//char[][] 배열 데이터에 따라 Entity들을 map에 삽입하여 배치
		for(int i=0;i<map.length;i++)
			for(int j=0;j<map[i].length;j++)
				insertEntity(map[i][j], i, j);

			System.out.println();
	}
	
	public void showMap(){
		//지도를 화면에 출력
	}
	
	public void moveEntity(){
		//Entity를 map에서 이동시킴
	}
	public void showMenu(){
		//명령 메뉴 출력
	}

	public void run() {
		// TODO Auto-generated method stub
		
	}
	

}
