package test.main;

import test.mypac.MyUtill;

public class MainClass01 {
	public static void main(String[] args) {
		//MyUtil  Ŭ������ ������ showVersion() �޼ҵ带 
		//ȣ���� ������.
		
		MyUtill.showVersion();  //static�� �ʵ� Ŭ���� ������ �ö󰣴�. Heap���� ������ü x
		
		//MyUtil  Ŭ������ ������ sendMessage() �޼ҵ带 
		//ȣ���� ������.		
		
		MyUtill mc=new MyUtill();
		mc.sendMessage();
		
		MyUtill u2 = new MyUtill ();
		u2.sendMessage();
		
		//new MyUtil().sendMessage();
		
		
		
	}
}
