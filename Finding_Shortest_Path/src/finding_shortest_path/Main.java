/**Main.java
* @author anish
* @date_created 31 Dec 2022
* @last_updated 05 Jan 2023
* @last_updated_by anish
 */
package finding_shortest_path;

/**@description
 * This is the Main
 * It instantiates class shortest_path and executes the whole program sequentially
 *  
 */

public class Main {

	
	public static void main(String[] args) 
	{
		find_shortest_path run = new find_shortest_path();
		
		run.Generating_Nodes();
		run.findPath();
		run.Display_GUI();
	}

}
