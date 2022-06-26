
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int planeSeatsAvailable = 31;
System.out.println("Available seats left on the Plane: " + planeSeatsAvailable);

double totalCost = 23.64; 
System.out.println("Total is: " + totalCost);

char myMiddleInitial = 'A';
System.out.println("Middle name starts with: " + myMiddleInitial);

boolean isHotOutside = true;
System.out.println("It is hot outside: " + isHotOutside);

String customerFirstName = "John";
System.out.println("What is the Customer's first name? " + customerFirstName);

String streetAddress = "438 Brenda Dr";
System.out.println("The address we have on file is: " + streetAddress);

planeSeatsAvailable = planeSeatsAvailable - 2; 
System.out.println(planeSeatsAvailable);

totalCost = totalCost + 2.15;
System.out.println(totalCost);

myMiddleInitial = 'B';
System.out.println(myMiddleInitial);

isHotOutside = !isHotOutside;
System.out.println(isHotOutside);

String fullName = customerFirstName + " " +  myMiddleInitial + " Jones";
System.out.println(fullName);


System.out.println( "Hi, my name is " + fullName + " and I live at " + streetAddress + "!");
	}

}
