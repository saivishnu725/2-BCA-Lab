import java.applet.*;
import java.awt.*;

public class B03AppletWindow extends Applet{
		public void init(){
				System.out.println("Applet initialised");
		}
		public void paint(Graphics g){
				g.setColor(Color.RED);
				g.drawString("Hello World", 20, 20);
		}
}

/* <applet code="B03AppletWindow.class" height=300 width=300> </applet> */
