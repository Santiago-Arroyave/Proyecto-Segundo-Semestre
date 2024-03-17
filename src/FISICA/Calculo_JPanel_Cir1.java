package FISICA;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Calculo_JPanel_Cir1 extends JPanel {

	FISICA_2 f;
	OPCION_MIXTO o;
	Frame_Cir1 r;
	JPanel_Cir1 t;

	int x[], x1[], x2[], x3[], x4[], x5[];
	int y[], y1[], y2[], y3[], y4[], y5[];

	public Calculo_JPanel_Cir1() {
		super();
		setSize(1300, 700);
		setBackground(new Color(141, 184, 249));
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.drawRect(0, 0, 1149, 50);
		g.drawRect(150, 0, 1149, 50);
		g.drawRect(0, 50, 1300, 50);
		// CIR E1 E2
		g.drawRect(30, 200, 330, 100);
		g.drawRect(230, 200, 75, 100);
		x = new int[3];
		y = new int[3];

		x[0] = 30;
		y[0] = 300;

		x[1] = 130;
		y[1] = 200;

		x[2] = 230;
		y[2] = 300;
		g.drawPolygon(x, y, 3);

		// CIR E3
		g.drawRect(430, 200, 320, 100);
		g.drawRect(630, 200, 120, 100);

		x1 = new int[3];
		y1 = new int[3];

		x1[0] = 430;
		y1[0] = 300;

		x1[1] = 530;
		y1[1] = 200;

		x1[2] = 630;
		y1[2] = 300;
		g.drawPolygon(x1, y1, 3);

		// CIR E4

		g.drawRect(830, 200, 260, 100);
		g.drawRect(1030, 200, 60, 100);
		x2 = new int[3];
		y2 = new int[3];

		x2[0] = 830;
		y2[0] = 300;

		x2[1] = 930;
		y2[1] = 200;

		x2[2] = 1030;
		y2[2] = 300;
		g.drawPolygon(x2, y2, 3);

		// CIR E5

		g.drawRect(30, 400, 200, 100);

		x3 = new int[3];
		y3 = new int[3];

		x3[0] = 30;
		y3[0] = 500;

		x3[1] = 130;
		y3[1] = 400;

		x3[2] = 230;
		y3[2] = 500;
		g.drawPolygon(x3, y3, 3);
		// divi
		g.drawRect(0, 330, 280, 230);

		// CIR E6

		g.drawRect(320, 400, 200, 100);

		x4 = new int[3];
		y4 = new int[3];

		x4[0] = 320;
		y4[0] = 500;

		x4[1] = 420;
		y4[1] = 400;

		x4[2] = 520;
		y4[2] = 500;

		g.drawPolygon(x4, y4, 3);
		g.drawRect(280, 330, 280, 230);

		// CIR E7

		g.drawRect(600, 400, 160, 100);
		x5 = new int[2];
		y5 = new int[2];

		x5[0] = 600;
		y5[0] = 500;

		x5[1] = 760;
		y5[1] = 400;

		g.drawPolygon(x5, y5, 2);
		g.drawRect(560, 330, 240, 230);

		// CIR E8

		g.drawRect(850, 410, 150, 100);
		g.drawRect(910, 410, 90, 100);
		//
		g.drawRect(800, 330, 440, 230);

		// division del jframe
		g.drawRect(0, 100, 400, 230);
		g.drawRect(400, 100, 400, 230);
		g.drawRect(800, 100, 400, 230);
		// 2 Division
		g.drawRect(0, 100, 1200, 230);
	}
}
