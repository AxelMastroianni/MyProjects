package lettore.immagini;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LeggiImmagine {
	
	private int altezza=500;
	private int base=500;
	
	public static JFrame leggiImmagine(String filename) {
		File f=new File(filename);
		BufferedImage img=null;
		try {
			img=ImageIO.read(f);
			JFrame frame=new JFrame();
			frame.setSize(img.getWidth(),img.getHeight());
			JLabel label=new JLabel(new ImageIcon(img));
			frame.add(label);
			return frame;
		}catch(IOException e) {
			System.out.println("Non ho trovato l'immagine");
			return null;
		}
	}
	
	public static void chiudiFrame(JFrame frame) {
		WindowEvent winClosingEvent=new WindowEvent(frame, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	public static String[] leggiImaggini(String directory) {
		File f=new File(directory);
		return f.list();
	}
	
	public static JPanel leggiImg(String filename) {
		File f=new File(filename);
		BufferedImage img=null;
		try {
			img=ImageIO.read(f);
			JPanel panel=new JPanel();
			panel.setSize(img.getWidth(),img.getHeight());
			JLabel label=new JLabel(new ImageIcon(img));
			panel.add(label);
			return panel;
		}catch(IOException e) {
			System.out.println("Non ho trovato l'immagine");
			return null;
		}
	}

}
