/**
 * 
 */
package world;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author sarah
 * Copyright Shanghai Chances. 2016年1月31日
 */
public class weekeg2 {
	public static void main(String[] agrs) {
		  String newtime="2016-8-4";
		  System.out.println(newtime+""+testDate(newtime)); 
		 }
		 public static String testDate(String newtime) {
		  String dayNames[] = {"星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
		  int week1[] = {7,1,2,3,4,5,6};
		  Calendar c = Calendar.getInstance();// 获得一个日历的实例
		  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		  try {
		   c.setTime(sdf.parse(newtime));
		  } catch (ParseException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }
		   String a=dayNames[c.get(Calendar.DAY_OF_WEEK)-1];
		  
		   int b=week1[c.get(Calendar.DAY_OF_WEEK)-1];
		   if(b!=7){
		    c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY); 
		   }else{
		    c.add(Calendar.WEEK_OF_MONTH, -1); 
		    c.set(Calendar.DAY_OF_WEEK, 2);
		   }
		   
		   for(int i=1;i<b;i++){
		   if(i==1){
		     System.out.println(sdf.format(c.getTime()));//本周一 
		   }
		   c.add(Calendar.DATE,1);
		 
		 System.out.println(sdf.format(c.getTime()));
		   } 
		   System.out.println("-------------"); 
		      return a;
		 }
}
