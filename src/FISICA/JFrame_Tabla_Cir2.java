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

public class JFrame_Tabla_Cir2 extends JFrame{
	
	DecimalFormat df = new DecimalFormat();
	FISICA_2 f;
	OPCION_MIXTO o;
	JFrame_Cir2 x;
	Calculo_JFrame_Cir2 c;
	
	JButton volver;
	JTextField V1,V2,V3,V4,V5,V6,V7,I1,I2,I3,I4,I5,I6,I7,P1,P2,P3,P4,P5,P6,P7;
	JLabel R1,R2,R3,R4,R5,R6,R7,resis,vol,corrien,poten;
	
	public JFrame_Tabla_Cir2 (FISICA_2 f,OPCION_MIXTO o,JFrame_Cir2 x,Calculo_JFrame_Cir2 c) {
		this.f = f;
		this.o = o;
		this.x = x;
		this.c = c;
		
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
		
		volver =  new JButton("ATRAS");
		volver.setBounds(340,260,80,30);
		volver.setForeground(Color.black);
		volver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				evento_volver();
			}
		});
		add(volver);
		
		
		
		V1.setText(String.valueOf(df.format(c.VR1)));
		V2.setText(String.valueOf(df.format(c.VR2)));
		V3.setText(String.valueOf(df.format(c.VR3)));
		V4.setText(String.valueOf(df.format(c.VE3)));
		V5.setText(String.valueOf(df.format(c.VE2)));
		V6.setText(String.valueOf(df.format(c.VE2)));
		V7.setText(String.valueOf(df.format(c.VR7)));
		
		I1.setText(String.valueOf(df.format(c.IT)));
		I2.setText(String.valueOf(df.format(c.IE1)));
		I3.setText(String.valueOf(df.format(c.IE1)));
		I4.setText(String.valueOf(df.format(c.IR4)));
		I5.setText(String.valueOf(df.format(c.IR5)));
		I6.setText(String.valueOf(df.format(c.IR6)));
		I7.setText(String.valueOf(df.format(c.IT)));
		
		P1.setText(String.valueOf(df.format(c.PR1)));
		P2.setText(String.valueOf(df.format(c.PR2)));
		P3.setText(String.valueOf(df.format(c.PR3)));
		P4.setText(String.valueOf(df.format(c.PR4)));
		P5.setText(String.valueOf(df.format(c.PR5)));
		P6.setText(String.valueOf(df.format(c.PR6)));
		P7.setText(String.valueOf(df.format(c.PR7)));
		
	
		JPanel_Tabla_Cir2 m = new JPanel_Tabla_Cir2();
		add(m);
		
		
	}

	protected void evento_volver() {
		setVisible(false);
		dispose();
		c.setVisible(true);
		
	}
}
