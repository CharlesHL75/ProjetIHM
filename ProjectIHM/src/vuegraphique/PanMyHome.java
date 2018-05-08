package vuegraphique;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanMyHome extends JPanel  {
	private static final long serialVersionUID = 4721795520307721056L;
	
	FramePrincipal framePrincipal;
	
	JLabel maison = new JLabel();
	JLabel fenetre1 = new JLabel();
	JLabel fenetre2 = new JLabel();
	JLabel fenetre3 = new JLabel();
	JLabel fenetre4 = new JLabel();
	JLabel porte = new JLabel();
	ImageIcon fentrerougeicn;
	ImageIcon fentreverticn;
	ImageIcon porteverticn;
	ImageIcon porterougeicn;
	ImageIcon planicn;
	ImageIcon maisonicn;
	private Box boxSide = Box.createVerticalBox();
	JButton vueEnsemble = new JButton();
	JButton etage1 = new JButton();
	JButton etage2 = new JButton();
	JButton RDC = new JButton();
	public PanMyHome(FramePrincipal framePrincipal) {
		this.framePrincipal=framePrincipal;
	}

	public void initialisation() {
		this.setBackground(Color.WHITE);
		this.setLayout(null);
		
		BufferedImage planimg=null;
		try {
			planimg = ImageIO.read(new File("RESSOURCE/planEtage2.png"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
		ImageIcon planicn=new ImageIcon(planimg);
		
		
		BufferedImage maisonimg=null;
		try {
			maisonimg = ImageIO.read(new File("RESSOURCE/maison.png"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
		maisonicn=new ImageIcon(maisonimg);
		
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
		
		etage1.setText("Étage 1");
		etage1.setBackground(Color.WHITE);
		etage1.setForeground(Color.BLACK); 
		etage1.setFocusPainted(false);
		etage1.setFont(new Font("Robotic", Font.BOLD, 23));
		etage1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		etage1.setPreferredSize(new Dimension(130,40));
		etage1.setMaximumSize(new Dimension(130,40));
		etage1.setMinimumSize(new Dimension(130,40));

	
		RDC.setText("RDC");
		RDC.setBackground(Color.WHITE);
		RDC.setForeground(Color.BLACK); 
		RDC.setFocusPainted(false);
		RDC.setFont(new Font("Robotic", Font.BOLD, 23));
		RDC.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		RDC.setPreferredSize(new Dimension(130,40));
		RDC.setMaximumSize(new Dimension(130,40));
		RDC.setMinimumSize(new Dimension(130,40));
		
		etage2.setText("Étage 2");
		etage2.setBackground(Color.WHITE);
		etage2.setForeground(Color.BLACK); 
		etage2.setFocusPainted(false);
		etage2.setFont(new Font("Robotic", Font.BOLD, 23));
		etage2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		etage2.setPreferredSize(new Dimension(130,40));
		etage2.setMaximumSize(new Dimension(130,40));
		etage2.setMinimumSize(new Dimension(130,40));
		etage2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fenetre1.setVisible(false);
				fenetre2.setVisible(false);
				fenetre3.setVisible(false);
				fenetre4.setVisible(false);
				porte.setVisible(false);
				maison.setIcon(planicn);
				vueEnsemble.setBackground(Color.WHITE);
				etage2.setBackground(new Color(34,119,239));
				

				
			}
		});
		
		
		vueEnsemble.setText("Maison");
		vueEnsemble.setBackground(new Color(34,119,239));
		vueEnsemble.setForeground(Color.BLACK); 
		vueEnsemble.setFocusPainted(false);
		vueEnsemble.setFont(new Font("Robotic", Font.BOLD, 23));
		vueEnsemble.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		vueEnsemble.setPreferredSize(new Dimension(130,40));
		vueEnsemble.setMaximumSize(new Dimension(130,40));
		vueEnsemble.setMinimumSize(new Dimension(130,40));
		vueEnsemble.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				maison.setVisible(true);
				fenetre1.setVisible(true);
				fenetre2.setVisible(true);
				fenetre3.setVisible(true);
				fenetre4.setVisible(true);
				porte.setVisible(true);
				maison.setIcon(maisonicn);
				etage2.setBackground(Color.WHITE);
				vueEnsemble.setBackground(new Color(34,119,239));
				

				
			}
		});
		
		boxSide.add(etage2);
		boxSide.add(Box.createRigidArea(new Dimension(0,40)));
		boxSide.add(etage1);
		boxSide.add(Box.createRigidArea(new Dimension(0,40)));
		boxSide.add(RDC);
		boxSide.add(Box.createRigidArea(new Dimension(0,40)));
		boxSide.add(vueEnsemble);
		boxSide.setBounds(80,80,400,400);
		fenetre1.setIcon(fentrerougeicn);
		fenetre2.setIcon(fentreverticn);
		fenetre3.setIcon(fentrerougeicn);
		fenetre4.setIcon(fentrerougeicn);
		porte.setIcon(porteverticn);
		maison.setIcon(maisonicn);
		maison.setBounds(300,-25,700,500);
		fenetre1.setBounds(400,155,101,49);
		fenetre2.setBounds(640,155,101,49);
		fenetre3.setBounds(640,250,101,49);
		fenetre4.setBounds(400,250,101,49);
		porte.setBounds(525,346,98,72);
		initListenerPorteFenetre();
		this.add(boxSide);
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
		     		framePrincipal.panSecure.Jcadenas.setIcon(framePrincipal.panSecure.cadenas_ouvert2);
		     		framePrincipal.panSecure.JTexteEtat.setText("Your home is not armed");
		     		framePrincipal.panSecure.JTexteEtat2.setText("                ");
		     		framePrincipal.panSecure.setOuvert(true);
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
		     		framePrincipal.panSecure.Jcadenas.setIcon(framePrincipal.panSecure.cadenas_ouvert2);
		     		framePrincipal.panSecure.JTexteEtat.setText("Your home is not armed");
		     		framePrincipal.panSecure.JTexteEtat2.setText("                ");
		     		framePrincipal.panSecure.setOuvert(true);
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
		     		framePrincipal.panSecure.Jcadenas.setIcon(framePrincipal.panSecure.cadenas_ouvert2);
		     		framePrincipal.panSecure.JTexteEtat.setText("Your home is not armed");
		     		framePrincipal.panSecure.JTexteEtat2.setText("                ");
		     		framePrincipal.panSecure.setOuvert(true);
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
		     		framePrincipal.panSecure.Jcadenas.setIcon(framePrincipal.panSecure.cadenas_ouvert2);
		     		framePrincipal.panSecure.JTexteEtat.setText("Your home is not armed");
		     		framePrincipal.panSecure.JTexteEtat2.setText("                ");
		     		framePrincipal.panSecure.setOuvert(true);
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
		     		framePrincipal.panSecure.Jcadenas.setIcon(framePrincipal.panSecure.cadenas_ouvert2);
		     		framePrincipal.panSecure.JTexteEtat.setText("Your home is not armed");
		     		framePrincipal.panSecure.JTexteEtat2.setText("                ");
		     		framePrincipal.panSecure.setOuvert(true);
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
