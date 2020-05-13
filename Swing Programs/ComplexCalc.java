import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
import LearningSwing.subCalc;

public class ComplexCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame j1= new JFrame();
		JButton ad = new JButton("+");
		JButton sb = new JButton("-");
		JButton mu = new JButton("*");
		JButton di = new JButton("/");
		JTextField jt1 = new JTextField();
		
		subCalc s1=new subCalc();
		//JTextField jt2 = new JTextField();
		JLabel jl = new JLabel("Answer");
		//JLabel jl1 = new JLabel("First:");
		//JLabel jl2 = new JLabel("Second:");
		j1.setVisible(true);
		j1.setSize(500, 300);
		j1.setLayout(null);
		//jt.setBounds(25, , width, height);
		//jl1.setBounds(50, 10, 30, 30);
		//jl2.setBounds(250, 10, 50, 30);
		jt1.setBounds(50, 10, 300, 30);
		//jt2.setBounds(300, 10, 150, 30);
		
		ad.setBounds(50, 50, 100, 30);
		sb.setBounds(150,50 , 100, 30);
		mu.setBounds(250,50, 100, 30);
		di.setBounds(350, 50, 100, 30);
		
		jl.setBounds(175, 100, 50, 30);
		
		j1.add(ad);j1.add(mu);j1.add(sb);j1.add(di);j1.add(jt1);
		//j1.add(jt2);j1.add(jl);
		//j1.add(jl1);j1.add(jl2);
		
		//jt2.setVisible(true);
		jt1.setVisible(true);
		
		ad.setVisible(true);
		sb.setVisible(true);
		sb.setVisible(true);
		di.setVisible(true);
		
		//jl.setVisible(true);
		//jl1.setVisible(true);
		//jl2.setVisible(true);
		ad.addActionListener(s1);
		sb.addActionListener(s1);
		mu.addActionListener(s1);
		di.addActionListener(s1);

	}

}
