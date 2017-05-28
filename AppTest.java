import java.awt.*;
import java.applet.*;
/*  
<Applet code = "AppTest" width = 500 height = 500>
</Applet>
*/
public class AppTest extends Applet
{
	String msg;
	public void init()
	{
		setForeground(Color.red);
		setBackground(Color.cyan);
		msg = "Inside init()";
	}
	public void start()
	{
		msg +=  "Inside start()";
	}
	public void paint(Graphics g)
	{
		msg +=  "Inside paint()";
		g.drawString(msg,10,30);
	}

}
