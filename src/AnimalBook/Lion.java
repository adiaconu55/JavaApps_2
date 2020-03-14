package AnimalBook;

public class Lion extends Animal{


	public Lion(int age) {
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "Lion [age=" + age + "]";
	}
}
