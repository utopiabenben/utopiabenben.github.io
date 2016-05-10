/**
 * 
 */
package world;

/**
 * @author sarah Copyright Shanghai Chances. 2016年1月31日
 *         2、用分支语句：if-else、break、switch、return输出星期一到星期日；
 */
public class BranchStatement {
	public void printif() {
		for (int i = 1; i <= 8; i++) {
			if (i == 1) {
				System.out.print("Monday ");
			} else if (i == 2) {
				System.out.print("Tuesday ");
			} else if (i == 3) {
				System.out.print("Wednesday ");
			} else if (i == 4) {
				System.out.print("Thursday ");
			} else if (i == 5) {
				System.out.print("Friday ");
			} else if (i == 6) {
				System.out.print("Saturday ");
			} else if (i == 7) {
				System.out.println("Sunday ");
			} else {
				break;
			}
		}
	}

	public void printswitch() {
		int date = 1;
		do {
			switch (date) {
			case 1:
				System.out.print("Monday ");
				break;
			case 2:
				System.out.print("Tuesday ");
				break;
			case 3:
				System.out.print("Wednesday ");
				break;
			case 4:
				System.out.print("Thursday ");
				break;
			case 5:
				System.out.print("Friday ");
				break;
			case 6:
				System.out.print("Saturday ");
				break;
			case 7:
				System.out.print("Sunday ");
				break;
			default:
				return;
			}
			date++;
		}
		while(date <= 7);
	}

	public static void main(String[] arg) {
		BranchStatement date = new BranchStatement();
		// System.out.println("if语句输出周一至周日");
		// date.printif();
		System.out.println("switch语句输出周一至周日");
		date.printswitch();

	}
}
