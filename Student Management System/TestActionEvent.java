import java.awt.*;
import java.awt.event.*;

public class TestActionEvent {
    public static void main(String[] args) {
    Frame f = new Frame("TestActionEent");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Button b1 = new Button("START"); 
    Button b2 = new Button("STOP");   //�����¼�Դ����b2

    Monitor m = new Monitor();        //�����¼�������m
    b2.addActionListener(m);         //  ���¼�Դ����b2ע�ᵽ�¼�������m�У���֪b2�ѱ�m������
    b2.setActionCommand("GAME OVER!");
    f.add(b1, BorderLayout.NORTH);   
    f.add(b2, BorderLayout.SOUTH);   //����ťb2��ӵ����f
    f.pack();                       //  ��������ȷ��Frame�߿��С��������Χ��װ��һ��
    f.setVisible(true);
    }
}

class Monitor implements ActionListener {  //����ʵ�����¼������ӿ�ActionListener���¼���������Monitor

    public void actionPerformed(ActionEvent e) {  //  �¼���Ϣ���������ActionEvent e�д��ݹ������ȴ�����
                                                  //actionPerformed()�������Ǿ���Ĵ����¼��ķ����� 
        System.out.println("A Button has been pressed!\n" + 
        "the relative info is:" + e.getActionCommand());   //  ActionCommand��Ĭ����ϢΪ��Button������
    }
}