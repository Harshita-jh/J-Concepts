package methodchain;

public class Main {

	public static void main(String[] args) {
		 
		Student s = new Student();
		//Normal way to access methods
		/*
		 * s.setName("Harshita"); s.setAge(29); s.setCity("Bangalore");
		 */
		//using method chaining
		s
			.setName("Harshita")
			.setAge(29)
			.setCity("Bangalore");
		
		System.out.println(s);

	}

}
