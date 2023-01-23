package finding_shortest_path;

public class Validation
{
    private static final int min_nodes = 3;
    private static final int max_nodes = 26; // A to Z.


    // Function to validate user input on how many nodes to generate
    public boolean ValidateNoofNodes(String no_of_Nodes)
    {
        try
        {
            int nodes = Integer.parseInt(no_of_Nodes);

            if (nodes < 0)
            {
                System.out.println("Invalid Input! The number of nodes cannot be negative\n");
                return false;
            }
            else
            {
                if (nodes < min_nodes)
                {
                    System.out.println("Invalid Input! At least 3 nodes must be generated\n");
                    return false;
                }
                else
                {


                    if (nodes > max_nodes)
                    {
                        System.out.println("Invalid Input! Maximum possible nodes is " + max_nodes + "\n");
                        return false;
                    }
                }
            }

            return true;
        }
        catch (Exception e)
        {
            System.out.println("Input must be an Integer!\n");
            return false;
        }
    }


    //Validating start and end nodes
    public boolean ValidateNode(char nodeLabel)
    {
        nodeLabel = Character.toUpperCase(nodeLabel);

        char letter = 'A';

        for (int i = 0; i < UserInputs.number_of_Nodes; i++)
        {
            if (nodeLabel == letter++)
            {
                return true;
            }
        }

        return false;
    }
}
