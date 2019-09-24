public class DeterminingPasswork {
	/*      
      @autor NewManWatch
	  @Time 2019-9-4 21:16:06
	  @param 
     */
	public static void main(String ages[]){
		/*测试  测试成功*/
        out("123","123");
        		
	}
    public static void out(String useN ,String pressW ) {
        switch(useN){
			/*
			case 后面接用户名
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
}