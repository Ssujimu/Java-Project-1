package Project_1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.w3c.dom.events.MouseEvent;

public class FirstMain extends JFrame implements ActionListener{
	
	public FirstMain() {
		
		super("2022 테스트");
		setBounds(200, 100, 600, 800);
		setLayout(null);
		
		JPanel jp = new JPanel();
		jp.setBounds(0, 0, 600, 650);
		jp.setLayout(null);
		
		JLabel wel = new JLabel("2022 테스트에 오신걸 환영합니다.");
		wel.setBounds(50, 45, 600, 100);
		Font welf = new Font("휴먼둥근헤드라인", Font.PLAIN, 30);
		wel.setFont(welf);
		
		JButton start = new JButton("START");
		start.setBounds(180, 450, 200, 80);
		start.setBackground(Color.green);
		
		start.addActionListener(this);
		
		jp.add(wel);
		jp.add(start);
		add(jp);
		
		
		
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		
		new FirstMain();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

	
}
