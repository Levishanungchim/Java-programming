import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class NewApplet extends Applet implements ActionListener
{
	
	List l1=new List(5);
	TextField t1=new TextField(5);
	TextField t2=new TextField(5);
	TextField t3=new TextField(5);
	TextField t4=new TextField(5);
	TextField t5=new TextField(5);
	TextField t6=new TextField(5);
	String msg="these for only triangle";
	Button b1,b2;
	
	public void init()
{
	l1.add("line");
	l1.add("triangle");
	l1.add("rectangle");
	l1.add("oval");
	b1 = new Button("draw");
	b2=new Button("generate");
	add(l1);
	add(b1);
	add(t1);
	add(t2);
	add(t3);
	add(t4);
	add(t5);
	add(t6);
	add(b2);
	b2.addActionListener(this);	
	
}

public void actionPerformed(ActionEvent e)
{
	repaint();	
}
public void paint(Graphics g)
{
		
	if(l1.getSelectedItem()=="oval")
	{
		g.drawOval(Integer.parseInt(t1.getText()),Integer.parseInt(t2.getText()),Integer.parseInt(t3.getText()),Integer.parseInt(t4.getText()));		
	}
	if(l1.getSelectedItem()=="line")
	{
		g.drawLine(Integer.parseInt(t1.getText()),Integer.parseInt(t2.getText()),Integer.parseInt(t3.getText()),Integer.parseInt(t4.getText()));	
	}
	if(l1.getSelectedItem()=="rectangle")
	{
		g.drawRect(Integer.parseInt(t1.getText()),Integer.parseInt(t2.getText()),Integer.parseInt(t3.getText()),Integer.parseInt(t4.getText()));		
	}
	if(l1.getSelectedItem()=="triangle")
	{
		g.drawLine(Integer.parseInt(t1.getText()),Integer.parseInt(t2.getText()),Integer.parseInt(t3.getText		()),Integer.parseInt(t4.getText()));
g.drawLine(Integer.parseInt(t3.getText()),Integer.parseInt(t4.getText()),Integer.parseInt(t5.getText()),Integer.parseInt(t6.getText()));
g.drawLine(Integer.parseInt(t1.getText()),Integer.parseInt(t2.getText()),Integer.parseInt(t5.getText()),Integer.parseInt(t6.getText()));	
	
	}



}

		
}





