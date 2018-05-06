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

public class PanAcceuil extends JPanel  {
	private static final long serialVersionUID = 4721795520307721056L;
	
	
	
		
		JLabel JtexteAccueil = new JLabel();
		JLabel JTexteNotificcation = new JLabel();
		JLabel JNotificcation = new JLabel();
		JLabel JNextNotif  = new JLabel();
		JLabel JAtHome  = new JLabel();
		JLabel JPourcentageSafety  = new JLabel();
		
		
		
		Box boxgauche  = Box.createVerticalBox();
		Box boxdroite  = Box.createHorizontalBox();
		Box boxTextAcceuil  = Box.createHorizontalBox();
		Box boxTextNotif  = Box.createHorizontalBox();
		Box boxNotification  = Box.createHorizontalBox();
		Box boxNextNotif  = Box.createHorizontalBox();
		
		int notif;
		
		
		public void initialisation() {
		        	this.setBackground(Color.WHITE);
			
			        //notif1
					BufferedImage notif1=null;
					try {
						notif1 = ImageIO.read(new File("RESSOURCE/notif1.png"));
					} catch (IOException e1) {
						e1.printStackTrace();
					}		
					ImageIcon notif1a=new ImageIcon(notif1);
					
					 //notif2
					BufferedImage notif2=null;
					try {
						notif2 = ImageIO.read(new File("RESSOURCE/notif2.png"));
					} catch (IOException e1) {
						e1.printStackTrace();
					}		
					ImageIcon notif2a=new ImageIcon(notif2);
					
					 //notif3
					BufferedImage notif3=null;
					try {
						notif3 = ImageIO.read(new File("RESSOURCE/notif3.png"));
					} catch (IOException e1) {
						e1.printStackTrace();
					}		
					ImageIcon notif3a=new ImageIcon(notif3);
					
				
					
					 //notif4
					BufferedImage notif4=null;
					try {
						notif4 = ImageIO.read(new File("RESSOURCE/notif4.png"));
					} catch (IOException e1) {
						e1.printStackTrace();
					}		
					ImageIcon notif4a=new ImageIcon(notif4);
					
					
					//notif5
					BufferedImage notif5=null;
					try {
						notif5 = ImageIO.read(new File("RESSOURCE/notif5.png"));
					} catch (IOException e1) {
						e1.printStackTrace();
					}		
					ImageIcon notif5a=new ImageIcon(notif5);
					
					//notif6
					BufferedImage notif6=null;
					try {
						notif6 = ImageIO.read(new File("RESSOURCE/notif6.png"));
					} catch (IOException e1) {
						e1.printStackTrace();
					}		
					ImageIcon notif6a=new ImageIcon(notif6);
					
					//next
					BufferedImage next=null;
					try {
						next = ImageIO.read(new File("RESSOURCE/next.png"));
					} catch (IOException e1) {
						e1.printStackTrace();
					}		
					ImageIcon next1=new ImageIcon(next);
					
					//at home
					BufferedImage atHome=null;
					try {
						atHome = ImageIO.read(new File("RESSOURCE/atHome.png"));
					} catch (IOException e1) {
						e1.printStackTrace();
					}		
					ImageIcon atHome1=new ImageIcon(atHome);
					
					//pourcentage safety
					BufferedImage pourcentageSafety=null;
					try {
						pourcentageSafety = ImageIO.read(new File("RESSOURCE/pourcentageSafety.png"));
					} catch (IOException e1) {
						e1.printStackTrace();
					}		
					ImageIcon pourcentageSafety1=new ImageIcon(pourcentageSafety);
					
					
					
					
					//TEXTE ACCEUIL
					JtexteAccueil.setText("WELCOME");
					JtexteAccueil.setFont(new Font("Tahoma", Font.BOLD, 32));
					
					//TEXTE NOTIFICATIONS
					JTexteNotificcation.setText("Notifications :");
					JTexteNotificcation.setFont(new Font("Tahoma", Font.BOLD, 15));
			
					//NOTIFICATIONS
					
					JNextNotif.setIcon(next1);
					JNotificcation.setIcon(notif1a);		
					notif=1;
					JNextNotif.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//� ajouter et mettre pour chaque label
					JNextNotif.addMouseListener(new MouseListener() {
						@Override
						public void mouseReleased(MouseEvent e) {
						}
						@Override
						public void mousePressed(MouseEvent e) {
						    if(notif==1) {
						    	JNotificcation.setIcon(notif2a);
						    	notif=2;
						    }else
						    	if(notif==2) {
						    		JNotificcation.setIcon(notif3a);
							    	notif=3;
							    }else
							    	if(notif==3) {
							    		JNotificcation.setIcon(notif4a);
								    	notif=4;
								    }else
								    	if(notif==4) {
								    		JNotificcation.setIcon(notif5a);
									    	notif=5;
									    }else
									    	if(notif==5) {
									    		JNotificcation.setIcon(notif6a);
									    		JNextNotif.setVisible(false);
										    	notif=6;
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
					
					//AT HOME
					JAtHome.setIcon(atHome1);
					
					//POURCENTAGE SAFETY
					JPourcentageSafety.setIcon(pourcentageSafety1);
				   
					boxTextAcceuil.add(Box.createRigidArea(new Dimension(0,0)));
					boxTextAcceuil.add(JtexteAccueil);
					boxTextAcceuil.add(Box.createRigidArea(new Dimension(0,250)));
					boxTextNotif.add(JTexteNotificcation);
					boxNotification.add(JNotificcation);
					boxNextNotif.add(JNextNotif);
					
					boxgauche.add(boxTextAcceuil);
					boxgauche.add(boxTextNotif);
					boxgauche.add(boxNotification);
					boxgauche.add(boxNextNotif);
					boxgauche.setVisible(true);
					
					boxdroite.add(JAtHome);
					boxdroite.add(JPourcentageSafety);
					boxdroite.setVisible(true);
					this.add(boxgauche);
					this.add(boxdroite);
					
					
		
				
		

	}

}
