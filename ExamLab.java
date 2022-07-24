import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="ExamLab" width=500 height=500>
</applet>
*/

public class ExamLab extends Applet implements ActionListener {
    Label text;
    TextField test;
    Button draw;
    Choice ch;
    public void init(){
        text = new Label("Shapes");
        draw = new Button("Draw");
        test = new TextField(10);
        Choice ch = new Choice();
        ch.add("Line");
        ch.add("Triangle");
        ch.add("Rectangle");
        ch.add("Oval");
        add(text);
        add(ch);
        add(draw);
        add(test);
        draw.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
        String arg = e.getActionCommand();
        String data = ch.getItem(ch.getSelectedIndex());
        if(arg.equals("Draw")){
        test.setText(data);
        }
    }


}