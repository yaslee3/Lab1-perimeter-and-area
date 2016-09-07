import java.text.NumberFormat;
import java.util.Scanner;

public class CalculatePerimeterArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		
		//prompts the user to enter values of length and width
		System.out.println("Enter value of length and width of the classroom" );
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			// get input from user
			System.out.print("Enter length:");
			double length = Double.parseDouble(sc.nextLine());
			
			System.out.print("Enter width:");
			double width = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Height:");  // Extra Challenges 
			double height = Double.parseDouble(sc.nextLine());//Extra Challenges
			
			             // calculate total
						double area = length * width;
						double perimeter = 2 * length + 2 * width;
						double volume = (length* width * height); // Extra Challenges
						
						// format and display output
						NumberFormat number = NumberFormat.getNumberInstance();
						number.setMinimumFractionDigits(2);                                                                        //Extra challenge
						String message = "area:"+ number.format(area) + "\n" + "perimeter: " + number.format(perimeter) + "\n" +"volume:" + number.format(volume) + "\n";
					    System.out.println(message);
					    
						// see if the user wants to continue
						System.out.print(" (y/n): ");
						choice = sc.nextLine();
						System.out.println();
					}
					sc.close();
					System.out.println("Bye!");

		}
	}


