package Project_1;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ResultThreadTrend extends JFrame{
	
	
	public ResultThreadTrend() {
		super("결과 로딩중");
		setBounds(200, 100, 600, 800);
		setLayout(null);
		setVisible(true);
		
		ImageIcon img = new ImageIcon("pho/loading.gif");
		JLabel imgp = new JLabel(img);
		imgp.setBounds(130, 200, 300, 300);
		JButton resb = new JButton("결과보기");
		Font resf = new Font("휴먼편지체", Font.BOLD, 15);
		resb.setFont(resf);
		resb.setBackground(Color.white);
		resb.setBounds(230, 450, 100, 50);
		
		Thread thread = new Thread() {

			@Override
			public void run() {
				for (int i = 5; i > 0; i--) {
					try {
						System.out.println(i);
						add(imgp);
						Thread.sleep(1000);	// 1초마다
						
					} catch (InterruptedException e) {
						// TODO: handle exception
					}

				}
				add(resb);
				super.run();
			}
			
			
		};
		
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		thread.start();
		
	}
	
	public static void main(String[] args) {
		
		new ResultThreadTrend();
		
	}

}
