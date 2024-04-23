package ex_240423_home;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardEndHandler;

public class arme {
	private String meteo;
	private String stone;
	private String rightning;
	
	public String getMeteo() {
		return meteo;
	}
	public void setMeteo(String meteo) {
		this.meteo = meteo;
	}
	public String getStone() {
		return stone;
	}
	public void setStone(String stone) {
		this.stone = stone;
	}
	public String getRightning() {
		return rightning;
	}
	public void setRightning(String rightning) {
		this.rightning = rightning;
	}
	
	public void dealing() 
	{
		System.out.println("최후의 필살기");
	}

	public void rock() 
	{
		System.out.println("stone으로 굳히기");
	}
	
	public void selectend(String end) 
	{
		System.out.println("마지막 일격 :" + end);
		
	}
}
