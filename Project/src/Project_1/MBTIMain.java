package Project_1;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import javax.swing.*;

public class MBTIMain extends JFrame {
	
	class FirstHome extends JPanel implements ActionListener{	// 초기 화면 - 시작버튼, 판넬
		
//		Container con;	// 컨테이너
//		CardLayout card;
		
		public FirstHome() {	// 첫화면 셋팅
			
			setBounds(0, 0, 600, 650);
			setLayout(null);
			
			// 웰컴
			JLabel wel = new JLabel("2022 테스트에 오신걸 환영합니다.");
			wel.setBounds(50, 45, 600, 100);
			Font welf = new Font("휴먼둥근헤드라인", Font.PLAIN, 30);
			wel.setFont(welf);
			
			// 첫 화면 이미지
			ImageIcon icon = new ImageIcon("pho/science.png");
			ImageIcon icon2 = new ImageIcon("pho/science2.png");
			JLabel ic = new JLabel(icon);
			JLabel ic2 = new JLabel(icon2);
			ic.setBounds(95, 200, 250,200);
			ic2.setBounds(280, 200, 250, 200);
			add(ic);
			add(ic2);
			
			
			// 두 가지 테스트 시작 버튼 두 가지
			JButton start = new JButton("성격 유형 검사 하러가기");	// 첫 번째 검사버튼
			Font startf = new Font("휴먼모음T", Font.BOLD, 25);
			start.setFont(startf);
			start.setBounds(120, 450, 350, 80);
			start.setBackground(new Color(92, 209, 229));
			start.addActionListener(this);	// 첫 번째 테스트 버튼 눌렀을 시
			
			JButton start2 = new JButton("사막 심리 테스트");	// 다른 검사 버튼
			start2.setFont(startf);
			start2.setBounds(120, 540, 350, 80);
			start2.setBackground(new Color(153, 112, 0));
//			start2.addActionListener(this);	// 두 번째 테스트 버튼 눌렀을 시
			
			JButton start3 = new JButton("트렌드 능력고사 보러가기");
			start3.setFont(startf);
			start3.setBounds(120, 630, 350, 80);
			start3.setBackground(new Color(67, 116, 217));
			
			
			
			add(wel);
			add(start);
			add(start2);
			add(start3);
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {	// start버튼 눌렀을때 어떻게 할까요..
			frameCard.show(getContentPane(), "upPanel");	// 해결완료
			
		}
		

	}
	

	String[] questions = {
			"친구의 소개로 소개팅에 나온 나는?",
			"주말에 난?",
			"다른 사람과 이야기 할 때 나는?",
			"친구들과의 약속이 취소된다면 나는?",
			"갑자기 약속이 잡히게 된다면?",

			"연인이 길을 가다가 누군가와 부딪혔다. 그때의 나는?",
			"<html><body><center>애인이 나 변한 거 없어?<br> <br>라고 물어볼때 나는?</center></body></html>",
			"<html><body><center>직장 상사가 짜증나게 할 때<br> <br>연인과 통화하면 나는?</center></body></html>",
			"연인과의 말다툼 중 나는?",
			"아래의 말 중 내가 동료들에게 들은 말은?",

			"<html><body><center>고민을 얘기하는 친구, 듣다 보니<br> <br>친구의 잘못인 것 같다. 그럴 때 나는?</center></body></html>",
			"누군가의 부탁을 거절해야 하는 상황이 오면 나는?",
			"다른 사람과 대화할 때 거슬린다고 생각되는 것은?",
			"누군가를 설득할 때 나는?",
			"화났을 때 나는?",

			"여행을 갔을 때 나의 모습과 비슷한 것은?",
			"내가 편안함을 느낄 때는?",
			"계획이란",
			"준비물을 준비할 때 나는?",
			"<html><body><center>끝나고 집에 가서 공부하려 했는데,<br> <br>친구들이 놀자고 붙잡는다.</center></body></html>"
	};

	String[] answers1 = {

			"먼저 말 걸면서 분위기를 띄운다.",
			"사람들과 만나는 것을 즐긴다.",
			"내가 주로 말 하는 편이다.",
			"친구들을 만나지 못해 아쉽다.",
			"갑작스런 만남은 재밌고 좋다.",

			"저기요! 사과하셔야죠! 일단 따지고 본다. ", //S
			"앞머리 잘랐어? 틀린 그림 찾기처럼 다 찾아낸다.", //S
			"<html><body><center>오늘 나에게 일어난 일을<br> <br>처음부터 끝까지 다 이야기한다.</center></body></html>", //S
			"연인의 기분이 조금 상하더라도 팩트가 우선이다.",
			"과장님은 너무 칼같아요. 먼저 다가가기 어려워요.",
			
			"논리적으로 친구의 잘못된 점을 말해 준다.",
			"단호하게 할 수 없다고 말한다.",
			"대화의 주제에 벗어나거나 잘못된 사실을 말할 때",
			"<html><body><center>상대방의 의견보다 더<br> <br>합리적이고 논리적인 방안을 제시한다.</center></body></html>",
			"논리적으로 잘 말하면서 따진다.",

			"<html><body><center>기존에 내가 미리 준비한 계획이 틀어지면<br> <br>마음이 불안하지만 플랜B를 꺼낸다.</center></body></html>",
			"<html><body><center>준비되어 있다는 편안함을 위해<br> <br>미리미리 계획해야 마음의 안정감을 느낀다.</center></body></html>",
			"<html><body><center>세세하게 세우지 않더라도 전체적인 틀이나<br> <br>그 날 하루의 가이드라인 같은 것</center></body></html>",
			"하루 전 날 미리 준비한다.",
			"계획에 없던 일인데...매우 당황스럽다."
	};

	String[] answers2 = {
			"말을 걸어올 때까지 기다리고 본다.",
			"혼자 있는 게 싫지 않은 편이다.",
			"내가 주로 듣는 편이다.",
			"<html><body><center>친구들을 만나는게 싫진 않지만,<br> <br>약속이 취소되어 혼자있게 된 시간이 좋다.</center></body></html>",
			"<html><body><center>갑작스런 만남은 부담스럽다.<br> <br> 최소 며칠 전에 약속하고 만나는게 좋다.</center></body></html>",

			"괜찮아? 다친데 없어? 연인을 위로한다.", //N
			"스타일이 바뀌었네? 잘 눈치 못채서 삐질삐질", //N
			"일단 상사 욕부터 하고 있었던 일은 대충 얘기한다.", //N
			"팩트보다는 연인의 기분이 우선이다. ",//N
			"<html><body><center>과장님은 따뜻하고 상냥하세요.<br> <br>사회생활하기에 너무 여려요</center></body></html>",//N

			"<html><body><center>직접적으로 말하면 친구가 그래 할까봐<br> <br>최대한 돌려서 말한다.</center></body></html>",
			"고민하다가 대부분 들어주는 편이다.",
			"다른 사람의 감정을 무시하는 표현을 할 때",
			"<html><body><center>상대방의 감정을 공감하면서<br> <br>대화하며 설득하려고 노력한다.</center></body></html>",
			"할 말이 많지만 너무 분해서 눈물부터 난다.",

			"그날의 기분, 날씨에 따라 유동적으로 계획을 세운다.",
			"<html><body><center>내가 하고 싶은 일을 자유롭게 할 수 있을 때<br> <br>마음이 편하다.</center></body></html>",
			"계획? 무계획도 계획의 일부다.",
			"'내일 챙겨야지' 하다가 까먹고 놓고 오는 일이 많다.",
			"오케이! 역시 계획대로 안 되는 것이 인생! 놀자!!!"
	};

	String[] types = {
			"EI",
			"SN",
			"TF",
			"JP"
	};
	
	// MBTI 결과 모음
	String [] features = {
			"별따먹자", //INFP_박수지
			"프레첼", //ESFJ_최한별
			"꿀꽈배기" //ISFJ_송지은
	};
	String [] feats = {
			"심리테스트, mbti테스트가 나오면 일단 무조건 하고 보는 편임.\n"
					+ "관종이지만 막상 관심을 받으면 어색해하고 어쩔 줄 모르는 모습이 관찰됨. 끈기 없고,\n"
					+ "계획적이지 못해 벼락치기를 하는 편이지만 막상 하면 잘 해내는 학생임.\n"
					+ "집에 있을 때면 연락은 잘 안되는 편이고, 혼자 있는 것을 선호할 때가 있음.\n"
					+ "가끔은 우울한 모습을 보이는데, 본인의 우울한 감정을 싫어하지 않는 편임.\n"
					+ "사람들한테 상처 주는 것도, 받는 것도 정말 싫어함.",

					"철저하고 질서정연한 학생으로 계획을 잘 세우고 그에 맞춰 생활하고자 노력함.\n"
							+ "공감능력이 뛰어나 평소 남의 일도 내 일처럼 생각하고 고민상담을 해주는 편임.\n"
							+ "그러나 쓸데없이 걱정이 너무 많은 면모도 있어 이를 조금 고칠 필요가 있음.\n"
							+ "핵인싸기질이 있어서 사회생활도 잘하고 자연스럽게 분위기를 풀어나가는 학생임.",

							"하자고 하면 거의 다 해주고 거절, 부탁을 잘 못하는 편의 학생임.\n"
									+ "게으른 완벽주의자 성향이 있어 계획을 세우고 그대로 지켜야 마음이 편함.\n"
									+ "상황에 따라 외향, 내향 왔다갔다하는 편이라 가끔 본인도 본인을 잘 모르겠음.\n"
									+ "배려심도 많고 공감도 잘해주고 사람들이랑 어울리는 거 좋아하는 편임.\n"
									+ "그렇지만 또 혼자 노는 것도 되게 좋아함.\n"
									+ "사람들은 내 인생이 노잼이라지만 난 나름대로 내 인생 재밌고 좋음."
	};
	String [] friends = {
			"남이 나를 어떻게 생각할지 늘 고민하고 걱정하는 모습이 보임.\n"
					+ "인간 관계에 조금 예민하게 반응하는 편이라 본인을 소중하게 대해줬으면 함.\n"
					+ "친구랑 있는 게 좋지만 혼자만의 시간도 중요하게 생각하는 학생임.\n"
					+ "친구의 얘기를 잘 들어주지만 속으로 딴 생각 하는 모습이 종종 관찰됨.",

					"사람을 좋아하는 편이라 본인의 사람들이 힘들면 본인도 같이 힘들어지는 편임.\n"
							+ "인간관계가 틀어지면 받는 스트레스가 큰 편이고 타인의 눈치를 조금 보는 편임.\n"
							+ "새로운 사람과 만나서 친해지는 것을 정말 좋아하고 배려왕으로 소문남.",

							"본인을 편안하게 해주는 쪽의 사람, 이벤트 잘 챙겨주고 표현을 잘해주는 학생들을 좋아함.\n"
									+ "외로움은 좀 타는데 그렇다고 많은 사람이랑 놀고 싶지는 않음.\n"
									+ "티는 안 나지만 사실은 인간 관계에서 스트레스를 많이 받는 편임."
	};

	String [] MBTItype= {
			"INFP",
			"ESFJ",
			"ISFJ"
	};
		
	
	ArrayList<Character> answerArr;	// 고른 답변 저장
	

	class QAPanel extends JPanel implements ActionListener{

		// 멤버 변수 접근
		JLabel question;
		JToggleButton answer1;
		JToggleButton answer2;
		JButton back;	// 이전문항
		JButton next;	// 다음문항
		JProgressBar progress;	// 진행률 표시바
		JLabel progressText;	// 진행률 문항
		String type;	// 결과 로직에  

		public QAPanel() {	// 문항, 버튼 추가 판넬

//			setLayout(new GridLayout(5, 1));	// 5열 1행
			setBackground(Color.white);
			setLayout(null);
			
			Font qfont = new Font("함초롬돋움", Font.BOLD, 18);	// 질문 글씨
			Font afont = new Font("함초롬돋움", Font.BOLD, 15);	// 답변 글씨

			question = new JLabel();	// 질문 라벨
			answer1 = new JToggleButton();	// 답변성향 1 버튼
			answer2 = new JToggleButton();	// 답변성향 2 버튼
			back = new MoveButton("<<");	// 이전 문항 선택 버튼
			next = new MoveButton(">>");	// 다음 문항

			answer1.setName("answer1");
			answer2.setName("answer2");
			
			answer1.addActionListener(this);
			answer2.addActionListener(this);

			
			ButtonGroup bg = new ButtonGroup();	// 그룹으로 묶어서 중복 선택 안되게
			bg.add(answer1);
			bg.add(answer2);
			
			// 질문 꾸미기
			question.setBounds(-5, 150, 600, 100);
			question.setHorizontalAlignment(JLabel.CENTER);
			question.setFont(qfont);
			
			// 답변 꾸미기
			answer1.setBounds(95, 300, 400, 100);
			answer1.setHorizontalAlignment(SwingConstants.CENTER);
			answer1.setBackground(Color.white);
			answer1.setFont(afont);
			answer2.setBounds(95, 450, 400, 100);
			answer2.setHorizontalAlignment(SwingConstants.CENTER);
			answer2.setBackground(Color.white);
			answer2.setFont(afont);
			
			// 다음, 이전
			back.setBounds(30, 180, 50, 50);
			back.setBackground(Color.white);
			back.setBorderPainted(false);
			back.setOpaque(false);
			next.setBounds(500, 180, 50, 50);
			next.setBackground(Color.white);
			next.setOpaque(false);
			next.setBorderPainted(false);
			
			progress = new JProgressBar(JProgressBar.HORIZONTAL, 0, 20);
			progress.setBounds(95, 620, 400, 20);
			progress.setBackground(Color.white);
			progress.setForeground(new Color(181, 178, 255));
			
			progressText = new JLabel();
			progressText.setBounds(-5, 645, 600, 20);
			progressText.setFont(afont);
			progressText.setHorizontalAlignment(JLabel.CENTER);

			add(question);
			add(answer1);
			add(answer2);
			add(back);
			add(next);
			add(progress);
			add(progressText);
			
			answerArr = new ArrayList<Character>();
			for (int i = 0; i < questions.length; i++) {
				answerArr.add(null);
			}
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			JToggleButton now = (JToggleButton)e.getSource();
			String name = ((QAPanel)now.getParent()).getName();
			System.out.println(name);
			String type = ((QAPanel)now.getParent()).type;
			
			if(now.getName()=="answer1") {
				// now(내가누른 버튼)가 어떤 패널에 올라가 있는지
				answerArr.set(Integer.parseInt(name), type.charAt(0));
//				System.out.println(type.charAt(0));	// type 중 내가 고른 것 하나 가져오기
//				System.out.println(((QAPanel)now.getParent()).type);
			}else {
				answerArr.set(Integer.parseInt(name), type.charAt(1));
			}
		}
	}
	
	class MoveButton extends JButton implements ActionListener{	// 버튼 다음문항 이전 문항 이벤트
		
		public MoveButton(String name) {
			super(name);
			setName(name);
			addActionListener(this);
		}

		@Override
		public void actionPerformed(ActionEvent e) {	// 다음문항 이전 문항 버튼
			
			String now = ((JButton)e.getSource()).getParent().getName();
			
//			System.out.println(now);
			if(((JButton)e.getSource()).getName()=="<<") {
				QACard.show(upPanel, Integer.parseInt(now)-1+"");
			}
			else {
				if(now.equals("19")) {
					boolean check = true;
					
					for (int i = 0; i < answerArr.size(); i++) {
						if(answerArr.get(i)==null) {
							check = false;
						}
					}
					
					if(check) {
						frameCard.show(getContentPane(), "resload");
						resl.thread.start();
					} else {
						JDialog warn = new JDialog(MBTIMain.this, "경고", false);
						warn.setBounds(400, 400, 200, 150);
						warn.setVisible(true);
					}
				}
				QACard.show(upPanel, Integer.parseInt(now)+1+"");
			}
			
		}
	}
	
	
	
	
	class ResultLoading extends JPanel implements ActionListener{	// 결과 로딩창
		
		Thread thread;
		
		public ResultLoading() {
//			super("결과 로딩중");
			
			setLayout(null);
			setBounds(0, 0, 600, 800);
			ImageIcon img = new ImageIcon("pho/loading.gif");
			JLabel imgp = new JLabel(img);
			imgp.setBounds(130, 200, 300, 300);
//			add(imgp);
			
			// 5초뒤 결과보기 버튼 쨘
			JButton resb = new JButton("결과보기");
			Font resf = new Font("휴먼편지체", Font.BOLD, 15);
			resb.setFont(resf);
			resb.setBackground(Color.white);
			resb.setBounds(230, 450, 100, 50);
			resb.addActionListener(this);
			
			thread = new Thread() {	// 실행 되자마자 걍 5초 카운트 세버려서 19문항 다음부터 thread가 실행되었음 좋겠어요 -> 해결!

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
//					super.run();
				}
				
			};
			
//			thread.start();
		}

		@Override
		public void actionPerformed(ActionEvent e) {	// 결과보기 버튼을 눌렀을 때 결과창으로
			// ResultPanel
//			new ResultPanel();
			frameCard.show(getContentPane(), rr.resultCal(answerArr));
		}

	}
	
	ImageIcon IMG;
	
	class ResultPanel extends JPanel{
		
		JLabel features;
		TextArea feats;
		TextArea friends;
		
		public ResultPanel() {
			
			setBounds(0, 0, 600, 650);
			setLayout(null);
			
			JLabel you = new JLabel("당신은...");
			you.setBounds(50,15,80,50);
			Font youF = new Font("휴먼둥근헤드라인", Font.PLAIN,20);
			you.setFont(youF);
			
			JLabel name = new JLabel("특징");
			name.setBounds(50,330,80,50);
			Font nameF = new Font("휴먼둥근헤드라인", Font.PLAIN,20);
			name.setFont(nameF);
			
			features = new JLabel();
			features.setBounds(250,300,80,50);
			Font featureF = new Font("휴먼둥근헤드라인", Font.PLAIN,20);
			features.setFont(featureF);
			
			
			feats = new TextArea();
			feats.setBounds(50, 380, 500, 110);
			feats.setEditable(false);
			
			JLabel friendship = new JLabel("인간관계");
			friendship.setBounds(50,500,80,50);
			Font friendshipF = new Font("휴먼둥근헤드라인", Font.PLAIN,20);
			friendship.setFont(friendshipF);
			
			friends = new TextArea();
			friends.setBounds(50, 550, 500, 100);
			friends.setEditable(false);
			
			//ImageIcon img1 = new ImageIcon("pic1/INFP.png");
			JLabel resImg = new JLabel(IMG);
			resImg.setBounds(190,70,225,230);

			add(resImg);
			add(you);
			add(name);
			add(features);
			add(feats);
			add(friendship);
			add(friends);

		}
		
		String resultCal(ArrayList<Character> arr){

			String resultType = "";
			String types = "EISNTFJP";
			
			LinkedHashMap<Character, Integer> calMap = new LinkedHashMap<Character, Integer>();
			for (int i = 0; i < types.length(); i++) {
				calMap.put(types.charAt(i), 0);
			}

			for (Character c : arr) {
				for (Character key : calMap.keySet()) {
					if(c==key) {
						calMap.put(key, calMap.get(key)+1);
					}
				}
			}

			for (int i = 0; i < types.length()-1; i+=2) {
				if(calMap.get(types.charAt(i)) > calMap.get(types.charAt(i+1))) {
					resultType += types.charAt(i);
				}
				else {
					resultType += types.charAt(i+1);
				}
			}

			System.out.println(resultType);

			return resultType;
		}
	}
	

//	class ResultPanel extends JPanel{	// 결과창
//		public ResultPanel() {
//			setBounds(0,0,600,650);
//			setLayout(null);
//		
//			JLabel res = new JLabel("당신은...");
//			res.setBounds(50,45,600,100);
//			Font resf = new Font("휴먼둥근헤드라인", Font.PLAIN,20);
//			res.setFont(resf);
//			
//			ImageIcon img1 = new ImageIcon("pic/dog2.jpg"); //이미지로 한번 넣어봤습니다.
//			JLabel resImg = new JLabel(img1);
//			resImg.setBounds(20,200,550,400);
//			resImg.setBackground(Color.cyan);
//			add(resImg);
//			add(res);
//			
//			}
//		}
	
	
	
	ArrayList<QAPanel> qaPanelArr;
	CardLayout frameCard;	// start버튼 눌렀을 때 화면 전환 가능하도록 카드레이아웃 걸기
	CardLayout QACard;	// 문항답변 고르고 화면 넘기기
	JPanel bigPanel;
	JPanel upPanel;	// 판넬 안에 문항, 답변 넣기
//	JProgressBar progress;	// 문항 진행률 표시바
	ResultPanel rr;	// 결과창
	ResultLoading resl;	// 결과창 로딩중

	public MBTIMain() {

		super("2022 테스트");	// JFrame 설정
		setBounds(200, 100, 600, 800);
		frameCard = new CardLayout();	// JFrame에 카드 레이아웃넣고
		setLayout(frameCard);

		FirstHome fm = new FirstHome();	// 첫시작화면 부르기
		add(fm, "fm");
		
		
		upPanel = new JPanel();	// 질문 답변 판넬
		upPanel.setBounds(0, 0, 600, 650);
		upPanel.setBackground(Color.pink);

		QACard = new CardLayout();	// 질문 답변 넘기기 창
		upPanel.setLayout(QACard);

		add(upPanel, "upPanel");
		
		
		qaPanelArr = new ArrayList<QAPanel>();

		for (int i = 0; i < questions.length; i++) {	 // 질문 답변 출력
			QAPanel qa = new QAPanel();
			qa.question.setText(questions[i]);
			qa.answer1.setText(answers1[i]);
			qa.answer2.setText(answers2[i]);
			if(i<5) {
				qa.type = types[0];
			}
			else if(i<10) {
				qa.type = types[1];
			}
			else if(i<15) {
				qa.type = types[2];
			}
			else{
				qa.type = types[3];
			}
			
			qa.progress.setValue(i+1);
			qa.progressText.setText((i+1)+"/20");
			
			qaPanelArr.add(qa);
			qa.setName(i+"");
			upPanel.add(qa, i+"");
			
		}
		
		for (int i = 0; i < feats.length; i++) {
			IMG = new ImageIcon("pic1/MBTI"+(i+1)+".png");
			rr = new ResultPanel();
			rr.features.setText(features[i]);
			rr.feats.setText(feats[i]);
			rr.friends.setText(friends[i]);

			rr.setName(MBTItype[i]);
			add(rr, MBTItype[i]);
		}
		
	    resl = new ResultLoading();
	    add(resl, "resload");
	    
	    
		frameCard.show(getContentPane(), "fm");

		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new MBTIMain();
	}

}