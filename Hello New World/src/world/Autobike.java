/**
 * 
 */
package world;

/**
 * @author sarah Copyright Shanghai Chances. 2016��1��28��
 */
public class Autobike extends AutoMotive {

	public void start() {
		System.out.println("����Ħ�г����ҿ�ʼ������");
	}

	public void stop() {
		System.out.println("��ͣ������ʱ���ǣ�" + this.getTime() + "s");

	}

	private int getTime() {

		return 15;
	}

	public int getspeed() {
		return 120;

	}

	public String gettype() {

		return "����883N";
	}

	public static void main(String[] args) {

		Autobike auto = new Autobike();
		auto.showInfo();
	}
}
