package FISICA;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

//import jdk.nashorn.internal.scripts.JO;
import java.text.DecimalFormat;;

public class Capacitor_Y_Resistencia extends JFrame implements ActionListener {

	Fondo_cap_res p = new Fondo_cap_res();
	Vector<Double> Base_Datos_Resistencias = new Vector<Double>();
	Vector<Double> Base_Datos_Capacitores = new Vector<Double>();
	Vector<Double> Base_Carga_Capacitores = new Vector<Double>();

	Vector<Double> base_carga = new Vector<Double>();
	Vector<Double> base_corriente = new Vector<Double>();
	Vector<Double> base_voltaje = new Vector<Double>();

	Vector<Double> Carga_asignada = new Vector<Double>();
	Vector<Double> R_voltaje_asignado = new Vector<Double>();
	Vector<Double> C_voltaje_asignado = new Vector<Double>();

	Vector<Double> POS = new Vector<Double>(); // POSICIONES EN LOS QUE SE ASIGNO LA CARGA O VOLTAJE CERO
	Vector<Double> VALOR_POS = new Vector<Double>(); // VALOR POS CORRESPONDE AL VALOR DEL CAPACIRO QUE SE ENCUNTRA EN
														// LA POSICION POS
	Vector<Double> Recorrido_Valor_pos = new Vector<Double>();
	Vector<Double> Recorrido_carga_pos = new Vector<Double>();

	Vector<Double> Recorrido_corriente_pos = new Vector<Double>();
	Vector<Double> Corriente_asignada = new Vector<Double>();

	Vector<Double> Voltaje_asignado = new Vector<Double>();
	Vector<Double> Recorrido_volta_pos = new Vector<Double>();
	
	Vector<Double> VALOR_POS_PAREL = new Vector<Double>();
	Vector<Double> VALOR_POS_CAP_SERIE = new Vector<Double>();

	//////////////////////////////////////////////////////////////////////////////////////
	DecimalFormat df = new DecimalFormat();
	//////////////////////////////////////////////////////////////////////////////////////
	int Vol_C = 0, Vol_R = 0, Corrient_e = 0, carg_a, Resistenci_a = 0, Capacito_r = 0;
	int pos = 0;

	///////////////////////////////// CAPACITORES ////////////////////////////////
	double ACUMULADOR_CARGA_TOTAL = 0;
	double ACUMULADOR_CAPACITANCIA_TOTAL = 0;
	double VOLTAJE_TOTAL = 0;
	double VOLTAJE_TOTAL2 = 0;
	double suma_voltajes_C_serie = 0;
	double suma_voltajes_C_Paralelo = 0;
	double carga_dada = 0;

	double Carga_asig = 0;
	double Carga_asig2 = 0;
	double suma_cargas = 0;
	double voltaje_dado = 0;

	////////////////////////////////// RESISTENCIA //////////////////////////////
	double RESISTENCIA_TOTAL = 0;
	double CORRIENTE_TOTAL = 0;
	double ACUM_VOLTAJES = 0;
	double suma_corrientes = 0;
	double Corriente_asig2 = 0;
	double Corriente_asig = 0;
	double corriente_dada = 0;
	double Voltaje_asig = 0;
	double Voltaje_asig2 = 0;
	double suma_vol = 0;

	////////////////////////////////////////////////////////////////////////////////////////////////

	FISICA_2 f;
	JRadioButton CAP, RES;
	JButton guardar, R_Paralelo, R_Serie, C_Paralelo, C_Serie, volver, TC_Serie, TC_Paralelo, TR_Serie, TR_Paralelo;
	JLabel carga, Voltaje_C, resistencia, Corrinte, capacitores, titulo, cap, res, Voltaje_R;
	JComboBox<Integer> Carga, Corriente, VOLTAJE_C, R_C, VOLTAJE_R, RESISTENCIA, CAPACITOR;
	JComboBox<String> CAPACITORES, RESISTENCIAS;

	public Capacitor_Y_Resistencia(FISICA_2 f) {
		super();

		this.f = f;

		this.setContentPane(p);

		titulo = new JLabel("CAPACITORES Y RESISTENCIAS");
		titulo.setBounds(314, 35, 400, 30);
		titulo.setForeground(Color.WHITE);
		titulo.setFont(new Font("tahoma", Font.BOLD | Font.ROMAN_BASELINE, 20));
		add(titulo);

		/////////////////////////////////////////////////////////////////////////////
		// CAPACITOR

		CAPACITORES = new JComboBox<String>();
		CAPACITORES.addItem("CAPACITORES");
		CAPACITORES.addItem("CON VOLTAJE SIN CARGA");
		CAPACITORES.addItem("CON CARGA SIN VOLTAJE");
		CAPACITORES.addItem("CON CARGA CON VOLTAJE");
		CAPACITORES.setBounds(740, 90, 160, 20);
		CAPACITORES.setForeground(Color.WHITE);
		CAPACITORES.setBackground(Color.black);
		CAPACITORES.addActionListener(this);
		add(CAPACITORES);

		///////////////////////////////////////////////////////////////////////////

		Voltaje_C = new JLabel("C VOLTAJE");
		Voltaje_C.setBounds(490, 170, 100, 30);
		Voltaje_C.setForeground(Color.WHITE);
		Voltaje_C.setVisible(false);
		Voltaje_C.setFont(new Font("tahoma", Font.BOLD | Font.ROMAN_BASELINE, 13));
		add(Voltaje_C);

		VOLTAJE_C = new JComboBox<Integer>();
		for (int i = 0; i <= 1000; i++) {
			VOLTAJE_C.addItem(i);
		}
		VOLTAJE_C.setBounds(640, 175, 50, 20);
		VOLTAJE_C.setForeground(Color.black);
		VOLTAJE_C.setVisible(false);
		add(VOLTAJE_C);

		/////////////////////////////////////////////////////////////////////////////

		carga = new JLabel("CARGA:");
		carga.setBounds(490, 220, 100, 30);
		carga.setForeground(Color.WHITE);
		carga.setVisible(false);
		carga.setFont(new Font("tahoma", Font.BOLD | Font.ROMAN_BASELINE, 13));
		add(carga);

		Carga = new JComboBox<Integer>();
		for (int i = 0; i <= 1000; i++) {
			Carga.addItem(i);
		}
		Carga.setBounds(640, 225, 50, 20);
		Carga.setForeground(Color.black);
		Carga.setVisible(false);
		add(Carga);

		//////////////////////////////////////////////////////////////////////////////////

		capacitores = new JLabel("CAPACITOR:");
		capacitores.setBounds(490, 270, 100, 30);
		capacitores.setForeground(Color.WHITE);
		capacitores.setVisible(false);
		capacitores.setFont(new Font("tahoma", Font.BOLD | Font.ROMAN_BASELINE, 13));
		add(capacitores);

		CAPACITOR = new JComboBox<Integer>();
		for (int i = 1; i <= 1000; i++) {
			CAPACITOR.addItem(i);
		}

		CAPACITOR.setBounds(640, 275, 50, 20);
		CAPACITOR.setForeground(Color.black);
		CAPACITOR.setVisible(false);
		add(CAPACITOR);

		//////////////////////////////////////////////////////////////////////////////////////////

		// RESISTENCIAS

		RESISTENCIAS = new JComboBox<String>();
		RESISTENCIAS.addItem("RESISTENCIAS");
		RESISTENCIAS.addItem("CON VOLTAJE SIN CORRIENTE");
		RESISTENCIAS.addItem("CON CORRIENTE SIN VOLTAJE");
		RESISTENCIAS.addItem("CON CORRIENTE CON VOLTAJE");
		RESISTENCIAS.setBounds(40, 90, 190, 20);
		RESISTENCIAS.setForeground(Color.WHITE);
		RESISTENCIAS.setBackground(Color.black);
		RESISTENCIAS.addActionListener(this);
		add(RESISTENCIAS);

		//////////////////////////////////////////////////////////////////////////////////////////

		Voltaje_R = new JLabel("R VOLTAJE");
		Voltaje_R.setBounds(40, 170, 100, 30);
		Voltaje_R.setForeground(Color.WHITE);
		Voltaje_R.setVisible(false);
		Voltaje_R.setFont(new Font("tahoma", Font.BOLD | Font.ROMAN_BASELINE, 13));
		add(Voltaje_R);

		VOLTAJE_R = new JComboBox<Integer>();
		for (int i = 0; i < 1000; i++) {
			VOLTAJE_R.addItem(i);
		}
		VOLTAJE_R.setBounds(200, 175, 50, 20);
		VOLTAJE_R.setForeground(Color.black);
		VOLTAJE_R.setVisible(false);
		add(VOLTAJE_R);

		///////////////////////////////////////////////////////////////////////////////////////////

		Corrinte = new JLabel("CORRIENTE:");
		Corrinte.setBounds(40, 220, 100, 30);
		Corrinte.setForeground(Color.WHITE);
		Corrinte.setVisible(false);
		Corrinte.setFont(new Font("tahoma", Font.BOLD | Font.ROMAN_BASELINE, 13));
		add(Corrinte);

		// COMBOBOX
		Corriente = new JComboBox<Integer>();
		for (int i = 0; i < 1000; i++) {
			Corriente.addItem(i);
		}
		Corriente.setBounds(200, 225, 50, 20);
		Corriente.setForeground(Color.black);
		Corriente.setVisible(false);
		add(Corriente);

		/////////////////////////////////////////////////////////////////////////////////////////////

		resistencia = new JLabel("RESISTENCIA:");
		resistencia.setBounds(40, 270, 100, 30);
		resistencia.setForeground(Color.WHITE);
		resistencia.setVisible(false);
		resistencia.setFont(new Font("tahoma", Font.BOLD | Font.ROMAN_BASELINE, 13));
		add(resistencia);

		RESISTENCIA = new JComboBox<Integer>();
		for (int i = 1; i <= 1000; i++) {
			RESISTENCIA.addItem(i);
		}

		RESISTENCIA.setBounds(200, 275, 50, 20);
		RESISTENCIA.setForeground(Color.black);
		RESISTENCIA.setVisible(false);
		add(RESISTENCIA);

		/////////////////////////////////////////////////////////////////////////////////////////////

		// BOTONES

		R_Paralelo = new JButton("R_PARALELO");
		R_Paralelo.setBounds(40, 370, 120, 30);
		R_Paralelo.setForeground(Color.black);
		R_Paralelo.setEnabled(false);
		R_Paralelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				evento_R_Paralelo();
			}
		});
		add(R_Paralelo);

		R_Serie = new JButton("R_SERIE");
		R_Serie.setBounds(40, 430, 120, 30);
		R_Serie.setForeground(Color.black);
		R_Serie.setEnabled(false);
		R_Serie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				evento_R_Serie();
			}
		});
		add(R_Serie);

		C_Paralelo = new JButton("C_PARALELO");
		C_Paralelo.setBounds(600, 370, 120, 30);
		C_Paralelo.setForeground(Color.black);
		C_Paralelo.setEnabled(false);
		C_Paralelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				evento_C_Paralelo();
			}
		});
		add(C_Paralelo);

		C_Serie = new JButton("C_SERIE");
		C_Serie.setBounds(600, 430, 120, 30);
		C_Serie.setForeground(Color.black);
		C_Serie.setEnabled(false);
		C_Serie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				evento_C_Serie();
			}
		});
		add(C_Serie);

		guardar = new JButton("GUARDAR");
		guardar.setBounds(410, 390, 120, 30);
		guardar.setForeground(Color.black);
		guardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				evento_guardar();
			}
		});
		add(guardar);

		volver = new JButton("VOLVER");
		volver.setBounds(20, 5, 100, 20);
		volver.setForeground(Color.black);
		volver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				evento_volver();
			}
		});
		add(volver);

		TC_Serie = new JButton("TABLA SERIE");
		TC_Serie.setBounds(760, 430, 140, 30);
		TC_Serie.setForeground(Color.black);
		TC_Serie.setEnabled(false);
		TC_Serie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				evento_TC_Serie();
			}
		});
		add(TC_Serie);

		TC_Paralelo = new JButton("TABLA PARALELO");
		TC_Paralelo.setBounds(760, 370, 140, 30);
		TC_Paralelo.setForeground(Color.black);
		TC_Paralelo.setEnabled(false);
		TC_Paralelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				evento_TC_Paralelo();
			}
		});
		add(TC_Paralelo);

		TR_Serie = new JButton("TABLA SERIE");
		TR_Serie.setBounds(200, 430, 140, 30);
		TR_Serie.setForeground(Color.black);
		TR_Serie.setEnabled(false);
		TR_Serie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				evento_TR_Serie();
			}
		});
		add(TR_Serie);

		TR_Paralelo = new JButton("TABLA PARALELO");
		TR_Paralelo.setBounds(200, 370, 140, 30);
		TR_Paralelo.setForeground(Color.black);
		TR_Paralelo.setEnabled(false);
		TR_Paralelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				evento_TR_Paralelo();
			}
		});
		add(TR_Paralelo);

		ButtonGroup grupoRadioBotones = new ButtonGroup();
		grupoRadioBotones.add(CAP);
		grupoRadioBotones.add(RES);

		Panel_SE_PA P = new Panel_SE_PA();
		add(P);

	}

	protected void evento_con_carga_con_vol() {
		// TODO Esbozo de m�todo generado autom�ticamente

	}

	protected void evento_con_carga_sin_vol() {
		// TODO Esbozo de m�todo generado autom�ticamente

	}

	protected void evento_con_vol_sin_carga() {
		// TODO Esbozo de m�todo generado autom�ticamente

	}

	protected void evento_TR_Paralelo() {

		setVisible(false);
		TABLA_R_PARALELO T = new TABLA_R_PARALELO(this);
		T.setSize(1250, 400);
		T.getContentPane().setBackground(Color.black);
		T.setLocationRelativeTo(T);
		T.setVisible(true);
	}

	protected void evento_TR_Serie() {
		setVisible(false);
		TABLA_R_SERIE T = new TABLA_R_SERIE(this);
		T.setSize(1250, 400);
		T.getContentPane().setBackground(Color.black);
		T.setLocationRelativeTo(T);
		T.setVisible(true);

	}

	protected void evento_TC_Paralelo() {
		setVisible(false);
		TABLA_CAP_PARALELO Tabla = new TABLA_CAP_PARALELO(this);
		Tabla.setSize(1250, 400);
		Tabla.getContentPane().setBackground(Color.black);
		Tabla.setLocationRelativeTo(Tabla);
		Tabla.setVisible(true);

	}

	protected void evento_TC_Serie() {
		setVisible(false);
		TABLA_CAP_SERIE Ta = new TABLA_CAP_SERIE(this);
		Ta.setSize(1250, 400);
		Ta.getContentPane().setBackground(Color.black);
		Ta.setLocationRelativeTo(Ta);
		Ta.setVisible(true);

	}

	protected void evento_volver() {
		setVisible(false);
		dispose();
		f.setVisible(true);

	}

	protected void evento_C_Serie() {

		if (VOLTAJE_C.getSelectedIndex() != 0 && Carga.getSelectedIndex() == 0) {
			// CAPACITOR EN SERIE CON VOLTAJE SIN CARGA
			double tem = 0;
			for (int i = 0; i < Base_Datos_Capacitores.size(); i++) {
				tem += Math.pow(Base_Datos_Capacitores.get(i), -1); // sumo los capacitores acumulados
				ACUMULADOR_CAPACITANCIA_TOTAL = Math.pow(tem, -1);
			}

			ACUMULADOR_CARGA_TOTAL = ACUMULADOR_CAPACITANCIA_TOTAL * Vol_C;

			for (int i = 0; i < Base_Datos_Capacitores.size(); i++) {
				base_voltaje.add(ACUMULADOR_CARGA_TOTAL / Base_Datos_Capacitores.get(i));
			}

			TC_Serie.setEnabled(true);
			JOptionPane.showMessageDialog(null, "CALCULO EXITOSO");

		}

		if (Carga.getSelectedIndex() != 0 && VOLTAJE_C.getSelectedIndex() == 0) {
			// CAPACITOR EN SERIE CON CARGA SIN VOLTAJE
			double tem_1 = 0;
			for (int i = 0; i < Base_Datos_Capacitores.size(); i++) {
				tem_1 += Math.pow(Base_Datos_Capacitores.get(i), -1); // sumo los capacitores acumulados
				ACUMULADOR_CAPACITANCIA_TOTAL = Math.pow(tem_1, -1);
			}

			for (int K = 0; K < Base_Datos_Capacitores.size(); K++) {
				base_voltaje.add(carg_a / Base_Datos_Capacitores.get(K));
			}

			for (int v = 0; v < base_voltaje.size(); v++) {
				VOLTAJE_TOTAL += base_voltaje.get(v);
			}

			TC_Serie.setEnabled(true);
			JOptionPane.showMessageDialog(null, "CALCULO EXITOSO");

		}

		// CAPACITOR EN SERIE CON VOLTAJE Y CON CARGA
		if (Carga.getSelectedIndex() == 0 && VOLTAJE_C.getSelectedIndex() == 0) {

			for (int j = 1; j <= Base_Datos_Capacitores.size(); j++) {
				System.out.println("Capacitor N� " + j + " es  = " + df.format(Base_Datos_Capacitores.get(j - 1)));
			}

			String Car = JOptionPane.showInputDialog("Igrese la carga Total");
			carga_dada = Integer.parseInt(Car);

			System.out.println("carga asiganada" + carga_dada);

			for (int i = 0; i < Base_Datos_Capacitores.size(); i++) {
				String vol = JOptionPane.showInputDialog("Ingrese el voltaje de Capacitor N� " + (i + 1));
				double Vol = Integer.parseInt(vol);
				C_voltaje_asignado.add(Vol);
			}

			System.out.println(" voltajes asignados = " + C_voltaje_asignado);

			double Tem = 0;
			for (int i = 0; i < Base_Datos_Capacitores.size(); i++) {
				Tem += Math.pow(Base_Datos_Capacitores.get(i), -1); // sumo los capacitores acumulados
				ACUMULADOR_CAPACITANCIA_TOTAL = Math.pow(Tem, -1);
			}

			for (double i = 0; i < C_voltaje_asignado.size(); i++) {
				if (C_voltaje_asignado.get((int) i) != 0) {
					VOLTAJE_TOTAL += C_voltaje_asignado.get((int) i);
				}
			}
			System.out.println("VOLTAJE = " + df.format(VOLTAJE_TOTAL));

			for (double j = 0; j < C_voltaje_asignado.size(); j++) {
				if (0 == C_voltaje_asignado.get((int) j)) {
					POS.add(j);

				}
				
			}

			System.out.println("POSICIONES DE LOS CEROS " + POS);

			for (int i = 0; i < POS.size(); i++) {
				for (int j = 0; j < Base_Datos_Capacitores.size(); j++) {
					if (POS.get(i) == j) {
						VALOR_POS.add(Base_Datos_Capacitores.get(j));
					}
				}
			}
			System.out.println("capacitores con voltaje cero = " + VALOR_POS);

			for (int i = 0; i < VALOR_POS.size(); i++) {
				Recorrido_Valor_pos.add(carga_dada / VALOR_POS.get(i));
			}

			for (int i = 0; i < Recorrido_Valor_pos.size(); i++) {
				VOLTAJE_TOTAL2 += Recorrido_Valor_pos.get(i);
			}

			suma_voltajes_C_serie = VOLTAJE_TOTAL + VOLTAJE_TOTAL2;
			System.out.println("VOLTAJE TOTAL ES = " + df.format(suma_voltajes_C_serie));
			System.out.println("RECORRIDO" + Recorrido_Valor_pos);
		}

		TC_Serie.setEnabled(true);
		JOptionPane.showMessageDialog(null, "CALCULO EXITOSO");
	}

	protected void evento_C_Paralelo() {
		// CAPACITOR PARALELO CON VOLTAJE SIN CARGA
		if (VOLTAJE_C.getSelectedIndex() != 0 && Carga.getSelectedIndex() == 0) {

			for (int j = 0; j < Base_Datos_Capacitores.size(); j++) {
				Base_Carga_Capacitores.add(Base_Datos_Capacitores.get(j) * Vol_C);
			}

			for (int i = 0; i < Base_Carga_Capacitores.size(); i++) {
				ACUMULADOR_CARGA_TOTAL += Base_Carga_Capacitores.get(i);
			} // sumo las cargas acumuladas

			for (int i = 0; i < Base_Datos_Capacitores.size(); i++) {
				ACUMULADOR_CAPACITANCIA_TOTAL += Base_Datos_Capacitores.get(i);
			} // sumo los capacitores acumulados

			TC_Paralelo.setEnabled(true);
			JOptionPane.showMessageDialog(null, "CALCULO EXITOSO");
		}

		// PARALELO CON CARGA SIN VOLTAJE
		if (Carga.getSelectedIndex() != 0 && VOLTAJE_C.getSelectedIndex() == 0) {

			for (int i = 0; i < Base_Datos_Capacitores.size(); i++) {
				ACUMULADOR_CAPACITANCIA_TOTAL += Base_Datos_Capacitores.get(i); // sumo los capacitores acumulados
			}

			VOLTAJE_TOTAL = carg_a / ACUMULADOR_CAPACITANCIA_TOTAL;

			for (int j = 0; j < Base_Datos_Capacitores.size(); j++) {
				base_carga.add(Base_Datos_Capacitores.get(j) * VOLTAJE_TOTAL);
			}

			TC_Paralelo.setEnabled(true);
			JOptionPane.showMessageDialog(null, "CALCULO EXITOSO");

		}

		// PARALELO CON VOLTAJE Y CON CARGA

		if (Carga.getSelectedIndex() == 0 && VOLTAJE_C.getSelectedIndex() == 0) {

			for (int j = 1; j <= Base_Datos_Capacitores.size(); j++) {
				System.out.println("Capacitor N� " + j + " es  = " + df.format(Base_Datos_Capacitores.get(j - 1)));
			}

			String Car = JOptionPane.showInputDialog("Igrese el voltaje  Total");
			voltaje_dado = Integer.parseInt(Car);

			System.out.println("voltaje asiganado = " + voltaje_dado);

			for (int i = 0; i < Base_Datos_Capacitores.size(); i++) {
				String car = JOptionPane.showInputDialog("Ingrese la carga de Capacitor N� " + (i + 1));
				double Carg = Integer.parseInt(car);
				Carga_asignada.add(Carg);
			}

			System.out.println("carga  asignados = " + Carga_asignada);

			for (int i = 0; i < Base_Datos_Capacitores.size(); i++) {
				ACUMULADOR_CAPACITANCIA_TOTAL += Base_Datos_Capacitores.get(i);
			}

			for (double i = 0; i < Carga_asignada.size(); i++) {
				if (Carga_asignada.get((int) i) != 0) {
					Carga_asig += Carga_asignada.get((int) i);
				}
			}
			System.out.println("CARGA = " + df.format(Carga_asig));

			for (double j = 0; j < Carga_asignada.size(); j++) {
				if (0 == Carga_asignada.get((int) j)) {
					POS.add(j);

				}
			}

			System.out.println("POSICIONES DE LOS CEROS " + POS);

			for (int i = 0; i < POS.size(); i++) {
				for (int j = 0; j < Base_Datos_Capacitores.size(); j++) {
					if (POS.get(i) == j) {
						VALOR_POS_CAP_SERIE.add(Base_Datos_Capacitores.get(j));
					}
				}
			}
			System.out.println("capacitores con carga  cero = " + VALOR_POS);

			for (int i = 0; i < VALOR_POS_CAP_SERIE.size(); i++) {
				Recorrido_carga_pos.add(voltaje_dado * VALOR_POS_CAP_SERIE.get(i));
			}

			for (int i = 0; i < Recorrido_carga_pos.size(); i++) {
				Carga_asig2 += Recorrido_carga_pos.get(i);
			}

			suma_cargas = Carga_asig2 + Carga_asig;
			System.out.println("CARGA TOTAL ES = " + df.format(suma_cargas));
			System.out.println("RECORRIDO" + Recorrido_carga_pos);

		}

		TC_Paralelo.setEnabled(true);
		JOptionPane.showMessageDialog(null, "CALCULO EXITOSO");
	}

	protected void evento_R_Serie() {

		if (VOLTAJE_R.getSelectedIndex() != 0 && Corriente.getSelectedIndex() == 0) {

			// RESISTENCIA EN SERIE CON VOLTAJE SIN CORRIENTE
			for (int i = 0; i < Base_Datos_Resistencias.size(); i++) {
				RESISTENCIA_TOTAL += Base_Datos_Resistencias.get(i);
			}

			CORRIENTE_TOTAL = Vol_R / RESISTENCIA_TOTAL;
			for (int a = 0; a < Base_Datos_Resistencias.size(); a++) {
				base_voltaje.add(CORRIENTE_TOTAL * Base_Datos_Resistencias.get(a));
			}

			for (int z = 0; z < base_voltaje.size(); z++) {
				ACUM_VOLTAJES += base_voltaje.get(z);
			}

			TR_Serie.setEnabled(true);
			JOptionPane.showMessageDialog(null, "CALCULO EXITOSO");
		}

		if (Corriente.getSelectedIndex() != 0 && VOLTAJE_R.getSelectedIndex() == 0) {

			// RESISTENCIA EN SERIE CON CORRIENTE SIN VOLTAJE

			for (int j = 0; j < Base_Datos_Resistencias.size(); j++) {
				RESISTENCIA_TOTAL += Base_Datos_Resistencias.get(j);
			}

			for (int x = 0; x < Base_Datos_Resistencias.size(); x++) {
				base_voltaje.add(Corrient_e * Base_Datos_Resistencias.get(x));
			}

			for (int z = 0; z < base_voltaje.size(); z++) {
				ACUM_VOLTAJES += base_voltaje.get(z);
			}
			TR_Serie.setEnabled(true);
			JOptionPane.showMessageDialog(null, "CALCULO EXITOSO");

		}
		// RESISTENCIA EN SERIE CON VOLTAJE Y CORRIENTE

		if (Corriente.getSelectedIndex() == 0 && VOLTAJE_R.getSelectedIndex() == 0) {

			for (int j = 1; j <= Base_Datos_Resistencias.size(); j++) {
				System.out.println("Resistencia  N� " + j + " es  = " + df.format(Base_Datos_Resistencias.get(j - 1)));
			}

			String Car = JOptionPane.showInputDialog("Igrese la Corriente  Total");
			corriente_dada = Integer.parseInt(Car);

			System.out.println("voltaje asiganado = " + corriente_dada);

			for (int i = 0; i < Base_Datos_Resistencias.size(); i++) {
				String car = JOptionPane.showInputDialog("Ingrese el Voltaje de la resistencia N� " + (i + 1));
				double Carrien = Integer.parseInt(car);
				Voltaje_asignado.add(Carrien);
			}

			System.out.println("Voltaje  asignado = " + Voltaje_asignado);

			for (int i = 0; i < Base_Datos_Resistencias.size(); i++) {
				RESISTENCIA_TOTAL += Base_Datos_Resistencias.get(i);
			}

			for (double i = 0; i < Voltaje_asignado.size(); i++) {
				if (Voltaje_asignado.get((int) i) != 0) {
					Voltaje_asig += Voltaje_asignado.get((int) i);
				}
			}
			System.out.println("VOLTAJE = " + df.format(Voltaje_asig));

			for (double j = 0; j < Voltaje_asignado.size(); j++) {
				if (0 == Voltaje_asignado.get((int) j)) {
					POS.add(j);

				}
			}

			System.out.println("POSICIONES DE LOS CEROS " + POS);

			for (int i = 0; i < POS.size(); i++) {
				for (int j = 0; j < Base_Datos_Resistencias.size(); j++) {
					if (POS.get(i) == j) {
						VALOR_POS.add(Base_Datos_Resistencias.get(j));
					}
				}
			}
			System.out.println("Resistencia con voltaje cero = " + VALOR_POS);

			for (int i = 0; i < VALOR_POS.size(); i++) {
				Recorrido_volta_pos.add(corriente_dada * VALOR_POS.get(i));
			}

			for (int i = 0; i < Recorrido_volta_pos.size(); i++) {
				Voltaje_asig2 += Recorrido_volta_pos.get(i);
			}

			suma_vol = Voltaje_asig + Voltaje_asig2;
			System.out.println("VOLTAJE TOTAL ES = " + df.format(suma_vol));
			System.out.println("RECORRIDO" + Recorrido_volta_pos);

			TR_Serie.setEnabled(true);
			JOptionPane.showMessageDialog(null, "CALCULO EXITOSO");
		}

	}

	protected void evento_R_Paralelo() {

		if (VOLTAJE_R.getSelectedIndex() != 0 && Corriente.getSelectedIndex() == 0) {

			// RESISTENCIA PARALELO CON VOLTAJE SIN CARGA
			double tem3 = 0;
			for (int w = 0; w < Base_Datos_Resistencias.size(); w++) {
				tem3 += Math.pow(Base_Datos_Resistencias.get(w), -1);
				RESISTENCIA_TOTAL = Math.pow(tem3, -1);
			}
			for (int z = 0; z < Base_Datos_Resistencias.size(); z++) {
				base_corriente.add(Vol_R / Base_Datos_Resistencias.get(z));
			}

			for (int n = 0; n < base_corriente.size(); n++) {
				CORRIENTE_TOTAL += base_corriente.get(n);
			}

			TR_Paralelo.setEnabled(true);
			JOptionPane.showMessageDialog(null, "CALCULO EXITOSO");

		}

		if (Corriente.getSelectedIndex() != 0 && VOLTAJE_R.getSelectedIndex() == 0) {

			// RESISTENCIA EN PARALELO CON CORRIENTE SIN VOLTAJE

			double tem4 = 0;

			for (int j = 0; j < Base_Datos_Resistencias.size(); j++) {
				tem4 += Math.pow(Base_Datos_Resistencias.get(j), -1);
				RESISTENCIA_TOTAL = Math.pow(tem4, -1);
			}

			ACUM_VOLTAJES = Corrient_e * RESISTENCIA_TOTAL;
			for (int x = 1; x <= Base_Datos_Resistencias.size(); x++) {

			}

			for (int z = 0; z < Base_Datos_Resistencias.size(); z++) {
				base_corriente.add(ACUM_VOLTAJES / Base_Datos_Resistencias.get(z));
			}

			for (int k = 0; k < base_corriente.size(); k++) {
				CORRIENTE_TOTAL += base_corriente.get(k);
			}

			TR_Paralelo.setEnabled(true);
			JOptionPane.showMessageDialog(null, "CALCULO EXITOSO");
		}

		// RESISTENCIA EN PARALELO CON VOLTAJE Y CORRIENTE

		if (Corriente.getSelectedIndex() == 0 && VOLTAJE_R.getSelectedIndex() == 0) {

			for (int j = 1; j <= Base_Datos_Resistencias.size(); j++) {
				System.out.println("Resistencia  N� " + j + " es  = " + df.format(Base_Datos_Resistencias.get(j - 1)));
			}

			String Car = JOptionPane.showInputDialog("Igrese el voltaje  Total");
			voltaje_dado = Integer.parseInt(Car);

			System.out.println("voltaje asiganado = " + voltaje_dado);

			for (int i = 0; i < Base_Datos_Resistencias.size(); i++) {
				String car = JOptionPane.showInputDialog("Ingrese la corriente de la Resistencia N� " + (i + 1));
				double Carrien = Integer.parseInt(car);
				Corriente_asignada.add(Carrien);
			}

			System.out.println("Corriente  asignada = " + Corriente_asignada);

			double tem3 = 0;
			for (int w = 0; w < Base_Datos_Resistencias.size(); w++) {
				tem3 += Math.pow(Base_Datos_Resistencias.get(w), -1);
				RESISTENCIA_TOTAL = Math.pow(tem3, -1);
			}

			for (double i = 0; i < Corriente_asignada.size(); i++) {
				if (Corriente_asignada.get((int) i) != 0) {
					Corriente_asig += Corriente_asignada.get((int) i);
				}
			}
			System.out.println("CORRIENTE = " + df.format(Corriente_asig));

			for (double j = 0; j < Corriente_asignada.size(); j++) {
				if (0 == Corriente_asignada.get((int) j)) {
					POS.add(j);

				}
			}

			System.out.println("POSICIONES DE LOS CEROS " + POS);

			for (int i = 0; i < POS.size(); i++) {
				for (int j = 0; j < Base_Datos_Resistencias.size(); j++) {
					if (POS.get(i) == j) {
						VALOR_POS_PAREL.add(Base_Datos_Resistencias.get(j));
					}
				}
			}
			System.out.println("Resistencia con corriente  cero = " + VALOR_POS_PAREL);

			for (int i = 0; i < VALOR_POS_PAREL.size(); i++) {
				Recorrido_corriente_pos.add(voltaje_dado / VALOR_POS_PAREL.get(i));
			}

			for (int i = 0; i < Recorrido_corriente_pos.size(); i++) {
				Corriente_asig2 += Recorrido_corriente_pos.get(i);
			}

			suma_corrientes = Corriente_asig2 + Corriente_asig;
			System.out.println("CORRIENTE TOTAL ES = " + df.format(suma_corrientes));
			System.out.println("RECORRIDO" + Recorrido_corriente_pos);

			TR_Paralelo.setEnabled(true);
			JOptionPane.showMessageDialog(null, "CALCULO EXITOSO");
		}
	}

	protected void evento_guardar() {

		String CAP = (String) CAPACITORES.getSelectedItem();
		String RES = (String) RESISTENCIAS.getSelectedItem();

		if (CAP.equals("CAPACITORES") && RES.equals("RESISTENCIAS")) {

			JOptionPane.showMessageDialog(null, "ERROR SELECIONE UNA OPCION", null, JOptionPane.ERROR_MESSAGE);

		} else {

			// CAPACITORES
			Vol_C = (int) VOLTAJE_C.getSelectedItem();
			carg_a = (int) Carga.getSelectedItem();
			Capacito_r = (int) CAPACITOR.getSelectedItem();
			// RESISTENCIAS
			Vol_R = (int) VOLTAJE_R.getSelectedItem();
			Corrient_e = (int) Corriente.getSelectedItem();
			Resistenci_a = (int) RESISTENCIA.getSelectedItem();

			if (CAP.equals("CON VOLTAJE SIN CARGA")) {
				if (VOLTAJE_C.getSelectedIndex() == 0) {
					JOptionPane.showMessageDialog(null, "ERROR SELECCIONE UN VOLTAJE", null, JOptionPane.ERROR_MESSAGE);
				} else {
					//////////////////////////////////////////////
					Base_Datos_Resistencias.removeAllElements();
					Base_Datos_Capacitores.removeAllElements();
					Base_Carga_Capacitores.removeAllElements();
					base_carga.removeAllElements();
					base_corriente.removeAllElements();
					base_voltaje.removeAllElements();
					Carga_asignada.removeAllElements();
					R_voltaje_asignado.removeAllElements();
					C_voltaje_asignado.removeAllElements();
					POS.removeAllElements();
					VALOR_POS.removeAllElements();
					Recorrido_Valor_pos.removeAllElements();
					Recorrido_carga_pos.removeAllElements();
					VALOR_POS_PAREL.removeAllElements();
					VALOR_POS_CAP_SERIE.removeAllElements();
					ACUMULADOR_CARGA_TOTAL = 0;
					ACUMULADOR_CAPACITANCIA_TOTAL = 0;
					VOLTAJE_TOTAL = 0;
					VOLTAJE_TOTAL2 = 0;
					suma_voltajes_C_serie = 0;
					Carga_asig = 0;
					Carga_asig2 = 0;
					suma_cargas = 0;
					
					/////////////////////////////////////////////

					for (int i = 1; i <= Capacito_r; i++) {

						C_Paralelo.setEnabled(true);
						C_Serie.setEnabled(true);
						String entrada = JOptionPane.showInputDialog("Ingrese el valor del Capacitor N :" + " " + i);
						double entrada2 = Integer.parseInt(entrada);
						Base_Datos_Capacitores.add(entrada2);
						R_Paralelo.setEnabled(false);
						R_Serie.setEnabled(false);
						TR_Paralelo.setEnabled(false);
						TR_Serie.setEnabled(false);
					}

				}

			} else {
				if (CAP.equals("CON CARGA SIN VOLTAJE")) {

					if (Carga.getSelectedIndex() == 0) {
						JOptionPane.showMessageDialog(null, "ERROR SELECCIONE UNA CARGA", null,
								JOptionPane.ERROR_MESSAGE);
					} else {
						/////////////////////////////////////////////////////////
						Base_Datos_Resistencias.removeAllElements();
						Base_Datos_Capacitores.removeAllElements();
						Base_Carga_Capacitores.removeAllElements();
						base_carga.removeAllElements();
						base_corriente.removeAllElements();
						base_voltaje.removeAllElements();
						Carga_asignada.removeAllElements();
						R_voltaje_asignado.removeAllElements();
						C_voltaje_asignado.removeAllElements();
						POS.removeAllElements();
						VALOR_POS.removeAllElements();
						Recorrido_Valor_pos.removeAllElements();
						Recorrido_carga_pos.removeAllElements();
						VALOR_POS_PAREL.removeAllElements();
						ACUMULADOR_CARGA_TOTAL = 0;
						ACUMULADOR_CAPACITANCIA_TOTAL = 0;
						VALOR_POS_CAP_SERIE.removeAllElements();
						VOLTAJE_TOTAL = 0;
						VOLTAJE_TOTAL2 = 0;
						suma_voltajes_C_serie = 0;
						Carga_asig = 0;
						Carga_asig2 = 0;
						suma_cargas = 0;
						/////////////////////////////////////////////////////////

						for (int i = 1; i <= Capacito_r; i++) {

							C_Paralelo.setEnabled(true);
							C_Serie.setEnabled(true);
							String entrada = JOptionPane
									.showInputDialog("Ingrese el valor del Capacitor N� :" + " " + i);
							double entrada2 = Integer.parseInt(entrada);
							Base_Datos_Capacitores.add(entrada2);
							R_Paralelo.setEnabled(false);
							R_Serie.setEnabled(false);
							TR_Paralelo.setEnabled(false);
							TR_Serie.setEnabled(false);
						}

					}

				}
				if (CAP.equals("CON CARGA CON VOLTAJE")) {

					Base_Datos_Resistencias.removeAllElements();
					Base_Datos_Capacitores.removeAllElements();
					Base_Carga_Capacitores.removeAllElements();
					base_carga.removeAllElements();
					base_corriente.removeAllElements();
					base_voltaje.removeAllElements();
					Carga_asignada.removeAllElements();
					R_voltaje_asignado.removeAllElements();
					C_voltaje_asignado.removeAllElements();
					POS.removeAllElements();
					VALOR_POS.removeAllElements();
					Recorrido_Valor_pos.removeAllElements();
					Recorrido_carga_pos.removeAllElements();
					VALOR_POS_PAREL.removeAllElements();
					VALOR_POS_CAP_SERIE.removeAllElements();
					ACUMULADOR_CARGA_TOTAL = 0;
					ACUMULADOR_CAPACITANCIA_TOTAL = 0;
					VOLTAJE_TOTAL = 0;
					VOLTAJE_TOTAL2 = 0;
					suma_voltajes_C_serie = 0;
					Carga_asig = 0;
					Carga_asig2 = 0;
					suma_cargas = 0;

					for (int i = 1; i <= Capacito_r; i++) {

						C_Paralelo.setEnabled(true);
						C_Serie.setEnabled(true);
						String entrada = JOptionPane.showInputDialog("Ingrese el valor del Capacitor N� :" + " " + i);
						double entrada2 = Integer.parseInt(entrada);
						Base_Datos_Capacitores.add(entrada2);
						R_Paralelo.setEnabled(false);
						R_Serie.setEnabled(false);
						TR_Paralelo.setEnabled(false);
						TR_Serie.setEnabled(false);
					}
				}
			}
			if (RES.equals("CON VOLTAJE SIN CORRIENTE")) {
				if (VOLTAJE_R.getSelectedIndex() == 0) {
					JOptionPane.showMessageDialog(null, "ERROR SELECCIONE UN VOLTAJE", null, JOptionPane.ERROR_MESSAGE);
				} else {
					//////////////////////////////////////////////
					Base_Datos_Resistencias.removeAllElements();
					Base_Datos_Capacitores.removeAllElements();
					Base_Carga_Capacitores.removeAllElements();
					base_carga.removeAllElements();
					base_corriente.removeAllElements();
					base_voltaje.removeAllElements();
					Carga_asignada.removeAllElements();
					R_voltaje_asignado.removeAllElements();
					C_voltaje_asignado.removeAllElements();
					POS.removeAllElements();
					VALOR_POS.removeAllElements();
					Recorrido_Valor_pos.removeAllElements();
					VALOR_POS_PAREL.removeAllElements();
					VALOR_POS_CAP_SERIE.removeAllElements();
					RESISTENCIA_TOTAL = 0;
					CORRIENTE_TOTAL = 0;
					ACUM_VOLTAJES = 0;
					suma_corrientes = 0;
					Corriente_asig2 = 0;
					Corriente_asig = 0;
					corriente_dada = 0;
					Voltaje_asig = 0;
					Voltaje_asig2 = 0;
					suma_vol = 0;

					for (int i = 1; i <= Resistenci_a; i++) {

						R_Paralelo.setEnabled(true);
						R_Serie.setEnabled(true);
						String entrada = JOptionPane
								.showInputDialog("Ingrese el valor de la Resistencia N� :" + " " + i);
						double entrada1 = Integer.parseInt(entrada);
						Base_Datos_Resistencias.add(entrada1);
						C_Paralelo.setEnabled(false);
						C_Serie.setEnabled(false);
						TC_Serie.setEnabled(false);
						TC_Paralelo.setEnabled(false);

					}

				}
			}
			if (RES.equals("CON CORRIENTE SIN VOLTAJE")) {
				if (Corriente.getSelectedIndex() == 0) {
					JOptionPane.showMessageDialog(null, "ERROR SELECCIONE UNA CORRIENTE", null,
							JOptionPane.ERROR_MESSAGE);
				} else {
					//////////////////////////////////////////////
					Base_Datos_Resistencias.removeAllElements();
					Base_Datos_Capacitores.removeAllElements();
					Base_Carga_Capacitores.removeAllElements();
					base_carga.removeAllElements();
					base_corriente.removeAllElements();
					base_voltaje.removeAllElements();
					Carga_asignada.removeAllElements();
					R_voltaje_asignado.removeAllElements();
					C_voltaje_asignado.removeAllElements();
					POS.removeAllElements();
					VALOR_POS.removeAllElements();
					Recorrido_Valor_pos.removeAllElements();
					VALOR_POS_PAREL.removeAllElements();
					VALOR_POS_CAP_SERIE.removeAllElements();
					RESISTENCIA_TOTAL = 0;
					CORRIENTE_TOTAL = 0;
					ACUM_VOLTAJES = 0;
					suma_corrientes = 0;
					Corriente_asig2 = 0;
					Corriente_asig = 0;
					corriente_dada = 0;
					Voltaje_asig = 0;
					Voltaje_asig2 = 0;
					suma_vol = 0;

					for (int i = 1; i <= Resistenci_a; i++) {

						R_Paralelo.setEnabled(true);
						R_Serie.setEnabled(true);
						String entrada = JOptionPane
								.showInputDialog("Ingrese el valor de la Resistencia N� :" + " " + i);
						double entrada1 = Integer.parseInt(entrada);
						Base_Datos_Resistencias.add(entrada1);
						C_Paralelo.setEnabled(false);
						C_Serie.setEnabled(false);
						TC_Serie.setEnabled(false);
						TC_Paralelo.setEnabled(false);
					}
				}
			}
			if (RES.equals("CON CORRIENTE CON VOLTAJE")) {
				Base_Datos_Resistencias.removeAllElements();
				Base_Datos_Capacitores.removeAllElements();
				Base_Carga_Capacitores.removeAllElements();
				base_carga.removeAllElements();
				base_corriente.removeAllElements();
				base_voltaje.removeAllElements();
				Carga_asignada.removeAllElements();
				R_voltaje_asignado.removeAllElements();
				C_voltaje_asignado.removeAllElements();
				POS.removeAllElements();
				VALOR_POS.removeAllElements();
				Recorrido_Valor_pos.removeAllElements();
				VALOR_POS_PAREL.removeAllElements();
				VALOR_POS_CAP_SERIE.removeAllElements();
				RESISTENCIA_TOTAL = 0;
				CORRIENTE_TOTAL = 0;
				ACUM_VOLTAJES = 0;
				suma_corrientes = 0;
				Corriente_asig2 = 0;
				Corriente_asig = 0;
				corriente_dada = 0;
				Voltaje_asig = 0;
				Voltaje_asig2 = 0;
				suma_vol = 0;

				for (int i = 1; i <= Resistenci_a; i++) {

					R_Paralelo.setEnabled(true);
					R_Serie.setEnabled(true);
					String entrada = JOptionPane.showInputDialog("Ingrese el valor de la Resistencia N� :" + " " + i);
					double entrada1 = Integer.parseInt(entrada);
					Base_Datos_Resistencias.add(entrada1);
					C_Paralelo.setEnabled(false);
					C_Serie.setEnabled(false);
					TC_Serie.setEnabled(false);
					TC_Paralelo.setEnabled(false);
				}
			}
		}
	}

	public void evento_RES() {
		Habilitar_Capacitores(false);
		Habilitar_Resistencia(true);

	}

	protected void evento_CAP() {
		Habilitar_Resistencia(false);
		Habilitar_Capacitores(true);

	}

	private void Habilitar_Resistencia(boolean b) {

		VOLTAJE_R.setVisible(b);// COMBOX
		Voltaje_R.setVisible(b);// LABEL
		Corrinte.setVisible(b);
		Corriente.setVisible(b);
		resistencia.setVisible(b);
		RESISTENCIA.setVisible(b);

	}

	private void Habilitar_Capacitores(boolean c) {

		VOLTAJE_C.setVisible(c);// COMBOX
		Voltaje_C.setVisible(c);// LABEL
		Carga.setVisible(c);
		carga.setVisible(c);
		capacitores.setVisible(c);
		CAPACITOR.setVisible(c);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == CAPACITORES) {
			CAPACITOR.setSelectedIndex(0);
			VOLTAJE_C.setSelectedIndex(0);
			Carga.setSelectedIndex(0);

			if (CAPACITORES.getSelectedIndex() == 0) {
				Habilitar_Resistencia(false);
				Habilitar_Capacitores(false);
			}
			if (CAPACITORES.getSelectedIndex() == 1) {
				/////////////////////////////////////
				Habilitar_Resistencia(false);
				Carga.setVisible(false);
				carga.setVisible(false);
				/////////////////////////////////////
				VOLTAJE_C.setVisible(true);// COMBOX
				Voltaje_C.setVisible(true);// LABEL
				CAPACITOR.setVisible(true);
				capacitores.setVisible(true);
			}

			if (CAPACITORES.getSelectedIndex() == 2) {
				////////////////////////////////////
				Habilitar_Resistencia(false);
				VOLTAJE_C.setVisible(false);// COMBOX
				Voltaje_C.setVisible(false);// LABEL
				///////////////////////////////////
				Carga.setVisible(true);
				carga.setVisible(true);
				CAPACITOR.setVisible(true);
				capacitores.setVisible(true);

			}
			if (CAPACITORES.getSelectedIndex() == 3) {
				//////////////////////////////////////
				Habilitar_Resistencia(false);
				VOLTAJE_C.setVisible(false);// COMBOX
				Voltaje_C.setVisible(false);// LABEL
				Carga.setVisible(false);
				carga.setVisible(false);
				////////////////////////////////////
				CAPACITOR.setVisible(true);
				capacitores.setVisible(true);

			}
		} else {
			if (e.getSource() == RESISTENCIAS) {
				Corriente.setSelectedIndex(0);
				VOLTAJE_R.setSelectedIndex(0);
				RESISTENCIA.setSelectedIndex(0);

				if (RESISTENCIAS.getSelectedIndex() == 0) {
					Habilitar_Resistencia(false);
					Habilitar_Capacitores(false);
				}
				if (RESISTENCIAS.getSelectedIndex() == 1) {
					////////////////////////////////////////
					Habilitar_Capacitores(false);
					Corriente.setVisible(false);
					Corrinte.setVisible(false);
					resistencia.setVisible(false);
					/////////////////////////////////////
					resistencia.setVisible(true);
					RESISTENCIA.setVisible(true);
					VOLTAJE_R.setVisible(true);// COMBOX
					Voltaje_R.setVisible(true);// LABEL
				}
				if (RESISTENCIAS.getSelectedIndex() == 2) {
					/////////////////////////////////////
					Habilitar_Capacitores(false);
					VOLTAJE_R.setVisible(false);// COMBOX
					Voltaje_R.setVisible(false);// LABEL
					//////////////////////////////////////
					Corrinte.setVisible(true);
					Corriente.setVisible(true);
					resistencia.setVisible(true);
					RESISTENCIA.setVisible(true);
				}
				if (RESISTENCIAS.getSelectedIndex() == 3) {
					////////////////////////////////////
					Habilitar_Capacitores(false);
					VOLTAJE_R.setVisible(false);// COMBOX
					Voltaje_R.setVisible(false);// LABEL
					Corriente.setVisible(false);
					Corrinte.setVisible(false);
					//////////////////////////////////////
					resistencia.setVisible(true);
					RESISTENCIA.setVisible(true);
				}
			}
		}

	}
}
