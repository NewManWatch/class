public class DeterminingPasswork {
	/*      
      @autor NewManWatch
	  @Time 2019-9-4 21:16:06
	  @param 
     */
	public static void main(String ages[]){
		//String[] useN = {'1','2','3'};
		//String[] pressW ={'1','2','3'};
		
       // out(useN,pressW);/*测试  测试成功*/
        		
	}
    public static void out(String[] useN ,String[] pressW ) {
        
		/*
		
    	char[][] useNamePool = {{'1','2','3'}}  ;            //[x][y]  x 用户内部码 y 用户名   // 
		char[][] pressWorkPoll = {{'1','2','3'}} ;           // [x][z]  x 用户内部码  y 对应密码          //
		int useNum = 0 ;
		useNum = FindUseNum (useN,useNamePool) ;                          
		*/
		
		
		
		
		
		
		
		switch( useN ){
			
			/*case 后面接用户名
			if 中equals后面接 密码
			等有时间改成与数据库连的
			*/
			
			
			case "123": if(pressW.equals("123")){
				
				System.out.println("login.........yes");
			}else;
			break;
			default :System.out.println("登录失败") ;break;
		}
		
    }
	/*public static int FindUseNum (char[] Nowstr,char[][] FindPool){
		//
		 // Nowstr[a];
		 // FindPool[i1][i2];
		  
		  //辅助查找数组 help[];
		  //how 
		
		//
	    //int help[] = new int[10];
		int a = 0  ;
		int i1 = 0 ;
		int i2 = 0 ;
		int how = 2 ;
		for( i1 = 0 ;i1 <= FindPool.length&&how == 2;i2++){ 
			for(i2 = 0; i2 <= Nowstr.length&&how == 2 ;i2++ ){
				
				if (Nowstr[i2] == FindPool[i1][i2]){
					how = 1;
					break;
				}else ;
			}
			if (how == 1){
				break;
			}					
		}
		if (how == 1){
			
			System.out.println("login.........yes");
		}else{
			System.out.println("登录失败");
		}
		
		
		
		return 0;
	}

	*/
}



