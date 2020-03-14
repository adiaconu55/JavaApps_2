package AnimalBook;

public class Book{

	Animal v[];
	int size;
	
	public Book() {
		v=null;
		size=0;
	}
	
	public Book(Animal v[],int n) {
		size=n;
		this.v= new Animal[n];
		for(int i=0;i<size;i++)
			this.v[i]=v[i];
	}
	
	public void addDog(String name,int age) throws Exception {
		Animal v2[] = new Animal[size+1];
		for(int i=0;i<size;i++)
			v2[i]=v[i];
		size++;
		v=v2;
		v[size-1]= new Dog(name,age);
	}
	
	public void addCat(String name,int age) throws Exception{
		Animal v2[] = new Animal[size+1];
		for(int i=0;i<size;i++)
			v2[i]=v[i];
		size++;
		v=v2;
		v[size-1]= new Cat(name,age);
	}
	
	public void addLion(int age) throws Exception {
		Animal v2[] = new Animal[size+1];
		for(int i=0;i<size;i++)
			v2[i]=v[i];
		size++;
		v=v2;
		v[size-1]= new Lion(age);
	}
	
	public void showAllAnimals() {
		for(int i=0;i<size;i++)
			System.out.print(v[i]+"\n");
	}
	
}
