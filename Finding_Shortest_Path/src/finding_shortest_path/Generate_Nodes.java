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

/*@description
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
	private static final int max_axis_value = 550; // max coordinate on panel
	private static final int border_compensation = 50; // to prevent generation of nodes on the edge of the frame
	public static int[][] Coord;




	//Methods start here//

	// Generating Random Coordinates
	public static void Generate_Random_Coordinates()
	{


		Random random = new Random();  //create a random class

		int xcoord;
		int ycoord;

		UserInputs inputs = new UserInputs();

		int[][] Coordinates = new int[inputs.number_of_Nodes][2];

		Coordinates[0][0] = random.nextInt(max_axis_value + 1) + border_compensation;
		Coordinates[0][1] = random.nextInt(max_axis_value + 1) + border_compensation;

		for (int i = 0; i < inputs.number_of_Nodes; i++)
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
		Coord = Coordinates;
	}

}