package FISICA;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Calculo_JPanel_Cir4 extends JPanel {

	FISICA_2 f;
	OPCION_MIXTO o;
	JFrame_Cir4_R r;
	JPanel_Cir4_R t;
	int x[];
	int y[];
	int x1[];
	int y1[];
	int x2[];
	int y2[];

	public Calculo_JPanel_Cir4() {
		super();
		setSize(1300, 700);
		setBackground(new Color(141, 184, 249));
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.drawRect(0, 0, 1200, 50);
		g.drawRect(150, 0, 1200, 50);
		g.drawRect(0, 50, 1300, 50);
		// CIR E1
		g.drawRect(50, 160, 280, 100);
		g.drawRect(130, 160, 100, 100);
		x = new int[3];
		y = new int[3];

		x[0] = 130;
		y[0] = 260;

		x[1] = 230;
		y[1] = 160;

		x[2] = 330;
		y[2] = 260;
		g.drawPolygon(x, y, 3);

		// CIR E2
		g.drawRect(450, 160, 280, 100);
		g.drawRect(530, 160, 100, 100);
		x1 = new int[2];
		y1 = new int[2];

		x1[0] = 530;
		y1[0] = 260;

		x1[1] = 630;
		y1[1] = 160;
		g.drawPolygon(x1, y1, 2);

		// CIR E3

		g.drawRect(850, 160, 180, 100);
		g.drawRect(930, 160, 100, 100);
		x2 = new int[3];
		y2 = new int[3];

		x2[0] = 930;
		y2[0] = 260;

		x2[1] = 1030;
		y2[1] = 160;

		x2[2] = 1130;
		y2[2] = 260;
		g.drawPolygon(x2, y2, 3);

		// CIR E4
		g.drawRect(50, 380, 200, 100);
		g.drawRect(150, 380, 100, 100);

		// CIR E5
		g.drawRect(450, 380, 200, 100);
		g.drawRect(550, 380, 100, 100);

		// CIR E6
		
		g.drawRect(850, 380, 100, 100);

		// division del jframe
		g.drawRect(0, 100, 400, 600);
		g.drawRect(400, 100, 400, 600);
		g.drawRect(800, 100, 400, 600);
		// 2 Division
		g.drawRect(0, 100, 1200, 190);
	}
}
