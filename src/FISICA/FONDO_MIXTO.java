package FISICA;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class FONDO_MIXTO  extends JPanel{

	private Image imagen;

	public void paint(Graphics g) {
		
		imagen = new ImageIcon(getClass().getResource("/FISICA/gris.jpg")).getImage();
		g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this);
		setOpaque(false);
		super.paint(g);
	}

	private void initComponents() {	
	}
}
