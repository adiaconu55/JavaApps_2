package AnimalBook;

public class Dog extends Animal{

	String name;
	
	public Dog(String name,int age) {
		
		this.age=age;
		this.name=name;
		
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
	
	public void Show() {
		System.out.print("mama");
	}
	
}
