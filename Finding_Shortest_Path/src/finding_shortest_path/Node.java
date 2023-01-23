package finding_shortest_path;

public class Node
{
    private int xCoord;
    private int yCoord;
    private static char label = 'A';
    private char name;

    Node(int xCoord, int yCoord)
    {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        name = label++;
    }

    public Node() {
        xCoord = 0;
        yCoord = 0;
    }

    public char getName() {
        return name;
    }

    public int getxCoord() {
        return xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    public void display()
    {
        System.out.println(name + ": " + xCoord + "," + yCoord);
    }
}
