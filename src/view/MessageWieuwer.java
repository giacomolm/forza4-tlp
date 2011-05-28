package view;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;


public class MessageWieuwer extends JComponent {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Message message;
	private int x,y,lenght;
	
	public MessageWieuwer(Message message,int x, int y, int length){
		this.message = message;
		this.x = x;
		this.y = y;
		this.lenght = length;
	}
	
	public void paintComponent(Graphics f){
		Graphics2D g = (Graphics2D) f;
		g.setFont(new Font("Serif", Font.PLAIN, 20));
		Rectangle bordo = new Rectangle(this.x-10,this.y-23,this.lenght+10,30);
		g.setColor(new Color(0,0,50));
		g.fill(bordo);
		Rectangle r = new Rectangle(this.x-5,this.y-17,this.lenght,20);
		g.setColor(Color.LIGHT_GRAY);
		g.fill(r);
		g.setColor(new Color(0,0,250));
		g.drawString(message.getMessage(), x, y);
	}

}
