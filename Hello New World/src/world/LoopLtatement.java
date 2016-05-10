/**
 * 
 */
package world;

/**
 * @author sarah Copyright Shanghai Chances. 2016年1月31日
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
		System.out.println("\n逆序后为：");
		for (int j = 0; j < i; j++) {
			dayNames[j] = dayNames[i - 1 - j];
			System.out.print(dayNames[j] + "  ");

		}

	}

	public static void date2() {
		String[][] dayNames = { { "Monday ", "星 期 一", "星 期 1" }, { "Tuesday ", "星 期 二", "星 期2" },
				{ "Wednesday ", "星 期 三", "星 期 3" }, { "Thursday ", "星期四", "星期4" }, { "Friday ", "星期五", "星期5" },
				{ "Saturday ", "星期六", "星期6" }, { "Sunday ", "星期日", "星期7" }

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
		 System.out.println("一维数组输出周一至周日");
		 LoopLtatement.date();
		 System.out.println("\n");
		System.out.println("二维数组输出周一至周日");
		LoopLtatement.date2();

	}
}
