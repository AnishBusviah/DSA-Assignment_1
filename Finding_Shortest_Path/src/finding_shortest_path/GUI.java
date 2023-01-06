/**Generating_Random_Nodes.java
 * @author anish
 * @date_created 31 Dec 2022
 * @last_updated 05 Jan 2023
 * @last_updated_by anish
 */
package finding_shortest_path;

/** @description
 *	This class contains the codes for the GUI of Finding_Shortest_Path program
 *	
 *	GUI using JFrame
 */


// Importing Libraries
import javax.swing.JFrame; // JFrame Library



public class GUI extends JFrame
{
	
	private static final long serialVersionUID = 1L;
	//MyPanel panel;
	
	GUI()
	{ 	
		
		//panel = new MyPanel();
	
		
		// Setting up frame
		this.setTitle("Finding Shortest Path"); // setting up title of this
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // setting this to exit when pressing close button
		this.setSize(1080, 720); // Setting size of this (x,y)
		//this.add(panel);
		this.setVisible(true); // Making this visible
		//this.getContentPane().setBackground(new Color(0x888888)); // change colour of background
		this.setResizable(false);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		
		
		
	}


}
