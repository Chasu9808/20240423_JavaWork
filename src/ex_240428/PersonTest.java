package ex_240428;

public class PersonTest {

	public static void main(String[] args) {
		
		Person [] testMemberPerson = new Person[4];
		
		hongjintae hongJintaeLion = new hongjintae();
		
		leehansol leehansolLion = new leehansol();
		
		limchaesu limchaesuLion = new limchaesu();
		
		moonjungseob moonjungseobLion  = new moonjungseob();
		
	
		
			
		
		testMemberPerson[0] = hongJintaeLion;
		testMemberPerson[1] = leehansolLion;
		testMemberPerson[2] = limchaesuLion;
		testMemberPerson[3] = moonjungseobLion;
		
		
		for (Person person : testMemberPerson) 
		{
		
			if(person instanceof hongjintae) {
				hongjintae test = (hongjintae)person;
				test.sleep();
			} 
			else if (person instanceof leehansol) 
			{
				leehansol test1 = (leehansol)person;
				test1.speak();
			}
			else if (person instanceof limchaesu) 
			{
				limchaesu test2 = (limchaesu)person;
				test2.walk();
			}
			else if (person instanceof moonjungseob) 
			{
				moonjungseob test3 = (moonjungseob)person;
				test3.eat();
			}
			
	}

}
}
