package test.main;

import test.mypac.Car;
import test.mypac.MyUtill;

public class MainClass03 {
	public static void main(String[] args) {
		//1. MyUtill 클랫의 getCar() 메소드를 호출해서
		// 리턴되는 값을 car1 이라는 지역 변수에 담아 보세요.
		Car car1 = MyUtill.getCar();
		
		//2. car1 변수에 들어 있는 객체의 참조값을 이용해서 
		// 	 drive() 메소드를 호출해 보세요.
		
		car1.drive();
		 
	}
}
