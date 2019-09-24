import java.util.Scanner;
public class OldLoin {
	
	public static void main(String ages[]){
		LoIn();
	}
	public static void LoIn(){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("用户名:");
		String useN = scan.nextLine();
		System.out.println("密码:");
		String passW = scan.nextLine();        	
        DeterminingPasswork.out(useN,passW);	
        System.out.println("是否重新登录");
		String yesOrNo = scan.nextLine();
		String yN = yesOrNo.toUpperCase();
		if(yN.equals("Y")){
			LoIn();
		}else ;
		
	}
   
}