package rnaReader;

import java.awt.*;

import javax.swing.*;

public class Panel extends JFrame
{
	public JButton btnAction;
	public JLabel lblResult;
	public JTextField txtInput;
	public CodonManager manager;
	
	public static void main(String[] args) 
	{
		Panel p = new Panel();
	}
	
	public Panel()
	{
		init();
		setVisible(true);
		setLayout(new GridLayout(2,1));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700,300);
	
		setResizable(false);
	}



	public void init()
	{
		manager = new CodonManager();
		btnAction = new JButton("Calculate");
		btnAction.addActionListener(e->Action());
		lblResult = new JLabel(" Input awaiting");
		txtInput = new JTextField("Enter RNA code Here");
		
		JPanel pnl = new JPanel();
		pnl.setLayout(new GridLayout(1,2));
		pnl.add(txtInput);
		pnl.add(btnAction);
		
		add(pnl);
		
		add(lblResult);
		
		
	}

	
	public void Action()
	{
		lblResult.setText(manager.Action(txtInput.getText()));
	}
	
}
