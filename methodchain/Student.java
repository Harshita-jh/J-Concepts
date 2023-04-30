package methodchain;

public class Student {
	
	private String name;
	private int age;
	private String city;
	
	public Student setName(String name) {
		this.name = name;
		//return current reference
		return this;
	}
	public Student setAge(int age) {
		this.age = age;
		return this;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", city=" + city + "]";
	}
	
	
	
}
