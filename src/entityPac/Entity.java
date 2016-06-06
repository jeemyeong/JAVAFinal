package entityPac;

import worldMapPac.WorldMap;

public class Entity {
	int hp;
	int maxHp;
	int attackPower;
	int row;
	int col;
	char icon;
	WorldMap map;
	public Entity(){
	}
	
	public void inputCommand(){
	}
	public void setRow(int row){
		this.row = row;
	}
	public void setCol(int col){
		this.col = col;
	}
	public int getRow(){
		return row;
	}
	public int getCol(){
		return col;
	}
	public int getHP(){
		return hp;
	}
	public int getMaxHP(){
		return maxHp;
	}
	public int getAttackPower(){
		return attackPower;
	}
	void increaseHP(int i){
		if(hp+i>getMaxHP()) hp=getMaxHP();
		else hp+=i;
	}
	void increaseMaxHP(int i){
		maxHp+=i;
	}
	void decreaseHP(int i){
		hp-=i;
	}
	void increaseAttackPower(int i){
		attackPower+=i;
	}
	void decreaseAttackPower(int i){
		attackPower-=i;
	}
	public char getIcon(){
		return icon;
	}
	void showMenu(){
	}
	

	
}
