import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;


public class sayIt {

	public static void main(String[] args) {
		cussing yomama = new cussing();
		yomama.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		yomama.setSize(350,100);
		yomama.setVisible(true);
		yomama.setResizable(false);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		int w = yomama.getSize().width;
		int h = yomama.getSize().height;
		int x = (dim.width-w)/2;
		int y = (dim.height-h)/2;
		yomama.setLocation(x,y);

	}

}
