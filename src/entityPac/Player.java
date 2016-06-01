package entityPac;

import configPac.Config;

public class Player extends Entity {

	public Player(int i, int j){
		icon = '@';
		hp = 30;
		maxHp = 100;
		attackPower = 10;
		row = i;
		col = j;
		
	}
	public void inputCommand(){
		
	}
	void move(int i, int j){
		row+=i;
		col+=j;
	}

}
