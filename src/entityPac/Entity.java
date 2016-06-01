package entityPac;

public class Entity {
	int hp;
	int maxHp;
	int attackPower;
	int row;
	int col;
	
	void inputCommand(){
		//명령 입력을 받는 함수
	}
	void setRow(){
		//Entity의 WorldMap에서의 좌표 저장
	}
	void setCol(){
		//Entity의 WorldMap에서의 좌표 저장
	}
	int getRow(){
		//Entity WorldMap에서의 좌표 반환
		return row;
	}
	int getCol(){
		//Entity WorldMap에서의 좌표 반환
		return col;
	}
	int getHP(){
		return hp;
	}
	int getAttackPower(){
		return attackPower;
	}
	void increaseHP(){
		//체력 증가
	}
	void decreaseHP(){
		//체력감소
	}
	void getIcon(){
		//객체의 아이콘 반환
	}
	void showMenu(){
		//객체의 선택 메뉴 출력
	}
	
	boolean getEnd(){
		if (true)
			return true;
		else
			return false;
	}
	
}
