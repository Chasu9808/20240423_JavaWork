package ex_240428;

public class PersonTest {

	public static void main(String[] args) {
		
		Object [] testMemberObjects = new Object[4];
		
		hongjintae hongJintaeLion = new hongjintae();
		
		leehansol leehansolLion = new leehansol();
		
		limchaesu limchaesuLion = new limchaesu();
		
		moonjungseob moonjungseobLion  = new moonjungseob();
		
	
		
			
		
		testMemberObjects[0] = hongJintaeLion;
		testMemberObjects[1] = leehansolLion;
		testMemberObjects[2] = limchaesuLion;
		testMemberObjects[3] = moonjungseobLion;
		
		
		for (Object object : testMemberObjects) 
		{
			Object object1 = object;
		
			if(object1 instanceof hongjintae) {
				hongjintae test = (hongjintae)object1;
				test.sleep();
			} 
			else if (object1 instanceof leehansol) 
			{
				leehansol test1 = (leehansol)object1;
				test1.speak();
			}
			else if (object1 instanceof limchaesu) 
			{
				limchaesu test2 = (limchaesu)object1;
				test2.walk();
			}
			else if (object1 instanceof moonjungseob) 
			{
				moonjungseob test3 = (moonjungseob)object1;
				test3.eat();
			}
			
	}

}
}
