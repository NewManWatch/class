import java.util.Scanner;
public class WorkThree{
	public static void main (String[] args){
		say();			
	}	
	public static void say (){
		
		Scanner scan = new Scanner(System.in);
		int old = scan.nextInt();
		int pd = old/19;
		switch (pd ){
			case 0 : System.out.printf("С���\n");break;
			case 1 : System.out.printf("����\n");break;
			default :break;											
		}	
        if(old > 0){  
            say();		
		}else ;	
	}
}