package design;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class FrameInitializer {
	
	public void setIcon (JFrame frame) 
	{
		Image title = new ImageIcon(this.getClass().getResource("/title.png")).getImage();
		frame.setIconImage(title);
	}
	
	public void setDim (JFrame frame)
	{
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(dim.width,dim.height);
		frame.setLocation(0,0);
	}
}
