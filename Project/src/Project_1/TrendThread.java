package Project_1;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TrendThread extends JFrame{
	

	public TrendThread() {
		setBounds(200, 100, 600, 800);
		setLayout(null);
		
		JPanel jp = new JPanel();	// 프레임안에 먼저 패널을 넣자
		add(jp);
		jp.setLayout(null);
		jp.setBounds(0, 0, 600, 800);
		
		JLabel tiLabel = new JLabel();
		tiLabel.setLayout(null);
		tiLabel.setBounds(0, 0, 100, 80);	// 왜 안돼 -> 레이아웃 널 됐다
		
		Font ff = new Font("한컴산뜻돋움", Font.BOLD, 15);
		tiLabel.setFont(ff);
		
		jp.add(tiLabel);
		
		Thread timer = new Thread() {
			
			@Override
			public void run() {
				for (int i = 10; i >= 0; i--) {
					try {
						tiLabel.setText(i+"");
//						System.out.println(i);	// JFrame에 어떻게 나타낼까
						Thread.sleep(1000);	// 1초마다
						
					} catch (InterruptedException e) {
						// TODO: handle exception
					}
				}
				super.run();
			}
		};
		
		timer.start();
		
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	
	
	
	public static void main(String[] args) {
		new TrendThread();
	}

}
