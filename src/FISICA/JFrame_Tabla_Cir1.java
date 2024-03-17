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

public class JFrame_Tabla_Cir1 extends JFrame{

	DecimalFormat df = new DecimalFormat();
	
	FISICA_2 f;
	OPCION_MIXTO o;
	Frame_Cir1 r;
	Calculo_JFrame_Cir1 s;
	
	JButton volver;
	JTextField V1,V2,V3,V4,V5,V6,V7,V8,V9,V10,V11,V12,I1,I2,I3,I4,I5,I6,I7,I8,I9,I10,I11,I12,
	P1,P2,P3,P4,P5,P6,P7,P8,P9,P10,P11,P12;
	JLabel R1,R2,R3,R4,R5,R6,R7,R8,R9,R10,R11,R12,resis,vol,corrien,poten;
	
	public JFrame_Tabla_Cir1 (FISICA_2 f,OPCION_MIXTO o,Frame_Cir1 r,Calculo_JFrame_Cir1 s) {
		this.f = f;
		this.o = o;
		this.r = r;
		this.s = s;
		
		
		resis =  new JLabel("R");
		resis.setBounds(20, 8 , 40, 30);
		resis.setForeground(Color.black);
		resis.setFont(new Font("tahoma", Font.BOLD | Font.ROMAN_BASELINE, 20));
		add(resis);
		
		vol =  new JLabel("VOLTAJE");
		vol.setBounds(60, 8 , 130, 30);
		vol.setForeground(Color.black);
		vol.setFont(new Font("tahoma", Font.BOLD | Font.ROMAN_BASELINE, 20));
		add(vol);
		
		corrien =  new JLabel("CORRIENTE");
		corrien.setBounds(170, 8 , 130, 30);
		corrien.setForeground(Color.black);
		corrien.setFont(new Font("tahoma", Font.BOLD | Font.ROMAN_BASELINE, 20));
		add(corrien);
		
		poten =  new JLabel("POTENCIA");
		poten.setBounds(310, 8 , 130, 30);
		poten.setForeground(Color.black);
		poten.setFont(new Font("tahoma", Font.BOLD | Font.ROMAN_BASELINE, 20));
		add(poten);
		
		R1 =  new JLabel("R1");
		R1.setBounds(20, 41 , 130, 30);
		R1.setForeground(Color.black);
		add(R1);
		
		R2 =  new JLabel("R2");
		R2.setBounds(20, 72 , 130, 30);
		R2.setForeground(Color.black);
		add(R2);
		
		R3 =  new JLabel("R3");
		R3.setBounds(20, 103 , 130, 30);
		R3.setForeground(Color.black);
		add(R3);
		
		R4 =  new JLabel("R4");
		R4.setBounds(20, 133 , 130, 30);
		R4.setForeground(Color.black);
		add(R4);
		
		R5 =  new JLabel("R5");
		R5.setBounds(20, 163 , 130, 30);
		R5.setForeground(Color.black);
		add(R5);
		
		R6 =  new JLabel("R6");
		R6.setBounds(20, 190 , 130, 30);
		R6.setForeground(Color.black);
		add(R6);
		
		R7 =  new JLabel("R7");
		R7.setBounds(20, 222 , 130, 30);
		R7.setForeground(Color.black);
		add(R7);
		
		R8 =  new JLabel("R8");
		R8.setBounds(20, 252 , 130, 30);
		R8.setForeground(Color.black);
		add(R8);
		
		R9 =  new JLabel("R9");
		R9.setBounds(20, 282 , 130, 30);
		R9.setForeground(Color.black);
		add(R9);
		
		R10 =  new JLabel("R10");
		R10.setBounds(20, 312 , 130, 30);
		R10.setForeground(Color.black);
		add(R10);
		
		R11 =  new JLabel("R11");
		R11.setBounds(20, 342 , 130, 30);
		R11.setForeground(Color.black);
		add(R11);
		
		R12 =  new JLabel("R12");
		R12.setBounds(20, 372 , 130, 30);
		R12.setForeground(Color.black);
		add(R12);
		
		V1 = new JTextField();
		V1.setBounds(60,45,90,22);
		V1.setBackground(Color.white);
		V1.setEditable(false);
		add(V1);
		
		V2 = new JTextField();
		V2.setBounds(60,75,90,22);
		V2.setBackground(Color.white);
		V2.setEditable(false);
		add(V2);
		
		V3 = new JTextField();
		V3.setBounds(60,105,90,22);
		V3.setBackground(Color.white);
		V3.setEditable(false);
		add(V3);
		
		V4 = new JTextField();
		V4.setBounds(60,135,90,22);
		V4.setBackground(Color.white);
		V4.setEditable(false);
		add(V4);
		
		V5 = new JTextField();
		V5.setBounds(60,165,90,22);
		V5.setBackground(Color.white);
		V5.setEditable(false);
		add(V5);
		
		V6 = new JTextField();
		V6.setBounds(60,195,90,22);
		V6.setBackground(Color.white);
		V6.setEditable(false);
		add(V6);
		
		V7 = new JTextField();
		V7.setBounds(60,225,90,22);
		V7.setBackground(Color.white);
		V7.setEditable(false);
		add(V7);
		
		V8 = new JTextField();
		V8.setBounds(60,255,90,22);
		V8.setBackground(Color.white);
		V8.setEditable(false);
		add(V8);
		
		V9 = new JTextField();
		V9.setBounds(60,285,90,22);
		V9.setBackground(Color.white);
		V9.setEditable(false);
		add(V9);
		
		V10 = new JTextField();
		V10.setBounds(60,315,90,22);
		V10.setBackground(Color.white);
		V10.setEditable(false);
		add(V10);
		
		V11 = new JTextField();
		V11.setBounds(60,345,90,22);
		V11.setBackground(Color.white);
		V11.setEditable(false);
		add(V11);
		
		V12 = new JTextField();
		V12.setBounds(60,375,90,22);
		V12.setBackground(Color.white);
		V12.setEditable(false);
		add(V12);
		
		I1 = new JTextField();
		I1.setBounds(190,45,90,22);
		I1.setBackground(Color.white);
		I1.setEditable(false);
		add(I1);
		
		I2 = new JTextField();
		I2.setBounds(190,75,90,22);
		I2.setBackground(Color.white);
		I2.setEditable(false);
		add(I2);
		
		I3 = new JTextField();
		I3.setBounds(190,105,90,22);
		I3.setBackground(Color.white);
		I3.setEditable(false);
		add(I3);
		
		I4 = new JTextField();
		I4.setBounds(190,135,90,22);
		I4.setBackground(Color.white);
		I4.setEditable(false);
		add(I4);
		
		I5 = new JTextField();
		I5.setBounds(190,165,90,22);
		I5.setBackground(Color.white);
		I5.setEditable(false);
		add(I5);
		
		I6 = new JTextField();
		I6.setBounds(190,195,90,22);
		I6.setBackground(Color.white);
		I6.setEditable(false);
		add(I6);
		
		I7 = new JTextField();
		I7.setBounds(190,225,90,22);
		I7.setBackground(Color.white);
		I7.setEditable(false);
		add(I7);
		
		I8 = new JTextField();
		I8.setBounds(190,255,90,22);
		I8.setBackground(Color.white);
		I8.setEditable(false);
		add(I8);
		
		I9 = new JTextField();
		I9.setBounds(190,285,90,22);
		I9.setBackground(Color.white);
		I9.setEditable(false);
		add(I9);
		
		I10 = new JTextField();
		I10.setBounds(190,315,90,22);
		I10.setBackground(Color.white);
		I10.setEditable(false);
		add(I10);
		
		I11 = new JTextField();
		I11.setBounds(190,345,90,22);
		I11.setBackground(Color.white);
		I11.setEditable(false);
		add(I11);
		
		I12 = new JTextField();
		I12.setBounds(190,375,90,22);
		I12.setBackground(Color.white);
		I12.setEditable(false);
		add(I12);
		
		
		P1 = new JTextField();
		P1.setBounds(320,45,90,22);
		P1.setBackground(Color.white);
		P1.setEditable(false);
		add(P1);
		
		P2 = new JTextField();
		P2.setBounds(320,75,90,22);
		P2.setBackground(Color.white);
		P2.setEditable(false);
		add(P2);
		
		P3 = new JTextField();
		P3.setBounds(320,105,90,22);
		P3.setBackground(Color.white);
		P3.setEditable(false);
		add(P3);
		
		P4 = new JTextField();
		P4.setBounds(320,135,90,22);
		P4.setBackground(Color.white);
		P4.setEditable(false);
		add(P4);
		
		P5 = new JTextField();
		P5.setBounds(320,165,90,22);
		P5.setBackground(Color.white);
		P5.setEditable(false);
		add(P5);
		
		P6 = new JTextField();
		P6.setBounds(320,195,90,22);
		P6.setBackground(Color.white);
		P6.setEditable(false);
		add(P6);
		
		P7 = new JTextField();
		P7.setBounds(320,225,90,22);
		P7.setBackground(Color.white);
		P7.setEditable(false);
		add(P7);
		
		P8 = new JTextField();
		P8.setBounds(320,255,90,22);
		P8.setBackground(Color.white);
		P8.setEditable(false);
		add(P8);
		
		P9 = new JTextField();
		P9.setBounds(320,285,90,22);
		P9.setBackground(Color.white);
		P9.setEditable(false);
		add(P9);
		
		P10 = new JTextField();
		P10.setBounds(320,315,90,22);
		P10.setBackground(Color.white);
		P10.setEditable(false);
		add(P10);
		
		P11 = new JTextField();
		P11.setBounds(320,345,90,22);
		P11.setBackground(Color.white);
		P11.setEditable(false);
		add(P11);
		
		P12 = new JTextField();
		P12.setBounds(320,375,90,22);
		P12.setBackground(Color.white);
		P12.setEditable(false);
		add(P12);
		
		volver =  new JButton("ATRAS");
		volver.setBounds(340,420,80,30);
		volver.setForeground(Color.black);
		volver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				evento_volver();
			}
		});
		add(volver);
		
	
		V1.setText(String.valueOf(df.format(s.VR1)));
		V2.setText(String.valueOf(df.format(s.VE9)));
		V3.setText(String.valueOf(df.format(s.VE7)));
		V4.setText(String.valueOf(df.format(s.VE1)));
		V5.setText(String.valueOf(df.format(s.VE1)));
		V6.setText(String.valueOf(df.format(s.VE5)));
		V7.setText(String.valueOf(df.format(s.VE3)));
		V8.setText(String.valueOf(df.format(s.VR8)));
		V9.setText(String.valueOf(df.format(s.VR9)));
		V10.setText(String.valueOf(df.format(s.VR10)));
		V11.setText(String.valueOf(df.format(s.VR11)));
		V12.setText(String.valueOf(df.format(s.VR12)));
		
		I1.setText(String.valueOf(df.format(s.IE6)));
		I2.setText(String.valueOf(df.format(s.IR2)));
		I3.setText(String.valueOf(df.format(s.IR3)));
		I4.setText(String.valueOf(df.format(s.IR4)));
		I5.setText(String.valueOf(df.format(s.IR5)));
		I6.setText(String.valueOf(df.format(s.IR6)));
		I7.setText(String.valueOf(df.format(s.IR7)));
		I8.setText(String.valueOf(df.format(s.IE2)));
		I9.setText(String.valueOf(df.format(s.IE2)));
		I10.setText(String.valueOf(df.format(s.IE4)));
		I11.setText(String.valueOf(df.format(s.IE4)));
		I12.setText(String.valueOf(df.format(s.IT)));
		
		P1.setText(String.valueOf(df.format(s.PR1)));
		P2.setText(String.valueOf(df.format(s.PR2)));
		P3.setText(String.valueOf(df.format(s.PR3)));
		P4.setText(String.valueOf(df.format(s.PR4)));
		P5.setText(String.valueOf(df.format(s.PR5)));
		P6.setText(String.valueOf(df.format(s.PR6)));
		P7.setText(String.valueOf(df.format(s.PR7)));
		P8.setText(String.valueOf(df.format(s.PR8)));
		P9.setText(String.valueOf(df.format(s.PR9)));
		P10.setText(String.valueOf(df.format(s.PR10)));
		P11.setText(String.valueOf(df.format(s.PR11)));
		P12.setText(String.valueOf(df.format(s.PR12)));
		
	
		JPanel_Tabla_Cir1 m = new JPanel_Tabla_Cir1();
		add(m);
		
		
	}

	protected void evento_volver() {
		setVisible(false);
		dispose();
		s.setVisible(true);
		
	}
}

