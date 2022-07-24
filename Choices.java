import java.awt.*;
import java.applet.*;
/*
<applet code="Choices" width=700 height=200>
</applet>
*/

public class Choices extends Applet{
  Label text;
  public void init()
 {
  text=new Label("Brand of Laptop"); 
      Choice ch=new Choice();
      ch.add("Asus");
      ch.add("Dell");
      ch.add("Acer");
      ch.add("Lenovo");
      ch.add("HP");
add (text);
   add (ch);
 }
  
} 