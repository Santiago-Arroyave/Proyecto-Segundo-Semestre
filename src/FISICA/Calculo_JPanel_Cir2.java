package FISICA;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Calculo_JPanel_Cir2 extends JPanel {

	FISICA_2 f;
	OPCION_MIXTO o;
	JFrame_Cir2 r;
	JPanel_Cir2 t;
	
	
	public Calculo_JPanel_Cir2 () {
		super();
		setSize(790,700);
		setBackground(new Color (141,184,249));
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);	
		
		g.drawRect(0, 0, 350,130);
		g.drawRect(0, 130, 350, 280);
		//
		g.drawRect(350,0, 450, 410);
		//CIR 1
		g.drawRect(420, 80, 300,100);
		//CIR 2
		g.drawRect(520, 240, 100,80);
	}
}
