package entityPac;
import configPac.Config;
import worldMapPac.WorldMap;

public class Rock extends Entity {

	public Rock(int i, int j, WorldMap map){
		icon = 'R';
		row = i;
		col = j;
		this.map = map;
	}
	public void inputCommand(){
		System.out.print(Config.rockMenu);
		String s = Config.scan.nextLine();
		s = s.toUpperCase();
		switch(s){
		case Config.PUSH: case Config.sPUSH:
		int x = this.map.player.col;
		int y = this.map.player.row;
		if (this.map.arrayMap[2*row-y][2*col-x]==null){
			int r = row;
			int c = col;
			this.map.arrayMap[2*r-y][2*c-x] = this.map.arrayMap[r][c];
			this.map.arrayMap[r][c] = null;
			this.map.arrayMap[2*r-y][2*c-x].row = 2*r-y;
			this.map.arrayMap[2*r-y][2*c-x].col = 2*c-x;
			System.out.println(Config.rockPush);
		}
		break;
		case Config.NOTHING: case Config.sNOTHING: break;
		default: System.out.println(Config.inputError); break;
		}
	}

}
