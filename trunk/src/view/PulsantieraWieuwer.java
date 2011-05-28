package view;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;


public class PulsantieraWieuwer extends JComponent {

	private static final long serialVersionUID = 1L;
	
	private int x,y;
	
	public PulsantieraWieuwer(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	public void paintComponent(Graphics f){
		Graphics2D g = (Graphics2D) f;
		Rectangle r = new Rectangle(x-5,y-5,330,50);
		g.setColor(Color.BLUE);
		g.fill(r);
		Ellipse2D.Double el[] = new Ellipse2D.Double[8];
		int i;
		for(i=0;i<8;i++){
			el[i]=new Ellipse2D.Double(x+i*40,y,40,40);
			g.setColor(Color.YELLOW);
			g.fill(el[i]);
			g.setColor(Color.BLUE);
			g.setFont(new Font("Serif",Font.BOLD,22));
			g.drawString(Integer.toString(i+1),x+i*40+15,y+25);
		}
		
	}
	

}