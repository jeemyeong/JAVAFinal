package entityPac;
import configPac.Config;
import worldMapPac.WorldMap;

public class SMonster extends Entity {

	public SMonster(int i, int j, WorldMap map){
		icon = 'm';
		row = i;
		col = j;
		hp = 30;
		maxHp = 30;
		attackPower = 10;
		this.map = map;
	}
	public void inputCommand(){
		System.out.print(Config.monsterMenu);
		String s = Config.scan.nextLine();
		s = s.toUpperCase();
		switch(s){
		case Config.ATTACK: case Config.sATTACK:
			if(Math.random()<0.5){
				System.out.println(Config.playerAttack);
				getDamage(this.map.player.getAttackPower());
				if(getHP()<=0){
					die();
				}else{
					System.out.print(Config.monster);
					System.out.println(getHP()+"/"+getMaxHP());
					attackPlayer(this.map.player);
				}
			}
			else{
				attackPlayer(this.map.player);
				if(this.map.player.getHP()>0){
					System.out.println(Config.playerAttack);
					getDamage(this.map.player.getAttackPower());
					if(getHP()<=0){
						die();
					}else{
						System.out.print(Config.monster);
						System.out.println(getHP()+"/"+getMaxHP());
					}
				}
			}
			break;
		case Config.LEAVE: case Config.sLEAVE: 
			System.out.println(Config.playerLeave);
			break;
		default: System.out.println(Config.inputError); break;
		}
	}
	void getDamage(int i){
		hp-=i;
	}
	void die(){
		System.out.print(Config.monster);
		System.out.println("0/"+getMaxHP());
		this.map.arrayMap[row][col] = null;
		this.map.player.getExp(30);
		System.out.println(Config.sMonsterKill);
	}
	void attackPlayer(Player player){
		player.getDamage(getAttackPower());
		System.out.println(Config.monsterAttack);
		if(player.getHP()<=0){
			System.out.println(Config.playerDie);
			this.map.getEnd();
		}
	}
}
