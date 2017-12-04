package test.main;

import test.mypac.MyUtill;

public class MainClass01 {
	public static void main(String[] args) {
		//MyUtil  클래스에 정의한 showVersion() 메소드를 
		//호출해 보세요.
		
		MyUtill.showVersion();  //static은 필드 클래스 영역에 올라간다. Heap영역 독립객체 x
		
		//MyUtil  클래스에 정의한 sendMessage() 메소드를 
		//호출해 보세요.		
		
		MyUtill mc=new MyUtill();
		mc.sendMessage();
		
		MyUtill u2 = new MyUtill ();
		u2.sendMessage();
		
		//new MyUtil().sendMessage();
		
		
		
	}
}
