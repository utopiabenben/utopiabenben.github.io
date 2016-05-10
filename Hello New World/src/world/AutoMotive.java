/**
 * 定义一个机动车的抽象类,调用车的接口；
 * 定义一个输出速度的抽象方法；
 * 定义一个输出品牌的抽象方法；
 * 实现不同品牌车具有不同速度；继承机动车的属性；
 */
package world;

/**
 * @author sarah Copyright Shanghai Chances. 2016年1月27日
 */
public abstract class AutoMotive implements CarInterface {



	public void showInfo() {// 输出车的基本信息

		System.out.println("我的型号是：" + this.gettype());
		System.out.println("我的速度是：" + this.getspeed() + "km/h");
	}

	public abstract String gettype();

	public abstract int getspeed();

}
