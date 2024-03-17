package FISICA;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FISICA_2 extends JFrame {

	JLabel nombre,semestre;
	JButton Boton1, Boton2, Boton4;
	
	Fondo fondo = new Fondo();
	
	public FISICA_2() {

		super("PROYECTO");
		
		this.setContentPane(fondo);
		
		setSize(700,400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setLayout(null);
		setAlwaysOnTop(true);
		Texto();
		
		setVisible(true);

	}

	public void Texto() {

		nombre = new JLabel("SANTIAGO ARROYAVE HERNANDEZ");
		nombre.setBounds(410, 300, 500, 40);
		nombre.setForeground(Color.white);
		nombre.setFont(new Font("tahoma", Font.BOLD | Font.ROMAN_BASELINE, 13));
		
		semestre = new JLabel("PROYECTO FINAL SEGUNDO SEMESTRE");
		semestre.setBounds(140, 20, 500, 40);
		semestre.setFont(new Font("tahoma", Font.BOLD | Font.ROMAN_BASELINE, 20));
		semestre.setForeground(Color.white);

		JLabel Titulo2 = new JLabel("CIRCUITOS ELECTRICOS");
		Titulo2.setBounds(410, 60, 500, 50);
		Titulo2.setBackground(new Color(51, 130, 251));
		Titulo2.setForeground(Color.white);
		Titulo2.setFont(new Font("tahoma", Font.BOLD | Font.ROMAN_BASELINE, 18));

		
		add(nombre);
		add(semestre);
		add(Titulo2);
		botones();

	}

	public void botones() {
		Boton1 = new JButton("RESISTENCIA & CAPACITORES");
		Boton2 = new JButton("RESISTENCIA MIXTO");
		Boton4 = new JButton("SALIR");
		Boton1.setForeground(Color.black);
		Boton2.setForeground(Color.black);
		Boton4.setForeground(Color.black);
		Boton1.setBounds(420, 140, 210, 20);
		Boton2.setBounds(440, 180, 160, 20);
		Boton4.setBounds(480, 220, 80, 20);

		Boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				evento_Boton1();
			}
		});

		Boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				evento_Boton2();
			}
		});

		Boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				evento_Boton4();
			}
		});


		add(Boton1);
		add(Boton2);
		add(Boton4);

	}

	protected void evento_Boton4() {
		int res = JOptionPane.showConfirmDialog(this, "Desea realmente salir de la aplicaci�n?", "Confirmaci�n",
				JOptionPane.YES_NO_OPTION);
		if (res == JOptionPane.YES_OPTION)
			System.exit(0);

	}

	protected void evento_Boton2() {
		// MIXTO R
		setVisible(false);
		OPCION_MIXTO o = new OPCION_MIXTO(this);
		this.setContentPane(fondo);
		o.setSize(960,700);
		o.setLocationRelativeTo(null);
		o.setDefaultCloseOperation(EXIT_ON_CLOSE);
		o.setLayout(null);
		o.getContentPane().setBackground(new Color(141, 184, 249));
		o.setVisible(true);
	}

	protected void evento_Boton1() {
		// RESISTENCIA & CAPACITORES
		setVisible(false);
		Capacitor_Y_Resistencia s = new  Capacitor_Y_Resistencia(this);
		s.setSize(960,540);
		s.setLocationRelativeTo(null);
		s.setDefaultCloseOperation(EXIT_ON_CLOSE);
		s.setLayout(null);
		s.getContentPane().setBackground(new Color(141, 184, 249));
		s.setVisible(true);
	}

	public static void main(String[] args) {
		

		FISICA_2 f = new FISICA_2();

	}
}
