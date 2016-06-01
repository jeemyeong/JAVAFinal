package configPac;

import java.util.Scanner;

public class Config {

	public static Scanner scan = new Scanner(System.in); 
	public static int mapRow = 7;  
	public static int mapCol = 20;  
	final public static char UP = 'W';  
	final public static char DOWN = 'S';
	final public static char LEFT = 'A';  
	final public static char RIGHT = 'D';
	final public static String mainMenu = "(A)Left (D)Right (W)Up (S)Down (Q)uit: "; 
	final public static String player = "Player  HP: "; 
	final public static String damage = "\t Damage: "; 
	final public static String shortSword = "\tShort Sword"; 
	final public static String bareHands = "\tBare hands"; 
	final public static String x = "\tX: "; 
	final public static String y = " Y: "; 
	final public static String MAP_FILENAME = "c:/oop/map.dat";
//전역 변수 및 기호 상수(symbolic constant)들을 정의함 
//모든 출력 문자열 및 문자들은 여기에 상수로 정의하여 사용함 
//입력 관련 메소드를 정의하여 사용함 
}
