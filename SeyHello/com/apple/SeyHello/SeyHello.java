public class SeyHello{
	public static void main(String[] args){

		seyHello (2);
		
		System.out.println(allAdd(100,0)) ;
		
	}	
	public static void seyHello(int num){ 
	
    	System.out.println("Hello World");
	
	}
	
	public static int allAdd(int max,int min){
		int sum=0;
		
		for (int i = min;i <= max;i++){
			sum=sum+i;
		}
		return sum;
		
		
	}
	
	
}