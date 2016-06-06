package entityPac;
import configPac.Config;
import worldMapPac.WorldMap;

public class Box extends Entity {
	public Box(int i, int j, WorldMap map){
		icon = 'B';
		row = i;
		col = j;
		this.map = map;
	}
	public void inputCommand(){
		System.out.print(Config.boxMenu);
		String s = Config.scan.nextLine();
		s = s.toUpperCase();
		switch(s){
		case Config.OPEN: case Config.sOPEN:
			System.out.println(Config.boxOpen);
			if(Math.random()<(0.6)){
				this.map.arrayMap[row][col] = new Food(row, col, map);
				System.out.println(Config.boxToFood);
			}
			else if(Math.random()<(0.3)){
				this.map.arrayMap[row][col] = new Weapon(row, col, map);
				System.out.println(Config.boxToWeapon);
			}
			else{
				this.map.turnLight();
				if(this.map.getLight())
					System.out.println(Config.turnOnLight);
				if(!this.map.getLight())
					System.out.println(Config.turnOffLight);
			}
			break;
		case Config.NOTHING: case Config.sNOTHING: break;
		default: System.out.println(Config.inputError); break;
		}
	}
}
