package test;

public class personTest {
	private String firstName;
	private String lastName;
	private int age;
	
	personTest(String inFirstName, String inLastName, int inAge){
		firstName = inFirstName;
		lastName = inLastName;
		age = inAge;
	}
	
	public String getFirstName(){return this.firstName;}
	public String getLastName (){return this.lastName ;}
	public int	  getAge	  (){return this.age	  ;}
	
	public void   setFirstName(String in){this.firstName = in;}
	public void   setLastName (String in){this.lastName  = in;}
	public void   setAge	  (int    in){this.age	     = in;}
	
	public String toString() {
		return this.getFirstName() + " " + this.getLastName() +
				", age: " + this.getAge();
	}
	
	
	public personTest makePerson(personTest in) throws underAgeException{
		if(this.getAge() < 18 || in.getAge() < 18) throw new underAgeException();
		return new personTest(this.getFirstName(), in.getLastName(), 1);
	}
	
}
