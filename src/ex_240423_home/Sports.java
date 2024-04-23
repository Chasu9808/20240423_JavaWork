package ex_240423_home;


public class Sports {

	public static void main(String[] args) {
		
	socer socerSports = new socer("socer","11명","everyday");
	
	System.out.println("제일 좋아하는 스포츠는 :" + socerSports.getSportsName());
	System.out.println("인원수는? :" + socerSports.getSportsMember());
	System.out.println("가능한 계절은? :" + socerSports.getSportsSeason());
	

	}

}
