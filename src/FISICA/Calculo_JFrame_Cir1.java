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

public class Calculo_JFrame_Cir1 extends JFrame {

	FISICA_2 f;
	OPCION_MIXTO o;
	Frame_Cir1 r;
	
	DecimalFormat df = new DecimalFormat();

	double Re1,Re2,Re3,Re4,Re5,Re6,Re7,Re8,Re9,Re10, IT,VR1 = 0,VR7,VE2,VE3,IE1,VR2,VR3,IR4,IR5,IR6,
	VE6,VE1,VR12,PR1,PR2,PR3,PR4,PR5,PR6,PR7,IE5,IE4,VR4,VR5,VR8,PR8,IR7,IR9,IR10,
	PR9,PR10,PR11,PR12,VE4,IE3,VR9,VE9,IE8,VE7,IE6,VE5,IE2,IR2,IR3,VR10,VR11;
	
	JLabel R1, R2, R3, R4, R5, R6, R7, R8, R9, R10,R11,R12, V1, RE1, RE2, RE3, RE4, RE5, RE6, RE7, RE8, RE9, RT, val, pro, dia;
	JButton atras, tabla;
	JTextField RE1_1, RE1_1_1, RE3_3, RE2_2, RE5_5, RE4_4, RE6_6, RE7_7, R1_1, R3_3, R4_4, R2_2, R7_7, R9_9, R5_5, R6_6,
			R10_10, R11_11,RE8_8,R12_12;
	int DVR1;

	public Calculo_JFrame_Cir1(FISICA_2 f, OPCION_MIXTO o, Frame_Cir1 r) {
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
		R2.setBounds(230, 10, 100, 30);
		R2.setForeground(Color.BLACK);
		add(R2);

		R3 = new JLabel("R3" + " = " + r.R3_3);
		R3.setBounds(295, 10, 100, 30);
		R3.setForeground(Color.BLACK);
		add(R3);

		R4 = new JLabel("R4" + " = " + r.R4_4);
		R4.setBounds(355, 10, 100, 30);
		R4.setForeground(Color.BLACK);
		add(R4);

		R5 = new JLabel("R5" + " = " + r.R5_5);
		R5.setBounds(415, 10, 100, 30);
		R5.setForeground(Color.BLACK);
		add(R5);

		R6 = new JLabel("R6" + " = " + r.R6_6);
		R6.setBounds(475, 10, 100, 30);
		R6.setForeground(Color.BLACK);
		add(R6);

		R7 = new JLabel("R7" + " = " + r.R7_7);
		R7.setBounds(535, 10, 100, 30);
		R7.setForeground(Color.BLACK);
		add(R7);

		R8 = new JLabel("R8" + " = " + r.R8_8);
		R8.setBounds(595, 10, 100, 30);
		R8.setForeground(Color.BLACK);
		add(R8);
		
		R9 = new JLabel("R9" + " = " + r.R9_9);
		R9.setBounds(655, 10, 100, 30);
		R9.setForeground(Color.BLACK);
		add(R9);

		R10 = new JLabel("R10" + " = " + r.R10_10);
		R10.setBounds(715, 10, 100, 30);
		R10.setForeground(Color.BLACK);
		add(R10);
		
		R11 = new JLabel("R11" + " = " + r.R11_11);
		R11.setBounds(775, 10, 100, 30);
		R11.setForeground(Color.BLACK);
		add(R11);
		
		R12 = new JLabel("R12" + " = " + r.R12_12);
		R12.setBounds(835, 10, 100, 30);
		R12.setForeground(Color.BLACK);
		add(R12);

		V1 = new JLabel("V" + " = " + r.V1_1);
		V1.setBounds(895, 10, 100, 30);
		V1.setForeground(Color.BLACK);
		add(V1);

		double cal1 = r.R4_4 * r.R5_5;
		double cal2 = r.R4_4 + r.R5_5;

		Re1 = cal1 / cal2;

		RE1 = new JLabel("RE1" + " = " + " R4 X R5  /  R4 + R5 " + " = " + df.format(Re1));
		RE1.setBounds(30, 110, 400, 30);
		RE1.setForeground(Color.BLACK);
		add(RE1);

		Re2 = r.R8_8 + r.R9_9;

		RE2 = new JLabel("RE2" + " = " + " R8 + R9 " + " = " + df.format(Re2));
		RE2.setBounds(30, 150, 400, 30);
		RE2.setForeground(Color.BLACK);
		add(RE2);

		double cal3 = r.R7_7 * Re2;
		double cal4 = r.R7_7 + Re2;
		Re3 = cal3 / cal4;

		RE3 = new JLabel("RE3" + " = " + " R7 * RE2 / R7 + RE2" + " = " + df.format(Re3));
		RE3.setBounds(430, 110, 400, 30);
		RE3.setForeground(Color.BLACK);
		add(RE3);

		Re4 = Re1 + r.R10_10 + Re3;

		RE4 = new JLabel("RE4" + " = " + " RE1 + R10 + RE3 " + " = " + df.format(Re4));
		RE4.setBounds(830, 110, 400, 30);
		RE4.setForeground(Color.BLACK);
		add(RE4);

		double cal5 = r.R6_6 * Re4;
		double cal6 = r.R6_6 + Re4;
		Re5 = cal5 / cal6;

		RE5 = new JLabel("RE5" + " = " + " R6 * RE4 / R6 + RE4 " + " = " + df.format(Re5));
		RE5.setBounds(30, 340, 400, 30);
		RE5.setForeground(Color.BLACK);
		add(RE5);

		Re6 = r.R1_1 + Re5;

		RE6 = new JLabel("RE6" + " = " + " R1 + RE5 " + " = " + df.format(Re6));
		RE6.setBounds(330, 340, 400, 30);
		RE6.setForeground(Color.BLACK);
		add(RE6);

		double cal7 = r.R3_3 * Re6;
		double cal8 = r.R3_3 + Re6;
		Re7 = cal7 / cal8;

		RE7 = new JLabel("RE7" + " = " + " R3 + RE6 " + " = " + df.format(Re7));
		RE7.setBounds(600, 340, 400, 30);
		RE7.setForeground(Color.BLACK);
		add(RE7);

		Re8 = r.R11_11 + Re7;

		RE8 = new JLabel("RE8" + " = " + " R11 + RE7 " + " = " + df.format(Re8));
		RE8.setBounds(830, 340, 400, 30);
		RE8.setForeground(Color.BLACK);
		add(RE8);

		double cal9 = r.R2_2 * Re8;
		double cal10 = r.R2_2 + Re8;

		Re9 = cal9 / cal10;

		RE9 = new JLabel("RE9" + " = " + " R2 * RE8 / R2 + RE8 " + " = " + df.format(Re9));
		RE9.setBounds(830, 360, 400, 30);
		RE9.setForeground(Color.BLACK);
		add(RE9);
		
		Re10 = r.R12_12 + Re9;
		
		RT = new JLabel("R TOTAL" + " = " + df.format(Re10));
		RT.setBounds(830, 520, 400, 30);
		RT.setForeground(Color.BLACK);
		add(RT);

		atras = new JButton("ATRAS");
		atras.setBounds(1040, 570, 80, 30);
		atras.setForeground(Color.BLACK);
		atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				evento_atras();
			}
		});
		add(atras);

		tabla = new JButton("TABLA");
		tabla.setBounds(940, 570, 80, 30);
		tabla.setForeground(Color.black);
		tabla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				evento_tabla();

			}
		});
		add(tabla);

		RE1_1 = new JTextField("RE1");
		RE1_1.setBounds(250, 185, 35, 25);
		RE1_1.setBackground(new Color(141, 184, 249));
		RE1_1.setEditable(false);
		add(RE1_1);

		RE2_2 = new JTextField("RE2");
		RE2_2.setBounds(350, 230, 35, 25);
		RE2_2.setBackground(new Color(141, 184, 249));
		RE2_2.setEditable(false);
		add(RE2_2);

		R7_7 = new JTextField("R7");
		R7_7.setBounds(295, 230, 30, 25);
		R7_7.setBackground(new Color(141, 184, 249));
		R7_7.setEditable(false);
		add(R7_7);

		RE1_1_1 = new JTextField("RE1");
		RE1_1_1.setBounds(670, 185, 35, 25);
		RE1_1_1.setBackground(new Color(141, 184, 249));
		RE1_1_1.setEditable(false);
		add(RE1_1_1);

		RE3_3 = new JTextField("RE3");
		RE3_3.setBounds(730, 230, 35, 25);
		RE3_3.setBackground(new Color(141, 184, 249));
		RE3_3.setEditable(false);
		add(RE3_3);

		R10_10 = new JTextField("R10");
		R10_10.setBounds(670, 285, 35, 25);
		R10_10.setBackground(new Color(141, 184, 249));
		R10_10.setEditable(false);
		add(R10_10);

		R6_6 = new JTextField("R6");
		R6_6.setBounds(1020, 230, 30, 25);
		R6_6.setBackground(new Color(141, 184, 249));
		R6_6.setEditable(false);
		add(R6_6);

		RE4_4 = new JTextField("RE4");
		RE4_4.setBounds(1075, 230, 35, 25);
		RE4_4.setBackground(new Color(141, 184, 249));
		RE4_4.setEditable(false);
		add(RE4_4);

		R1_1 = new JTextField("R1");
		R1_1.setBounds(180, 390, 30, 25);
		R1_1.setBackground(new Color(141, 184, 249));
		R1_1.setEditable(false);
		add(R1_1);

		RE5_5 = new JTextField("RE5");
		RE5_5.setBounds(210, 430, 35, 25);
		RE5_5.setBackground(new Color(141, 184, 249));
		RE5_5.setEditable(false);
		add(RE5_5);

		RE6_6 = new JTextField("RE6");
		RE6_6.setBounds(500, 430, 35, 25);
		RE6_6.setBackground(new Color(141, 184, 249));
		RE6_6.setEditable(false);
		add(RE6_6);

		R3_3 = new JTextField("R3");
		R3_3.setBounds(459, 430, 30, 25);
		R3_3.setBackground(new Color(141, 184, 249));
		R3_3.setEditable(false);
		add(R3_3);

		RE7_7 = new JTextField("RE7");
		RE7_7.setBounds(750, 440, 30, 25);
		RE7_7.setBackground(new Color(141, 184, 249));
		RE7_7.setEditable(false);
		add(RE7_7);

		R11_11 = new JTextField("R11");
		R11_11.setBounds(720, 480, 30, 25);
		R11_11.setBackground(new Color(141, 184, 249));
		R11_11.setEditable(false);
		add(R11_11);

		R12_12 = new JTextField("R12");
		R12_12.setBounds(860, 400, 35, 25);
		R12_12.setBackground(new Color(141, 184, 249));
		R12_12.setEditable(false);
		add(R12_12);

		RE8_8 = new JTextField("RE8");
		RE8_8.setBounds(990, 450, 30, 25);
		RE8_8.setBackground(new Color(141, 184, 249));
		RE8_8.setEditable(false);
		add(RE8_8);

		R2_2 = new JTextField("R2");
		R2_2.setBounds(900, 450, 30, 25);
		R2_2.setBackground(new Color(141, 184, 249));
		R2_2.setEditable(false);
		add(R2_2);

		Calculo_JPanel_Cir1 p = new Calculo_JPanel_Cir1();
		add(p);

	}

	protected void evento_atras() {
		setVisible(false);
		dispose();
		r.setVisible(true);

	}

	protected void evento_tabla() {


		IT = r.V1_1 / Re10;
		VR12 = IT * r.R12_12;
		VE9  = IT * Re9;
		IE8 = VE9 / Re8;
		VE7 = IE8 * Re7;
		IE6 = VE7 / Re6;
		VE5 = IE6 * Re5;
		IE4 = VE5 / Re4;
		VE1 = IE4 * Re1;
		VE3 = IE4 * Re3;
		IE2 = VE3 / Re2;
		//
		VR1 = IE6 * r.R1_1;
		IR2 = VE9 / r.R2_2;
		IR3 = VE7 / r.R3_3;
		IR4 = VE1 / r.R4_4;
		IR5 = VE1 / r.R5_5;
		IR6 = VE5 / r.R6_6;
		IR7 = VE3 / r.R7_7;
		//
		VR8 = IE2 * r.R8_8;
		VR9 = IE2 * r.R9_9;
		VR10= IE4 * r.R10_10;
		VR11= IE8 * r.R11_11;
		VR12= IT  * r.R12_12;
		
		
		PR1 = IE6 * VR1;
		PR2 = VE9 * IR2;
		PR3 = VE7 * IR3;
		PR4 = VE1 * IR4;
		PR5 = VE1 * IR5;
		PR6 = VE5 * IR6;
		PR7 = VE3 * IR7;
		PR8 = VR8 * IE2;
		PR9 = VR9 * IE2;
		PR10 = VR10 * IE4;
		PR11 = VR11 * IE8;
		PR12 = VR12 * IT;
		
		setVisible(false);
		JFrame_Tabla_Cir1  y = new JFrame_Tabla_Cir1(f, o, r, this);
		y.setSize(448 ,500);
		y.setLocationRelativeTo(null);
		y.setBackground(Color.white);
		y.setDefaultCloseOperation(EXIT_ON_CLOSE);
		y.setLayout(null);
		y.setVisible(true);
		
		
	}

}
