import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="Addition" width=600 height=400>
</applet>
*/
public class Addition extends Applet implements ActionListener {
    String msg;
    TextField num1, num2, sum;
    Label l1, l2, l3;
    Button add;
    
    public void init()
    {
        l1 = new Label("Number 1");
        l2 = new Label("Number 2");
        l3 = new Label("Result");
        num1 = new TextField(10);
        num2 = new TextField(10);
        sum = new TextField(10);
        add = new Button("ADD");
        add.addActionListener(this);
        add(l1);
        add(num1);
        add(l2);
        add(num2);
        add(l3);
        add(sum);
        add(add);
    }

    public void actionPerformed(ActionEvent e){
        String arg = e.getActionCommand();
        if(arg.equals("ADD")){
            String s1 = num1.getText();
            String s2 = num2.getText();
            int n1 = Integer.parseInt(s1);
            int n2 = Integer.parseInt(s2);
            int n3 = n1 + n2;
            msg = String.valueOf(n3);
            sum.setText(msg);
        }
    }
    public void paint(Graphics g){
        g.drawString(msg, 30, 70);
    }

}
