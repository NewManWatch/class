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
		
		JFrame frame = new JFrame("登录页面");/* 实例化窗体对象*/
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField jPasswordField1 = new JTextField(30);/* 定义文框*/
        JPasswordField jPasswordField2 = new JPasswordField();/* 定义密文框*/
        jPasswordField2.setEchoChar('*');/* 设置回显字符为**/		
		frame.setLayout(null);  
        //frame.setSize(110,50);   
        JButton button = new JButton("登入");		
        button.setBounds(10, 70,90 ,30 );//
		Monitor m = new Monitor();        //创建事件监听器m
		String s= jPasswordField1.getText().toString();
		//String s = request.getParameter(jPasswordField2);
		//System.out.println(s);
		
        button.addActionListener(m);         //  将事件源对象b2注册到事件监听器m中，告知b2已被m所监听
		
        
        frame.setVisible(true);
		frame.add(button);  
        JLabel label1 = new JLabel("用户账号");
        JLabel label2 = new JLabel("密码:");
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
class Monitor implements ActionListener {  //创建实现了事件监听接口ActionListener的事件监听器类Monitor

    public void actionPerformed(ActionEvent e) {  //  事件信息被打包在了ActionEvent e中传递过来，等待处理。
                                                  //actionPerformed()方法就是具体的处理事件的方法。 
        System.out.println(  e.getActionCommand());
		
		DeterminingPasswork.out( e.getActionCommand());
		
    }
}