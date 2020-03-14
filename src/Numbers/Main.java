package Numbers;

import java.util.Scanner;

public class Main {

	public static boolean testPrime(int n) {
	
	if(n<2)
		return false;
	if(n==2)
		return true;
	for(int i=2;i<n/2;i++) {
		if(n%i==0)
			return false;
	}
	return true;
	
}

	public static void binary(int n) {
		
		int a[] = new int[8];
		int i=0;
		System.out.print("The number in binary is: ");
		
		while(n!=0) {
			
			if(n%2==0) 
				a[i]=0;
			else
				a[i]=1;
			i++;
			n=n/2;
			
		}
		
		for(int j=i;j>=0;j--) {
			System.out.print(a[j]);
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		if(testPrime(n)) {
			System.out.print("Its prime !\n");
		}
		else {
			System.out.print("Its not prime :(\n");
		}
		binary(n);
		sc.close();
	}
}
