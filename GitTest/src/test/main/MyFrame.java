package test.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener{
	//������
	public MyFrame(String title) {
		super(title);
		//setBounds(x, y, width, height)
		setBounds(100, 100, 300, 400);
		//�������� ���̾ƿ� ��Ģ �����ϱ� 
		setLayout(new BorderLayout());
		//�������� �ݾ����� process ���� �ǵ��� 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//�������� ȭ�鿡 ���̵��� ���� 
		setVisible(true);
		
		//���� ��ư�� ����� 
		JButton sendBtn=new JButton("����");
		//��ư�� �������� �׼� command �����ϱ� 
		sendBtn.setActionCommand("send");
		//��ư�� �������� ���ʿ� ��ġ�ϱ�
		add(sendBtn, BorderLayout.NORTH);
		//��ư�� �׼� ������ ����ϱ�
		sendBtn.addActionListener(this);
	}
	
	//main �޼ҵ�
	public static void main(String[] args) {
		new MyFrame("���� ������");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//������ ��ư�� �׼� command �� �о�´�.
		String command=e.getActionCommand();
		//�׼� command �� �����̳Ŀ� ���� �б��ϱ�
		if(command.equals("send")) {
			JOptionPane.showMessageDialog(this, "�����մϴ�.");
		}
	}
}












