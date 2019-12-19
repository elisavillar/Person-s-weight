
public class Person {

	private String name;
	private char gender;
	private int age , id;
	private float weight , height;
	private final char MALE = 'M', FEMALE = 'F', UNKNOWN = 'U';
	private final int BELOW = -1, IDEAL = 0, OVERWEIGHT = 1;
	private Boolean isOver18 = false;
	
	
	//A default constructor. 
	Person () {
		
		this.name = "";
		this.gender = MALE;
		this.age = 0;
		this.id = this.generateId();
		this.weight = 0;
		this.height = 1;	
	}
	
	
	//A constructor with the name, age and gender, the rest by default. 
	Person (String name, int age, char gender){
		
		this.name = name;
		this.age = age;
		this.gender = this.checkGender(gender);
		this.id = this.generateId();
		this.weight = 0;
		this.height = 1;
	}
	
	//A constructor with all the attributes as parameters. 
	Person (String name, int age, char gender, int id, float weight, float height){
		
		this.name = name;
		this.gender = this.checkGender(gender);
		this.age = age;
		this.id = id;
		this.weight = weight;
		this.height = height;
	}
	
	//Calculate (): calculate if the person is at his ideal weight (weight / (height ^ 2)), 
	 public int calculate(float weight, float height){
		 
		 float bmi = (float) (weight / (height * height));
		 float below = 18.5f;
		 float ideal = 29.9f;
		
		if ( bmi < below) {
			
			return BELOW;
			
		} else if ( bmi < ideal) {
			
			return IDEAL;
			
		} else {
			
			return OVERWEIGHT;
			
		}
	 }
	
		//isOver18 (): indicates if it is of legal age, it returns a Boolean. 
		public Boolean isOver18(int age) {
			
			isOver18 = (age >= 18) ? true : false;
			
			return isOver18;
		}
		
		//CheckGender(char gender): Check if the entered gender is correct. It will not be visible outside the class. 
		private char checkGender (char gender) {
			switch (gender) {
			case 'F':
			case 'f':
				return FEMALE;
			case 'm':
			case 'M':
				return MALE;
			default:
				return UNKNOWN; 
			}
		}
		
		//ToString (): returns all object information. 
		public String toString () {
			return (name + "\t" + age + "\t" + gender + "\t" + id + "\t" + weight + "\t" + height);
		}
		
		//GeneratesID (): generates a random number of 8 digits.
		private int generateId () {
			
			return (int) (Math.random() * 99999999) + 1;
			
		}
		
		//Setter of each attribute. 
		
		public void setName (String name) {
			this.name = name;
		}
		
		public void setGender (char gender) {
			this.gender = gender;
		}
		
		public void setAge (int age) {
			this.age = age;
		}
		
		public void setId (int id) {
			this.id = id;
		}
		
		public void setWeight (float weight) {
			this.weight = weight;
		}
		
		public void setHeight (float height) {
			this.height = height;
		}
		
		//Getter of each attribute. 
		
		public String getName () {
			return this.name;
		}
		
		public char getGender () {
			return this.gender;
		}
		
		public int getAge () {
			return this.age;
		}
		
		public int getId () {
			return this.id;
		}
		
		public float getWeight () {
			return this.weight;
		}
		
		public float getHeight () {
			return this.height;
		}
		
		public String printAge (Person... person) {
			String messageAge = null;
			
				if (this.isOver18(this.getAge())){
					messageAge = "is over 18.";
				} else {
					messageAge = ("is underage.");
				}
			return messageAge;
			
		}
		public String printWeight (Person...person) {
			String messageWeight = null;
		
			if (this.calculate(this.getWeight(), this.getHeight()) == -1) {
				messageWeight = "Below normal weight";
			} else if (this.calculate(this.getWeight(), this.getHeight()) == 0) {
				messageWeight = "Normal weight";
			} else if (this.calculate(this.getWeight(), this.getHeight()) == 1) {
				messageWeight = "Overweight";
			}
			
			return messageWeight;
		}


		
}
