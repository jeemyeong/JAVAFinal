package entityPac;

public class Entity {
	int hp;
	int maxHp;
	int attackPower;
	int row;
	int col;
	
	void inputCommand(){
		//��� �Է��� �޴� �Լ�
	}
	void setRow(){
		//Entity�� WorldMap������ ��ǥ ����
	}
	void setCol(){
		//Entity�� WorldMap������ ��ǥ ����
	}
	int getRow(){
		//Entity WorldMap������ ��ǥ ��ȯ
		return row;
	}
	int getCol(){
		//Entity WorldMap������ ��ǥ ��ȯ
		return col;
	}
	int getHP(){
		return hp;
	}
	int getAttackPower(){
		return attackPower;
	}
	void increaseHP(){
		//ü�� ����
	}
	void decreaseHP(){
		//ü�°���
	}
	void getIcon(){
		//��ü�� ������ ��ȯ
	}
	void showMenu(){
		//��ü�� ���� �޴� ���
	}
	
	boolean getEnd(){
		if (true)
			return true;
		else
			return false;
	}
	
}
