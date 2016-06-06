package worldMapPac;

import configPac.Config;
import entityPac.*;

public class WorldMap {
	
	public Entity[][] arrayMap;
	public Player player;
	public Teleport[] teleport = new Teleport[2];
	boolean light = true;
	boolean end = false;
	boolean hasKey = false;
	
	void insertEntity(char type, int i, int j){
		switch (type){
			case '#' : arrayMap[i][j] = new Wall(i,j, this); break;
			case 'F' : arrayMap[i][j] = new Food(i,j, this); break;
			case 'M' : arrayMap[i][j] = new Monster(i,j, this); break;
			case 'm' : arrayMap[i][j] = new SMonster(i,j, this); break;
			case 'R' : arrayMap[i][j] = new Rock(i,j, this); break;
			case 'T' : arrayMap[i][j] = new Teleport(i,j, this);
					if(teleport[0]==null) teleport[0]=(Teleport) arrayMap[i][j];
					else teleport[1]=(Teleport) arrayMap[i][j];
					break;
			case 'W' : arrayMap[i][j] = new Weapon(i,j, this); break;
			case 'B' : arrayMap[i][j] = new Box(i,j, this); break;
			case 'K' : arrayMap[i][j] = new Key(i,j, this); break;
			case 'D' : arrayMap[i][j] = new Door(i,j, this); break;
			case '@' : arrayMap[i][j] = new Player(i,j, this); 
					   player=(Player) arrayMap[i][j]; break;
		}
	}
	
	void deleteEntity(int x, int y){
		arrayMap[y][x] = null;
	}
	public void initialize(char[][] map){
		arrayMap = new Entity[Config.mapRow][Config.mapCol];
		for(int i=0;i<map.length;i++)
			for(int j=0;j<map[i].length;j++)
				insertEntity(map[i][j], i, j);
	}
	
	void showMap(){
		int xView = player.getCol();
		int yView = player.getRow();
		if(xView<3) xView=3;
		if(yView<3) yView=3;
		for(int i=yView-3;i<yView+4;i++){
			for(int j=xView-3;j<xView+4;j++){
				if (!light)
					System.out.print('-');
				else if (arrayMap[i][j] != null)
					System.out.print(arrayMap[i][j].getIcon());
				else
					System.out.print('.');
			}
			System.out.println();
		}
	}
	
	public void moveEntity(int x, int y, int nx, int ny){
		if (arrayMap[ny][nx] == null){
			arrayMap[ny][nx] = arrayMap[y][x];
			arrayMap[y][x] = null;
		}
	}
	public void turnLight(){
		light = !light;
	}
	public boolean getLight(){
		return light;
	}
	void showMenu(){
		System.out.println(Config.playerHP + player.getHP()+"/"+player.getMaxHP()+ Config.damage + player.getAttackPower() + "\n" +
						   Config.playerLv+player.Lv()+Config.playerExp+player.Exp()+"/"+player.maxExp()+player.getWeapon() + "\n" + 
						   Config.x+player.getCol()+Config.y+player.getRow());
		System.out.print(Config.mainMenu);
	}
	public void getKey(){
		hasKey = true;
	}
	public boolean hasKey(){
		return hasKey;
	}
	public void getEnd(){
		end = true;
	}
	public void run() {
		while(!end){
			System.out.println();
			showMap();
			showMenu();
			player.inputCommand(Config.scan.nextLine());
		}
	}
	

}
