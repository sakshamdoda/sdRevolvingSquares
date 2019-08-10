import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Entry {
public static void main(String[] args) {
	Mainframe frm=new Mainframe();
}
}
class Mainframe extends JFrame {
public Mainframe()
{
	setLayout(null);
	setTitle("Revolving Squares");
	setVisible(true);
	setBounds(0,0,500,500);
	JButton btn=new JButton("Start");
	btn.setBounds(50,50,100,20);
	add(btn);
	btn.addActionListener(new ButtonHandler(this));
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
class ButtonHandler implements ActionListener {
Mainframe frm;
public ButtonHandler(Mainframe f)
{
	frm=f;
}
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("button clicked");
BouncingSquare1 objBouncingSquare1=new BouncingSquare1(frm);
objBouncingSquare1.start();
BouncingSquare2 objBouncingSquare2=new BouncingSquare2(frm);
objBouncingSquare2.start();
BouncingSquare3 objBouncingSquare3=new BouncingSquare3(frm);
objBouncingSquare3.start();
BouncingSquare4 objBouncingSquare4=new BouncingSquare4(frm);
objBouncingSquare4.start();
circle objcircle=new circle(frm);

try {
	objBouncingSquare1.join();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
try {
	objBouncingSquare2.join();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
try {
	objBouncingSquare3.join();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
try {
	objBouncingSquare3.join();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
if(objBouncingSquare1.isAlive()==false)
{
	objcircle.start();
}

	}
}
class BouncingSquare1 extends Thread
{
	Mainframe x;
	public BouncingSquare1(Mainframe frm)
	{
		x=frm;
	}
	public void run()
	{
		Graphics grp=x.getGraphics();
		int xpos=200,ypos=200;
		grp.setXORMode(Color.white);
		while(xpos<300)
		{
			grp.drawRect(xpos,ypos,50,50);
			xpos++;
			ypos++;
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
}
class BouncingSquare2 extends Thread
{
	Mainframe x;
	public BouncingSquare2(Mainframe frm)
	{
		x=frm;
	}
	public void run()
	{
		Graphics grp=x.getGraphics();
		int xpos=300,ypos=300;
		grp.setXORMode(Color.white);
		while(xpos>200)
		{
			grp.drawRect(xpos,ypos,50,50);
			xpos--;
			ypos++;
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
}
class BouncingSquare3 extends Thread
{
	Mainframe x;
	public BouncingSquare3(Mainframe frm)
	{
		x=frm;
	}
	public void run()
	{
		Graphics grp=x.getGraphics();
		int xpos=200,ypos=400;
		grp.setXORMode(Color.white);
		while(xpos>100)
		{
			grp.drawRect(xpos,ypos,50,50);
			xpos--;
			ypos--;
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
}
class BouncingSquare4 extends Thread
{
	Mainframe x;
	public BouncingSquare4(Mainframe frm)
	{
		x=frm;
	}
	public void run()
	{
		Graphics grp=x.getGraphics();
		int xpos=100,ypos=300;
		grp.setXORMode(Color.white);
		while(xpos<200)
		{
			grp.drawRect(xpos,ypos,50,50);
			xpos++;
			ypos--;
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
}
class circle extends Thread
{
	Mainframe x;
	public circle(Mainframe frm)
	{
		x=frm;
	}
	public void run()
	{
		Graphics grp=x.getGraphics();
		grp.setXORMode(Color.white);
	grp.setColor(Color.cyan);
	grp.fillOval(200,300,50,50);
	}
	
}
