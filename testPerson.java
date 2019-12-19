/*Ask by keyboard the name, age, gender, weight and height. 
Create 3 objects of the previous class.
 The first object will get the previous variables requested by keyboard, the second object will get all the previous ones 
 but the weight and height by default, and the last one everything by default.
 For the latter, use setter methods to give values to the attributes. 
For each object, you should check if you are at ideal weight, overweight or below ideal weight and show a message. 
Indicate for each object if it is of legal age. 
Finally, display the information of each object. You can use methods in the executable class, to make it easier for you.
*/
import java.util.Scanner;

public class testPerson {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner (System.in);
		String name;
		char gender;
		int age, id;
		float weight , height;
		
		Person[] person = new Person [3];		
		
		System.out.println("Enter the name:");
		name = myObj.next();
			
		System.out.println("Enter the gender:");
		gender = myObj.next().charAt(0);
	
		System.out.println("Enter the age:");
		age = myObj.nextInt();
			
		System.out.println("Enter the id:");
		id = myObj.nextInt();
			
		System.out.println("Enter the weight:");
		weight = myObj.nextFloat();
			
		System.out.println("Enter the height:");
		height = myObj.nextFloat();
		myObj.nextLine();
			
		person[0] = new Person (name, age, gender, id, weight, height);
		
		System.out.println("Enter the name:");
		name = myObj.next();
			
		System.out.println("Enter the gender:");
		gender = myObj.next().charAt(0);
	
		System.out.println("Enter the age:");
		age = myObj.nextInt();
		
		person[1] = new Person (name, age, gender);
		
		person[2] = new Person();
		person[2].setName("Jose");
		person[2].setGender('M');
		person[2].setAge(24);
		person[2].setWeight(65.5f);
		person[2].setHeight(1.85f);
	
		
		for (int pos = 0; pos < person.length ; pos++) {
			
			System.out.printf("The #%d person's weight is: %s, and he/she %s\n", (pos+1), person[pos].printWeight(person), 
					person[pos].printAge(person));
		}
		
		System.out.printf("\n%-15s %-15s %-15s %-15s %-15s %-15s \n", "NAME", "AGE", "GENDER", "ID", "WEIGHT", "HEIGHT");
		
		for (int pos = 0; pos < person.length ; pos++) {
			
			System.out.printf("%-15s %-15d %-15c %-15d %-15.2f %-15.2f \n", person[pos].getName(), person[pos].getAge(),
					person[pos].getGender(), person[pos].getId(), person[pos].getWeight(),person[pos].getHeight() );
		}
		
		myObj.close();
	}

}
