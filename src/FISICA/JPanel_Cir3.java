package FISICA;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class JPanel_Cir3 extends JPanel{
	
	FISICA_2 f;
	OPCION_MIXTO o ;
	
	public JPanel_Cir3() {
		super();
		setSize(790,700);
		setBackground(new Color (141,184,249));
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(100, 100,500, 300);
		g.drawRect(350, 100, 250, 300);
		//3rec
		g.setColor(new Color(141,184,249));
		g.fillRect(550, 250, 99, 99);
		g.setColor(Color.black);
		g.drawRect(550, 250, 100, 100);
		//4rec
		g.setColor(new Color(141,184,249));
		g.fillRect(170, 350, 99, 99);
		g.setColor(Color.black);
		g.drawRect(170,350,100,100);
		//Oval
		g.setColor(new Color(141,184,249));
		g.fillOval(60, 240, 64, 79);
		g.setColor(Color.black);
		g.drawOval(70, 240, 65, 80);
		
		
	}
}
