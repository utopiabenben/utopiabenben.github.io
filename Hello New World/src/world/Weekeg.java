/**
 * 
 */
package world;

import java.util.Scanner;

/**
 * @author sarah Copyright Shanghai Chances. 2016��1��31�� ��ͬ�ķ����������һ�������գ�
 *         1�������飬����һ�������գ����������������� 
 *         2���÷�֧��䣺if-else��break��switch��return�����
 *         3����ѭ����䣺while�������do-while�������for�������continue
 *         4����set��list��
 *         Ӧ�ã�
 *         ���������һ~�����壬���������������������������գ������Ϣ��
 * 
 */
public class Weekeg {

	public void print(int date) {
		switch (date) {
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		default:
			System.out.println("������");
		}

	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ss = new Scanner(System.in);
		try {
			int dd = Integer.parseInt(ss.next());
			if (dd > 7 || dd < 1) {
				System.out.println("������������д���,������1��7������");
			} else {
				new Weekeg().print(dd);
			}
		} catch (Exception e) {
			System.out.println("������������,������1��7������");
		}
	}
}
