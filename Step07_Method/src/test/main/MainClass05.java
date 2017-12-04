package test.main;

import test.mypac.Car;
import test.mypac.MyUtill;

public class MainClass05 {
	public static void main(String[] args) {
		//useCar (Car car) 메소드를 출력해 보세요.
		MyUtill.useCar(new Car());
		//userCar(String msg, Car car) 메소드를 호출해 보세요.
		MyUtill.useCar("hello~", new Car());
	}
}
