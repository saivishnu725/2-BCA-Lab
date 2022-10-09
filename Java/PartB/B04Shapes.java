import java.awt.*;

public class B04Shapes extends Canvas {
    public void paint (Graphics g)
    {
        // Rectangle shape
        setBackground(Color.WHITE);
        setForeground(Color.RED);
        g.drawRect(50,75,100,50);
        g.fillRect(200,75,100,50);

        // Rounded corners Rectangle shape
        g.drawRoundRect(50,150,100,50,15,15);
        g.fillRoundRect(200,150,100,50,15,15);

        //Oval shape
        g.drawOval(50,250,50, 60);
        g.fillOval(200,250,50, 60);

        // Arch - with changed background and foreground
        g.drawArc(50, 350, 100,50,25,75);
        g.fillArc(200, 350, 100,50,25,75);
    }

    public static void main (String args[]){
        B04Shapes m = new B04Shapes();
        Frame f = new Frame("Shapes");
        f.add(m);
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
