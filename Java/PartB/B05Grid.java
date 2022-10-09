import java.awt.*;
import java.applet.*;

/*<applet code="Grid.class" width="400" height ="300"></applet>*/

public class B05Grid extends Applet
{
		public void paint(Graphics g)
		{
				int row, col, x, y = 20;
				//row
				for(row = 1; row < 6; row++)
				{
						x = 20;
						//column
						for(col = 1; col < 5; col++)
						{
								g.drawRect(x, y, 20, 20);//drawRect(int x, int y, //int width, int height)
								System.out.println("x = " + x);
								x += 20;
						}
						System.out.println("\n\ny = " + y);
						y += 20;
				}
		}
}
