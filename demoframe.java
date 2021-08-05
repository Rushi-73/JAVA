import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//in this class we have created basic program of creating frame using java swing and awt
class demoframe implements ActionListener
{
	JFrame f=new JFrame("Login");
	JTextField txt_username=null;
	JPasswordField txt_password=null;
	JButton btn_login=null;
	demoframe()
	{
		f.setVisible(true);
		f.setSize(400,400);
		f.setLocation(450,230);
        f.getContentPane().setBackground(java.awt.Color.GRAY);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        init();
	}

	void init()
	{
		JLabel lb_username=new JLabel();
		lb_username.setText("Username");
		f.add(lb_username);
		lb_username.setBounds(90,30,80,20);

		JLabel lb_password=new JLabel();
		lb_password.setText("Password");
		f.add(lb_password);
		lb_password.setBounds(90,70,80,20);

		 txt_username=new JTextField();
		f.add(txt_username);
		txt_username.setBounds(170,30,80,20);
		//txt_username.addKeyListener(new temp());

		 txt_password=new JPasswordField();
		f.add(txt_password);
		txt_password.setBounds(170,70,80,20);
		txt_password.addKeyListener(new temp());
		

		JButton btn_login=new JButton("Login");
		f.add(btn_login);
		btn_login.setBounds(90,100,80,20);
		btn_login.addActionListener(this);

		JButton btn_cancel=new JButton("Cancel");
		f.add(btn_cancel);
		btn_cancel.setBounds(190,100,80,20);
		btn_cancel.addActionListener(this);

	}

	void loginCheck()
	{
		try
		{
		Connection con=null;
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","2000");

		if(con==null)
		{
			System.out.println("Connection failed");
		}
		else
		{
			PreparedStatement ps=con.prepareStatement("select count(*) from userinfo where uname=? and pword=?");
			String usern=txt_username.getText();
			String password=txt_password.getText();
			ps.setString(1,usern);
			ps.setString(2,password);

			ResultSet rs=ps.executeQuery();
			rs.next();
			int cnt=rs.getInt(1);
			if(cnt==0)
			{
				System.out.println("Login failed");
			}
			else
			{
				System.out.println("Login successfully");
			}

		}
	}catch (Exception e) {
					e.printStackTrace();
				}

	}

	class temp extends KeyAdapter
	{
		public void keyReleased(KeyEvent ke)
		{
			if(ke.getSource()==txt_password)
			{
				if(ke.getKeyText(ke.getKeyCode())=="Enter")
				{
					ke.loginCheck();
				}
			}
			if(ke.getSource()==txt_username)
			{
				String s=txt_username.getText();
				txt_password.setText(s);

			}
		}
	}
	public void actionPerformed(ActionEvent ae)
	{

		if(ae.getActionCommand()=="Login")
		{
		/*if(txt_username.getText().equals("rushi")&&txt_password.getText().equals("1234"))
		{
			System.out.println("Login successfully");
		}
		else
		{
			System.out.println("Login failed");
		}*/
		this.loginCheck();
		
	}
	else if(ae.getActionCommand()=="Cancel")
	{
		System.out.println("Cancel");
	}
	}
	public static void main(String[] args) {
		demoframe d=new demoframe();
	}
}
