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
			
			//case ������û���
			//if ��equals����� ����
			//����ʱ��ĳ������ݿ�����			
			case "123": if(strPW.equals("123")){				
		                    System.out.println("login.........yes");
						
		                }else{
		                    System.out.println("�������");
							
	                    }break;
			default :System.out.println("�޴��û���") ;break;
		}	 
    }	
}



