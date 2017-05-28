import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*  <Applet code = "mDrag" width = 500 height = 500>
 *  </Applet>
 */
public class mDrag extends Applet implements MouseMotionListener
{
	int mousex;
	int mousey;
	String msg = " ";
	public void init()
	{
		mousex = 0;
		mousey = 0;
		addMouseMotionListener(this);
	}
	public void mouseDragged(MouseEvent me)
	{
		mousex = me.getX();
		mousey = me.getY();
		msg = " * ";
		showStatus("Mouse Dragged:" + mousex + "," + mousey);
		repaint();
	}
	public void mouseMoved(MouseEvent me)
	{
		msg = " ";
		mousex = me.getX();
		mousey = me.getY();
		showStatus("Mouse Moved:" + mousex + "," + mousey);
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,mousex,mousey);
	}
}
