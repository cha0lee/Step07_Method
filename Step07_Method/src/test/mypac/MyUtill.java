package test.mypac;
/*
 *  [메소드 정의하기 ]
 *  
 *  1. 접근지정자 ? public
 *  2. static or non static? static
 *  3. return 데이터 type ? void
 *  4. 메소드 명 ? showVersion
 *  5. 메소드에 전달받는 인자의 갯수와 데이터 type ? ()
 * 
 */
public class MyUtill {
	
	public MyUtill() {  
		
	}

	//메소드 정의하기 
	public static void showVersion() {
		System.out.println("showVersion() 호출됨!");
	}
	
	
	public void sendMessage() {
		System.out.println("sendMessage() 호출됨!");
	}
	
	public static int getNum() {
		System.out.println("getNum() 호출끝");
		return 10;
	}
	
	public static String getMessage() {
		System.out.println("getMessage() 호출됨");
		return "Hello! mama!";
	}
	
	public static void printNum(int num) {
		System.out.println("---" + num + "---");
	}
	
	public String getName() {
		System.out.println("getName() 호출됨");
		return "김구라";
	}
	
	/*
	 *  접근 지정자 : public 
	 *  static
	 *  리턴 데이터 type : Car
	 *  메소드명 : getCar
	 *  메소드 인자 : 없음
	 *  
	 */
	
	public static Car getCar() {
		// Car 객체를 생성해서 참조값을 변수에 담은 다음
		Car car = new Car(); //car type의 참조값은 new car(); 해야지 얻어낼 수 있다.
		//변수에 저장된 참조값을 리턴해준다.
		return  car;
	} 
	
	//인자로 String type 을 받는 메소드 
	public static void printMsg(String msg) {
		System.out.println("printMsg() 호출됨");
	}
	
	//인자로 Car type 을 받는 메소드
	public static void useCar(Car car) {
		car.drive();
	}
	//인자로 String type 과 car type 을 전달 받는 메소드
	public static void useCar(String msg, Car car) {
		car.drive();	
	}
}
