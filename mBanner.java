import java.awt.*;
import java.applet.*;
/*  <Applet code="mBanner" width=500 height=500>
    </Applet>
*/
public class mBanner extends Applet implements Runnable
{
	String msg;
	Thread t;
	boolean stopFlag;
	public void init()
	{
		setForeground(Color.black);
		setBackground(Color.cyan);
		msg = "A simple moving banner ";
	}
	public void start()
	{
		t = new Thread(this);
		stopFlag = false;
		t.start();
	}
	public void run()
	{
		char ch;
		for(;;)
		{
			try
			{
				repaint();
				Thread.sleep(250);
				ch = msg.charAt(0);
				msg = msg.substring(1,msg.length());
				msg +=  ch;
				if(stopFlag)
					break;
			}
			catch(InterruptedException e)
			{

			}
		}
	}
	public void stop()
	{
		stopFlag = true;
		t = null;
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,10,30);
	}
}
