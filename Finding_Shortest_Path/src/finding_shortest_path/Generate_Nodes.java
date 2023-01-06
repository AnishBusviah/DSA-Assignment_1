/**Generating_Random_Nodes.java
 * @author saras
 * @date_created 30 Dec 2022
 * @last_updated 05 Jan 2023
 * @last_updated_by anish
 * 
 * @changes_made: Updated max_nodes to 26 so the maximum nodes possible is 26 
 * 				  and changed max_axis_value to 550 to match JFrame for nodes 
 * 				  plotting
 */
package finding_shortest_path;

/**@description
 * This program takes an integer n as input from the user and generates n number of random coordinates
 * 
 * Updated version of Generating_Random_Nodes
 */




// Importing Libraries
import java.util.Scanner;
import java.util.Random;


public class Generate_Nodes 
{
	
	//Declaring Variables//
	
	private static int max_axis_value = 550; // max coordinate on panel
	private static int max_nodes = 26; // A to Z.
	private static int min_nodes = 3;
	private static int border_compensation = 50; // to prevent generation of nodes on the edge of the frame
	
	
	private static String no_of_Nodes =  new String();
	private static int number_of_Nodes;
	
	public static int[][] Nodes;	
	
	
	
	//Methods start here//
	
	// Function to validate user input
	public static boolean Validate_User_Input(String no_of_Nodes)
	{
		try
		{			
			int nodes = Integer.parseInt(no_of_Nodes);
			
			if (nodes < 0)
			{
				System.err.println("Invalid Input! The number of nodes cannot be negative");
				return false;
			}
			else
			{
				if (nodes < min_nodes)
				{
					System.err.println("Invalid Input! At least 3 nodes must be generated");
					return false;
				}
				else
				{
					
					
					if (nodes > max_nodes)
					{
						System.err.println("Invalid Input! Maximum possible nodes is " + max_nodes);
						return false;
					}
				}
			}
			
			return true;
		}
		catch (Exception e)
		{
			System.err.println("Input must be an Integer!");
			return false;
		}
	}
	
	
	
	// Function to get user input
	public static void Get_User_Input()
	{
		boolean valid = false;
		
		
		Scanner scanner = new Scanner(System.in);
				
		while (!valid)
		{
			System.out.print("Enter the number of nodes to generate: ");
			no_of_Nodes = scanner.nextLine();
			valid = Validate_User_Input(no_of_Nodes);
		}
		
		scanner.close();
		
		number_of_Nodes =  Integer.parseInt(no_of_Nodes);
	}
	
	
	
	
	
	
	
	
	
	
	// Generating Random Coordinates
	public static void Generate_Random_Coordinates() 
	{
			

		Random random = new Random();  //create a random class

		int xcoord;
		int ycoord;
		
		
		int Coordinates[][] = new int[number_of_Nodes][2];
		
		Coordinates[0][0] = random.nextInt(max_axis_value + 1) + border_compensation;
		Coordinates[0][1] = random.nextInt(max_axis_value + 1) + border_compensation;
		
		for (int i = 0; i < number_of_Nodes; i++) 
		{
			xcoord = random.nextInt(max_axis_value + 1) + border_compensation;
			ycoord = random.nextInt(max_axis_value + 1) + border_compensation;
			
		
			for(int j = 0; j < i; j++) 
			{
				if((xcoord == Coordinates[j][0]) && (ycoord == Coordinates[j][1]))
				{
					xcoord = random.nextInt(max_axis_value + 1) + border_compensation;
					ycoord = random.nextInt(max_axis_value + 1) + border_compensation;
					j = 0; // j is set to 0 so the loop starts again
				}
				else 
				{
					Coordinates[i][0] = xcoord;// if the coordinates are unique, we assign them
					Coordinates[i][1] = ycoord;
				}		
			}
		}
		Nodes = Coordinates;
	}
	
}