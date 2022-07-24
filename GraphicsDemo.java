/*<applet code="GraphicsDemo.class" width="500" height="500"> </applet>*/

import java.applet,Applet;
import java.awt.*;

public class GraphicsDemo extends Applet{
public void paint(Graphics g)
{
g.setColor(Color.red);
g.drawString("welcome",50,50);
g.drawLine(20,30,20,300);
g.drawRect(70,100,30,30);
g.drawOval(70,200,30,30);
g.setColor(Color.green);
g.fillOval(170,200,30,30);
g.drawArc(90,150,30,30,30,270);
g.fillArc(270,150,30,30,3,189)
}
}