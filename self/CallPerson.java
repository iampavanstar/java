public class CallPerson{

	public static void main(String args[]){
	
		Person person = new Person();
		System.out.println(person.personFirstName()+" "+person.personLastName()+" "+person.personAge());

		new Person("My Test");

	}
}