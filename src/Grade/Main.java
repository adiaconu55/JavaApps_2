package Grade;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int grades[],n,s=0;
		System.out.print("Enter the number of grades: ");
		n=sc.nextInt();
		grades = new int[n];
		System.out.print("Enter the grades(only between 4 and 10): ");
		for(int i=0;i<n;i++) {
			do {
				grades[i]=sc.nextInt();
			}while(grades[i]<4 || grades[i]>10);
			s+=grades[i];
		}
		
		System.out.print("The graduation grade is: "+s/n);
		
		sc.close();
	}
	
}
