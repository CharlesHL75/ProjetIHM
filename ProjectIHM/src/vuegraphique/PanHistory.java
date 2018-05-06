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
import javax.swing.JPanel;

import autre.ImageJLabel;

public class PanHistory extends JPanel  {
	private static final long serialVersionUID = 4721795520307721056L;
		
	Box boxSide = Box.createVerticalBox();
	ImageJLabel historySide1 = new ImageJLabel("RESSOURCE/panHistory/historySide1.png");
	ImageJLabel historySide3 = new ImageJLabel("RESSOURCE/panHistory/historySide3.png");
	ImageJLabel historySide5 = new ImageJLabel("RESSOURCE/panHistory/historySide5.png");
	ImageJLabel historySide2 = new ImageJLabel("RESSOURCE/panHistory/historySide2V.png");
	ImageJLabel historySide4 = new ImageJLabel("RESSOURCE/panHistory/historySide4N.png");
	
	ImageJLabel history = new ImageJLabel("RESSOURCE/panHistory/history1.png");
	
	boolean side2 = true;
	
	public void initialisation() {
		this.setBackground(Color.WHITE);
		this.setLayout(null);
		
		//INITIALISATION IMAGES
		BufferedImage history11 =null;
		try {
			history11 = ImageIO.read(new File("RESSOURCE/panHistory/history1.png"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
		ImageIcon history1 =new ImageIcon(history11);
		
		BufferedImage history22 =null;
		try {
			history22 = ImageIO.read(new File("RESSOURCE/panHistory/history2.png"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
		ImageIcon history2 =new ImageIcon(history22);

		
		BufferedImage historySide2N2 =null;
		try {
			historySide2N2 = ImageIO.read(new File("RESSOURCE/panHistory/historySide2N.png"));
		} catch (IOException e2) {
			e2.printStackTrace();
		}		
		ImageIcon historySide2N =new ImageIcon(historySide2N2);
		
		BufferedImage historySide2V2 =null;
		try {
			historySide2V2 = ImageIO.read(new File("RESSOURCE/panHistory/historySide2V.png"));
		} catch (IOException e2) {
			e2.printStackTrace();
		}		
		ImageIcon historySide2V =new ImageIcon(historySide2V2);
		
		BufferedImage historySide4N4 =null;
		try {
			historySide4N4 = ImageIO.read(new File("RESSOURCE/panHistory/historySide4N.png"));
		} catch (IOException e4) {
			e4.printStackTrace();
		}		
		ImageIcon historySide4N =new ImageIcon(historySide4N4);
		
		BufferedImage historySide4V4 =null;
		try {
			historySide4V4 = ImageIO.read(new File("RESSOURCE/panHistory/historySide4V.png"));
		} catch (IOException e4) {
			e4.printStackTrace();
		}		
		ImageIcon historySide4V =new ImageIcon(historySide4V4);
		
		
		
		historySide2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//� ajouter et mettre pour chaque label
		historySide2.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
				if(!side2) {
					side2=true;
					historySide2.setIcon(historySide2V);
					historySide4.setIcon(historySide4N);
					history.setIcon(history1);
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
		
		historySide4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//� ajouter et mettre pour chaque label
		historySide4.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
				if(side2) {
					side2=false;
					historySide2.setIcon(historySide2N);
					historySide4.setIcon(historySide4V);
					history.setIcon(history2);
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
		
		
		boxSide.add(historySide1);
		boxSide.add(historySide2);
		boxSide.add(historySide3);
		boxSide.add(historySide4);
		boxSide.add(historySide5);
		history.setBounds(330,15,565,445);
		boxSide.setBounds(0,0,1000,1000);
		this.add(history);
		this.add(boxSide);
		this.setVisible(true);
		
		
	}

	
	
	
}
