public class DeterminingPasswork {
	/*      
      @autor NewManWatch
	  @Time 2019-9-4 21:16:06
	  @param 
     */
	public static void main(String ages[]){       		
	}
    public static void out(String useN ,char[] pressW) {		
		String strPW = new String (pressW);	

		
		switch( useN ){
			
			//case 后面接用户名
			//if 中equals后面接 密码
			//等有时间改成与数据库连的			
			case "123": if(strPW.equals("123")){				
		                    System.out.println("login.........yes");
						
		                }else{
		                    System.out.println("密码错误");
							
	                    }break;
			default :System.out.println("无此用户名") ;break;
		}	 
    }	
}



