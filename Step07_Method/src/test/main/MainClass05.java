package test.main;

import test.mypac.Car;
import test.mypac.MyUtill;

public class MainClass05 {
	public static void main(String[] args) {
		//useCar (Car car) �޼ҵ带 ����� ������.
		MyUtill.useCar(new Car());
		//userCar(String msg, Car car) �޼ҵ带 ȣ���� ������.
		MyUtill.useCar("hello~", new Car());
	}
}
