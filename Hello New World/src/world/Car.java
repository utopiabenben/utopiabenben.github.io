/** 
 * 定义跑车
 */
package world;

public class Car extends AutoMotive {

	public void start() {
		System.out.println("我是跑车，我开始跑了");
	}

	public void stop() {
		System.out.println("我停下来的时间是：" + this.getTime() + "s");

	}

	private int getTime() {

		return 45;
	}

	public String gettype() {

		return "凯迪拉克CT6";
	}

	public int getspeed() {

		return 220;
	}

	public static void main(String[] args) {

		Car car = new Car();
		car.showInfo();
	}
}