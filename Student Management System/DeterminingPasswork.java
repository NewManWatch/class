public class DeterminingPasswork {
	/*      
      @autor NewManWatch
	  @Time 2019-9-4 21:16:06
	  @param 
     */
	public static void main(String ages[]){       		
	}
    public static void out(String useN ,char[] pressW,int x ) {		
		/*  x �������¼���� ��� ��¼�ɹ�����xΪ0 ��� x >= 3 �ܾ���¼����        */
		
		if ( x >= 3){
			return ;
		}
		String strPW = new String (pressW);		
		switch( useN ){
			
			//case ������û���
			//if ��equals����� ����
			//����ʱ��ĳ������ݿ�����			
			case "123": if(strPW.equals("123")){				
		                    System.out.println("login.........yes");
							x = 0 ;
		                }else{
		                    System.out.println("�������");
							x = x + 1;
	                    }break;
			default :System.out.println("�޴��û���") ;x = x + 1;break;
		}
	 
    }

	
}



