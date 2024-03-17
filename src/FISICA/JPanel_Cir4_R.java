package FISICA;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


public class JPanel_Cir4_R extends JPanel{

	FISICA_2 f;
	OPCION_MIXTO o;
	int x[] = new int [3];
	int y[] = new int [3];
	public JPanel_Cir4_R() {
		super();
		setSize(790,700);
		setBackground(new Color(141,184,249));
	}

		
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		x[0]= 300;
		y[0]= 350;
		
		x[1]= 500;
		y[1]= 150;
		
		x[2]= 700;
		y[2]= 350;
		
		g.drawPolygon(x,y,3);
		//1 rec
		g.drawRect(100,150, 600, 200);
		//2 rec
		g.drawRect(500, 150,200, 200);
		//3 rec
		g.drawRect(300, 150, 200, 200);
		//oval
		g.setColor(new Color(141,184,249));
		g.fillOval(60, 230, 79, 59);
		g.setColor(Color.black);
		g.drawOval(60, 230, 80, 60);
	 }
	}
