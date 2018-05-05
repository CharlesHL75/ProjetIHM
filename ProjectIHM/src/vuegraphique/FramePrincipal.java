package vuegraphique;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class FramePrincipal extends JFrame {

	private static final long serialVersionUID = 1L;

	
	private JPanel panAccueil = new JPanel();
	private JPanel panContents = new JPanel();
	private PanAcceuil panAcceuil;
	private CardLayout cartes = new CardLayout();

	
	@SuppressWarnings("static-access")
	public FramePrincipal(int l1, int l2) {
		this.setTitle("IHM");  //Définit un titre
		this.setSize(900, 603); 
		this.setLocationRelativeTo(null); //Positionne au centre la fenetre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Termine le processus lorsqu'on clique sur la croix rouge
		
		this.panAcceuil = new PanAcceuil();
		this.panAcceuil.initialisation();
		this.panContents.setLayout(cartes); //ajoute à panContents le Layout de cartes
		this.panContents.add(this.panAcceuil,"ACCEUIL");
		//this.panContents.add(this.panAdmin,"ADMIN");
		
		//this.pack();
		//this.setExtendedState(this.MAXIMIZED_BOTH);
		
		this.getContentPane().add(panContents);

		this.setVisible(true);
	}

	

	
	public void showPanAcceuil() {
		this.cartes.show(panContents, "USER");
		this.repaint();
	}
	


	public JPanel getPanContents() {
		return panContents;
	}

	public CardLayout getCartes() {
		return cartes;
	}
	
	
	
}
