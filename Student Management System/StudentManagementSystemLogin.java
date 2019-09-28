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
	    /*      
         @autor NewManWatch
	     @Time 2019-9-23 17:46:06
		 
		       frame              登录窗口
	           jPasswordField1    用户名文本框
		       jPasswordField2    密码文本框
		 
		 
		 
		 
        */	
        
		JFrame frame = new JFrame("登录页面");/* 实例化窗体对象*/
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField jPasswordField1 = new JTextField(30);            /* 定义文框*/
        JPasswordField jPasswordField2 = new JPasswordField();      /* 定义密文框*/
        jPasswordField2.setEchoChar('*');                           /* 设置回显字符为**/		
		frame.setLayout(null);  
        JButton button = new JButton("登入");		
        button.setBounds(10, 70,90 ,30 );//
		Monitor m = new Monitor();        //创建事件监听器m
        button.addActionListener(new ActionListener (){
			public void actionPerformed(ActionEvent e ) {         
                DeterminingPasswork.out(jPasswordField1.getText(),jPasswordField2.getPassword());
				
				//直接在main中用gettext避免使用字符串获取输入再调用方法
               } 			
	    	});               
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
        //button.setActionCommand(jPasswordField1.getText());
       
		
	}	
	public static void ActionPerform (){
	

	}
}
