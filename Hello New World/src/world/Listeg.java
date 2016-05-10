/**
 * 
 */
package world;
import java.util.ArrayList;
import java.util.List;
/**
 * @author sarah
 * Copyright Shanghai Chances. 2016年3月4日
 */
public class Listeg {
	
	
		
	    public static void main(String[] args) {
	        Weekend week1 = new Weekend("1","星期一");
	        Weekend week2 = new Weekend("2","星期一");
	        Weekend week3 = new Weekend("3","星期一");
	        Weekend week4 = new Weekend("4","星期二");
	        Weekend week5 = new Weekend("5","星期二");
	        List<Weekend> list = new ArrayList<Weekend>();
	        list.add(week1);
	        list.add(week2);
	        list.add(week3);
	        list.add(week4);
	        list.add(week5);
	         
	        List<Weekend> weekList = new ArrayList<Weekend>();
	        for (int i = 0; i < list.size(); i++) {
	            Weekend w1 = list.get(i);
	            weekList.add(w1);
	            for (int j = 0; j < weekList.size(); j++) {
	                if(i<list.size()-1){
	                    Weekend w2 = list.get(i+1);
	                    Weekend w3 = weekList.get(j);
	                    if(w2.getDay().equals(w3.getDay())){
	                        w2.setId(w3.getId()+","+w2.getId());
	                        weekList.remove(w1);
	                    }
	                }
	            }
	        }
	         
	        System.out.println(weekList);
	    }
	}
	 
