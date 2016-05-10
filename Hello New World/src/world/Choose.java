/**
 * 
 */
package world;

/**
 * @author sarah Copyright Shanghai Chances. 2016年1月28日
 */
public class Choose {

	public void select(int speed) {
		Car car = new Car();
		Autobike ab = new Autobike();

		if (speed > 150) {
			System.out.println("welcome to you !您选择的是车速大于150km/h");
			car.start();
			car.showInfo();
			car.stop();

		} else {
			System.out.println("welcome to you !您选择的是车速小于150km/h");
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
