package FISICA;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class JPanel_Tabla_Cir1 extends JPanel{

public JPanel_Tabla_Cir1 () {
		
		super();
		setSize(600,490);	
		setBackground(Color.white);
		
	}
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		
		//HORIZONTAL
		g.drawRect(0,0,430, 400);
		g.drawRect(0,0,430,400);
		//VERTICAL
		g.drawRect(0, 0, 50 , 400);// R
		g.drawRect(50, 0, 110 , 400);//VOL
		g.drawRect(160, 0, 140 , 400);//CORR
		g.drawRect(300, 0, 130 , 400);//POT
		//R ETC
		g.drawRect(0, 40, 430 , 30);//R1
		g.drawRect(0, 70, 430 , 30);//R2
		g.drawRect(0, 100, 430 , 30);//R3
		g.drawRect(0, 130, 430 , 30);//R4
		g.drawRect(0, 160, 430 , 30);//R5
		g.drawRect(0, 190, 430 , 30);//R6
		g.drawRect(0, 220, 430 , 30);//R7
		g.drawRect(0, 250, 430 , 30);//R8
		g.drawRect(0, 280, 430 , 30);//R9
		g.drawRect(0, 310, 430 , 30);//R10
		g.drawRect(0, 340, 430 , 30);//R11
		g.drawRect(0, 370, 430 , 30);//R12
		
		
	}
}

