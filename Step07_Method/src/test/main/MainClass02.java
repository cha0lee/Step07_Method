package test.main;

import test.mypac.MyUtill;

public class MainClass02 {
	public static void main(String[] args) {
		//MyUtil Ŭ������ getNum() �޼ҵ带 ȣ���� ������.
		System.out.println("���� �޼ҵ尡 ���� �Ǿ����ϴ�.");
		MyUtill.getNum(); // ���� ���� �� ��ġ�� return�� 10�� ��ġ�Ѵ�.
		int a=MyUtill.getNum(); //a ������ return�� 10 ��� 
		
		//MyUtil Ŭ������ getMessage() �޼ҵ带 ȣ���ϰ� 
		//���ϵǴ� ���� msg ��� ���������� ������ ������.
//		MyUtill.getMessage(); //�Ʒ��� �� ���� ǥ��
		String msg=MyUtill.getMessage();
		
		//MyUtill Ŭ������ ���ǵ� getName()�޼ҵ带 ȣ���ϰ� 
		//���� �Ǵ� ���� name �̶�� ���� ������ ������ ������.
		MyUtill ac=new MyUtill();
		String name=ac.getName();
	}
}
