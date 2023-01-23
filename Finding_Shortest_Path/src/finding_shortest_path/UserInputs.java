package finding_shortest_path;

import java.util.Scanner;

public class UserInputs
{
    //Declaring Variables//


    private static String no_of_Nodes =  new String();
    public static int number_of_Nodes;

    Scanner scanner = new Scanner(System.in);

    static Validation validate = new Validation();


    // Function to ask user for number of nodes to generate
    public void inputNumberofNodes()
    {
        boolean valid = false;


        while (!valid)
        {
            System.out.print("Enter the number of nodes to generate: ");
            no_of_Nodes = scanner.nextLine();
            valid = validate.ValidateNoofNodes(no_of_Nodes);
        }



        number_of_Nodes =  Integer.parseInt(no_of_Nodes);
    }




    private static char startNode;
    private static char endNode;

    public void startEndNodes() {
        boolean valid = false;
        String hs = new String();


        // Getting input for start node
        while (!valid) {
            System.out.print("Enter Starting Node: ");
            startNode = scanner.next().charAt(0);
            valid = validate.ValidateNode(startNode);


            if (!valid) {
                System.out.println("Please enter a valid Node\n");
            }
        }



        valid = false;
        // Getting input for destination node
        while (!valid) {
            System.out.print("Enter Destination Node: ");

            endNode = scanner.next().charAt(0);
            valid = validate.ValidateNode(endNode);
            if (endNode == startNode)
            {
                valid = false;
            }
            if (!valid) {
                System.out.println("Please enter a valid Node\n");
            }

        }
        //scanner.close();
    }





    //Accessor to get start and end nodes
    public char getStartNode() {
        return Character.toUpperCase(startNode);
    }

    public char getEndNode() {
        return Character.toUpperCase(endNode);
    }

}

