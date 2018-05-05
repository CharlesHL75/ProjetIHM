package vuegraphique;

import java.awt.BorderLayout;
import java.awt.CardLayout;
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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import control.ControlSIdentifier;



public class FramePrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	ControlSIdentifier controlSIdentifier = new ControlSIdentifier();

	JPanel panContents = new JPanel();
	PanAcceuil panAcceuil= new PanAcceuil();
	PanConnexion panConnexion = new PanConnexion(this, controlSIdentifier);

	private CardLayout cartes = new CardLayout();
	JPanel panBas = new JPanel();
	JPanel panTop  = new JPanel();
	Box boxPanBas  = Box.createHorizontalBox();
	int panActuel = 0; 
	//0 connexion
	//1 acceuil
	//2 my home
	//3 secure
	//4 camera
	//5 pas

	JLabel Jmyhome = new JLabel();
	JLabel Jsecure = new JLabel();
	JLabel Jacceuil = new JLabel();
	JLabel Jcamera = new JLabel();
	JLabel Jhistory = new JLabel();
	
	public FramePrincipal() {
		this.setTitle("IHM");  //Définit un titre
		this.setSize(917, 623); 
		this.setLocationRelativeTo(null); //Positionne au centre la fenetre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Termine le processus lorsqu'on clique sur la croix rouge
		
		this.panAcceuil.initialisation();
		this.panConnexion.initConnexion();
		this.panContents.setLayout(cartes); //ajoute à panContents le Layout de cartes
		this.panContents.add(this.panAcceuil,"ACCEUIL");
		this.panContents.add(this.panConnexion,"CONNEXION");

		this.panBas.setLayout(new BorderLayout()); //Configuration du panel haut de la frame
		//this.panBas.add(boutonAide,BorderLayout.EAST);
		//this.panBas.add(boutonAcceuil,BorderLayout.WEST);
		this.initPanBas();
		this.add(panBas,BorderLayout.SOUTH);
		this.showPanConnexion();
		
		
		this.panBas.setVisible(false);
		this.panTop.setVisible(false);
		this.getContentPane().add(panContents);
		this.showPanConnexion();
		this.setVisible(true);
	}

	

	public void showPanConnexion() {
		this.cartes.show(panContents, "CONNEXION");
		this.repaint();
	}
	
	public void showPanAcceuil() {
		this.cartes.show(panContents, "ACCEUIL");
		this.repaint();
	}
	
	
	public void showPanMyHome() {
		this.cartes.show(panContents, "ACCEUIL");
		this.repaint();
	}
	
	public void showPanSecure() {
		this.cartes.show(panContents, "ACCEUIL");
		this.repaint();
	}
	
	public void showPanCamera() {
		this.cartes.show(panContents, "ACCEUIL");
		this.repaint();
	}

	public JPanel getPanContents() {
		return panContents;
	}

	public CardLayout getCartes() {
		return cartes;
	}
	
	
	public void initPanBas() {
		
		
		
		//MY HOME
		BufferedImage myhome=null;
		try {
			myhome = ImageIO.read(new File("RESSOURCE/panBas/myhome.png"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
		ImageIcon myhome11=new ImageIcon(myhome);
		BufferedImage myhome2=null;
		try {
			myhome2 = ImageIO.read(new File("RESSOURCE/panBas/myhomeV.png"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}	
		ImageIcon myhome22=new ImageIcon(myhome2);
		
		
		//SECURE
		BufferedImage secure=null;
		try {
			secure = ImageIO.read(new File("RESSOURCE/panBas/secure.png"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
		ImageIcon secure11=new ImageIcon(secure);
		BufferedImage secure2=null;
		try {
			secure2 = ImageIO.read(new File("RESSOURCE/panBas/secureV.png"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}	
		ImageIcon secure22=new ImageIcon(secure2);
		
		
		//ACCEUIL
		BufferedImage acceuil=null;
		try {
			acceuil = ImageIO.read(new File("RESSOURCE/panBas/acceuil.png"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
		ImageIcon acceuil11=new ImageIcon(acceuil);
		BufferedImage acceuil2=null;
		try {
			acceuil2 = ImageIO.read(new File("RESSOURCE/panBas/acceuilV.png"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}	
		ImageIcon acceuil22=new ImageIcon(acceuil2);
		
		
		//CAMERA
		BufferedImage camera=null;
		try {
			camera = ImageIO.read(new File("RESSOURCE/panBas/camera.png"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
		ImageIcon camera11=new ImageIcon(camera);
		BufferedImage camera2=null;
		try {
			camera2 = ImageIO.read(new File("RESSOURCE/panBas/cameraV.png"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}	
		ImageIcon camera22=new ImageIcon(camera2);
		
		//HISTPRY
		BufferedImage history=null;
		try {
			history = ImageIO.read(new File("RESSOURCE/panBas/history.png"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
		ImageIcon history11=new ImageIcon(history);
		BufferedImage history2=null;
		try {
			history2 = ImageIO.read(new File("RESSOURCE/panBas/historyV.png"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}	
		ImageIcon history22=new ImageIcon(history2);
		
		//MY HOME
		Jmyhome.setIcon(myhome11);
		Jmyhome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//à ajouter et mettre pour chaque label
		Jmyhome.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
				if (panActuel!=2) {
					Jmyhome.setIcon(myhome22);
					Jacceuil.setIcon(acceuil11);
					Jcamera.setIcon(camera11);
					Jhistory.setIcon(history11);
					Jsecure.setIcon(secure11);
					panActuel=2;
					showPanMyHome();
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
		
		
		//SECURE
		Jsecure.setIcon(secure11);
		Jsecure.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//à ajouter et mettre pour chaque label
		Jsecure.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
				if (panActuel!=3) {
					Jmyhome.setIcon(myhome11);
					Jacceuil.setIcon(acceuil11);
					Jcamera.setIcon(camera11);
					Jhistory.setIcon(history11);
					Jsecure.setIcon(secure22);
					panActuel=3;
					showPanSecure();
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
		
		
		//ACCEUIL
		Jacceuil.setIcon(acceuil22);
		Jacceuil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//à ajouter et mettre pour chaque label
		Jacceuil.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
				if (panActuel!=1) {
					Jmyhome.setIcon(myhome11);
					Jacceuil.setIcon(acceuil22);
					Jcamera.setIcon(camera11);
					Jhistory.setIcon(history11);
					Jsecure.setIcon(secure11);
					panActuel=1;
					showPanSecure();
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
		
		
		//CAMERA
		Jcamera.setIcon(camera11);
		Jcamera.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//à ajouter et mettre pour chaque label
		Jcamera.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
				if (panActuel!=4) {
					Jmyhome.setIcon(myhome11);
					Jacceuil.setIcon(acceuil11);
					Jcamera.setIcon(camera22);
					Jhistory.setIcon(history11);
					Jsecure.setIcon(secure11);
					panActuel=4;
					showPanCamera();
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
		
		
		//HISTORY
		Jhistory.setIcon(history11);
		Jhistory.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//à ajouter et mettre pour chaque label
		Jhistory.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
				if (panActuel!=5) {
					Jmyhome.setIcon(myhome11);
					Jacceuil.setIcon(acceuil11);
					Jcamera.setIcon(camera11);
					Jhistory.setIcon(history22);
					Jsecure.setIcon(secure11);
					panActuel=5;
					showPanCamera();
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
		
		boxPanBas.add(Jmyhome);
		boxPanBas.add(Jsecure);
		boxPanBas.add(Jacceuil);
		boxPanBas.add(Jcamera);
		boxPanBas.add(Jhistory);	
		panBas.add(boxPanBas);
	}
}
