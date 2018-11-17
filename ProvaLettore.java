package lettore.immagini;

import javax.swing.JFrame;

public class ProvaLettore {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		JFrame frame=LeggiImmagine.leggiImmagine("./Immagini/054.jpg");
		frame.setVisible(true);
		Thread.sleep(5000);
		LeggiImmagine.chiudiFrame(frame);

	}

}
