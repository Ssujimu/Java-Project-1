package Project_1;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class DesertPanelMain extends JFrame{
	
	class DesertPanel extends JPanel implements MouseMotionListener, MouseListener{
	
		public DesertPanel() {
			setBounds(0, 0, 600, 800);
			setLayout(null);
			
			Font f1 = new Font("함초롬돋움", Font.BOLD, 25);
			Font f2 = new Font("함초롬돋움", Font.BOLD, 15);
			
			JLabel text1 = new JLabel("사막에서 마지막까지 데리고 갈 동물은?");
			text1.setBounds(-5, 100, 600, 50);
			text1.setHorizontalAlignment(JLabel.CENTER);
			text1.setFont(f1);
			
			JLabel text2 = new JLabel("<html><body><center>사막에서의 여정이 힘에 부쳤던 당신은<br> <br>"
					+ "어쩔 수 없이 함께 가던 동물들을<br> <br>"
					+ "차례대로 버리고 가기로 결심한다.<br> <br>"
					+ "이 때 당신은 다음 동물들을 어떤 순서로 버리겠는가?</center></body></html>");
			text2.setBounds(-5, 100, 600, 300);
			text2.setHorizontalAlignment(JLabel.CENTER);
			text2.setFont(f2);
			ImageIcon animalImg;

			for (int i = 0; i < 5; i++) {
				animalImg = new ImageIcon("pho/D"+(i+1)+".png");
				JLabel animal = new JLabel(animalImg);
				animal.setBounds(55+100*i, 500, 80, 80);
				animal.setName("D"+(i+1));
				animal.addMouseMotionListener(this);
				animal.addMouseListener(this);
				add(animal);
			}
			
			for (int i = 0; i < 5; i++) {
				JButton blank = new JButton();
				blank.setBounds(55+100*i, 380, 80, 80);
				blank.setEnabled(false);
				add(blank);
			}
			
			JButton goResult = new JButton();
			goResult.setBounds(195, 640, 200, 60);
			goResult.setText("결과 보기");
			goResult.setFont(f2);
			goResult.setBackground(Color.lightGray);
			add(goResult);
			
			add(text1);
			add(text2);
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			int x = e.getComponent().getX()-40+e.getX();
			int y = e.getComponent().getY()-40+e.getY();
			
			e.getComponent().setLocation(x, y);
		}

		@Override
		public void mouseMoved(MouseEvent e) {
		}
		@Override
		public void mouseClicked(MouseEvent e) {
		}
		@Override
		public void mousePressed(MouseEvent e) {
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			
			int x = e.getComponent().getX()-40+e.getX();
			int y = e.getComponent().getY()-40+e.getY();

			for (int i = 0; i < 5; i++) {
				if(x >= 55+100*i && x <= 55+100*i+80 && y >= 380 && y <= 380+80) {
					e.getComponent().setLocation(55+100*i, 380);
				}
			}
		}

		@Override
		public void mouseEntered(MouseEvent e) {
		}
		@Override
		public void mouseExited(MouseEvent e) {
		}
		
	}
	
	public DesertPanelMain() {
		super("사막오막육막칠막");
		setBounds(200, 100, 600, 800);
		
		add(new DesertPanel());
		
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	

	
	public static void main(String[] args) {
		new DesertPanelMain();

	}

}