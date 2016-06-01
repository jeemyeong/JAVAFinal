package entityPac;

import configPac.Config;

public class Entity {
	int hp;
	int maxHp;
	int attackPower;
	int row;
	int col;
	char icon;
	public Entity(){
		this.icon = '.';
	}
	
	public void inputCommand(){
		//명령 입력을 받는 함수
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
		hp+=i;
	}
	void decreaseHP(int i){
		hp-=i;
	}
	public char getIcon(){
		return icon;
	}
	void showMenu(){
		//객체의 선택 메뉴 출력
	}
	

	
}
