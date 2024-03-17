package FISICA;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class JPanel_Cir2 extends JPanel {

	FISICA_2 f;
	OPCION_MIXTO o;
	
	public JPanel_Cir2() {
		
		super();
		setSize(790,700);
		setBackground(new Color (141,184,249));
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//1 rec
		g.drawRect(100,150, 600, 200);
		//2 rec
		g.setColor(new Color (141,184,249));
		g.fillRect(400, 110, 199, 79);
		g.setColor(Color.black);
		g.drawRect(400,110,200,80);
		//3 rec
		g.setColor(new Color(141,184,249));
		g.fillRect(150, 310, 199,79);
		g.setColor(Color.black);
		g.drawRect(150,310, 200, 80);
		//ovalo
		g.setColor(new Color(141,184,249));
		g.fillOval(460, 320, 79, 59);
		g.setColor(Color.black);
		g.drawOval(460, 320, 80 , 60);
		
		
	}
}
