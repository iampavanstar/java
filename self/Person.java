public class Person{
	
	public Person(){
		System.out.println("Empty Consutructor");
	}

	public Person(String name){
		System.out.println("Consutructor "+name);
	}

	String firstName = "ABC" ;
	String lastName = "XYZ";
	int age = 30;

	String personFirstName(){
		return firstName;
	}

	String personLastName(){
		return lastName;
	}

	int personAge(){
		return age;
	}

}