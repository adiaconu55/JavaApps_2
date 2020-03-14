package AnimalBook;

public class Cat extends Animal{
	
	String name;
	
	public Cat(String name,int age) {
		this.age=age;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
	
}
