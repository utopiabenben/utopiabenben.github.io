/** 
 * �����ܳ�
 */
package world;

public class Car extends AutoMotive {

	public void start() {
		System.out.println("�����ܳ����ҿ�ʼ����");
	}

	public void stop() {
		System.out.println("��ͣ������ʱ���ǣ�" + this.getTime() + "s");

	}

	private int getTime() {

		return 45;
	}

	public String gettype() {

		return "��������CT6";
	}

	public int getspeed() {

		return 220;
	}

	public static void main(String[] args) {

		Car car = new Car();
		car.showInfo();
	}
}