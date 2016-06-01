package worldMapPac;

import configPac.Config;
import entityPac.*;

public class WorldMap {
	
	Entity[][] arrayMap = new Entity[Config.mapRow][Config.mapCol];
	Player player;
	boolean end = false;
	
	void insertEntity(char type, int i, int j){
		//Entity를 map에 삽입
		switch (type){
			case '#' : arrayMap[i][j] = new Wall(i,j); break;
			case 'F' : arrayMap[i][j] = new Food(i,j); break;
			case 'M' : arrayMap[i][j] = new Monster(i,j); break;
			case 'R' : arrayMap[i][j] = new Rock(i,j); break;
			case 'W' : arrayMap[i][j] = new Weapon(i,j); break;
			case '@' : arrayMap[i][j] = new Player(i,j); 
					   player=(Player) arrayMap[i][j]; break;
		}
	}
	
	void deleteEntity(int x, int y){
		//Entity를 Map에서 삭제
		arrayMap[y][x] = null;
	}
	public void initialize(char[][] map){
		//char[][] 배열 데이터에 따라 Entity들을 map에 삽입하여 배치
		for(int i=0;i<map.length;i++){
			for(int j=0;j<map[i].length;j++)
				insertEntity(map[i][j], i, j);
			}
	}
	
	void showMap(){
		//지도를 화면에 출력
		for(int i=0;i<arrayMap.length;i++){
			for(int j=0;j<arrayMap[i].length;j++){
				if (arrayMap[i][j] != null)
					System.out.print(arrayMap[i][j].getIcon());
				else
					System.out.print('.');
			}
			System.out.println();
		}
	}
	
	public void moveEntity(int x, int y, int nx, int ny){
		//Entity를 map에서 이동시킴
		if (arrayMap[ny][nx] == null){
			arrayMap[ny][nx] = arrayMap[y][x];
			arrayMap[y][x] = null;
		}
	}
	void showMenu(){
		System.out.println(Config.player + player.getHP()+"/"+player.getMaxHP()+ Config.damage + player.getAttackPower() + "\n" +
						   Config.bareHands + "\n" + 
						   Config.x+player.getCol()+Config.y+player.getRow());
		System.out.print(Config.mainMenu);
	}
	
	boolean getEnd(){
		//not yet
		if (end)
			return true;
		else
			return false;
	}
	public void movePlayer(){
		String cmd = Config.scan.nextLine();
		int y = player.getRow();
		int x = player.getCol();
		int ny = y;
		int nx = x;
		switch(cmd){
			case "W": case "w": ny-=1; break;
			case "A": case "a": nx-=1; break;
			case "S": case "s": ny+=1; break;
			case "D": case "d": nx+=1; break;
		}
		if(arrayMap[ny][nx] == null){
			moveEntity(x,y,nx,ny);
			player.setRow(ny);
			player.setCol(nx);
		}
		else if(arrayMap[ny][nx].getIcon()=='M')
			arrayMap[ny][nx].inputCommand();
		else{
			arrayMap[ny][nx].inputCommand();
		}
//		else if(arrayMap[ny][nx].getIcon() == '#'){
//			System.out.println("You can't go through wall");
//		}
	}
	public void run() {
		while(!getEnd()){
			showMap();
			showMenu();
			movePlayer();
		}
	}
	

}
