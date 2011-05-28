package view;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;


public class Pedina extends JComponent{
	
	public Pedina() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void paintComponent(Graphics f){
		// TODO Auto-generated method stub
        Graphics2D g2 = (Graphics2D) f;
		Ellipse2D.Double p = new Ellipse2D.Double(400,400,40,40);
		g2.setColor(Color.LIGHT_GRAY);
		g2.fill(p);
		Ellipse2D.Double q = new Ellipse2D.Double(404,404,32,32);
		g2.setColor(Color.DARK_GRAY);
		g2.fill(q);
		Ellipse2D.Double r = new Ellipse2D.Double(406,406,28,28);
		g2.setColor(Color.GRAY);
		g2.fill(r);
	}
}
