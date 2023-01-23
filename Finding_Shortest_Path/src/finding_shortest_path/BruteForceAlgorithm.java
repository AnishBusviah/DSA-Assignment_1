package finding_shortest_path;

import static java.lang.Double.parseDouble;

public class BruteForceAlgorithm
{
    static UserInputs inputs = new UserInputs();

    Node Nodes[] = new Node[inputs.number_of_Nodes]; // Creating n Node Objects



    // Assigning values to node objects
    public void createNodeObjects()
    {

        Node allocator; // object to assign values to each element of the array


        for (int i = 0; i < inputs.number_of_Nodes; i++)
        {
            allocator = new Node(Generate_Nodes.Coord[i][0], Generate_Nodes.Coord[i][1]);
            Nodes[i] = allocator;
            //Nodes[i].display();
        }
    }



    //Factorial method to calculate number of possibilities
    public static int facatorial(int num)
    {
        if (num == 1)
        {
            return num;

        } else{

            return (num * facatorial(num - 1));
        }
    }

    public static int noOfpossibilities = facatorial(inputs.number_of_Nodes);


    // Function to calculate all the permutations of labels
    public static String[][] possiblePaths = new String[noOfpossibilities][2];
    public static int count;


    //public static int counter = 2;
    public static void Permutate(String labels, String ans)
    {
        if (count >= noOfpossibilities)
        {
            count = 0;
        }

        // If string is empty
        if (labels.length() == 0) {
            possiblePaths[count][0] = ans+" ";
            //counter++;
            count++;
            //System.out.print(ans + " ");
            return;
        }


        for (int i = 0; i < labels.length(); i++) {


            // ith character of labels

            char ch = labels.charAt(i);


            // Rest of the string after excluding

            // the ith character

            String ros = labels.substring(0, i) + labels.substring(i + 1);


            // Recursive call

            Permutate(ros, ans + ch);

            }

    }


    public void filterShortestPaths()
    {
        char start = inputs.getStartNode();
        int letterPosition = start - 'A';
        int PathsperNode = noOfpossibilities/inputs.number_of_Nodes;
        int startSearchAt = letterPosition * PathsperNode;
        char path[];



        char startNode = inputs.getStartNode();
        char endNode = inputs.getEndNode();

        String[][] queriedPaths = new String[PathsperNode/(inputs.number_of_Nodes - 1)][2];
        //System.out.println(PathsperNode/(inputs.number_of_Nodes-1));


        int index = 0;
        for (int i = startSearchAt; i < (startSearchAt+PathsperNode); i++)
        {
            path = possiblePaths[i][0].toCharArray();
            //System.out.println(possiblePaths[i][0] + "," + possiblePaths[i][1]);

            //Checking if the 1st node of the path is equal to the start node
            if (path[0] == startNode && path[inputs.number_of_Nodes-1] == endNode)
            {
                queriedPaths[index][0] = possiblePaths[i][0];
                queriedPaths[index][1] = possiblePaths[i][1];
                //System.out.println(queriedPaths[index][0] + "," + queriedPaths[index][1]);
                index++;

            }

        }

        String shortestPath = new String();
        double shortestDistance = parseDouble(queriedPaths[0][1]);
        double distance;

        for (int i = 0; i < queriedPaths.length; i++)
        {
            distance = Double.parseDouble(queriedPaths[i][1]);

            if(distance < shortestDistance)
            {
                shortestDistance = distance;
                shortestPath = queriedPaths[i][0];
            }
        }


        //Outputting results
        System.out.println("\nPossible paths from " + startNode + " to " + endNode + " are: ");
        for (int i = 0; i < queriedPaths.length; i++)
        {
            System.out.println("Path " + (i+1)  + ": " + queriedPaths[i][0] + "\tDistance: " + queriedPaths[i][1]);
        }
        System.out.println("\nShortest path: " + shortestPath + "\tShortest Distance: " + shortestDistance + "\n");
    }



    // Function to calculate distance of all paths and filter the shortest ones
    public void calculatePaths()
    {
        String labels = "";
        //Adding labels equal to the number of nodes to string labels
        for(char letter = 65; letter<(65+inputs.number_of_Nodes); letter++)
        {
            labels += letter;
        }

        Permutate(labels, "");


        calculateDistance calculator = new calculateDistance();
        int x1;
        int x2;
        int y1;
        int y2;

        int node1;
        int node2;

        for (int i = 0; i < noOfpossibilities; i++)
        {

            double distance = 0;
            char[] path = possiblePaths[i][0].toCharArray();

            for (int n = 0; n < (inputs.number_of_Nodes - 1); n++)
            {
                node1 = path[n];
                node1 -= 'A';
                node2 = path[n+1];
                node2 -= 'A';
                calculator.setX1(Nodes[node1].getxCoord());
                calculator.setY1(Nodes[node1].getyCoord());
                calculator.setX2(Nodes[node2].getxCoord());
                calculator.setY2(Nodes[node2].getyCoord());

                //System.out.println(Nodes[node1].getName()+"("+Nodes[node1].getxCoord()+","+Nodes[node1].getyCoord()+")"+" "+Nodes[node2].getName()+"("+Nodes[node2].getxCoord()+","+Nodes[node2].getyCoord()+")");

                distance += calculator.getEuclideanDistance();
            }
            possiblePaths[i][1] = Double.toString(distance);
            //System.out.println(i+1 + ": " + possiblePaths[i][0] + "Distance: " + possiblePaths[i][1]);
        }

        filterShortestPaths();
    }

}




