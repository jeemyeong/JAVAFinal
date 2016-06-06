package entityPac;
import worldMapPac.WorldMap;
public class Wall extends Entity {

	public Wall(int i, int j, WorldMap map){
		icon = '#';
		row = i;
		col = j;
		this.map = map;
	}
}
