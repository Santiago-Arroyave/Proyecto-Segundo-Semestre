package FISICA;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

//import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

public class Calculo_JFrame_Cir2 extends JFrame{
	
	DecimalFormat df = new DecimalFormat("#.000");
	FISICA_2 f;
	OPCION_MIXTO o;
	JFrame_Cir2 x;
	Calculo_JFrame_Cir2 p;
	JPanel_Cir2 u;
	double  Re1,Re2,Re3,Re4, IT= 0,VR1=0,VR7=0,VE2=0,VE3 = 0,IE1=0,VR2=0,VR3,IR4=0,IR5=0,IR6=0,PR1=0,PR2=0,PR3=0,PR4=0,PR5=0,PR6=0,PR7=0;;
	JLabel R1, R2, R3, R4, R5, R6, R7, V1,RE1,RE2,RE3,RE4,RT,val,pro,dia;
	JButton atras,tabla;
	JTextField R1_1 , RE3_3,RE2_2,R7_7,R4_4;

	public Calculo_JFrame_Cir2(FISICA_2 f, OPCION_MIXTO o, JFrame_Cir2 x) {
		super();
		this.f = f;
		this.o = o;
		this.x = x;
		
		val = new JLabel("VALORES");
		val.setBounds(30, 10, 400, 30);
		val.setForeground(Color.black);
		val.setFont(new Font("tahoma", Font.BOLD | Font.ROMAN_BASELINE, 20));
		val.setBackground(Color.black);
		add(val);
		
		pro = new JLabel("PROCEDIMIENTO");
		pro.setBounds(30,140, 400, 30);
		pro.setForeground(Color.black);
		pro.setFont(new Font("tahoma", Font.BOLD | Font.ROMAN_BASELINE, 20));
		pro.setBackground(Color.black);
		add(pro);
		
		dia = new JLabel("DIAGRAMA");
		dia.setBounds(500, 10, 400, 30);
		dia.setForeground(Color.black);
		dia.setFont(new Font("tahoma", Font.BOLD | Font.ROMAN_BASELINE, 20));
		dia.setBackground(Color.black);
		add(dia);
		
		R1 = new JLabel("R1" + " = " + x.R1_1);
		R1.setBounds(30,40,50,30);
		R1.setForeground(Color.BLACK);
		add(R1);
		
		R2 = new JLabel("R2" + " = " + x.R2_2);
		R2.setBounds(110,40,50,30);
		R2.setForeground(Color.BLACK);
		add(R2);
		
		R3 = new JLabel("R3" + " = " + x.R3_3);
		R3.setBounds(190,40,50,30);
		R3.setForeground(Color.BLACK);
		add(R3);
		
		R4 = new JLabel("R4" + " = " + x.R4_4);
		R4.setBounds(30,70,50,30);
		R4.setForeground(Color.BLACK);
		add(R4);
		
		R5 = new JLabel("R5" + " = " + x.R5_5);
		R5.setBounds(110,70,50,30);
		R5.setForeground(Color.BLACK);
		add(R5);
		
		R6 = new JLabel("R6" + " = " + x.R6_6);
		R6.setBounds(190,70,50,30);
		R6.setForeground(Color.BLACK);
		add(R6);
		
		R7 = new JLabel("R7" + " = " + x.R7_7);
		R7.setBounds(30,100,50,30);
		R7.setForeground(Color.BLACK);
		add(R7);
		
		V1 = new JLabel("V" + " = " + x.V1_1);
		V1.setBounds(110,100,50,30);
		V1.setForeground(Color.BLACK);
		add(V1);
		
		Re1 = x.R2_2 + x.R3_3;
		
		RE1 = new JLabel("RE1" + " = " + " R2 + R3 " + " = " + df.format(Re1));
		RE1.setBounds(30,180,400,30);
		RE1.setForeground(Color.BLACK);
		add(RE1);
		
		double cal1 = x.R5_5 * x.R6_6;
		double cal2 = x.R5_5 + x.R6_6;
	    Re2 = cal1 / cal2;
		
		RE2 = new JLabel("RE2" + " = " + " R5 X R6  /  R5 + R6 " + " = " + df.format(Re2));
		RE2.setBounds(30,220,400,30);
		RE2.setForeground(Color.BLACK);
		add(RE2);
		
		double cal3 = Re1 * x.R4_4;
		double cal4 = Re1 + x.R4_4;
		Re3 = cal3  / cal4;
		
		RE3 = new JLabel("RE3" + " = " + " RE1 X R4  /  RE1 + R4 " + " = " + df.format(Re3));
		RE3.setBounds(30,260,400,30);
		RE3.setForeground(Color.BLACK);
		add(RE3);
		
		Re4 = x.R1_1 + Re2 + Re3 + x.R7_7;
		
		RE4 = new JLabel("RE4" + " = " + " R1 + RE2 + RE3 + RE7 " + " = " +  df.format(Re4));
		RE4.setBounds(30,300,400,30);
		RE4.setForeground(Color.BLACK);
		add(RE4);
		
		RT = new JLabel("R TOTAL" + " = " + df.format(Re4));
		RT.setBounds(30,340,400,30);
		RT.setForeground(Color.BLACK);
		add(RT);
		
		atras =  new JButton("ATRAS");
		atras.setBounds(680, 370, 80, 30);
		atras.setForeground(Color.BLACK);
		atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				evento_atras();
			}
		});
		add(atras);
		
		tabla =  new JButton("TABLA");
		tabla.setBounds(550, 370, 80, 30);
		tabla.setForeground(Color.black);
		tabla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				evento_tabla();
				
			}
		});
		add(tabla);
		
		R1_1 =  new JTextField("R1");
		R1_1.setBounds(480,70, 25, 25);
		R1_1.setBackground(new Color(141,184,249));
		R1_1.setEditable(false);
		add(R1_1);
		
		RE3_3 =  new JTextField("RE3");
		RE3_3.setBounds(650,70, 35, 25);
		RE3_3.setBackground(new Color(141,184,249));
		RE3_3.setEditable(false);
		add(RE3_3);
		
		RE2_2 =  new JTextField("RE2");
		RE2_2.setBounds(480,170, 35, 25);
		RE2_2.setBackground(new Color(141,184,249));
		RE2_2.setEditable(false);
		add(RE2_2);
		
		R7_7=  new JTextField("R7");
		R7_7.setBounds(650,170, 25, 25);
		R7_7.setBackground(new Color(141,184,249));
		R7_7.setEditable(false);
		add(R7_7);
		
		R4_4 = new JTextField("RE4");
		R4_4.setBounds(605,270, 30, 25);
		R4_4.setBackground(new Color(141,184,249));
		R4_4.setEditable(false);
		add(R4_4);
		
		Calculo_JPanel_Cir2 p = new Calculo_JPanel_Cir2();
		add(p);
	}

	protected void evento_tabla() {
		
		IT = x.V1_1 / Re4;
		VR1 = IT * x.R1_1;
		VR7 = IT * x.R7_7;
		VE2 = IT * Re2;
		VE3 = IT * Re3;
		IE1 = VE3 / Re1 ;
		VR2 = IE1 * x.R2_2;
		VR3 = IE1 * x.R3_3;
		IR4 = VE3  / x.R4_4;
		IR5 = VE2 / x.R5_5;
		IR6 = VE2 / x.R6_6;
		
		PR1 = IT * VR1;
		PR2 = VR2 * IE1;
		PR3 = VR3 * IE1;
		PR4 = VE3 * IR4;
		PR5 = VE2 * IR5;
		PR6 = VE2 * IR6;
		PR7 = VR7 * IT;
		
	
		setVisible(false);
		JFrame_Tabla_Cir2  y = new JFrame_Tabla_Cir2(f, o, x, this);
		y.setSize(448 ,340);
		y.setLocationRelativeTo(null);
		y.setBackground(Color.white);
		y.setDefaultCloseOperation(EXIT_ON_CLOSE);
		y.setLayout(null);
		y.setVisible(true);
	}

	protected void evento_atras() {
		setVisible(false);
		dispose();
		x.setVisible(true);
	}
}
