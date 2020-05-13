//advanced program of swing-4
import java. awt.Graphics;
import javax.swing.*;
import java.awt.event.*;
public class p9 extends JFrame //implements MouseListener
{
	JLabel jl1;
	JCheckBox c1;
	//JButton jb1;//making jbutton object 
	p9()
	{
		//jb1=new JButton("click me!!");
		jl1=new JLabel("helllo juhi");
		c1= new JCheckBox();
		add(c1);//adding button in the frame
		setVisible(true);//to switch on visibility
		setSize(300,400);//set size of jframe
		setLayout(new GridLayout(3,3));
		jl1.setBounds(9, 7, 5, 5);
		add(jl1);
		c1.setBounds(50, 50, 100, 30);//set sixe of button
		c1.addItemListener(
				new ItemListener()//used when you do not want to overrride all the methods of  mouseListener interface
				{
					public void itemStateChanged(Mouse Event e)
					{
						e.getStateChange=0;//uncheck
					}
				}
			);
		setDefaultCloseOperation(3);
	}
	public static void main(String args[])
	{	
			p9 obj = new p9();		
	}
		
}
