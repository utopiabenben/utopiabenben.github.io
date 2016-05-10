/**
 * @author sarah
 * Copyright Shanghai Chances. 2016Äê3ÔÂ4ÈÕ
 */
package world;

public class Weekend {
	String id;
	String day;
	public Weekend(String id,String day) {
		this.id = id;
		this.day = day;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + " " + this.day;
	} 
	
}