package Encoding;

import java.util.Scanner;

public class Encode {

	public static void encodeText(String s) {
		
		for(int i=0;i<s.length();i++) {
			
			System.out.print("#"+(int)s.charAt(i));
			
		}
		
	}
	
	public static void decodeText(Scanner sc) {
		
		System.out.print("\nEnter a string to decode: ");
		String s=sc.next();
		Scanner a = new Scanner(s).useDelimiter("#");
		try {

			for(int i=0;i<s.length();i++) {
				System.out.print((char)a.nextInt());
			}
			
		}
		catch(Exception e){}
			
		a.close();
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s=sc.next();
		encodeText(s);
		decodeText(sc);
		
		
		sc.close();
	}
	
}
