/**
 * 
 */
package world;

/**
 * @author sarah Copyright Shanghai Chances. 2016��1��31��
 */
public class LoopLtatement {
	public static void date() {
		String[] dayNames = { "Monday ", "Tuesday ", "Wednesday ", "Thursday ", "Friday ", "Saturday ", "Sunday " };
		String[] weeks = new String[dayNames.length];
		int i = 0;
		for (String str : dayNames) {
			weeks[i] = str;
			++i;
			System.out.print(str);

		}
		System.out.println("\n�����Ϊ��");
		for (int j = 0; j < i; j++) {
			dayNames[j] = dayNames[i - 1 - j];
			System.out.print(dayNames[j] + "  ");

		}

	}

	public static void date2() {
		String[][] dayNames = { { "Monday ", "�� �� һ", "�� �� 1" }, { "Tuesday ", "�� �� ��", "�� ��2" },
				{ "Wednesday ", "�� �� ��", "�� �� 3" }, { "Thursday ", "������", "����4" }, { "Friday ", "������", "����5" },
				{ "Saturday ", "������", "����6" }, { "Sunday ", "������", "����7" }

		};
		int p = 0;
		for (int i = 0; i < dayNames.length; i++) {
			for (int j = 0; j < dayNames[i].length; j++)
				System.out.print(dayNames[i][j] + "  ");
			do {
				System.out.println("\n");
				// break;
			} while (p < dayNames.length);
		}

	}

	public static void main(String[] arg) {
		 System.out.println("һά���������һ������");
		 LoopLtatement.date();
		 System.out.println("\n");
		System.out.println("��ά���������һ������");
		LoopLtatement.date2();

	}
}
