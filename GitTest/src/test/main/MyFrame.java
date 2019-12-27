package test.main;

public class MyFrame {

public class MyFrame extends JFrame implements ActionListener{
	//생성자
	public MyFrame(String title) {
		super(title);
		//setBounds(x,y,width,height)
		setBounds(100,100,300,400);
		//프레임의 레이아웃 법칙 지정하기
		setLayout(new BorderLayout());
		//프레임을 닫았을 때 process 종료되도록
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//프레임이 화면에 보이도록 설정
		setVisiable(true);
		
		//전송 버튼을 만들고
		JButton sendBtn =new JButton("전송");
		//버튼을 눌렀을 때 액션 command 지정하기
		sendBtn.setActionCommand("sendBtn");
		//버튼을 프레임의 북쪽에 배치하기
		add(sendBtn, Borderlayout.NORTH);
		//버튼에 액션리스너 등록하기
		sendBtn.addActionListener(this);
		
	}
	//main 메소드
	public static void main(String[] args) {
		new MyFrame("나의 프레임");
	}
	
	public void actionPerformed(ActionEvent e) {
		//눌러진 버튼의 액션 command을 읽어온다
		String command=e.getActionCommand();
		//액션  command가 무엇이냐에 따라서 분기하기
		if(command.equals("send")) {
			JOptionPane.showMessageDialog(this,"전송합니다");
		}
	}
	}
}
