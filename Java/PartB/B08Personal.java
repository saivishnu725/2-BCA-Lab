import java.awt.*;
import java.applet.*;
public class B08Personal extends Applet{
		Font f;
		public void init(){
		setSize(500,500);
		f=new Font ("Arial",Font.BOLD,20);
		}

		public void paint(Graphics g)
		{
		g.drawString("=============",50,50);
		g.drawString("Personal Information",50,80);
		g.drawString("=============",50,110);
		g.drawString("Name:Charles",50,140);
		g.drawString("Father Name:James",50,170);
		g.drawString("Date of Birth:02/03/1995",50,200);
		g.drawString("Address No:50,MG Road,Kolar",50,230);
		g.drawString("Mobile Number:9123456789",50,260);
		g.drawString("E-mail:charles1995@gmail.com",50,290);
		}
}

/*
<applet code="B08Personal.class" height="300" width="500"> </applet>
*/


