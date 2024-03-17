package FISICA;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panel_SE_PA extends JPanel {
	
	private Image imagen;
	
	public void pain(Graphics g) {
		//super.paintComponent(g);	
		
		imagen = new ImageIcon(getClass().getResource("/FISICA/img_cir4.jpg")).getImage();
		g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this);
		setOpaque(false);
		super.paint(g);
		
		
		/*g.drawRect(20, 30,900,450);
		g.drawRect(20, 30, 900, 40);
		g.drawRect(20, 350, 900, 130);
		g.drawRect(20, 30, 900, 95);
		g.drawRect(20, 70, 450, 410);//divi
		//cuadro guarda	
		g.setColor(new Color(141, 184, 249));
		g.drawRect(380, 380, 180, 50);
		g.fillRect(380, 380, 180, 50);
		g.setColor(Color.black);
		g.drawRect(380, 380, 182, 52);*/
	
	 }
}
