package FISICA;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.event.AncestorListener;

//import com.sun.webkit.ContextMenu.ShowContext;

public class OPCION_MIXTO extends JFrame implements ActionListener{
	
	FONDO_MIXTO  o = new  FONDO_MIXTO();
	
	JLabel cir1, cir2 , cir3 , cir4,texto;
	FISICA_2 f;
	JRadioButton OP1,OP2,OP3,OP4;
	JLabel OP_1,OP_2,OP_3,OP_4;
	JButton Confirmar,atras;
	
	ImageIcon imgOriginal = new ImageIcon(getClass().getResource("cir1.jpeg"));
	ImageIcon imgEscala = new ImageIcon(imgOriginal.getImage().getScaledInstance(340,180, Image.SCALE_DEFAULT));
	
	ImageIcon imgOriginal1 = new ImageIcon(getClass().getResource("cir2.jpeg"));
	ImageIcon imgEscala1 = new ImageIcon(imgOriginal1.getImage().getScaledInstance(340,180, Image.SCALE_DEFAULT));
	
	ImageIcon imgOriginal2 = new ImageIcon(getClass().getResource("cir3.jpeg"));
	ImageIcon imgEscala2 = new ImageIcon(imgOriginal2.getImage().getScaledInstance(360,180, Image.SCALE_DEFAULT));
	
	ImageIcon imgOriginal3 = new ImageIcon(getClass().getResource("cir4.jpeg"));
	ImageIcon imgEscala3 = new ImageIcon(imgOriginal3.getImage().getScaledInstance(360,180, Image.SCALE_DEFAULT));
	
	public OPCION_MIXTO(FISICA_2 f) {
		super();
		this.f=f;
		this.setContentPane(o);
		
		OP1 = new JRadioButton("", false);
		OP1.setBounds(70, 70, 20, 20);
		OP1.setBackground(null);
		add(OP1);
		
		OP_1 = new JLabel("1");
		OP_1.setBounds(50,70,20,20);
		OP_1.setForeground(Color.white);
		add(OP_1);
		
		OP2 = new JRadioButton("", false);
		OP2.setBounds(70, 320, 20, 20);
		OP2.setBackground(null);
		add(OP2);
		
		OP_2 = new JLabel("2");
		OP_2.setBounds(50,320,20,20);
		OP_2.setForeground(Color.white);
		add(OP_2);
		
		OP3 = new JRadioButton("", false);
		OP3.setBounds(500, 70, 20, 20);
		OP3.setBackground(null);
		add(OP3);
		
		OP_3 = new JLabel("3");
		OP_3.setBounds(480,70,20,20);
		OP_3.setForeground(Color.white);
		add(OP_3);
		
		OP4 = new JRadioButton("", false);
		OP4.setBounds(500, 320, 20, 20);
		OP4.setBackground(null);
		add(OP4);
		
		OP_4 = new JLabel("4");
		OP_4.setBounds(480,320,20,20);
		OP_4.setForeground(Color.white);
		add(OP_4);	

		ButtonGroup grupoRadioBotones = new ButtonGroup();
		grupoRadioBotones.add(OP1);
		grupoRadioBotones.add(OP2);
		grupoRadioBotones.add(OP3);
		grupoRadioBotones.add(OP4);
		
		texto =  new JLabel("Seleccione el circuito que desea desarrollar:");
		texto.setBounds(20,25, 1000, 20);
		texto.setForeground(Color.WHITE);
		texto.setFont((new Font("tahoma", Font.BOLD | Font.ROMAN_BASELINE, 20)));
		add(texto);
																	
		cir1  = new JLabel(imgEscala); 
		cir1.setOpaque(true);
		cir1.setBounds(75,110,340,180);
		add(cir1);
		
		cir2  = new JLabel(imgEscala1); 
		cir2.setOpaque(true);
		cir2.setBounds(75,360,340,180);
		add(cir2);
		
		cir3  = new JLabel(imgEscala2); 
		cir3.setOpaque(true);
		cir3.setBounds(500,110,360,180);
		add(cir3);
		
		cir4 = new JLabel(imgEscala3); 
		cir4.setOpaque(true);
		cir4.setBounds(500,360,360,180);
		add(cir4);
		
		Confirmar =  new JButton("CONFIRMAR");
		Confirmar.setBounds(680, 570, 120, 30);
		Confirmar.addActionListener(this);
		add(Confirmar);
		
		
		atras =  new JButton("ATRAS");
		atras.setBounds(830, 570, 80, 30);
		atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				evento_atras();
			}	
		});
		add(atras);
	}
	
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == Confirmar) {
			valideRadios();
		}
	}

	protected void evento_atras() {
		setVisible(false);
		dispose();
		f.setVisible(true);
		
	}
	
	public void valideRadios() {
		
		String Cad = " ";
		if(OP1.isSelected()) {
			Cad+="opcion 1";
			
			setVisible(false);
			Frame_Cir1  m = new  Frame_Cir1 (f,this);
			m.setResizable(false);
			m.setSize(850,520);
			m.setLocationRelativeTo(null);
			m.setDefaultCloseOperation(EXIT_ON_CLOSE);
			m.setLayout(null);
			m.getContentPane().setBackground(new Color(141,184,249));
			m.setVisible(true);
		
		}
			
					
		if(OP2.isSelected()) {
			Cad+="Opcion 2";
			
			setVisible(false);
			JFrame_Cir2  m = new  JFrame_Cir2 (f,this);
			m.setResizable(false);
			m.setSize(850,520);
			m.setLocationRelativeTo(null);
			m.setDefaultCloseOperation(EXIT_ON_CLOSE);
			m.setLayout(null);
			m.getContentPane().setBackground(new Color(141,184,249));
			m.setVisible(true);
		}
		if(OP3.isSelected()) {
			Cad+="Opcion 3";
			
			setVisible(false);
			JFrame_Cir3  m = new JFrame_Cir3 (f,this);
			m.setResizable(false);
			m.setSize(850,520);
			m.setLocationRelativeTo(null);
			m.setDefaultCloseOperation(EXIT_ON_CLOSE);
			m.setLayout(null);
			m.getContentPane().setBackground(new Color(141,184,249));
			m.setVisible(true);
		}
		if(OP4.isSelected()) {
			Cad+="Opcion 4";
			
			setVisible(false);
			JFrame_Cir4_R  m = new  JFrame_Cir4_R (f,this);
			m.setResizable(false);
			m.setSize(850,520);
			m.setLocationRelativeTo(null);
			m.setDefaultCloseOperation(EXIT_ON_CLOSE);
			m.setLayout(null);
			m.getContentPane().setBackground(new Color(141,184,249));
			m.setVisible(true);
		}	
	}	
}
