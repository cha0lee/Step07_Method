package test.main;

import test.mypac.MyUtill;

public class MainClass02 {
	public static void main(String[] args) {
		//MyUtil 클래스의 getNum() 메소드를 호출해 보세요.
		System.out.println("메인 메소드가 시작 되었습니다.");
		MyUtill.getNum(); // 현재 콜한 이 위치가 return값 10이 위치한다.
		int a=MyUtill.getNum(); //a 변수에 return값 10 담기 
		
		//MyUtil 클래스의 getMessage() 메소드를 호출하고 
		//리턴되는 값을 msg 라는 지역변수에 저장해 보세요.
//		MyUtill.getMessage(); //아래와 위 같은 표현
		String msg=MyUtill.getMessage();
		
		//MyUtill 클래스에 정의된 getName()메소드를 호출하고 
		//리턴 되는 값을 name 이라는 지역 변수에 저장해 보세요.
		MyUtill ac=new MyUtill();
		String name=ac.getName();
	}
}
