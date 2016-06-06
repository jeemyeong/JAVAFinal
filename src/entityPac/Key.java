package entityPac;
import configPac.Config;
import worldMapPac.WorldMap;

public class Key extends Entity {
	public Key(int i, int j, WorldMap map){
		icon = 'K';
		row = i;
		col = j;
		this.map = map;
	}
	public void inputCommand(){
		System.out.print(Config.keyMenu);
		String s = Config.scan.nextLine();
		s = s.toUpperCase();
		switch(s){
		case Config.GET: case Config.sGET:
			this.map.arrayMap[row][col] = null;
			this.map.getKey();
			System.out.println(Config.keyGet);
			break;
		case Config.NOTHING: case Config.sNOTHING: break;
		default: System.out.println(Config.inputError); break;
		}
	}
}
