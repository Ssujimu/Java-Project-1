package Project_1;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

import Project_1.PsychologicalTestMain.*;

public class TrendPanelMain extends JFrame{
	


	class firstHome extends JPanel implements ActionListener{	// 초기 화면 - 시작버튼

		public firstHome() {

			setBounds(0, 0, 600, 650);
			setLayout(null);

			JLabel wel = new JLabel("자 드가자");
			wel.setBounds(50, 45, 600, 100);
			Font welf = new Font("휴먼둥근헤드라인", Font.PLAIN, 30);
			wel.setFont(welf);

			JButton start = new JButton("드가자");
			start.setBounds(180, 450, 200, 80);
			start.setBackground(Color.green);
			start.addActionListener(this);

			
			add(wel);
			add(start);
		}

		@Override
		public void actionPerformed(ActionEvent e) {	// start버튼 눌렀을때
			frameCard2.show(getContentPane(), "UpPanel");
			tt = new TrendTimer();
			tt.start();
		}
	}


	String [] Qu = { //트렌드 퀴즈 문항
			"1. 다음 빈칸에 들어갈 대답은?",
			"2. 둘리가 하는 말로 옳은 것은?",
			"3. 학생들이 외치는 말로 옳은 것은?",
			"4. 다음 인물을 유행어로 옳지 않은 것은?",
			"5. 위 인물의 이름으로 옳은 것은?"
	};

	String [] A1 = { //1번보기
			"무한!도전~",
			"초능력 맛 좀 볼래?",
			"우린 신화예요!",
			"철이 없었죠",
			"비트채드"
	};
	
	String [] A2 = { //2번보기
			"무야~호~",
			"호이! 호이!",
			"지금은 소녀시대",
			"안녕 나의 꼬마아가씨?",
			"바이트채드"
	};
	
	String [] A3 = { //3번보기
			"야~뽀로로다!!",
			"1+1은 귀요미",
			"멈춰",
			"어? 예쁘다",
			"기가채드"
	};
	
	String [] A4 = { //4번보기
			"1박! 2일!!",
			"요리보고 조리봐도 둘리",
			"안녕",
			"안녕~! 난 준이라고 해~",
			"테라채드"
	};
	
	String [] CAs = {
			"2",
			"1",
			"3",
			"4",
			"3"
	};
	
	ImageIcon IMG;
	int score;
	TrendTimer tt;
	JLabel tiLabel;
	
	class TrendTimer extends Thread {	// 시간제한 쓰레드

		@Override
		public void run() {
			while(true) {
				for (int i = 3; i >= 0; i--) {
					System.out.println(i);
					try {
						
						tiLabel.setText("타이머: "+i);	// why안돼
						
						Thread.sleep(1000);

					} catch (Exception e) {

					}
					System.out.println("문제:" + now);
				}
				TrendCard.show(UpPanel, Integer.parseInt(now)+1+"");
				now = Integer.parseInt(now)+1+"";
			}
		}

	}
	
	
	
	class TrendPanel extends JPanel implements ActionListener{
		
		JLabel Qu;
		JRadioButton A1;
		JRadioButton A2;
		JRadioButton A3;
		JRadioButton A4;
		JButton Back;
		JButton Next;
		String CA;

		public TrendPanel() {
			setBounds(0,0,600,790);
			setLayout(null);

			Qu = new JLabel();
			Qu.setBounds(100,350,600,100);

			A1 = new JRadioButton();
			A1.setName("A1");
			A1.setBounds(100,450,200,20);
			A1.addActionListener(this);
			
			A2 = new JRadioButton();
			A2.setName("A2");
			A2.setBounds(300,450,200,20);
			A2.addActionListener(this);
			
			A3 = new JRadioButton();
			A3.setName("A3");
			A3.setBounds(100,600,200,20);
			A3.addActionListener(this);
			
			A4 = new JRadioButton();
			A4.setName("A4");
			A4.setBounds(300,600,200,20);
			A4.addActionListener(this);
			
			Back = new ButtonMove("<<");
			Back.setBounds(100,670,100,50);
			
			Next = new ButtonMove(">>");
			Next.setBounds(350,670,100,50);
			
			ButtonGroup bg = new ButtonGroup();
			bg.add(A1);
			bg.add(A2);
			bg.add(A3);
			bg.add(A4);
			
//			IMG = new ImageIcon();
			JLabel Qimg1 = new JLabel(IMG);
			Qimg1.setBounds(100,40,400,300);
			
			// 타이머 표시할 라벨
			tiLabel = new JLabel("타이머");
			tiLabel.setLayout(null);
			tiLabel.setBounds(10, 20, 100, 80);
			Font ff = new Font("한컴산뜻돋움", Font.BOLD, 15);
			tiLabel.setFont(ff);
			
			add(Qu);
			add(Qimg1);
			add(A1);
			add(A2);
			add(A3);
			add(A4);
			add(Back);
			add(Next);
			add(tiLabel);	// 타이머 
			
		}


		@Override
		public void actionPerformed(ActionEvent e) { //21343
			String Btype = ((JRadioButton)e.getSource()).getName(); //누른 버튼의 이름 A1, A2, A3, A4
//			System.out.println((((JRadioButton)e.getSource()).getParent()).getName()); //해당페널의 이름
			String Qa = (((JRadioButton)e.getSource()).getParent()).getName();
//			System.out.println(Qa);
//			System.out.println(Btype);
			
			if(Qa.equals("0")) { //1문제
				if(Btype.equals("A2")) {
					score+=1;
				}
			}
			else if(Qa.equals("1")) { //2
				if(Btype.equals("A1")) {
					score+=1;
				}
			}
			else if(Qa.equals("2")) { //3
				if(Btype.equals("A3")) {
					score+=1;
					
				}
			}
			else if(Qa.equals("3")) { //4
				if(Btype.equals("A4")) {
					score+=1;
					
				}
			}
			else if(Qa.equals("4")) { //5
				if(Btype.equals("A3")) {
					score+=1;
					
				}
			}
			System.out.println("총점 : "+score);
		}
	}
	
	String now = "0";

	class ButtonMove extends JButton implements ActionListener{
		public ButtonMove(String name1) {
			super(name1);
			setName(name1);
			addActionListener(this);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			now = ((JButton)e.getSource()).getParent().getName();
			
			if(((JButton)e.getSource()).getName()=="<<") {
				TrendCard.show(UpPanel, Integer.parseInt(now)-1+"");
			}
			else {
				tt.stop();
				TrendCard.show(UpPanel, Integer.parseInt(now)+1+"");
				
				tt = new TrendTimer();
				tt.start();
				
			}
		}
	}
	
	ArrayList<TrendPanel> TrendPanelArr;
	CardLayout frameCard2;
	CardLayout TrendCard;
	JPanel UpPanel;
	
	public TrendPanelMain() {
		super("트랜드 검사");
		setBounds(200, 100, 600, 800);
		frameCard2 = new CardLayout();
		setLayout(frameCard2);
		
		firstHome FH = new firstHome();
		add(FH, "FH");
		
		UpPanel = new JPanel();
		UpPanel.setBounds(0,0,600,790);
		UpPanel.setBackground(Color.green);
		
		TrendCard = new CardLayout();
		UpPanel.setLayout(TrendCard);
		
		add(UpPanel, "UpPanel");
		
		TrendPanelArr = new ArrayList<TrendPanel>();
		
		for(int i = 0; i < Qu.length; i++) {
			IMG = new ImageIcon("pic1/Q"+(i+1)+".png");
			TrendPanel tp = new TrendPanel();
			tp.Qu.setText(Qu[i]);
			tp.A1.setText(A1[i]);
			tp.A2.setText(A2[i]);
			tp.A3.setText(A3[i]);
			tp.A4.setText(A4[i]);
			

			if(i==0) {
				tp.CA=CAs[0];
			}
			else if(i==1) {
				tp.CA=CAs[1];
			}
			else if(i==2) {
				tp.CA=CAs[2];
			}
			else if(i==3) {
				tp.CA=CAs[3];
			}
			else if(i==4) {
				tp.CA=CAs[4];
			}
			
			TrendPanelArr.add(tp);
			tp.setName(i+""); //각 패널들 이름 지정
			UpPanel.add(tp,i+"");

		}
		
		
		frameCard2.show(getContentPane(), "FH");
		
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	
	public static void main(String[] args) {
		new TrendPanelMain();
	}

}