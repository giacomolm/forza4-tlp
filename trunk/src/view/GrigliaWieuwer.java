package view;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;


public class GrigliaWieuwer extends JComponent {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Griglia g;
	private int x,y;
	
	public GrigliaWieuwer(Griglia g,int x,int y){
		this.g = g;
		this.x = x;
		this.y = y;
	}
	
	public void paintComponent(Graphics f){
		Graphics2D t=(Graphics2D)f;
		int col,h;
		Rectangle bordo = new Rectangle(x-10,y-10,340,300);
		t.setColor(new Color(0,0,50));
		t.fill(bordo);
		Rectangle bkg = new Rectangle(x,y,320,280);
		t.setColor(new Color(0,0,255));
		t.fill(bkg);
		Color[] cl = new Color [3];
		cl[0]= Color.LIGHT_GRAY;
		cl[1]= Color.GREEN;
		cl[2]= Color.RED;
		Ellipse2D.Double c[][] = new Ellipse2D.Double[8][7];
		for(col=0;col<8;col++){
			for(h=0;h<7;h++){
				c[col][h]= new Ellipse2D.Double(x+col*40,y+240-h*40,40,40);
				t.setColor(cl[g.getPedinaOnGriglia(col, h)]);
				t.fill(c[col][h]);
			}
		}
	}

}
