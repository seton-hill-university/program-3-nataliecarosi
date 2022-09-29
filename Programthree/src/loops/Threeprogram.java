//Application:   Project 3
//Name:          Natalie Carosi
//GitHub User:   nataliecarosi
//Date           September 29, 2022
//Version        1.0
//Description:   Creating loops

package loops;

import java.util.Scanner;

public class Threeprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// activating keyboard
				Scanner keyboard = new Scanner(System.in);
				//Ask user a name and a number 0-100
				System.out.println(" what is your name?");
				String name = keyboard.next();
				System.out.println(" enter a number between 0-100");
				int enterednumber = keyboard.nextInt();
				
				//Thanks the user and now countdown numbers
				while (enterednumber>0 && enterednumber<100) {
					System.out.println(" Thank you for your input " + name);
					for(int countdown = enterednumber; countdown>0; countdown--) {
						System.out.println(" counting down from " + countdown); }
						break;
					
				} 
				
			//If number guessing does not work, then retry	
	if (enterednumber>0 || enterednumber<100); {
		System.out.println(" enter a number between 0-100");
		int retry = keyboard.nextInt();
		for(int countdown = retry; countdown>0; countdown--) {
			System.out.println(" counting down from " + countdown); }
			

	}
}
}