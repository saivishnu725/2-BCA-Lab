import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class B11MouseEvents extends Applet implements MouseListener{
		String msg = "Initial Message";
		
		public void init(){
				addMouseListener(this);
		}

		public void mouseClicked(MouseEvent m){
				msg = "Mouse Clicked";
				repaint();
		}
		public void mousePressed(MouseEvent m){
				msg = "Mouse Pressed";
				repaint();
		}

		public void mouseReleased(MouseEvent m){
				msg = "Mouse Released";
				repaint();
		}

		public void mouseEntered(MouseEvent m){
				msg = "Mouse Entered";
				repaint();
		}

		public void mouseExited(MouseEvent m){
				msg = "Mouse Exited";
				repaint();
		}

		public void paint(Graphics g){
				g.drawString(msg, 30, 30);
		}
}

/* <applet code="B11MouseEvents.class" height=300 width=300> </applet> */
