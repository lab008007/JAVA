package Day13.Ex03_WildCard;

public class Person {

	private String name;

	//생성자
	//getter, setter
	//toString
	public Person(String name) {
		this.name = name;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
	
	
}
