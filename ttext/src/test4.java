//恶汉式
public class test4 {
	private test4(){}
	private static  test4 tt  = new test4();
	public test4 getNewInstance(){
		return tt;
	}
}
//lanhanshi
class test5{
	private test5(){}
	private  static test5 tt1 = null;
	public test5 getNewInstance(){
		if(tt1==null){
			tt1 = new test5();
		}
		return tt1;
	}
	
}
