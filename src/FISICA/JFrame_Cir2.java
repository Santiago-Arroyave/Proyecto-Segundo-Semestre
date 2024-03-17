package FISICA;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JFrame_Cir2 extends JFrame {
	
	FISICA_2 f;
	OPCION_MIXTO o;
	int R1_1 = 0, R2_2 = 0, R3_3 = 0, R4_4 = 0, R5_5 = 0, R6_6 = 0, R7_7 = 0, V1_1 = 0;
	JTextField R1, R2, R3, R4, R5, R6, R7, V1;
	JLabel texto, LR1, LR2, LR3, LR4, LR5, LR6, LR7, LV1;
	JButton Calcular, atras;

	public JFrame_Cir2(FISICA_2 f, OPCION_MIXTO o) {
		super();
		this.f = f;
		this.o = o;

		texto = new JLabel("CIRCUITO MIXTO");
		texto.setBounds(50, 30, 400, 30);
		texto.setForeground(Color.black);
		texto.setFont(new Font("tahoma", Font.BOLD | Font.ROMAN_BASELINE, 20));
		texto.setBackground(Color.black);
		add(texto);

		R1 = new JTextField();
		R1.setBounds(250, 140, 30, 20);
		add(R1);

		LR1 = new JLabel("R1");
		LR1.setBounds(260, 120, 50, 20);
		LR1.setForeground(Color.BLACK);
		add(LR1);

		R2 = new JTextField();
		R2.setBounds(440, 100, 30, 20);
		add(R2);

		LR2 = new JLabel("R2");
		LR2.setBounds(450, 80, 50, 20);
		LR2.setForeground(Color.BLACK);
		add(LR2);

		R3 = new JTextField();
		R3.setBounds(530, 100, 30, 20);
		add(R3);

		LR3 = new JLabel("R3");
		LR3.setBounds(540, 80, 50, 20);
		LR3.setForeground(Color.BLACK);
		add(LR3);

		R4 = new JTextField();
		R4.setBounds(490, 180, 30, 20);
		add(R4);

		LR4 = new JLabel("R4");
		LR4.setBounds(500, 160, 50, 20);
		LR4.setForeground(Color.BLACK);
		add(LR4);

		R5 = new JTextField();
		R5.setBounds(250, 300, 30, 20);
		add(R5);

		LR5 = new JLabel("R5");
		LR5.setBounds(260, 280, 50, 20);
		LR5.setForeground(Color.BLACK);
		add(LR5);

		R6 = new JTextField();
		R6.setBounds(250, 380, 30, 20);
		add(R6);

		LR6 = new JLabel("R6");
		LR6.setBounds(260, 360, 50, 20);
		LR6.setForeground(Color.BLACK);
		add(LR6);

		R7 = new JTextField();
		R7.setBounds(600, 340, 30, 20);
		add(R7);

		LR7 = new JLabel("R7");
		LR7.setBounds(610, 320, 50, 20);
		LR7.setForeground(Color.BLACK);
		add(LR7);

		V1 = new JTextField();
		V1.setBounds(500, 340, 30, 20);
		add(V1);

		LV1 = new JLabel("V");
		LV1.setBounds(480, 340, 50, 20);
		LV1.setForeground(Color.BLACK);
		add(LV1);


		Calcular = new JButton("CALCULAR");
		Calcular.setBounds(550, 430, 100, 30);
		Calcular.setForeground(Color.BLACK);
		Calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				evento_Calcular();

			}
		});
		add(Calcular);

		atras = new JButton("ATRAS");
		atras.setBounds(690, 430, 100, 30);
		atras.setForeground(Color.BLACK);
		atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				evento_atras();
			}
		});
		add(atras);
		
		Solo_Numeros(R1);
		Solo_Numeros(R2);
		Solo_Numeros(R3);
		Solo_Numeros(R4);
		Solo_Numeros(R5);
		Solo_Numeros(R6);
		Solo_Numeros(R7);
		Solo_Numeros(V1);

		JPanel_Cir2 c = new JPanel_Cir2();
		add(c);

	}

	protected void evento_atras() {
		setVisible(false);
		dispose();
		o.setVisible(true);
	}

	protected void evento_Calcular() {
		if (R1.getText().isEmpty() || R2.getText().isEmpty() || R3.getText().isEmpty() || R4.getText().isEmpty()
				|| R5.getText().isEmpty() || R6.getText().isEmpty() || R7.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null,"Error llenar los campos de texto", null, JOptionPane.ERROR_MESSAGE);
		} else {
			
			R1_1 = Integer.parseInt(R1.getText());
			R2_2 = Integer.parseInt(R2.getText());
			R3_3 = Integer.parseInt(R3.getText());
			R4_4 = Integer.parseInt(R4.getText());
			R5_5 = Integer.parseInt(R5.getText());
			R6_6 = Integer.parseInt(R6.getText());
			R7_7 = Integer.parseInt(R7.getText());
			V1_1 = Integer.parseInt(V1.getText());
			
			setVisible(false);
			Calculo_JFrame_Cir2 s = new Calculo_JFrame_Cir2(f, o, this);
			s.setSize(800 ,450);
			s.setLocationRelativeTo(null);
			s.setDefaultCloseOperation(EXIT_ON_CLOSE);
			s.setLayout(null);
			s.getContentPane().setBackground(new Color(141, 184, 249));
			s.setVisible(true);
		
		}
	}
	
	private void Solo_Numeros(JTextField a) { //resive como parametro  una caja de texto jtexfiel
		a.addKeyListener(new KeyListener() { //parametro
		
			public void keyTyped(KeyEvent e) {//keyEvent es cada vez que se teclea y c guarda lo que se esta tecliando
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {//si la variable c es una letra no lo admite
					getToolkit().beep();
					e.consume(); //que no lo realice 
				}
				
			}
			
			public void keyReleased(KeyEvent e) {
				
				
			}
			
			
			public void keyPressed(KeyEvent e) {
				
			}
		});
		
	}
}
