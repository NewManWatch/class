import java.util.Scanner;
//package com.beyole.util;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/*      
      @autor NewManWatch
	  @Time 2019-9-23 17:46:06
	  @Job  login the StudentManagementSystem
     */
public class StudentManagementSystemLogin{
	public static void main (String[] args){
		
		JFrame frame = new JFrame("��¼ҳ��");/* ʵ�����������*/
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField jPasswordField1 = new JTextField(30);/* �����Ŀ�*/
        JPasswordField jPasswordField2 = new JPasswordField();/* �������Ŀ�*/
        jPasswordField2.setEchoChar('*');/* ���û����ַ�Ϊ**/		
		frame.setLayout(null);  
        //frame.setSize(110,50);   
        JButton button = new JButton("����");		
        button.setBounds(10, 70,90 ,30 );//
		Monitor m = new Monitor();        //�����¼�������m
		String s= jPasswordField1.getText().toString();
		//String s = request.getParameter(jPasswordField2);
		//System.out.println(s);
		
        button.addActionListener(m);         //  ���¼�Դ����b2ע�ᵽ�¼�������m�У���֪b2�ѱ�m������
		
        
        frame.setVisible(true);
		frame.add(button);  
        JLabel label1 = new JLabel("�û��˺�");
        JLabel label2 = new JLabel("����:");
        label1.setBounds(10, 10, 100, 20);
        label2.setBounds(10, 40, 100, 20);
        jPasswordField1.setBounds(110, 10, 80, 20);
        jPasswordField2.setBounds(110, 40, 50, 20);
        frame.setLayout(null);
        frame.add(label2);
        frame.add(label1);
        frame.add(jPasswordField2);
        frame.add(jPasswordField1);
        frame.setSize(400, 150);
        frame.setLocation(300, 200);
        frame.setVisible(true);
		//Frame f = new Frame("TestActionEent");
        button.setActionCommand(jPasswordField1.getText());
       
		
	}	
	public static void ActionPerform (){
	

	}
}
class Monitor implements ActionListener {  //����ʵ�����¼������ӿ�ActionListener���¼���������Monitor

    public void actionPerformed(ActionEvent e) {  //  �¼���Ϣ���������ActionEvent e�д��ݹ������ȴ�����
                                                  //actionPerformed()�������Ǿ���Ĵ����¼��ķ����� 
        System.out.println(  e.getActionCommand());
		
		DeterminingPasswork.out( e.getActionCommand());
		
    }
}