
public class WorkTwo {
    public static void main(String[] args) {
		WorkOne();
		WorkTwo();
	
     
	 
    }
	public static void WorkOne() {
		
		
		int layer=input.nextInt();
		for(int i =1 ;i <= layer ;i++){
			int outNowLayer = layer - i ;
			int nowNum = 1 + ( i - 1 ) * 2 ;
			for (int i2 =1 ; i2 <= outNowLayer ; i2++){
				System.out.printf (" " );
				
			}for (int i3 =1 ; i3 <= nowNum ; i3++){
				System.out.printf ("$" );
				
			}
			
			
		}
		 
    }
	public static void WorkTwo() {
		
         
	 
    }
	
}
