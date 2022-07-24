import java.applet.Applet;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;


public class shape extends Applet implements ItemListener {

    Choice myChoice;

    int rectX;
    int rectY;
    int rectWidth ;
    int rectHeight;
    String shape;
    int Selection; 

    public void init()
    {
       
        myChoice = new Choice();
        myChoice.addItem("choose to draw");
        myChoice.addItem("Draw a rectangle");
        myChoice.addItem("Draw a Line");
        myChoice.addItem("Draw an Oval");
myChoice.addItem("Draw a triangle");
        add(myChoice);
        myChoice.addItemListener(this);
    }

public void itemStateChanged (ItemEvent e)
    {
        
         Selection = myChoice.getSelectedIndex();
         repaint();
    }

public void paint(Graphics g)
{
         super.paint(g);

         if (Selection == 1)
         { 
            
             g.drawRect(50,50,100,100);
         }
         if (Selection == 2)
         {
             g.drawLine(50,50,200,50);
         }
         if (Selection == 3)
         {
            
             drawAnOval(50,50,200,50,g);

         }
if (Selection == 4)
         { 
            
            int x[]={100,70,130};
    int y[]={50,100,100};
g.drawPolygon(x,y,3);
         }
}

 
public void drawAnOval(int ovalX, int ovalY, int ovalWidth, int ovalHeight, Graphics g)
  {
    g.drawOval(ovalX, ovalY, ovalWidth, ovalHeight);
  }

}