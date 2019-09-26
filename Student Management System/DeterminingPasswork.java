public class DeterminingPasswork {
	/*      
      @autor NewManWatch
	  @Time 2019-9-4 21:16:06
	  @param 
     */
	public static void main(String ages[]){       		
	}
    public static void out(String useN ,char[] pressW,int x ) {		
		/*  x 是请求登录次数 如果 登录成功设置x为0 如果 x >= 3 拒绝登录请求        */
		
		if ( x >= 3){
			return ;
		}
		String strPW = new String (pressW);		
		switch( useN ){
			
			//case 后面接用户名
			//if 中equals后面接 密码
			//等有时间改成与数据库连的			
			case "123": if(strPW.equals("123")){				
		                    System.out.println("login.........yes");
							x = 0 ;
		                }else{
		                    System.out.println("密码错误");
							x = x + 1;
	                    }break;
			default :System.out.println("无此用户名") ;x = x + 1;break;
		}
	 
    }

	
}



