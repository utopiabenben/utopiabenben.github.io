/**
 * 
 */
package world;

/**
 * @author sarah
 * Copyright Shanghai Chances. 2016Äê3ÔÂ4ÈÕ
 */
public class Triangle {
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for(int i=1;i<6;i++){
			for(int j=1;j<i;j++){
			System.out.print(" ");
			}
			for(int j=1;j<=5-i;j++){
				System.out.print(j);
				}
			for(int j=6-i;j>=1;j--){
			System.out.print(j);
			}
			
			System.out.println();
			}
		for(int i=1;i<6;i++){
			for(int j=5;j>i;j--){
			System.out.print(" ");
			}
			for(int j=1;j<i;j++){
				System.out.print(j);
				}
			for(int j=i;j>=1;j--){
			System.out.print(j);
			}
			
			System.out.println();
			}
}
}

