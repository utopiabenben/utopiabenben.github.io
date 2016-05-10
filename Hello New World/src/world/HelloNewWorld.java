/**
 * @author sarah Copyright Shanghai Chances. 2016年1月15日，输出hello new world
 */
package world;

/**
 * 
 * 定义类 HelloNewWorld;定义属性 字符串 hello;定义方法 PrintMethod()输出字符串;
 */
public class HelloNewWorld {
	public static String hello;
	public static int sum;

	public void printMethodString(String hello) {
		System.out.println(hello);
	}

	public void printMethodInt(int sum) {
		System.out.println(sum);
	}

	public int add(int x, int y) {
		return x + y;
	}

	/**
	 * main调用PrintMethod()，非静态方法调用，需要先实例化该类的对象，然后通过对象访问；
	 */
	public static void main(String[] args) {
		HelloNewWorld a = new HelloNewWorld();
		int sum;
		sum = a.add(1, 2);
		a.printMethodString("Hello New World");
		a.printMethodInt(sum);
	}

}
