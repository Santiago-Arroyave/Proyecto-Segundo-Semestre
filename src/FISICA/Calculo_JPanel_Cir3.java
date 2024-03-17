package FISICA;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Calculo_JPanel_Cir3 extends JPanel {
	
	FISICA_2 f;
	OPCION_MIXTO o;
	JFrame_Cir2 r;
	JPanel_Cir2 t;
	
	
	public Calculo_JPanel_Cir3 () {
		super();
		setSize(1300,700);
		setBackground(new Color (141,184,249));
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);	
		
		g.drawRect(0, 0, 1159,50);
		g.drawRect(150, 0, 1159,50);
		//
		g.drawRect(0,50, 1300, 50);
		//CIR 1
		g.drawRect(300, 130, 300,200);
		g.drawRect(450, 130, 150,200);
		g.drawRect(0, 100, 650,270);
		//CIR 2
		g.drawRect(730, 200, 100,100);
		//CIR3
		g.drawRect(980, 200, 100,100);
		g.drawRect(650, 100, 500,270);
		
	}
}

