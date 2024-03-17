package FISICA;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class JPanel_Cir1 extends JPanel{
	int  x[], y[];
	public JPanel_Cir1() {
		
		super();
		setSize(790,700);
		setBackground(new Color (141,184,249));
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);	
		
		g.drawRect(50, 200,700, 200);
		x = new int [3];
		y = new int [3];
		x[0] = 100;
		y[0] = 400;
		
		x[1] = 250;
		y[1] = 200;
		
		x[2] = 400;
		y[2] = 400;
		
		g.drawPolygon(x, y, 3);
		g.setColor(new Color (141,184,249));
		g.fillOval(35, 270,30,50);
		g.setColor(Color.black);
		g.drawOval(15, 270, 70, 50);
		g.drawRect(400,100,170,300);
		
		
		
		 }

}
