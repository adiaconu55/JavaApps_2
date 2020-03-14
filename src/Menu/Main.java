package Menu;

import Matrix.*;

import java.util.Scanner;
//import TicTacToe.*;
import Encoding.*;

class Main {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		char c;
		System.out.print("Select an option:\n1.Grade Calculator\n2.AnimalBook\n3.Encoding\n4.MatrixCalculator\nEnter 'x' to exit\n");
		c=sc.next().charAt(0);
		
		while(c!='x') {
			
			switch (c) {
			
			case '1': Grade.Main.main(null); break;
			case '2': AnimalBook.Main.main(null); break;
			case '3': Encoding.Encode.main(null); break;
			case '4': MatrixCalculator.main(null); break;
			
			}
			
			System.out.print("Select an option:\n1.TicTacToe\n2.AnimalBook\n3.Encoding\n4.MatrixCalculator\nEnter 'x' to exit\n");
			c=sc.next().charAt(0);
			
		}
		
		sc.close();
	}
	
}
