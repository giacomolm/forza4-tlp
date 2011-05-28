package view;
import javax.swing.JFrame;


public class FrameTester {
	
	public static void main(String [] args){
		JFrame frame = new JFrame();
		frame.setSize(800, 800);
		frame.setTitle("Lorenza vaffanculo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GrigliaWieuwer gw;
		Griglia g = new Griglia();
		g.putPedina(1,1);
		g.putPedina(2,2);
		g.putPedina(1,2);
		g.putPedina(0,1);
		gw = new GrigliaWieuwer(g,50,50);
		frame.add(gw);
		g.putPedina(1,1);
		frame.setVisible(true);
		g.putPedina(0,2);
		g.putPedina(7,1);
		g.putPedina(1,2);
		g.putPedina(6,1);
		PulsantieraWieuwer pw = new PulsantieraWieuwer(100,500);
		frame.add(pw);
		Pedina ped = new Pedina();
		frame.add(ped);
	}

	
}
