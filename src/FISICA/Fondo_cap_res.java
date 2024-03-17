package FISICA;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

//import com.sun.prism.paint.Color;

public class Fondo_cap_res  extends JPanel{

	private Image imagen;

	public void paint(Graphics g) {
		
		imagen = new ImageIcon(getClass().getResource("/FISICA/r.jpg")).getImage();
		g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this);
		setOpaque(false);
		super.paint(g);
		

		g.drawRect(20, 30,900,450);
		g.drawRect(20, 30, 900, 40);
		g.drawRect(20, 350, 900, 130);
		g.drawRect(20, 30, 900, 95);
		g.drawRect(20, 70, 450, 280);
		g.drawRect(380, 380, 180, 50);
		
	}

	private void initComponents() {	
	}
}
