package FISICA;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Fondo  extends JPanel{

	private Image imagen;

	public void paint(Graphics g) {
		
		imagen = new ImageIcon(getClass().getResource("/FISICA/img_cir4.jpg")).getImage();
		g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this);
		setOpaque(false);
		super.paint(g);
	}

	private void initComponents() {	
	}
}
