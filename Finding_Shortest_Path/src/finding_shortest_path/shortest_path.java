/**shortest_path.java
* @author anish
* @date_created 31 Dec 2022
* @last_updated 05 Jan 2023
* @last_updated_by anish
*/
 

package finding_shortest_path;

/**
 * @author anish
 *
 */
public class shortest_path extends Generate_Nodes // inherits from class Generate_Nodes
{
	
	// Method to manage the generation of nodes
	public void Generating_Nodes()
	{	
		Generate_Nodes.Get_User_Input(); // Gets User Input on how many nodes to generate
		
		Generate_Nodes.Generate_Random_Coordinates(); // generates n nodes based on user input
		
		
		// printing coordinates of all generated nodes in console
		for (int i = 0; i < Generate_Nodes.Nodes.length; i++)
		{
			System.out.println("(" + Generate_Nodes.Nodes[i][0] + "," + Generate_Nodes.Nodes[i][1] + ")");
		}
	}
	
	// Method that displays a gui by calling class GUI()
	public void Display_GUI()
	{
		new GUI();
	}
}
