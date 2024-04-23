package ex_240423_home;

public class TodayLunchMenu {
	
	public static void main(String[] args)
	
	{
		System.out.println("메인시작");
		
		KoreanFood bibimbob = new KoreanFood("비빔밥", 9000, "본죽");
		KoreanFood bulgogi = new KoreanFood("불고기", 7500, "태산");
		KoreanFood dolsot = new KoreanFood("돌솥", 7500, "우정비빔밥");
		
		System.out.println("오늘 점심 메뉴 : " + bibimbob.getFoodName());
		System.out.println("오늘 점심 가격 : " + bibimbob.getFoodPrice());
		System.out.println("오늘 점심 장소 : " + bibimbob.getFoodPlace());
		
		System.out.println("오늘 점심 메뉴 : " + bulgogi.getFoodName());
		System.out.println("오늘 점심 가격 : " + bulgogi.getFoodPrice());
		System.out.println("오늘 점심 장소 : " + bulgogi.getFoodPlace());
	}

}
