package FISICA;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculo_JFrame_Cir3 extends JFrame {

	FISICA_2 f;
	OPCION_MIXTO o;
	JFrame_Cir3 r;
	DecimalFormat df = new DecimalFormat();

	double Re1, Re2, Re3, Re4, Re5, Re6, Re7, IT, VR1, VR7, VE2, VE3, IE1, VR2, VR3, IR4, IR5, IR6, VE6, VE1, PR1, PR2,
			PR3, PR4, PR5, PR6, PR7, IE5, IE4, VR4, VR5, VR8, PR8, IR7, IR9, IR10, PR9, PR10;

	JLabel R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, V1, RE1, RE2, RE3, RE4, RE5, RE6, RE7, RT, val, pro, dia;
	JButton atras, tabla;
	JTextField RE1_1, RE3_3, RE2_2, RE5_5, RE4_4, RE6_6, RE7_7;

	public Calculo_JFrame_Cir3(FISICA_2 f, OPCION_MIXTO o, JFrame_Cir3 r) {
		super();
		this.f = f;
		this.o = o;
		this.r = r;

		val = new JLabel("VALORES");
		val.setBounds(30, 10, 400, 30);
		val.setForeground(Color.black);
		val.setFont(new Font("tahoma", Font.BOLD | Font.ROMAN_BASELINE, 20));
		val.setBackground(Color.black);
		add(val);

		pro = new JLabel("PROCEDIMIENTO");
		pro.setBounds(480, 60, 400, 30);
		pro.setForeground(Color.black);
		pro.setFont(new Font("tahoma", Font.BOLD | Font.ROMAN_BASELINE, 20));
		pro.setBackground(Color.black);
		add(pro);

		/*
		 * dia = new JLabel("DIAGRAMA"); dia.setBounds(500, 10, 400, 30);
		 * dia.setForeground(Color.black); dia.setFont(new Font("tahoma", Font.BOLD |
		 * Font.ROMAN_BASELINE, 20)); dia.setBackground(Color.black); add(dia);
		 */

		R1 = new JLabel("R1" + " = " + r.R1_1);
		R1.setBounds(160, 10, 100, 30);
		R1.setForeground(Color.BLACK);
		add(R1);

		R2 = new JLabel("R2" + " = " + r.R2_2);
		R2.setBounds(240, 10, 100, 30);
		R2.setForeground(Color.BLACK);
		add(R2);

		R3 = new JLabel("R3" + " = " + r.R3_3);
		R3.setBounds(320, 10, 100, 30);
		R3.setForeground(Color.BLACK);
		add(R3);

		R4 = new JLabel("R4" + " = " + r.R4_4);
		R4.setBounds(400, 10, 100, 30);
		R4.setForeground(Color.BLACK);
		add(R4);

		R5 = new JLabel("R5" + " = " + r.R5_5);
		R5.setBounds(480, 10, 100, 30);
		R5.setForeground(Color.BLACK);
		add(R5);

		R6 = new JLabel("R6" + " = " + r.R6_6);
		R6.setBounds(560, 10, 100, 30);
		R6.setForeground(Color.BLACK);
		add(R6);

		R7 = new JLabel("R7" + " = " + r.R7_7);
		R7.setBounds(640, 10, 100, 30);
		R7.setForeground(Color.BLACK);
		add(R7);

		R8 = new JLabel("R8" + " = " + r.R8_8);
		R8.setBounds(720, 10, 100, 30);
		R8.setForeground(Color.BLACK);
		add(R8);

		R9 = new JLabel("R9" + " = " + r.R9_9);
		R9.setBounds(800, 10, 100, 30);
		R9.setForeground(Color.BLACK);
		add(R9);

		R10 = new JLabel("R10" + " = " + r.R10_10);
		R10.setBounds(880, 10, 100, 30);
		R10.setForeground(Color.BLACK);
		add(R10);

		V1 = new JLabel("V" + " = " + r.V1_1);
		V1.setBounds(960, 10, 100, 30);
		V1.setForeground(Color.BLACK);
		add(V1);

		double cal1 = r.R9_9 * r.R10_10;
		double cal2 = r.R9_9 + r.R10_10;

		Re1 = cal1 / cal2;

		RE1 = new JLabel("RE1" + " = " + " R9 X R10 / R9 + R10 " + " = " + df.format(Re1));
		RE1.setBounds(30, 130, 400, 30);
		RE1.setForeground(Color.BLACK);
		add(RE1);

		double cal3 = r.R6_6 * r.R7_7;
		double cal4 = r.R6_6 + r.R7_7;
		Re2 = cal3 / cal4;

		RE2 = new JLabel("RE2" + " = " + " R6 X R7  /  R6 + R7 " + " = " + df.format(Re2));
		RE2.setBounds(30, 170, 400, 30);
		RE2.setForeground(Color.BLACK);
		add(RE2);

		Re3 = r.R1_1 + r.R2_2;

		RE3 = new JLabel("RE3" + " = " + " R1 + R2 " + " = " + df.format(Re3));
		RE3.setBounds(30, 210, 400, 30);
		RE3.setForeground(Color.BLACK);
		add(RE3);

		Re4 = r.R4_4 + Re2 + r.R5_5;

		RE4 = new JLabel("RE4" + " = " + " R4 + R5 + RE2 " + " = " + df.format(Re4));
		RE4.setBounds(30, 250, 400, 30);
		RE4.setForeground(Color.BLACK);
		add(RE4);

		Re5 = r.R3_3 + r.R8_8;

		RE5 = new JLabel("RE5" + " = " + " R3 + R8 " + " = " + df.format(Re5));
		RE5.setBounds(30, 290, 400, 30);
		RE5.setForeground(Color.BLACK);
		add(RE5);

		double cal5 = Re4 * Re5;
		double cal6 = Re4 + Re5;
		Re6 = cal5 / cal6;

		RE6 = new JLabel("RE6" + " = " + " RE4 X RE5  / RE4 + RE5 " + " = " + df.format(Re6));
		RE6.setBounds(690, 130, 400, 30);
		RE6.setForeground(Color.BLACK);
		add(RE6);

		Re7 = Re3 + Re6 + Re1;

		RE7 = new JLabel("RE7" + " = " + " RE3 + RE6 + RE1 " + " = " + df.format(Re7));
		RE7.setBounds(950, 130, 400, 30);
		RE7.setForeground(Color.BLACK);
		add(RE7);

		RT = new JLabel("R TOTAL" + " = " + df.format(Re7));
		RT.setBounds(690, 320, 400, 30);
		RT.setForeground(Color.BLACK);
		add(RT);

		atras = new JButton("ATRAS");
		atras.setBounds(1040, 390, 80, 30);
		atras.setForeground(Color.BLACK);
		atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				evento_atras();
			}
		});
		add(atras);

		tabla = new JButton("TABLA");
		tabla.setBounds(940, 390, 80, 30);
		tabla.setForeground(Color.black);
		tabla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				evento_tabla();

			}
		});
		add(tabla);

		RE1_1 = new JTextField("RE1");
		RE1_1.setBounds(360, 320, 35, 25);
		RE1_1.setBackground(new Color(141, 184, 249));
		RE1_1.setEditable(false);
		add(RE1_1);

		RE3_3 = new JTextField("RE3");
		RE3_3.setBounds(360, 120, 35, 25);
		RE3_3.setBackground(new Color(141, 184, 249));
		RE3_3.setEditable(false);
		add(RE3_3);

		RE4_4 = new JTextField("RE4");
		RE4_4.setBounds(585, 210, 35, 25);
		RE4_4.setBackground(new Color(141, 184, 249));
		RE4_4.setEditable(false);
		add(RE4_4);

		RE5_5 = new JTextField("RE5");
		RE5_5.setBounds(435, 210, 35, 25);
		RE5_5.setBackground(new Color(141, 184, 249));
		RE5_5.setEditable(false);
		add(RE5_5);

		RE3_3 = new JTextField("RE3");
		RE3_3.setBounds(760, 185, 35, 25);
		RE3_3.setBackground(new Color(141, 184, 249));
		RE3_3.setEditable(false);
		add(RE3_3);

		RE6_6 = new JTextField("RE6");
		RE6_6.setBounds(810, 240, 35, 25);
		RE6_6.setBackground(new Color(141, 184, 249));
		RE6_6.setEditable(false);
		add(RE6_6);

		RE1_1 = new JTextField("RE1");
		RE1_1.setBounds(760, 285, 35, 25);
		RE1_1.setBackground(new Color(141, 184, 249));
		RE1_1.setEditable(false);
		add(RE1_1);

		RE7_7 = new JTextField("RE7");
		RE7_7.setBounds(1065, 240, 35, 25);
		RE7_7.setBackground(new Color(141, 184, 249));
		RE7_7.setEditable(false);
		add(RE7_7);

		Calculo_JPanel_Cir3 p = new Calculo_JPanel_Cir3();
		add(p);

	}

	protected void evento_atras() {
		setVisible(false);
		dispose();
		r.setVisible(true);

	}

	protected void evento_tabla() {

		IT = r.V1_1 / Re7;
		VE3 = IT * Re3;
		VE6 = IT * Re6;
		VE1 = IT * Re1;

		IE5 = VE6 / Re5;
		IE4 = VE6 / Re4;

		VE1 = IT * Re1;
		VE2 = IE4 * Re2;
		// 2 OPERACIONES VOLTAJES
		VR1 = IT * r.R1_1;
		VR2 = IT * r.R2_2;
		VR3 = IE5 * r.R3_3;
		VR4 = IE4 * r.R4_4;
		VR5 = IE4 * r.R5_5;
		VR8 = IE5 * r.R8_8;
		// 3 OPERACION CORRIENTES
		IR6 = VE2 / r.R6_6;
		IR7 = VE2 / r.R7_7;
		IR9 = VE1 / r.R9_9;
		IR10 = VE1 / r.R10_10;

		PR1 = IT * VR1;
		PR2 = IT * VR2;
		PR3 = VR3 * IE5;
		PR4 = VR4 * IE4;
		PR5 = VR5 * IE4;
		PR6 = VE2 * IR6;
		PR7 = VE2 * IR7;
		PR8 = VR8 * IE5;
		PR9 = VE1 * IR9;
		PR10 = VE1 * IR10;
		
		setVisible(false);
		JFrame_Tabla_Cir3  y = new JFrame_Tabla_Cir3(f, o, r, this);
		y.setSize(448 ,440);
		y.setLocationRelativeTo(null);
		y.setBackground(Color.white);
		y.setDefaultCloseOperation(EXIT_ON_CLOSE);
		y.setLayout(null);
		y.setVisible(true);


	}
}
