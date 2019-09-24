import java.util.Scanner;
//package com.beyole.util;
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
        jPasswordField2.setEchoChar('*');/* 设置回显字符为#*/
		
		frame.setLayout(null);  
       // frame.setSize(110,50);   
        JButton button = new JButton("登入");  
        frame.add(button);  
  
        button.setBounds(10, 70,90 ,30 );//
		
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
        
       
		
	}	
	public static void say (){

	}
}