/**
 * ����һ���������ĳ�����,���ó��Ľӿڣ�
 * ����һ������ٶȵĳ��󷽷���
 * ����һ�����Ʒ�Ƶĳ��󷽷���
 * ʵ�ֲ�ͬƷ�Ƴ����в�ͬ�ٶȣ��̳л����������ԣ�
 */
package world;

/**
 * @author sarah Copyright Shanghai Chances. 2016��1��27��
 */
public abstract class AutoMotive implements CarInterface {



	public void showInfo() {// ������Ļ�����Ϣ

		System.out.println("�ҵ��ͺ��ǣ�" + this.gettype());
		System.out.println("�ҵ��ٶ��ǣ�" + this.getspeed() + "km/h");
	}

	public abstract String gettype();

	public abstract int getspeed();

}
