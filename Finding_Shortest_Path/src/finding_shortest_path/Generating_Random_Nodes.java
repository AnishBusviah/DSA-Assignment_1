/**Generating_Random_Nodes.java
 * @author saras
 * @date_created 30 Dec 2022
 * @last_updated 30 Dec 2022
 * @last_updated_by anish
 */
package finding_shortest_path;

/**@description
 * This program takes an integer n as input from the user and generates n number of random coordinates
 * 
 * 
 * NOT IN USE
 */




// Importing Libraries
import java.util.Scanner;
import java.util.Random;


public class Generating_Random_Nodes 
{
	
	
	// Function containing information about the axes
	public static int axes()
	{
		int max_axis_value = 550;
		
		return max_axis_value;
	}
	
	
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
				if (nodes <= 2)
				{
					System.err.println("Invalid Input! At least 3 nodes must be generated");
					return false;
				}
				else
				{
					//int max_axis_value = axes();
					int max_nodes = 26; // A to Z
					
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
	public static int Get_User_Input()
	{
		boolean valid = false;
		String no_of_Nodes =  new String();
		
		Scanner scanner = new Scanner(System.in);
				
		while (!valid)
		{
			System.out.print("Enter the number of nodes to generate: ");
			no_of_Nodes = scanner.nextLine();
			valid = Validate_User_Input(no_of_Nodes);
		}
		
		scanner.close();
		
		return Integer.parseInt(no_of_Nodes);
	}
	
	
	
	
	
	
	
	
	
	
	// Generating Random Coordinates
	public int[][] Generate_Random_Coordinates(String[] args) 
	{
			

		Random random = new Random();  //create a random class

		int xcoord;
		int ycoord;
		
		int no_of_Nodes = Get_User_Input();
		int max_axis_value = axes();
		int border_compensation = 50;
		
		
		int Coordinates[][] = new int[no_of_Nodes][2];
		
		Coordinates[0][0] = random.nextInt(max_axis_value + 1) + border_compensation;
		Coordinates[0][1] = random.nextInt(max_axis_value + 1) + border_compensation;
		
		for (int i = 0; i < no_of_Nodes; i++) 
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
		
		return Coordinates;
	}

}