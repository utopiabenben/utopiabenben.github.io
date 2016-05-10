/**
 * 
 */
package world;

/**
 * @author sarah Copyright Shanghai Chances. 2016年1月28日
 */
public class Autobike extends AutoMotive {

	public void start() {
		System.out.println("我是摩托车，我开始发动了");
	}

	public void stop() {
		System.out.println("我停下来的时间是：" + this.getTime() + "s");

	}

	private int getTime() {

		return 15;
	}

	public int getspeed() {
		return 120;

	}

	public String gettype() {

		return "哈雷883N";
	}

	public static void main(String[] args) {

		Autobike auto = new Autobike();
		auto.showInfo();
	}
}
