package vuegraphique;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
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

	PanMyHome panMyHome;
	
	JLabel Jalarme = new JLabel();
	JLabel Jcadenas = new JLabel();
	JLabel JTexteEtat  = new JLabel();
	JLabel JTexteEtat2  = new JLabel();
	JLabel JTexteAlarme  = new JLabel();
	JLabel JTexteVide  = new JLabel();
	
	
	Box boxgauche  = Box.createVerticalBox();
	Box boxdroite  = Box.createVerticalBox();
	Box boxTextEtat  = Box.createHorizontalBox();
	Box boxTextEtat2  = Box.createHorizontalBox();
	Box boxTextAlarme  = Box.createHorizontalBox();
	ImageIcon cadenas_ouvert2;
	private boolean enabled;
	private boolean ouvert;
	
	public PanSecure (PanMyHome panMyHome) {
		this.panMyHome=panMyHome;
	}
	
	public void initialisation() {
	        	this.setBackground(Color.WHITE);
		
		        //CADENAS OUVERT
				BufferedImage cadenas_ouvert=null;
				try {
					cadenas_ouvert = ImageIO.read(new File("RESSOURCE/cadenasOuvert.png"));
				} catch (IOException e1) {
					e1.printStackTrace();
				}		
				cadenas_ouvert2=new ImageIcon(cadenas_ouvert);
				
				
				//CADENAS FERMEE
				BufferedImage cadenas_ferme=null;
				try {
					cadenas_ferme = ImageIO.read(new File("RESSOURCE/cadenasFerme.png"));
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
				
				//ALARM DISABLED
				BufferedImage alarmDisabled=null;
				try {
					alarmDisabled = ImageIO.read(new File("RESSOURCE/alarmeDisabled.png"));
				} catch (IOException e1) {
					e1.printStackTrace();
				}		
				ImageIcon alarmDisabled1=new ImageIcon(alarmDisabled);
				
		
				//CADENAS
				
				Jcadenas.setIcon(cadenas_ouvert2);
				JTexteEtat.setText("Your house is not armed");
				JTexteEtat.setFont(new Font("Roboto", Font.BOLD, 32));
				JTexteEtat2.setText("                ");
				JTexteEtat2.setFont(new Font("Roboto", Font.PLAIN, 32));
				
				setOuvert(true);
				
				Jcadenas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//� ajouter et mettre pour chaque label
				Jcadenas.addMouseListener(new MouseListener() {
					@Override
					public void mouseReleased(MouseEvent e) {
					}
					@Override
					public void mousePressed(MouseEvent e) {
						if(isOuvert()==true) {
						Jcadenas.setIcon(cadenas_ferme2);
						JTexteEtat.setText("EVERYTHING LOOKS GOOD");
						JTexteEtat2.setText("Your home is armed");
						panMyHome.fenetre1.setIcon(panMyHome.fentrerougeicn);
						panMyHome.fenetre2.setIcon(panMyHome.fentrerougeicn);
						panMyHome.fenetre3.setIcon(panMyHome.fentrerougeicn);
						panMyHome.fenetre4.setIcon(panMyHome.fentrerougeicn);
						panMyHome.porte.setIcon(panMyHome.porterougeicn);
						setOuvert(false);
						}
						else {
			     		Jcadenas.setIcon(cadenas_ouvert2);
						JTexteEtat.setText("Your home is not armed");
						JTexteEtat2.setText("                ");
						panMyHome.fenetre1.setIcon(panMyHome.fentreverticn);
						panMyHome.fenetre2.setIcon(panMyHome.fentreverticn);
						panMyHome.fenetre3.setIcon(panMyHome.fentreverticn);
						panMyHome.fenetre4.setIcon(panMyHome.fentreverticn);
						panMyHome.porte.setIcon(panMyHome.porteverticn);
						setOuvert(true);
						}
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
			    enabled=false;
			    Jalarme.setIcon(alarmDisabled1);
				JTexteVide.setText("         ");
				JTexteAlarme.setText("Alarme Disabled");
				JTexteAlarme.setFont(new Font("Tahoma", Font.BOLD, 27));
				
				Jalarme.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//� ajouter et mettre pour chaque label
				Jalarme.addMouseListener(new MouseListener() {
					@Override
					public void mouseReleased(MouseEvent e) {
					}
					@Override
					public void mousePressed(MouseEvent e) {
						if(enabled==false) {
							Jalarme.setIcon(alarm1);
							JTexteAlarme.setText("Alarme Enabled");
							enabled=true;
						}
						else {
							JTexteAlarme.setText("Alarme Disabled");
							Jalarme.setIcon(alarmDisabled1);
							enabled=false;
						}
						
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
				boxTextEtat.add(Box.createRigidArea(new Dimension(0,180)));
				boxTextEtat.add(JTexteEtat);
				boxTextEtat2.add(JTexteEtat2);
				boxTextEtat2.add(Box.createRigidArea(new Dimension(0,130)));
				boxTextAlarme.add(Jalarme);
				boxTextAlarme.add(JTexteVide);
				boxTextAlarme.add(JTexteAlarme);
				boxgauche.add(boxTextEtat);
				boxgauche.add(boxTextEtat2);
				boxgauche.add(boxTextAlarme);
				boxgauche.setVisible(true);
				boxdroite.add(Jcadenas);
				boxdroite.setVisible(true);
				this.add(boxgauche);
				this.add(boxdroite);
				
				
	}

	public boolean isOuvert() {
		return ouvert;
	}

	public void setOuvert(boolean ouvert) {
		this.ouvert = ouvert;
	}
	
	

}
