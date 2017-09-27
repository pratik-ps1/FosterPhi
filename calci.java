package Calculator;
import java.awt.*;
import java.awt.event.*;
public class calci {

	public static void main(String[] args) {
      
		new AwtEx().setVisible(true);
	}

}
class AwtEx extends Frame
{
	Button b1,b2;
	Label l1,l2,l3,l4,l5;
	TextField tf1,tf2;
	Panel p;
	AwtEx()
	{
		super("My Mini Calculator");
		setBackground(Color.GRAY);
		setLayout(null);
		setSize(400,300);
		l1= new Label("Mini Calculator");
		l1.setForeground(Color.WHITE);
		l1.setBounds(150, 60, 100, 20);
		add(l1);
		p= new Panel();
		p.setBackground(Color.YELLOW);
		p.setBounds(60, 100, 280, 140);
		add(p);
		l2= new Label("Enter 1st No: ");
		l2.setBounds(50,20,80,20);
		p.add(l2);
		tf1= new TextField();
		tf1.setForeground(Color.BLUE);
		tf1.setBounds(150, 20, 50, 20);
		p.add(tf1);
		l3= new Label("Enter 2nd No: ");
		l3.setBounds(50, 60, 80, 20);
		p.add(l3);
		tf2= new TextField();
		tf2.setForeground(Color.BLUE);
		tf2.setBounds(150, 60, 50, 20);
		p.add(tf2);
		b1= new Button("+");
		b1.addActionListener(new A());
		b1.setBounds(50, 100, 40, 30);
		p.add(b1);
		b2= new Button("clear");
		b2.addActionListener(new B());
		b2.setBounds(90, 100, 40, 30);
		p.add(b2);
		l4= new Label("Answer= ");
		l4.setBounds(70, 150, 100, 20);
		p.add(l4);
		l5= new Label("-------------");
		l5.setBounds(180, 150, 100, 20);
		p.add(l5);
		}
	class A implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String s1=tf1.getText();
			String s2=tf2.getText();
			try
			{
				int n1=Integer.parseInt(s1);
				int n2=Integer.parseInt(s2);
				int n=n1+n2;
				String s3=String.valueOf(n);
				l5.setText(s3);
			}
			catch(Exception ex)
			{
				l5.setText(ex.getMessage());
			}
		}

	}
	class B implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			tf1.setText("");
			tf2.setText("");
			l5.setText("-----------------------");
		}
	}
}