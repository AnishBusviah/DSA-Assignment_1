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
public class find_shortest_path
{
	
	// Method to manage the generation of nodes
	public void Generating_Nodes()
	{
		UserInputs inputs = new UserInputs();
		inputs.inputNumberofNodes(); // Gets User Input on how many nodes to generate

		Generate_Nodes generator = new Generate_Nodes();
		Generate_Nodes.Generate_Random_Coordinates(); // generates n nodes based on user input
		
		
		// printing coordinates of all generated nodes in console
		Node Nodes[] = new Node[inputs.number_of_Nodes];
		Node allocator;

		/*for (int i = 0; i < inputs.number_of_Nodes; i++)
		{
			allocator = new Node(generator.Coord[i][0], generator.Coord[i][1]);
			Nodes[i] = allocator;
			Nodes[i].display();
		}*/
	}



	public void findPath()
	{
		UserInputs inputs = new UserInputs();
		BruteForceAlgorithm algo = new BruteForceAlgorithm();

		algo.createNodeObjects();

		while (true)
		{
			inputs.startEndNodes();
			algo.calculatePaths();
		}

	}
	
	// Method that displays a gui by calling class GUI()
	public void Display_GUI()
	{
		new GUI();
	}
}
