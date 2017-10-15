/**
 * 
 */
package assingment9_3;

/**
 *  This class is mainly used to list the HDTV brand by it's size in ascending order
 *	using Arraylist passes the brandname and size into arrayList. once the arrayList is completed data will be sorted based on HDTV size.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author MANJUNATH
 *
 */
public class HdtvMainClass {

	private static Scanner sc;

	/**
	 * @param= brandName- to get the  HDTV brand name from user
	 * @param= size- to get the HDTV size 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<HDTV> arrayList = new ArrayList<HDTV>(); // Initialize Array List object for HDTV class
		int choice = 0;
		int size = 0;
		String brandName = "";
		sc = new Scanner(System.in); // scanner object for user input
		
		while (true) {
			System.out.println("Enter 1:insert HDTV details\t2:Display\t3:Exit");
			choice = sc.nextInt();			//get the user input
			
			if (choice == 1) {				//if user input is 1 as to insert array elements then it'll get brand name and size from user
				System.out.println("Enter brandname");
				sc.nextLine();
				brandName = sc.nextLine();		//get the brand name from user.
				System.out.println("Enter Size:");
				size = sc.nextInt();			//get the size from user.
				arrayList.add(new HDTV(brandName, size));		//add brand name and size to array list
			} 
			else if (choice == 2) {
				System.out.println("\nDisplaying the HDTV Brand Name sorting by Size:");
				System.out.println("--------------------------------------------------");
				Collections.sort(arrayList, HDTV.sizeSort); /* send size to comparator method to sort HDTV size based on Size property */
				for (HDTV str : arrayList) {		//loop will get the array elements to print the sorted list
					System.out.println(str);
				}
			} 
			else if (choice == 3) {
				System.out.println("Exit from the Application");
				System.exit(0);			//if user enter option 3, application will exit from the execution.
			}
			else {
				System.out.println("Enter valid input");
			}
		}
	}
}
