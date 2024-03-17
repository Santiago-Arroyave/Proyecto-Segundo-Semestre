package FISICA;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TABLA_CAP_SERIE extends JFrame {

	String[] columnNames = { "C", "VALOR", "VOL INGRESADO", "CAR INGRESADO", "", "CAP TOTAL", "VOLTAJE", "CARGA",
			"VOL TOTAL", "CAR TOTAL", };
	String[][] datos;
	JButton atras;
	Capacitor_Y_Resistencia r;
	DecimalFormat df = new DecimalFormat();

	public TABLA_CAP_SERIE(Capacitor_Y_Resistencia r) {
		super("TABLA DE DATOS");
		this.r = r;

		atras = new JButton("ATRAS");
		atras.setBounds(1100, 320, 80, 20);
		atras.setForeground(Color.black);
		atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				evento_atras();

			}
		});
		add(atras);

		int indice = r.Base_Datos_Capacitores.size();
		datos = new String[r.Base_Datos_Capacitores.size()][1000];
		// CON VOLTAJE SIN CARGA
		if (r.VOLTAJE_C.getSelectedIndex() != 0 && r.Carga.getSelectedIndex() == 0) {
			for (int i = 0; i < r.Base_Datos_Capacitores.size(); i++) {
				datos[i][0] = "C" + (i + 1);
				datos[i][1] = String.valueOf(r.Base_Datos_Capacitores.get(i));

			}

			datos[0][2] = String.valueOf(r.Vol_C);
			datos[0][3] = "";
			datos[0][4] = "";
			datos[0][5] = String.valueOf(df.format(r.ACUMULADOR_CAPACITANCIA_TOTAL));

			for (int w = 0; w < r.base_voltaje.size(); w++) {
				datos[w][6] = String.valueOf(df.format(r.base_voltaje.get(w)));
			}

			for (int x = 0; x < r.Base_Datos_Capacitores.size(); x++) {
				datos[x][7] = String.valueOf(df.format(r.ACUMULADOR_CARGA_TOTAL));
			}

			datos[1][8] = String.valueOf(df.format(r.Vol_C));
			datos[1][9] = String.valueOf(df.format(r.ACUMULADOR_CARGA_TOTAL));

			DefaultTableModel dtm = new DefaultTableModel(datos, columnNames);
			final JTable table = new JTable(dtm);

			table.setPreferredScrollableViewportSize(new Dimension(650, 100));
			JScrollPane scrollPane = new JScrollPane(table);
			getContentPane().add(scrollPane, BorderLayout.CENTER);
			addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});

		}

		// CON CARGA SIN VOLTAJE
		if (r.Carga.getSelectedIndex() != 0 && r.VOLTAJE_C.getSelectedIndex() == 0) {

			for (int i = 0; i < r.Base_Datos_Capacitores.size(); i++) {
				datos[i][0] = "C" + (i + 1);
				datos[i][1] = String.valueOf(r.Base_Datos_Capacitores.get(i));

			}
			for (int v = 0; v < r.Base_Datos_Capacitores.size(); v++) {
				datos[v][3] = String.valueOf(r.carg_a);
			}
			datos[0][4] = "";
			datos[0][5] = String.valueOf(df.format(r.ACUMULADOR_CAPACITANCIA_TOTAL));

			for (int e = 0; e < r.base_voltaje.size(); e++) {
				datos[e][6] = String.valueOf(df.format(r.base_voltaje.get(e)));
			}

			for (int j = 0; j < r.Base_Datos_Capacitores.size(); j++) {
				datos[j][7] = String.valueOf(r.carg_a);
			}

			datos[1][8] = String.valueOf(df.format(r.VOLTAJE_TOTAL));
			datos[1][9] = String.valueOf(df.format(r.carg_a));

			DefaultTableModel dtm = new DefaultTableModel(datos, columnNames);
			final JTable table = new JTable(dtm);

			table.setPreferredScrollableViewportSize(new Dimension(650, 100));
			JScrollPane scrollPane = new JScrollPane(table);
			getContentPane().add(scrollPane, BorderLayout.CENTER);
			addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
		}

		// CON VOLTAJE CON CARGA
		if (r.Carga.getSelectedIndex() == 0 && r.VOLTAJE_C.getSelectedIndex() == 0) {

			for (int i = 0; i < r.Base_Datos_Capacitores.size(); i++) {

				datos[i][0] = "C" + (i + 1);
				datos[i][1] = String.valueOf(df.format(r.Base_Datos_Capacitores.get(i)));
				datos[i][3] = String.valueOf(r.carga_dada);
			}

			for (int i = 0; i < r.C_voltaje_asignado.size(); i++) {
				datos[i][2] = String.valueOf(df.format(r.C_voltaje_asignado.get(i)));
			}

			datos[0][4] = " ";
			datos[0][5] = String.valueOf(df.format(r.ACUMULADOR_CAPACITANCIA_TOTAL));

				for (int i = 0; i < r.Recorrido_Valor_pos.size(); i++) {
					
						datos[i][6] = String.valueOf(df.format(r.Recorrido_Valor_pos.get(i)));
			}

			for (int i = 0; i < r.Base_Datos_Capacitores.size(); i++) {
				datos[i][7] = String.valueOf(df.format(r.carga_dada));
			}

		}

		datos[0][8] = String.valueOf(df.format(r.suma_voltajes_C_serie));
		datos[0][9] = String.valueOf(df.format(r.carga_dada));

		DefaultTableModel dtm = new DefaultTableModel(datos, columnNames);
		final JTable table = new JTable(dtm);

		table.setPreferredScrollableViewportSize(new Dimension(650, 100));
		JScrollPane scrollPane = new JScrollPane(table);
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	protected void evento_atras() {
		setVisible(false);
		dispose();
		r.setVisible(true);
	}

	private Double C(int i) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}
}