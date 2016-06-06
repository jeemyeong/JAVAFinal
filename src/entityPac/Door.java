package entityPac;
import configPac.Config;
import worldMapPac.WorldMap;

public class Door extends Entity {
	public Door(int i, int j, WorldMap map){
		icon = 'D';
		row = i;
		col = j;
		this.map = map;
	}
	public void inputCommand(){
		System.out.print(Config.doorMenu);
		String s = Config.scan.nextLine();
		s = s.toUpperCase();
		switch(s){
		case Config.OPEN: case Config.sOPEN:
			if(this.map.hasKey()){
				this.map.arrayMap[row][col]=null;
				System.out.println(Config.doorOpen);
			}
			else
				System.out.println(Config.doorCantOpen);
			break;
		case Config.NOTHING: case Config.sNOTHING: break;
		default: System.out.println(Config.inputError); break;
		}
	}
}
