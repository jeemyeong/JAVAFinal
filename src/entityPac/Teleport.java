package entityPac;
import configPac.Config;
import worldMapPac.WorldMap;

public class Teleport extends Entity {

	public Teleport(int i, int j, WorldMap map){
		icon = 'T';
		row = i;
		col = j;
		this.map = map;
	}
	public void inputCommand(){
		System.out.print(Config.teleportMenu);
		String s = Config.scan.nextLine();
		s = s.toUpperCase();
		int x;
		int y;
		switch(s){
		case Config.JUMP: case Config.sJUMP:
		if (this.map.teleport[0]==this){
			x = this.map.teleport[1].getCol();
			y = this.map.teleport[1].getRow();
		}
		else{
			x = this.map.teleport[0].getCol();
			y = this.map.teleport[0].getRow();
		}
		int r = this.map.player.getRow();
		int c = this.map.player.getCol();
		this.map.arrayMap[y+1][x] = this.map.player;
		this.map.player.row = y+1;
		this.map.player.col = x;
		this.map.arrayMap[r][c] = null;
		System.out.println(Config.teleportJump);
		
		break;
		case Config.NOTHING: case Config.sNOTHING: break;
		default: System.out.println(Config.inputError); break;
		}
	}

}
