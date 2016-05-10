/**
 * 
 */
package world;

import java.util.Scanner;

/**
 * @author sarah Copyright Shanghai Chances. 2016年1月31日 不同的方法输出星期一到星期日；
 *         1、用数组，星期一到星期日；正序输出、倒序输出 
 *         2、用分支语句：if-else、break、switch、return输出；
 *         3、用循环语句：while输出；用do-while输出；用for输出；用continue
 *         4、用set、list；
 *         应用：
 *         如果是星期一~星期五，输出工作；如果是星期六、星期日，输出休息；
 * 
 */
public class Weekeg {

	public void print(int date) {
		switch (date) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		default:
			System.out.println("星期日");
		}

	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ss = new Scanner(System.in);
		try {
			int dd = Integer.parseInt(ss.next());
			if (dd > 7 || dd < 1) {
				System.out.println("您输入的数字有错误,请输入1到7的数字");
			} else {
				new Weekeg().print(dd);
			}
		} catch (Exception e) {
			System.out.println("您的输入有误,请输入1到7的数字");
		}
	}
}
