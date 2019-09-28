import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class AnalogTelegraph{
	public static void main (String[] arge){		
		JFrame Telegraph = new JFrame("摩斯电码练习器");
		Telegraph.setDefaultCloseOperation(Telegraph.EXIT_ON_CLOSE);	
		JTextField work = new JTextField(30);	
        JButton door = new JButton("door");		
        door.setBounds(10, 70,90 ,30 );//
        door.addActionListener(new ActionListener (){
			public void actionPerformed(ActionEvent e ) {         
                AnalogTelegraphBody.englishTranslateMorseCode(work.getText());
               } 			
	    	});		
		JLabel label1 = new JLabel("需要练的");
		Telegraph.setLayout(null);
		Telegraph.setSize(600, 400);
        Telegraph.setLocation(600, 600);
		work.setBounds(100,10,90,30);
		door.setBounds(20, 70,90 ,30 );	
		label1.setBounds(15, 10, 100, 20);		
		Telegraph.add(door);
		Telegraph.add(work);
		Telegraph.add(label1);
		 	
		Telegraph.setVisible(true);	
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}