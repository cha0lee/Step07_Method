package test.main;

import test.mypac.Car;
import test.mypac.MyUtill;

public class MainClass03 {
	public static void main(String[] args) {
		//1. MyUtill Ŭ���� getCar() �޼ҵ带 ȣ���ؼ�
		// ���ϵǴ� ���� car1 �̶�� ���� ������ ��� ������.
		Car car1 = MyUtill.getCar();
		
		//2. car1 ������ ��� �ִ� ��ü�� �������� �̿��ؼ� 
		// 	 drive() �޼ҵ带 ȣ���� ������.
		
		car1.drive();
		 
	}
}
