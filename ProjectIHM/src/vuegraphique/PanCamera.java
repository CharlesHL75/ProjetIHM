package vuegraphique;

import java.awt.Color;
import java.io.File;

import javax.swing.JPanel;

public class PanCamera extends JPanel  {
	private static final long serialVersionUID = 4721795520307721056L;

	public void initialisation() {
		// TODO Auto-generated method stub
		this.setBackground(Color.WHITE);
		 File vlcInstallPath = new File("root/vlc");
	     EmbeddedMediaPlayer player;

	     public PanCamera(){
	       
			private static final long serialVersionUID = 1L;

			NativeLibrary.addSearchPath("libvlc", vlcInstallPath.getAbsolutePath());
	         EmbeddedMediaPlayerComponent videoCanvas = new EmbeddedMediaPlayerComponent();
	         this.setLayout(new BorderLayout());
	         this.add(videoCanvas, BorderLayout.CENTER);
	         this.player = videoCanvas.getMediaPlayer();
	     }

	     public void play(String media) {
	         player.prepareMedia(media);
	         player.parseMedia();
	         player.play();
	     }
		

	}

}
