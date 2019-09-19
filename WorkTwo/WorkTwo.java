import java.util.Scanner;
/*      
      @autor NewManWatch
	  @Time 2019-9-16 21:16:06
	  @param Job 2 # 1 Displays Pyramid # 2 Displays Multiplier Table
     */
public class WorkTwo {
    public static void main(String[] args) {
		WorkOne();	
		WorkTwo();	 
    }
	public static void WorkOne() {
	/*  @autor  NewManWatch                                           */   
	/*  @Time   2019-9-16 21:16:06                                     */
	/*  @param  int layer          Number of Pyramid Layers          */
	/*          int outNowLayer    Now output the number of spaces   */
	/*          int nowNum         Now output the number of symbols  */
		System.out.printf("play cin layer  \n");
		Scanner scan = new Scanner(System.in);
		int layer=scan.nextInt();
		for(int i =1 ;i <= layer ;i++){
			int outNowLayer = layer - i ;
			int nowNum = 1 + ( i - 1 ) * 2 ;
			for (int i2 =1 ; i2 <= outNowLayer ; i2++){
				System.out.printf (" " );
				
			}for (int i3 =1 ; i3 <= nowNum ; i3++){
				System.out.printf ("$" );
				
			}
			System.out.printf("\n");
			
		}
    }
	public static void WorkTwo() {
	/*  @autor  NewManWatch                                           */   
	/*  @Time   2019-9-16 21:16:06                                     */
	/*  @param  int layer          Layer Number of Multiplication Table          */
	/*          int result           The result of multiplication           */

		
		
		Scanner scan = new Scanner(System.in);
		System.out.printf("play cin layer \n");
		
		int layer=scan.nextInt();
		for(int i =1 ;i <= layer ;i++){
			
			for (int i2 =1 ;i2 <=i ; i2++){
				int result = i2 * i ;
				System.out.printf("%d * %d = %d ",i2,i,result);
				
				
				
			}
			System.out.printf("\n");
			
		}
		scan.close();
         
	 
    }
	
}
