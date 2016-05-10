/**
 * 
 */
package world;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author sarah
 * Copyright Shanghai Chances. 2016年1月31日
 */
public class Test{
    public static void main(String[] args) throws IOException
    {
           System.out.println("请输入月份:");
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int i=Integer.parseInt(br.readLine());
                while (i>12 || i<1){
                         System.out.println("请重新输入！");
                         br = new BufferedReader(new InputStreamReader(System.in));
                }
                System.in.close();
                br.close();
             
                switch (i){

                case 1:
                    System.out.println("本月共 "+31+" 天");
                    break;
                case 2:
                      System.out.println("本月共 "+28+"或"+29+" 天");
                    break;

                case 3:
                        System.out.println("本月共 "+31+" 天");
                         break;

                case 4:
                        System.out.println("本月共 "+30+" 天");
                        break;

                case 5:
                         System.out.println("本月共 "+31+" 天");
                         break;

                case 6:
                         System.out.println("本月共 "+30+" 天");
                         break;

                case 7:
                         System.out.println("本月共 "+31+" 天");
                         break;

                case 8:
                         System.out.println("本月共 "+31+" 天");
                         break;

                case 9:
                         System.out.println("本月共 "+30+" 天");
                         break;

                case 10:
                         System.out.println("本月共 "+31+"天");
                         break;

                case 11:
                         System.out.println("本月共 "+30+" 天");
                         break;

                case 12:
                         System.out.println("本月共 "+31+" 天");
                         break;
                default:
                         System.out.println("请重新输入！");
                }
         }
}