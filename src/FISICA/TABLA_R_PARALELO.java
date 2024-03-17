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

public class TABLA_R_PARALELO extends JFrame {
	
	String[] columnNames = {"R","VALOR","VOL INGRESADO","CORR INGRESADO","","R TOTAL","VOLTAJE","CORRIENTE","VOL TOTAL","CORR TOTAL",};
	String[][] datos;
	JButton atras;
	Capacitor_Y_Resistencia p;  
	DecimalFormat df =  new DecimalFormat();

	public TABLA_R_PARALELO(Capacitor_Y_Resistencia p) {
		super("TABLA DE DATOS");
		this.p = p;     
		
		 atras = new JButton("ATRAS");
         atras.setBounds(1100,320,80,20);
         atras.setForeground(Color.black);
         atras.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent arg0) {
 				evento_atras();
 				
 			}
 		});
         add(atras);
         
		int indice = p.Base_Datos_Resistencias.size();
		datos = new String[p.Base_Datos_Resistencias.size()][1000];
		
		//CON VOLTAJE SIN CORRIENTE
		
		if(p.VOLTAJE_R.getSelectedIndex() != 0 && p.Corriente.getSelectedIndex() == 0 ) {
		for (int i = 0; i < p.Base_Datos_Resistencias.size(); i++) {
			 datos[i][0] = "R"+(i + 1); 
			 datos[i][1] = String.valueOf(p.Base_Datos_Resistencias.get(i));
		    datos [i][2] = String.valueOf(p.Vol_R)	; 
		}

		datos [0][3] = "";
		datos [0][4] = "";
		datos [0][5] = String.valueOf(df.format(p.RESISTENCIA_TOTAL));
		
		for (int i = 0; i < p.Base_Datos_Resistencias.size(); i++) {
			datos[i][6] = String.valueOf(df.format(p.Vol_R));
		}
		
		for (int j = 0; j < p.base_corriente.size(); j++) {
			datos[j][7] = String.valueOf(df.format(p.base_corriente.get(j)));
		}
		
		datos [0][8] = String.valueOf(df.format(p.Vol_R)); 
		datos [0][9] = String.valueOf(df.format(p.CORRIENTE_TOTAL)); 

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
		
		//CON CORRIENTE Y SIN VOLTAJE
		if(p.Corriente.getSelectedIndex() != 0 && p.VOLTAJE_R.getSelectedIndex() == 0) {
			
			for (int i = 0; i < p.Base_Datos_Resistencias.size(); i++) {
				datos[i][0] = "R" + (i + 1);
				datos[i][1] = String.valueOf(p.Base_Datos_Resistencias.get(i));
				
			}
			
			datos[0][3] = String.valueOf(p.Corrient_e);
			datos[0][4] = "";
			datos[0][5] = String.valueOf(df.format(p.RESISTENCIA_TOTAL));
			
			for (int j = 0; j < p.Base_Datos_Resistencias.size(); j++) {
				datos[j][6] = String.valueOf(df.format(p.ACUM_VOLTAJES));
			}
			
			for (int w = 0; w < p.base_corriente.size(); w++) {
				datos[w][7] = String.valueOf(df.format(p.base_corriente.get(w)));
			}
			
			datos[0][8] = String.valueOf(df.format(p.ACUM_VOLTAJES));
			datos[0][9] = String.valueOf(df.format(p.CORRIENTE_TOTAL));
			
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
		//CON VOLTAJE Y CORRIENTE
		if(p.Corriente.getSelectedIndex() == 0 && p.VOLTAJE_R.getSelectedIndex() == 0) {
			
			for (int i = 0; i < p.Base_Datos_Resistencias.size(); i++) {
				datos[i][0] = "R" + (i + 1);
				datos[i][1] = String.valueOf(p.Base_Datos_Resistencias.get(i));
				datos[i][2] = String.valueOf(p.voltaje_dado);
				
			}
			
			for (int i = 0; i < p.Corriente_asignada.size(); i++) {
				datos[i][3] = String.valueOf(p.Corriente_asignada.get(i));
			}
			
			datos[0][4] = "";
			datos[0][5] = String.valueOf(df.format(p.RESISTENCIA_TOTAL));
			
			for (int j = 0; j < p.Base_Datos_Resistencias.size(); j++) {
				datos[j][6] = String.valueOf(df.format(p.voltaje_dado));
			}
			
			for (int w = 0; w < p.Recorrido_corriente_pos.size(); w++) {
				datos[w][7] = String.valueOf(df.format(p.Recorrido_corriente_pos.get(w)));
			}
			
			datos[0][8] = String.valueOf(df.format(p.voltaje_dado));
			datos[0][9] = String.valueOf(df.format(p.suma_corrientes));
			
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
		
		     
    }
	protected void evento_atras() {
		setVisible(false);
		dispose();
		p.setVisible(true);
	}
	private Double C(int i) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}
}