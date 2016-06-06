package entityPac;
import worldMapPac.WorldMap;
import configPac.Config;

public class Player extends Entity {
	String weapon = Config.bareHands;
	int Lv = 1;
	int Exp = 0;
	int maxExp = 100;
	public Player(int i, int j, WorldMap map){
		icon = '@';
		hp = 30;
		maxHp = 100;
		attackPower = 10;
		row = i;
		col = j;
		this.map = map;
		
	}
	public void inputCommand(String s){
		int y = this.row;
		int x = this.col;
		int ny = y;
		int nx = x;
		s = s.toUpperCase();
		switch(s){
		case Config.UP: ny-=1; move(nx,ny); break;
		case Config.LEFT: nx-=1; move(nx,ny); break;
		case Config.DOWN: ny+=1; move(nx,ny); break;
		case Config.RIGHT: nx+=1; move(nx,ny); break;
		case Config.QUIT: nx+=1; this.map.getEnd(); break;
		}
		
	}
	void move(int x, int y){
		if(this.map.arrayMap[y][x]==null){
			this.map.arrayMap[y][x] = this;
			this.map.arrayMap[row][col] = null;
			row = y;
			col = x;
		}
		else
			this.map.arrayMap[y][x].inputCommand();
	}
	void setWeapon(){
		this.weapon = Config.shortSword;
	}
	public String getWeapon(){
		return this.weapon;
	}
	void getDamage(int i){
		hp-=i;
	}
	void getExp(int i){
		Exp+=i;
		if(Exp>=100){
			getLvUP();
			Exp=0;
			System.out.println(Config.playerLvUP);
		}
	}
	void getLvUP(){
		Lv+=1;
		increaseMaxHP(10);
		increaseHP(20);
		increaseAttackPower(10);
		increaseMaxExp(10);
	}
	void increaseMaxExp(int i){
		maxExp += i;
	}
	public int Lv(){
		return Lv;
	}
	public int Exp(){
		return Exp;
	}
	public int maxExp(){
		return maxExp;
	}

}
