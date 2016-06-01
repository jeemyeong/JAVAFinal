package worldMapPac;

import configPac.Config;
import entityPac.*;

public class WorldMap {
	
	Entity[][] arrayMap = new Entity[Config.mapRow][Config.mapCol];
	Player player;
	
	public void insertEntity(char type, int i, int j){
		//Entity�� map�� ����
		switch (type){
		case '#' : arrayMap[i][j] = new Wall(); break;
		case 'F' : arrayMap[i][j] = new Food(); break;
		case 'M' : arrayMap[i][j] = new Monster(); break;
		case 'R' : arrayMap[i][j] = new Rock(); break;
		case 'W' : arrayMap[i][j] = new Weapon(); break;
		}
	}
	
	public void deleteEntity(){
		//Entity�� Map���� ����
	}
	public void initialize(char[][] map){
		//char[][] �迭 �����Ϳ� ���� Entity���� map�� �����Ͽ� ��ġ
		for(int i=0;i<map.length;i++)
			for(int j=0;j<map[i].length;j++)
				insertEntity(map[i][j], i, j);

			System.out.println();
	}
	
	public void showMap(){
		//������ ȭ�鿡 ���
	}
	
	public void moveEntity(){
		//Entity�� map���� �̵���Ŵ
	}
	public void showMenu(){
		//��� �޴� ���
	}

	public void run() {
		// TODO Auto-generated method stub
		
	}
	

}
