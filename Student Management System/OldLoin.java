import java.util.Scanner;
public class OldLoin {
	
	public static void main(String ages[]){
		LoIn();
	}
	public static void LoIn(){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�û���:");
		String useN = scan.nextLine();
		System.out.println("����:");
		String passW = scan.nextLine();        	
        DeterminingPasswork.out(useN,passW);	
        System.out.println("�Ƿ����µ�¼");
		String yesOrNo = scan.nextLine();
		String yN = yesOrNo.toUpperCase();
		if(yN.equals("Y")){
			LoIn();
		}else ;
		
	}
   
}