/**MyPanel.java
 * @author anish
 * @date_created 31 Dec 2022
 * @last_updated 05 Jan 2023
 * @last_updated_by anish
 */


package finding_shortest_path;


/** @description
 *	This class contains the codes for plotting the nodes on the GUI
 *	
 *	Using Graphics2D on a JPanel
 */



import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class MyPanel extends JPanel{




	private static final long serialVersionUID = 1L;

	
	// Plotting Coordinates using
		public void paint(Graphics g)
		{			
			Graphics2D g2D = (Graphics2D) g;
			
			g2D.setPaint(Color.black);
			
			for (int i = 0; i < Generate_Nodes.Coord.length; i++)
			{
				g2D.fillOval(Generate_Nodes.Coord[i][0], Generate_Nodes.Coord[i][1], 8, 8);
			}
			
			
			//g2D.setStroke(new BasicStroke(3));
			
			//g2D.drawLine(0, 0, 500, 500);
			
		}
}
