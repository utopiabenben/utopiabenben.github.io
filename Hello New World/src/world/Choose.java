/**
 * 
 */
package world;

/**
 * @author sarah Copyright Shanghai Chances. 2016��1��28��
 */
public class Choose {

	public void select(int speed) {
		Car car = new Car();
		Autobike ab = new Autobike();

		if (speed > 150) {
			System.out.println("welcome to you !��ѡ����ǳ��ٴ���150km/h");
			car.start();
			car.showInfo();
			car.stop();

		} else {
			System.out.println("welcome to you !��ѡ����ǳ���С��150km/h");
			ab.start();
			ab.showInfo();
			ab.stop();

		}

	}

	public static void resultprint() {

	}

	public static void main(String[] args) {

		Choose cs = new Choose();
		cs.select(220);

	}

}
