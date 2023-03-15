package loinAvecJava;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
System.out.println("Veuillez entrez votre nom");
String nom=myObj.nextLine();
System.out.println("hello "+nom);
System.out.println("donnez votre age ");
int age=myObj.nextInt();
if(age<18)
	System.out.println("vous êtes mineur");
else
	System.out.println("vous êtes majeur");

	}

}
