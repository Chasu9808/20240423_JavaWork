package ex_240423_home;

public class KoreanFood {
	
	private String foodName;
	private int foodPrice;
	private String foodPlace;
	
		//getter/setter 추가
		// 생성자 만들기
		// 객체를 생성해주는 역할 
		// 단수, 복수,
		// 매개변수가 3개인 생성자로 만들기
		// 참고로 생성자 기본문법은 클래스명과 동일 매서드명과 다름
		// 우클릭
	
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}
	public String getFoodPlace() {
		return foodPlace;
	}
	public void setFoodPlace(String foodPlace) {
		this.foodPlace = foodPlace;
	}
	
	public KoreanFood(String foodName, int foodPrice, String foodPlace) {
		super();
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.foodPlace = foodPlace;
		
		
		
	}


}
