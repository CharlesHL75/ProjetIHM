package vuegraphique;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanSecure extends JPanel  {
	private static final long serialVersionUID = 4721795520307721056L;

	JLabel Jalarme = new JLabel();
	JLabel Jcadenas = new JLabel();
	JLabel JTexteEtat  = new JLabel();
	JLabel JTexteEtat2  = new JLabel();
	JLabel JTexteAlarme  = new JLabel();
	Box boxgauche  = Box.createVerticalBox();
	Box boxdroite  = Box.createVerticalBox();
	Box boxTextEtat  = Box.createHorizontalBox();
	Box boxTextEtat2  = Box.createHorizontalBox();
	Box boxTextAlarme  = Box.createHorizontalBox();

	public void initialisation() {
	        	this.setBackground(Color.WHITE);
		
		        //CADENAS OUVERT
				BufferedImage cadenas_ouvert=null;
				try {
					cadenas_ouvert = ImageIO.read(new File("RESSOURCE/cadenasOuvert.png"));
				} catch (IOException e1) {
					e1.printStackTrace();
				}		
				ImageIcon cadenas_ouvert2=new ImageIcon(cadenas_ouvert);
				
				
				//CADENAS FERME
				BufferedImage cadenas_ferme=null;
				try {
					cadenas_ferme = ImageIO.read(new File("RESSOURCE/cadenasferme.png"));
				} catch (IOException e1) {
					e1.printStackTrace();
				}		
				ImageIcon cadenas_ferme2=new ImageIcon(cadenas_ferme);
				
				
				//ALARM
				BufferedImage alarm=null;
				try {
					alarm = ImageIO.read(new File("RESSOURCE/alarm.png"));
				} catch (IOException e1) {
					e1.printStackTrace();
				}		
				ImageIcon alarm1=new ImageIcon(alarm);
				
		
				//CADENAS
				Jcadenas.setIcon(cadenas_ouvert2);
				JTexteEtat.setText("Your house isnt armed");
				JTexteEtat2.setText(" ");
				
				Jcadenas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//� ajouter et mettre pour chaque label
				Jcadenas.addMouseListener(new MouseListener() {
					@Override
					public void mouseReleased(MouseEvent e) {
					}
					@Override
					public void mousePressed(MouseEvent e) {
						Jcadenas.setIcon(cadenas_ferme2);
						JTexteEtat.setText("EVRYTHING LOOKS GOOD");
						JTexteEtat2.setText("Your house is armed");
					}
		            @Override
		            public void mouseEntered(MouseEvent e) {
		            }

		            @Override
		            public void mouseExited(MouseEvent e) {
		            	
		            }
					@Override
					public void mouseClicked(MouseEvent e) {

					}
				});
				
				//Alarm
				Jalarme.setIcon(alarm1);
				JTexteAlarme.setText("Alarme Disabled");
				
				Jalarme.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//� ajouter et mettre pour chaque label
				Jalarme.addMouseListener(new MouseListener() {
					@Override
					public void mouseReleased(MouseEvent e) {
					}
					@Override
					public void mousePressed(MouseEvent e) {
						JTexteAlarme.setText("Alarme Enabled");
					}
		            @Override
		            public void mouseEntered(MouseEvent e) {
		            }

		            @Override
		            public void mouseExited(MouseEvent e) {
		            	
		            }
					@Override
					public void mouseClicked(MouseEvent e) {

					}
				});
				boxTextEtat.add(JTexteEtat);
				boxTextEtat2.add(JTexteEtat2);
				boxTextAlarme.add(Jalarme);
				boxgauche.add(boxTextEtat);
				boxgauche.add(boxTextEtat2);
				boxgauche.add(boxTextAlarme);
				boxgauche.setVisible(true);
				boxdroite.add(Jcadenas);
				boxdroite.setVisible(true);
				this.add(boxgauche);
				this.add(boxdroite);
				
				
	}
	
	

}
