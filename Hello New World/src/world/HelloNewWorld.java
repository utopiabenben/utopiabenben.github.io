/**
 * @author sarah Copyright Shanghai Chances. 2016��1��15�գ����hello new world
 */
package world;

/**
 * 
 * ������ HelloNewWorld;�������� �ַ��� hello;���巽�� PrintMethod()����ַ���;
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
	 * main����PrintMethod()���Ǿ�̬�������ã���Ҫ��ʵ��������Ķ���Ȼ��ͨ��������ʣ�
	 */
	public static void main(String[] args) {
		HelloNewWorld a = new HelloNewWorld();
		int sum;
		sum = a.add(1, 2);
		a.printMethodString("Hello New World");
		a.printMethodInt(sum);
	}

}
