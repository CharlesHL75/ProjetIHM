package vuegraphique;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanMyHome extends JPanel  {
	private static final long serialVersionUID = 4721795520307721056L;
	private JLabel maison = new JLabel();
	JLabel fenetre1 = new JLabel();
	JLabel fenetre2 = new JLabel();
	JLabel fenetre3 = new JLabel();
	JLabel fenetre4 = new JLabel();
	JLabel porte = new JLabel();
	ImageIcon fentrerougeicn;
	ImageIcon fentreverticn;
	ImageIcon porteverticn;
	ImageIcon porterougeicn;
	
	public void initialisation() {
		// TODO Auto-generated method stub
		this.setBackground(Color.WHITE);
		this.setLayout(null);
		
		BufferedImage maisonimg=null;
		try {
			maisonimg = ImageIO.read(new File("RESSOURCE/maison.png"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
		ImageIcon maisonicn=new ImageIcon(maisonimg);
		
		BufferedImage fentrerougeimg=null;
		try {
			fentrerougeimg = ImageIO.read(new File("RESSOURCE/rectangleRouge.png"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
		fentrerougeicn=new ImageIcon(fentrerougeimg);
		fentrerougeicn.setDescription(new String("rouge"));

		BufferedImage fentrevertimg=null;
		try {
			fentrevertimg = ImageIO.read(new File("RESSOURCE/rectangleVert.png"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
		fentreverticn=new ImageIcon(fentrevertimg);
		fentreverticn.setDescription(new String("vert"));
		
		BufferedImage porterougeimg=null;
		try {
			porterougeimg = ImageIO.read(new File("RESSOURCE/porteRouge.png"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
		porterougeicn=new ImageIcon(porterougeimg);
		porterougeicn.setDescription(new String("rouge"));

		BufferedImage portevertimg=null;
		try {
			portevertimg = ImageIO.read(new File("RESSOURCE/porteVerte.png"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
		porteverticn=new ImageIcon(portevertimg);
		porteverticn.setDescription(new String("vert"));
		
		
		fenetre1.setIcon(fentrerougeicn);
		fenetre2.setIcon(fentreverticn);
		fenetre3.setIcon(fentrerougeicn);
		fenetre4.setIcon(fentrerougeicn);
		porte.setIcon(porteverticn);
		maison.setIcon(maisonicn);
		maison.setBounds(300,30,539,391);
		fenetre1.setBounds(400,155,101,49);
		fenetre2.setBounds(640,155,101,49);
		fenetre3.setBounds(640,250,101,49);
		fenetre4.setBounds(400,250,101,49);
		porte.setBounds(525,346,98,72);
		initListenerPorteFenetre();
		this.add(fenetre1);
		this.add(fenetre2);
		this.add(fenetre3);
		this.add(fenetre4);
		this.add(porte);
		this.add(maison);
		
	}

	private void initListenerPorteFenetre() {

		fenetre1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//à ajouter et mettre pour chaque label
		fenetre1.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
				if (   (((ImageIcon) fenetre1.getIcon()).getDescription()).equals("rouge")) {
					fenetre1.setIcon(fentreverticn);
				} else {
					fenetre1.setIcon(fentrerougeicn);
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
		
		
		fenetre2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//à ajouter et mettre pour chaque label
		fenetre2.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
				if (   (((ImageIcon) fenetre2.getIcon()).getDescription()).equals("rouge")) {
					fenetre2.setIcon(fentreverticn);
				} else {
					fenetre2.setIcon(fentrerougeicn);
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
		
		
		
		
		
		fenetre3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//à ajouter et mettre pour chaque label
		fenetre3.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
				if (   (((ImageIcon) fenetre3.getIcon()).getDescription()).equals("rouge")) {
					fenetre3.setIcon(fentreverticn);
				} else {
					fenetre3.setIcon(fentrerougeicn);
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
		
		
		
		
		
		fenetre4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//à ajouter et mettre pour chaque label
		fenetre4.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
				if (   (((ImageIcon) fenetre4.getIcon()).getDescription()).equals("rouge")) {
					fenetre4.setIcon(fentreverticn);
				} else {
					fenetre4.setIcon(fentrerougeicn);
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
		
		
		
		
		porte.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//à ajouter et mettre pour chaque label
		porte.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
				if (   (((ImageIcon) porte.getIcon()).getDescription()).equals("rouge")) {
					porte.setIcon(porteverticn);
				} else {
					porte.setIcon(porterougeicn);
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
		
	}

}
