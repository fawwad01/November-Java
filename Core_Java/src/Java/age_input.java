package Java;

import java.util.Scanner;

public class age_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader=new Scanner(System.in);
		System.out.println("What is your name");
		String name=reader.next(); // provide you input and reading your input
		
		
		
		
		
		Scanner reader1=new Scanner(System.in); // Sanner object with input argument		
		System.out.println("What is your age");
		int age=reader1.nextInt(); // provide you input and reading your input
		
		
		
		Scanner reader2=new Scanner(System.in);
		System.out.println("what is your City");
		String city=reader2.next();
		
		System.out.println("your age is "+ age);  // print what your input
		System.out.println("your name is "+ name);  // print what your input
		System.out.println("your city is "+ city);
		
		
		
		
		
		
		
		
	}

}
