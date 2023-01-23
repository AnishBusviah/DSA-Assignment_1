package finding_shortest_path;

public class calculateDistance
{
    //calculate distance between the Coordinates connected by a path

    //private static Node[] nodeA;

    //go thru array & look for nod position
    /*
    public static int getIndex(String label)

    {
        for (int i=0; i<nodeA.length; i++) {
            if (nodeA[i].getName().equals(label)) {
                return i;
            }
        }
        return -1;
    }*/


    private int x1;
    private int x2;
    private int y1;
    private int y2;



    calculateDistance(int x1, int x2, int y1, int y2)
    {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public calculateDistance() {
        x1 = 0;
        x2 = 0;
        y1 = 0;
        y2 = 0;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    /*public static double calculateDistance(String path)
    {
        double distance = 0;
        String[] array = path.split(""); //to obtain each node
        for (int i=0; i<array.length-1; i++)
        {
            int indexA = getIndex(array[i]);
            int indexB = getIndex(array[i+1]);
            distance = distance + euclideanDistance (nodeA[indexA], nodeA[indexB]) ;
        }
        return distance ;
    }*/


    /*
    public static double euclideanDistance (Node n1, Node n2)
    {
        int x1 = n1.getX();
        int y1 = n1.getY();
        int x2 = n2.getX();
        int y2 = n2.getY();
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }
    */

    public double getEuclideanDistance ()
    {
        return Math.sqrt((this.y2 - this.y1) * (this.y2 - this.y1) + (this.x2 - this.x1) * (this.x2 - this.x1));
    }

}
