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

public class TABLA_CAP_PARALELO extends JFrame {
	
	String[] columnNames = {"C","VALOR","VOL INGRESADO","CAR INGRESADO","","CAP TOTAL","VOLTAJE","CARGA","VOL TOTAL","CAR TOTAL",};
	String[][] datos;
	JButton atras;
	Capacitor_Y_Resistencia p;  
	DecimalFormat df =  new DecimalFormat();

	public TABLA_CAP_PARALELO(Capacitor_Y_Resistencia p) {
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
         
		int indice = p.Base_Datos_Capacitores.size();
		datos = new String[p.Base_Datos_Capacitores.size()][1000];
		//CON VOLTAJE SIN CARGA
		if(p.VOLTAJE_C.getSelectedIndex() != 0 && p.Carga.getSelectedIndex() == 0 ) {
		for (int i = 0; i < p.Base_Datos_Capacitores.size(); i++) {
			 datos[i][0] = "C"+(i + 1); 
			 datos[i][1] = String.valueOf(p.Base_Datos_Capacitores.get(i));
			 datos[i][2] = String.valueOf(p.Vol_C);
			
			 
		}
		
		datos [0][3] = "";
		datos [0][4] = "";
		datos [0][5] = String.valueOf(df.format(p.ACUMULADOR_CAPACITANCIA_TOTAL));
		
		for (int i = 0; i < p.Base_Datos_Capacitores.size(); i++) {
			datos[i][6] = String.valueOf(p.Vol_C);
		}
		
		for (int j = 0; j < p.Base_Carga_Capacitores .size(); j++) {
			datos[j][7] = String.valueOf(p.Base_Carga_Capacitores .get(j));
		}
		
		datos [0][8] = String.valueOf(df.format(p.Vol_C)); 
		datos [0][9] = String.valueOf(df.format(p.ACUMULADOR_CARGA_TOTAL)); 

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
		
		//CON CARGA SIN VOLTAJE
		if(p.Carga.getSelectedIndex() != 0 && p.VOLTAJE_C.getSelectedIndex() == 0) {
			
			for (int i = 0; i < p.Base_Datos_Capacitores.size(); i++) {
				datos[i][0] = "C" + (i + 1);
				datos[i][1] = String.valueOf(p.Base_Datos_Capacitores.get(i));
			}
			datos[0][3] = String.valueOf(p.carg_a);
			datos[0][4] = "";
			datos[0][5] = String.valueOf(df.format(p.ACUMULADOR_CAPACITANCIA_TOTAL));
			
			for (int j = 0; j < p.Base_Datos_Capacitores.size(); j++) {
				datos[j][6] = String.valueOf(df.format(p.VOLTAJE_TOTAL));
			}
			
			for (int w = 0; w < p.base_carga.size(); w++) {
				datos[w][7] = String.valueOf(df.format(p.base_carga.get(w)));
			}
			
			datos[0][8] = String.valueOf(df.format(p.VOLTAJE_TOTAL));
			datos[0][9] = String.valueOf(df.format(p.carg_a));
			
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
		
		if(p.Carga.getSelectedIndex() == 0 && p.VOLTAJE_C.getSelectedIndex() ==0) {
			
			for (int i = 0; i < p.Base_Datos_Capacitores.size(); i++) {
				
				datos[i][0]= "C" + (i + 1);
				datos[i][1]= String.valueOf(df.format(p.Base_Datos_Capacitores.get(i)));
				datos[i][2]= String.valueOf(p.voltaje_dado);
			}
			
			for (int i = 0; i < p.Carga_asignada.size(); i++) {
					datos[i][3] = String.valueOf(df.format(p.Carga_asignada.get(i)));
			}
			
			datos [0][4] = " ";
			datos [0][5] = String.valueOf(df.format(p.ACUMULADOR_CAPACITANCIA_TOTAL));
			
			for (int i = 0; i < p.Base_Datos_Capacitores.size(); i++) {
				datos[i][6] = String.valueOf(p.voltaje_dado);
			}
			
			for (int i = 0; i < p.Recorrido_carga_pos.size(); i++) {
					datos[i][7] = String.valueOf(df.format(p.Recorrido_carga_pos.get(i)));
				
			}
			
			datos[0][8]= String.valueOf(df.format(p.voltaje_dado));
			datos[0][9]= String.valueOf(df.format(p.suma_cargas));
			
			
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