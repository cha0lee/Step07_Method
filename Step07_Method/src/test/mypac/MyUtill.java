package test.mypac;
/*
 *  [�޼ҵ� �����ϱ� ]
 *  
 *  1. ���������� ? public
 *  2. static or non static? static
 *  3. return ������ type ? void
 *  4. �޼ҵ� �� ? showVersion
 *  5. �޼ҵ忡 ���޹޴� ������ ������ ������ type ? ()
 * 
 */
public class MyUtill {
	
	public MyUtill() {  
		
	}

	//�޼ҵ� �����ϱ� 
	public static void showVersion() {
		System.out.println("showVersion() ȣ���!");
	}
	
	
	public void sendMessage() {
		System.out.println("sendMessage() ȣ���!");
	}
	
	public static int getNum() {
		System.out.println("getNum() ȣ�ⳡ");
		return 10;
	}
	
	public static String getMessage() {
		System.out.println("getMessage() ȣ���");
		return "Hello! mama!";
	}
	
	public static void printNum(int num) {
		System.out.println("---" + num + "---");
	}
	
	public String getName() {
		System.out.println("getName() ȣ���");
		return "�豸��";
	}
	
	/*
	 *  ���� ������ : public 
	 *  static
	 *  ���� ������ type : Car
	 *  �޼ҵ�� : getCar
	 *  �޼ҵ� ���� : ����
	 *  
	 */
	
	public static Car getCar() {
		// Car ��ü�� �����ؼ� �������� ������ ���� ����
		Car car = new Car(); //car type�� �������� new car(); �ؾ��� �� �� �ִ�.
		//������ ����� �������� �������ش�.
		return  car;
	} 
	
	//���ڷ� String type �� �޴� �޼ҵ� 
	public static void printMsg(String msg) {
		System.out.println("printMsg() ȣ���");
	}
	
	//���ڷ� Car type �� �޴� �޼ҵ�
	public static void useCar(Car car) {
		car.drive();
	}
	//���ڷ� String type �� car type �� ���� �޴� �޼ҵ�
	public static void useCar(String msg, Car car) {
		car.drive();	
	}
}
