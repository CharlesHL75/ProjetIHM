package vuegraphique;


import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
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

public class PanCamera extends JPanel  {
	private static final long serialVersionUID = 4721795520307721056L;
	
	
	JLabel Jcamera1 = new JLabel();
	JLabel Jcamera2 = new JLabel();
	JLabel Jcamera3 = new JLabel();
	JLabel Jcamera4 = new JLabel();
	JLabel Jcamera5 = new JLabel();
	JLabel Jcamera6 = new JLabel();
	JLabel Jcamerabig1 = new JLabel();
	JLabel Jcamerabig2 = new JLabel();
	JLabel Jcamerabig3 = new JLabel();
	JLabel Jcamerabig4 = new JLabel();
	JLabel Jcamerabig5 = new JLabel();
	JLabel Jcamerabig6 = new JLabel();
	

	Box boxligne1  = Box.createHorizontalBox();
	Box boxligne2  = Box.createHorizontalBox();
	
	Box boxcamera1  = Box.createVerticalBox();
	Box boxcamera2  = Box.createVerticalBox();
	Box boxcamera3  = Box.createVerticalBox();
	Box boxcamera4  = Box.createVerticalBox();
	Box boxcamera5  = Box.createVerticalBox();
	Box boxcamera6  = Box.createVerticalBox();
	
	Box boxcamerabig1  = Box.createVerticalBox();
	Box boxcamerabig2  = Box.createVerticalBox();
	Box boxcamerabig3  = Box.createVerticalBox();
	Box boxcamerabig4  = Box.createVerticalBox();
	Box boxcamerabig5  = Box.createVerticalBox();
	Box boxcamerabig6  = Box.createVerticalBox();

	public void initialisation() {
		// TODO Auto-generated method stub
		this.setBackground(Color.WHITE);
		
		
		boxcamerabig1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boxcamerabig2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boxcamerabig3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boxcamerabig4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boxcamerabig5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boxcamerabig6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boxcamera1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boxcamera2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boxcamera3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boxcamera4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boxcamera5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boxcamera6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		boxcamerabig1.setVisible(false);
		boxcamerabig2.setVisible(false);
		boxcamerabig3.setVisible(false);
		boxcamerabig4.setVisible(false);
		boxcamerabig5.setVisible(false);
		boxcamerabig6.setVisible(false);
		
		      
		       //camera 1
			    BufferedImage camera1=null;
		     	try {
				camera1 = ImageIO.read(new File("RESSOURCE/Camera/camera1.png"));
			    } catch (IOException e1) {
			    	e1.printStackTrace();
			    }		
				ImageIcon camera1a=new ImageIcon(camera1);
				Jcamera1.setIcon(camera1a);
				Jcamera1.addMouseListener(new MouseListener() {
					@Override
					public void mouseReleased(MouseEvent e) {
					}
					@Override
					public void mousePressed(MouseEvent e) {
						boxcamerabig1.setVisible(true);
						boxligne1.setVisible(false);
						boxligne2.setVisible(false);
						
						}
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
	
				});

	        	//camera big 1
				BufferedImage camerabig1=null;
				try {
					camerabig1 = ImageIO.read(new File("RESSOURCE/Camera/camera1big.png"));
				} catch (IOException e1) {
					e1.printStackTrace();
				}		
				ImageIcon camerabig1a=new ImageIcon(camerabig1);
				Jcamerabig1.setIcon(camerabig1a);
				Jcamerabig1.addMouseListener(new MouseListener() {
					@Override
					public void mouseReleased(MouseEvent e) {
					}
					@Override
					public void mousePressed(MouseEvent e) {
						boxcamerabig1.setVisible(false);
						boxligne1.setVisible(true);
						boxligne2.setVisible(true);
						}
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
	
				});
				
				//camera 2
				BufferedImage camera2=null;
				try {
					camera2 = ImageIO.read(new File("RESSOURCE/Camera/camera2.png"));
				} catch (IOException e1) {
					e1.printStackTrace();
				}		
				ImageIcon camera2a=new ImageIcon(camera2);
				Jcamera2.setIcon(camera2a);
				Jcamera2.addMouseListener(new MouseListener() {
					@Override
					public void mouseReleased(MouseEvent e) {
					}
					@Override
					public void mousePressed(MouseEvent e) {
						boxcamerabig3.setVisible(true);
						boxligne1.setVisible(false);
						boxligne2.setVisible(false);
						}
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
	
				});
				
				//camera big 2
				BufferedImage camerabig2=null;
				try {
					camerabig2 = ImageIO.read(new File("RESSOURCE/Camera/camera2big.png"));
				} catch (IOException e1) {
					e1.printStackTrace();
				}		
				ImageIcon camerabig2a=new ImageIcon(camerabig2);
				Jcamerabig2.setIcon(camerabig2a);
				Jcamerabig2.addMouseListener(new MouseListener() {
					@Override
					public void mouseReleased(MouseEvent e) {
					}
					@Override
					public void mousePressed(MouseEvent e) {
						boxcamerabig2.setVisible(false);
						boxligne1.setVisible(true);
						boxligne2.setVisible(true);
						}
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
	
				});
				
				//camera 3
				BufferedImage camera3=null;
				try {
					camera3 = ImageIO.read(new File("RESSOURCE/Camera/camera3.png"));
				} catch (IOException e1) {
					e1.printStackTrace();
				}		
				ImageIcon camera3a=new ImageIcon(camera3);
				Jcamera3.setIcon(camera3a);
				Jcamera3.addMouseListener(new MouseListener() {
					@Override
					public void mouseReleased(MouseEvent e) {
					}
					@Override
					public void mousePressed(MouseEvent e) {
						boxcamerabig2.setVisible(true);
						boxligne1.setVisible(false);
						boxligne2.setVisible(false);
						}
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
	
				});
				
				//camera big 3
				BufferedImage camerabig3=null;
				try {
					camerabig3 = ImageIO.read(new File("RESSOURCE/Camera/camera3big.png"));
				} catch (IOException e1) {
					e1.printStackTrace();
				}		
				ImageIcon camerabig3a=new ImageIcon(camerabig3);
				Jcamerabig3.setIcon(camerabig3a);
				Jcamerabig3.addMouseListener(new MouseListener() {
					@Override
					public void mouseReleased(MouseEvent e) {
					}
					@Override
					public void mousePressed(MouseEvent e) {
						boxcamerabig3.setVisible(false);
						boxligne1.setVisible(true);
						boxligne2.setVisible(true);
						}
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
	
				});
				
				//camera 4
				BufferedImage camera4=null;
				try {
					camera4 = ImageIO.read(new File("RESSOURCE/Camera/camera4.png"));
				} catch (IOException e1) {
					e1.printStackTrace();
				}		
				ImageIcon camera4a=new ImageIcon(camera4);
				Jcamera4.setIcon(camera4a);
				Jcamera4.addMouseListener(new MouseListener() {
					@Override
					public void mouseReleased(MouseEvent e) {
					}
					@Override
					public void mousePressed(MouseEvent e) {
						boxcamerabig4.setVisible(true);
						boxligne1.setVisible(false);
						boxligne2.setVisible(false);
						}
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
	
				});
				
				//camera big 4
				BufferedImage camerabig4=null;
				try {
					camerabig4 = ImageIO.read(new File("RESSOURCE/Camera/camera4big.png"));
				} catch (IOException e1) {
					e1.printStackTrace();
				}		
				ImageIcon camerabig4a=new ImageIcon(camerabig4);
				Jcamerabig4.setIcon(camerabig4a);
				Jcamerabig4.addMouseListener(new MouseListener() {
					@Override
					public void mouseReleased(MouseEvent e) {
					}
					@Override
					public void mousePressed(MouseEvent e) {
						boxcamerabig4.setVisible(false);
						boxligne1.setVisible(true);
						boxligne2.setVisible(true);
						}
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
	
				});
				
				
				//camera 5
				BufferedImage camera5=null;
				try {
					camera5 = ImageIO.read(new File("RESSOURCE/Camera/camera5.png"));
				} catch (IOException e1) {
					e1.printStackTrace();
				}		
				ImageIcon camera5a=new ImageIcon(camera5);
				Jcamera5.setIcon(camera5a);
				Jcamera5.addMouseListener(new MouseListener() {
					@Override
					public void mouseReleased(MouseEvent e) {
					}
					@Override
					public void mousePressed(MouseEvent e) {
						boxcamerabig5.setVisible(true);
						boxligne1.setVisible(false);
						boxligne2.setVisible(false);
						}
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
	
				});
				
				//camera big 5
				BufferedImage camerabig5=null;
				try {
					camerabig5 = ImageIO.read(new File("RESSOURCE/Camera/camera5big.png"));
				} catch (IOException e1) {
					e1.printStackTrace();
				}		
				ImageIcon camerabig5a=new ImageIcon(camerabig5);
				Jcamerabig5.setIcon(camerabig5a);
				Jcamerabig5.addMouseListener(new MouseListener() {
					@Override
					public void mouseReleased(MouseEvent e) {
					}
					@Override
					public void mousePressed(MouseEvent e) {
						boxcamerabig5.setVisible(false);
						boxligne1.setVisible(true);
						boxligne2.setVisible(true);
						}
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
	
				});
				
				//camera 6
				BufferedImage camera6=null;
				try {
					camera6 = ImageIO.read(new File("RESSOURCE/Camera/camera6.png"));
				} catch (IOException e1) {
					e1.printStackTrace();
				}		
				ImageIcon camera6a=new ImageIcon(camera6);
				Jcamera6.setIcon(camera6a);
				Jcamera6.addMouseListener(new MouseListener() {
					@Override
					public void mouseReleased(MouseEvent e) {
					}
					@Override
					public void mousePressed(MouseEvent e) {
						boxcamerabig6.setVisible(true);
						boxligne1.setVisible(false);
						boxligne2.setVisible(false);
						}
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
	
				});
				
				//camera big 6
				BufferedImage camerabig6=null;
				try {
					camerabig6 = ImageIO.read(new File("RESSOURCE/Camera/camera6big.png"));
				} catch (IOException e1) {
					e1.printStackTrace();
				}		
				ImageIcon camerabig6a=new ImageIcon(camerabig6);
				Jcamerabig6.setIcon(camerabig6a);
				Jcamerabig6.addMouseListener(new MouseListener() {
					@Override
					public void mouseReleased(MouseEvent e) {
					}
					@Override
					public void mousePressed(MouseEvent e) {
						boxcamerabig6.setVisible(false);
						boxligne1.setVisible(true);
						boxligne2.setVisible(true);
						}
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
	
				});
				
				boxcamerabig1.add(Jcamerabig1);
				boxcamerabig2.add(Jcamerabig2);
				boxcamerabig3.add(Jcamerabig3);
				boxcamerabig4.add(Jcamerabig4);
				boxcamerabig5.add(Jcamerabig5);
				boxcamerabig6.add(Jcamerabig6);
				
				boxcamera1.add(Jcamera1);
				boxcamera2.add(Jcamera2);
				boxcamera3.add(Jcamera3);
				boxcamera4.add(Jcamera4);
				boxcamera5.add(Jcamera5);
				boxcamera6.add(Jcamera6);
				
				boxligne1.add(boxcamera1);
				boxligne1.add(boxcamera2);
				boxligne1.add(boxcamera3);
				boxligne2.add(boxcamera4);
				boxligne2.add(boxcamera5);
				boxligne2.add(boxcamera6);
				
				boxligne1.add(Box.createRigidArea(new Dimension(0,250)));
				this.add(boxligne1);
				boxligne1.add(Box.createRigidArea(new Dimension(0,250)));
				this.add(boxligne2);
				
				this.add(boxcamerabig1);
				this.add(boxcamerabig2);
				this.add(boxcamerabig3);
				this.add(boxcamerabig4);
				this.add(boxcamerabig5);
				this.add(boxcamerabig6);
			
				
				
				
				
			
				
				

	}

}
