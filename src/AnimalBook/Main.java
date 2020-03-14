package AnimalBook;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Book book = new Book();
		Scanner sc = new Scanner(System.in);
		System.out.print("Select one of the options below:\na. Add Dog.\nb. Add Cat.\nc. Add Lion.\nd. Show all animals.\n\nEnter 'x' to exit");
		char c = sc.next().charAt(0);
		
		while(c!='x') {
			
			switch (c) {
			
			case 'a': System.out.print("\nEnter name and age for the Dog: "); book.addDog(sc.next(),sc.nextInt()); break;
			case 'b': System.out.print("\nEnter name and age for the Cat: ");book.addCat(sc.next(),sc.nextInt()); break;
			case 'c': System.out.print("\nEnter age for the Lion: "); book.addLion(sc.nextInt()); break;
			case 'd': System.out.print("\nThe animals are:\n");book.showAllAnimals(); break;
			
			}
			System.out.print("Select one of the options below:\na. Add Dog.\nb. Add Cat.\nc. Add Lion.\nd. Show all animals.\n\nEnter 'x' to exit");
			c = sc.next().charAt(0);
			
		}
		
		
		sc.close();
	}
	
}
