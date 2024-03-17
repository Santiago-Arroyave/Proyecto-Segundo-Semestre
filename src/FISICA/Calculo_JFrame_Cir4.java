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

public class Calculo_JFrame_Cir4 extends JFrame {

	FISICA_2 f;
	OPCION_MIXTO o;
	JFrame_Cir4_R r;

	DecimalFormat df = new DecimalFormat();

	double Re1,Re2,Re3,Re4,Re5,Re6,Re7, IT,VR1,VR7,VE2,VE3,IE1,VR2,VR3,IR4,IR5,IR6,
	VE6,VE1,PR1,PR2,PR3,PR4,PR5,PR6,PR7,IE5,IE4,VR4,VR5,VR8,PR8,IR7,IR9,IR10,
	PR9,PR10,VE4,IE3,VR9;
	
	JLabel R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, V1, RE1, RE2, RE3, RE4, RE5, RE6, RE7,RE8, RT, val, pro, dia;
	JButton atras, tabla;
	JTextField RE1_1, RE3_3, RE2_2, RE5_5, RE4_4, RE6_6,R1_1,R4_4, R2_2,R7_7,R9_9,R5_5,R6_6;

	public Calculo_JFrame_Cir4(FISICA_2 f, OPCION_MIXTO o, JFrame_Cir4_R r) {
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


		V1 = new JLabel("V" + " = " + r.V1_1);
		V1.setBounds(880, 10, 100, 30);
		V1.setForeground(Color.BLACK);
		add(V1);

		

		Re1 = r.R3_3 + r.R8_8;

		RE1 = new JLabel("RE1" + " = " + " R3 + R8 " + " = " + df.format(Re1));
		RE1.setBounds(30, 110, 400, 30);
		RE1.setForeground(Color.BLACK);
		add(RE1);
		
		double cal1 = r.R7_7 * Re1;
		double cal2 = r.R7_7 + Re1;
	
		Re2 = cal1 / cal2;

		RE2 = new JLabel("RE2" + " = " + " R7 X RE1  /  R7 + RE1 " + " = " + df.format(Re2));
		RE2.setBounds(450, 110, 400, 30);
		RE2.setForeground(Color.BLACK);
		add(RE2);

		Re3 = r.R9_9 + Re2;

		RE3 = new JLabel("RE3" + " = " + " R9 + RE2 " + " = " + df.format(Re3));
		RE3.setBounds(850, 110, 400, 30);
		RE3.setForeground(Color.BLACK);
		add(RE3);
		
		double cal3 = (Math.pow(r.R5_5, -1)+ Math.pow(r.R6_6, -1) + Math.pow(Re3, -1));
		double cal4 = Math.pow(cal3, -1);
		
		Re4 = cal4;

		RE4 = new JLabel("RE4" + " = " + "(R6.Pow(-1) + R5.Pow(-1) + RE3.Pow(-1) ).Pow(-1) " + " = " + df.format(Re4));
		RE4.setBounds(20, 310, 400, 30);
		RE4.setForeground(Color.BLACK);
		add(RE4);
	
		Re5 =  r.R2_2 + Re4;

		RE5 = new JLabel("RE5" + " = " + " R2 + RE4 " + " = " + df.format(Re5));
		RE5.setBounds(450, 310, 400, 30);
		RE5.setForeground(Color.BLACK);
		add(RE5);
			 
   		double cal5 = r.R4_4 * Re5;
		double cal6 = r.R4_4 + Re5;
		Re6 = cal5 / cal6;
		
		RE6 = new JLabel("RE6" + " = " + " R4 * RE5 / R4 + RE5 " + " = " + df.format(Re6));
		RE6.setBounds(850, 310, 400, 30);
		RE6.setForeground(Color.BLACK);
		add(RE6);
		
		Re7 = r.R1_1 + Re6;

		RT = new JLabel("R TOTAL" + " = " + df.format(Re7));
		RT.setBounds(1040, 400, 400, 30);
		RT.setForeground(Color.BLACK);
		add(RT);

		atras = new JButton("ATRAS");
		atras.setBounds(1040, 510, 80, 30);
		atras.setForeground(Color.BLACK);
		atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				evento_atras();
			}
		});
		add(atras);

		tabla = new JButton("TABLA");
		tabla.setBounds(940, 510, 80, 30);
		tabla.setForeground(Color.black);
		tabla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				evento_tabla();

			}
		});
		add(tabla);

		RE1_1 = new JTextField("RE1");
		RE1_1.setBounds(310, 180, 35, 25);
		RE1_1.setBackground(new Color(141, 184, 249));
		RE1_1.setEditable(false);
		add(RE1_1);
		
		R7_7 = new JTextField("R7");
		R7_7.setBounds(250, 180, 35, 25);
		R7_7.setBackground(new Color(141, 184, 249));
		R7_7.setEditable(false);
		add(R7_7);
		
		RE2_2 = new JTextField("RE2");
		RE2_2.setBounds(710, 180, 35, 25);
		RE2_2.setBackground(new Color(141, 184, 249));
		RE2_2.setEditable(false);
		add(RE2_2);
		
		R9_9 = new JTextField("R9");
		R9_9.setBounds(670, 250, 35, 25);
		R9_9.setBackground(new Color(141, 184, 249));
		R9_9.setEditable(false);
		add(R9_9);
		
		RE3_3 = new JTextField("RE3");
		RE3_3.setBounds(1065, 200, 35, 25);
		RE3_3.setBackground(new Color(141, 184, 249));
		RE3_3.setEditable(false);
		add(RE3_3);
		
		R5_5 = new JTextField("R5");
		R5_5.setBounds(960, 200, 30, 25);
		R5_5.setBackground(new Color(141, 184, 249));
		R5_5.setEditable(false);
		add(R5_5);
		
		R6_6 = new JTextField("R6");
		R6_6.setBounds(1020, 200, 30, 25);
		R6_6.setBackground(new Color(141, 184, 249));
		R6_6.setEditable(false);
		add(R6_6);
		
		R2_2 = new JTextField("R2");
		R2_2.setBounds(200,370, 30, 25);
		R2_2.setBackground(new Color(141, 184, 249));
		R2_2.setEditable(false);
		add(R2_2);

		RE4_4 = new JTextField("RE4");
		RE4_4.setBounds(240, 430, 35, 25);
		RE4_4.setBackground(new Color(141, 184, 249));
		RE4_4.setEditable(false);
		add(RE4_4);

		RE5_5 = new JTextField("RE5");
		RE5_5.setBounds(630, 410, 35, 25);
		RE5_5.setBackground(new Color(141, 184, 249));
		RE5_5.setEditable(false);
		add(RE5_5);
		
		R4_4 = new JTextField("R4");
		R4_4.setBounds(540,410, 30, 25);
		R4_4.setBackground(new Color(141, 184, 249));
		R4_4.setEditable(false);
		add(R4_4);
		
		R1_1 = new JTextField("R1");
		R1_1.setBounds(880,370, 30, 25);
		R1_1.setBackground(new Color(141, 184, 249));
		R1_1.setEditable(false);
		add(R1_1);

		RE6_6 = new JTextField("RE6");
		RE6_6.setBounds(940, 420, 35, 25);
		RE6_6.setBackground(new Color(141, 184, 249));
		RE6_6.setEditable(false);
		add(RE6_6);

		Calculo_JPanel_Cir4 p = new Calculo_JPanel_Cir4();
		add(p);

	}

	protected void evento_atras() {
		setVisible(false);
		dispose();
		r.setVisible(true);

	}

	protected void evento_tabla() {

		IT  = r.V1_1 / Re7;
		VR1 = r.R1_1 * IT;	
		VE6 = IT * Re6;
		IE5 = VE6 / Re5;
		VE4 = IE5 * Re4;
		IE3 = VE4 / Re3;
		VE2 = IE3 * Re2;
		IE1 = VE2 / Re1;
		//
		VR2 = IE5 * r.R2_2;
		VR3 = IE1 * r.R3_3;
		IR4 = VE6 / r.R4_4;
		IR5 = VE4 / r.R5_5;
		IR6 = VE4 / r.R6_6;
		IR7 = VE2 / r.R7_7;
		//
		VR8 = IE1 * r.R8_8;
		VR9 = IE3 * r.R9_9;
		
		

		PR1 = IT * VR1;
		PR2 = VR2 * IE5;
		PR3 = VR3 * IE1;
		PR4 = VE6 * IR4;
		PR5 = VE4 * IR5;
		PR6 = VE4 * IR6;
		PR7 = VE2 * IR7;
		PR8 = VR8 * IE1;
		PR9 = VR9 * IE3;
		
		setVisible(false);
		JFrame_Tabla_Cir4  y = new JFrame_Tabla_Cir4(f, o, r, this);
		y.setSize(448 ,400);
		y.setLocationRelativeTo(null);
		y.setBackground(Color.white);
		y.setDefaultCloseOperation(EXIT_ON_CLOSE);
		y.setLayout(null);
		y.setVisible(true);
			

	}

}
