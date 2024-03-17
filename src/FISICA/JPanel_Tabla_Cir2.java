package FISICA;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class JPanel_Tabla_Cir2 extends JPanel {
	
	public JPanel_Tabla_Cir2 () {
		
		super();
		setSize(600,400);	
		setBackground(Color.white);
		
	}
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		
		//HORIZONTAL
		g.drawRect(0,0,430, 250);
		g.drawRect(0,0,430,40);
		//VERTICAL
		g.drawRect(0, 0, 50 , 250);// R
		g.drawRect(50, 0, 110 , 250);//VOL
		g.drawRect(160, 0, 140 , 250);//CORR
		g.drawRect(300, 0, 130 , 250);//POT
		//R ETC
		g.drawRect(0, 40, 430 , 30);//R1
		g.drawRect(0, 70, 430 , 30);//R2
		g.drawRect(0, 100, 430 , 30);//R3
		g.drawRect(0, 130, 430 , 30);//R4
		g.drawRect(0, 160, 430 , 30);//R5
		g.drawRect(0, 190, 430 , 30);//R6
		g.drawRect(0, 220, 430 , 30);//R7
		//BORDES
		
	}
}
