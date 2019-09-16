public class WorkOne {
    public static void main(String[] args) {
		WorkOne();
		WorkTwo();
		WorkThree();
     
	 
    }
	public static void WorkOne() {
		System.out.println ( "34 + 30 = " + 34 +30 );
         
	 
    }
	public static void WorkTwo() {
		int count = 10;
		count *= count + 2 ;
		count /= 100;
		count ++ ;
		System.out.printf (" %d " ,count);
      
	 
    }
	public static void WorkThree() {
		int res ;
		int n1 = 12 ;
		int n2 = 24 ;
		int n3 = 16 ;
		int n4 = 3  ;
		double d ;
		double v1 = 10.0 ;
		double v2 = 3.1416;
		System.out.printf (" res =    n1 = %d n2 = %d n3 = %d n4 = %d \n d =    v1 = %f v2 = %f \n " ,n1,n2,n3,n4,v1,v2);
		res = n1 / n4 ;
		System.out.printf (" res = %d n1 = %d n2 = %d n3 = %d n4 = %d \n d =     v1 = %f v2 = %f \n " ,res,n1,n2,n3,n4,v1,v2);
		d = n1 / n4 ;
		System.out.printf (" res = %d n1 = %d n2 = %d n3 = %d n4 = %d \n d = %f v1 = %f v2 = %f \n " ,res,n1,n2,n3,n4,d,v1,v2);
		res = n3 / n4 ;
		System.out.printf (" res = %d n1 = %d n2 = %d n3 = %d n4 = %d \n d = %f v1 = %f v2 = %f \n " ,res,n1,n2,n3,n4,d,v1,v2);
		d = n3 / n4 ;
		System.out.printf (" res = %d n1 = %d n2 = %d n3 = %d n4 = %d \n d = %f v1 = %f v2 = %f \n " ,res,n1,n2,n3,n4,d,v1,v2);
		d = v1 / n4 ;
		System.out.printf (" res = %d n1 = %d n2 = %d n3 = %d n4 = %d \n d = %f v1 = %f v2 = %f \n " ,res,n1,n2,n3,n4,d,v1,v2);
		d = v1 / v2 ;
		System.out.printf (" res = %d n1 = %d n2 = %d n3 = %d n4 = %d \n d = %f v1 = %f v2 = %f \n " ,res,n1,n2,n3,n4,d,v1,v2);
		res = n1 / n2 ;
		System.out.printf (" res = %d n1 = %d n2 = %d n3 = %d n4 = %d \n d = %f v1 = %f v2 = %f \n " ,res,n1,n2,n3,n4,d,v1,v2);
		d = (double) n1 /n2 ;
		System.out.printf (" res = %d n1 = %d n2 = %d n3 = %d n4 = %d \n d = %f v1 = %f v2 = %f \n " ,res,n1,n2,n3,n4,d,v1,v2);
		d = n1 / (double) n2 ;
		System.out.printf (" res = %d n1 = %d n2 = %d n3 = %d n4 = %d \n d = %f v1 = %f v2 = %f \n " ,res,n1,n2,n3,n4,d,v1,v2);
		d = (double)(n1 / n2) ;
		System.out.printf (" res = %d n1 = %d n2 = %d n3 = %d n4 = %d \n d = %f v1 = %f v2 = %f \n " ,res,n1,n2,n3,n4,d,v1,v2);
		
     
	 
    }
}
