/**
 * 
 */
package world;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author sarah
 * Copyright Shanghai Chances. 2016��1��31��
 */
public class Test{
    public static void main(String[] args) throws IOException
    {
           System.out.println("�������·�:");
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int i=Integer.parseInt(br.readLine());
                while (i>12 || i<1){
                         System.out.println("���������룡");
                         br = new BufferedReader(new InputStreamReader(System.in));
                }
                System.in.close();
                br.close();
             
                switch (i){

                case 1:
                    System.out.println("���¹� "+31+" ��");
                    break;
                case 2:
                      System.out.println("���¹� "+28+"��"+29+" ��");
                    break;

                case 3:
                        System.out.println("���¹� "+31+" ��");
                         break;

                case 4:
                        System.out.println("���¹� "+30+" ��");
                        break;

                case 5:
                         System.out.println("���¹� "+31+" ��");
                         break;

                case 6:
                         System.out.println("���¹� "+30+" ��");
                         break;

                case 7:
                         System.out.println("���¹� "+31+" ��");
                         break;

                case 8:
                         System.out.println("���¹� "+31+" ��");
                         break;

                case 9:
                         System.out.println("���¹� "+30+" ��");
                         break;

                case 10:
                         System.out.println("���¹� "+31+"��");
                         break;

                case 11:
                         System.out.println("���¹� "+30+" ��");
                         break;

                case 12:
                         System.out.println("���¹� "+31+" ��");
                         break;
                default:
                         System.out.println("���������룡");
                }
         }
}