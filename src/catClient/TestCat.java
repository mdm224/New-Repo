package catClient;

import DataStructures.Cat;
import DataStructures.Color;

public class TestCat {
	 public static void main(String[] args)
	    {
		 Cat prince = new Cat();
		 prince.setAge(0.8);
		 prince.setName("Prince");
		 prince.setType("domestic");
		 prince.setColor(Color.LAVENDER);
		 
		 
		 Cat betty = new Cat("Betty");
		 betty.setAge(0.25);
		 betty.setType("domestic");
		 betty.setColor(Color.RED);
		 
		 Cat Graycie = new Cat("Graycie", 4);
		 Graycie.setColor(Color.LAVENDER);
		 Graycie.setType("domestic");
		 
		 Cat Oliver = new Cat("Oliver", 13, Color.BLACK, "domestic");
		 
		 Cat catObjects[] = new Cat[4];
		 catObjects[0] = prince;
		 catObjects[1] = betty;
		 catObjects[2] = Graycie;
		 catObjects[3] = Oliver;
		 
		 int numbers[] = new int [catObjects.length];
		 for (int i = 0; i < catObjects.length; i++)
		 {
			numbers[i] = i; 
		 }
		 
		 for (int i : numbers)
		 {
			 System.out.println(catObjects[i].toString());
		 }
		 
	   }
}
