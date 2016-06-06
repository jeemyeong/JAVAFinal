package entityPac;
import configPac.Config;
import worldMapPac.WorldMap;

public class Food extends Entity {
	public Food(int i, int j, WorldMap map){
		icon = 'F';
		row = i;
		col = j;
		this.map = map;
	}
	public void inputCommand(){
		System.out.print(Config.foodMenu);
		String s = Config.scan.nextLine();
		s = s.toUpperCase();
		switch(s){
		case Config.EAT: case Config.sEAT:
			this.map.player.increaseHP(30); 
			this.map.arrayMap[row][col] = null;
			System.out.println(Config.foodEat);
			break;
		case Config.NOTHING: case Config.sNOTHING: break;
		default: System.out.println(Config.inputError); break;
		}
	}
}
