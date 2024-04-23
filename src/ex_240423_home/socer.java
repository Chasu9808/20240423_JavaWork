package ex_240423_home;

public class socer {
	private String SportsName;
	private String SportsMember;
	private String SportsSeason;
	
	
	public String getSportsName() {
		return SportsName;
	}
	public void setSportsName(String sportsName) {
		SportsName = sportsName;
	}
	public String getSportsMember() {
		return SportsMember;
	}
	public void setSportsMember(String sportsMember) {
		SportsMember = sportsMember;
	}
	public String getSportsSeason() {
		return SportsSeason;
	}
	public void setSportsSeason(String sportsSeason) {
		this.SportsSeason = sportsSeason;
	}
	public socer(String sportsName, String sportsMember, String sportsSeason) {
		super();
		SportsName = sportsName;
		SportsMember = sportsMember;
		this.SportsSeason = sportsSeason;
	}
	
	
	
}
