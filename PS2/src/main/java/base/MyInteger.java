package base;

public class MyInteger {
	private int iValue;
	public MyInteger(int i){
		iValue=i;
	}
	public int  getiValue(){
		return iValue;
	}
	public boolean isEven(){
		if (iValue%2==0){
			return true;
		}
		return false;
	}
		
	public boolean isOdd(){
		if (iValue%2!=0){
			return true;
		}
		return false;
	}
	public boolean isPrime(){
		
		for (int a=2; a<=iValue/2; a++ ){
			if((iValue % a)==0 ){
				return false;
			}
					
		}
		return true;
		
			

	}
	public static boolean isEven(int iValue){
		if (iValue%2==0){ 
			return true;
		}
		return false;
	}
	public static boolean isOdd(int iValue){
		if (iValue%2!=0){
			return true;
		}
		return false;
	}
	public static boolean isPrime(int iValue){
		for (int a=2; a<=iValue/2; a++ ){
			if((iValue % a)==0 ){
				return false;
			}
		}
		return true;
		
			
	}
	public static boolean isEven(MyInteger iValue){
		return iValue.isEven();
		
	}
	public static boolean isOdd(MyInteger iValue){
		return iValue.isOdd();
	}
	public static boolean isPrime(MyInteger iValue){
		return iValue.isPrime();
		
	}
	public boolean equals(int realValue){
		return this.iValue==realValue;
	}
	public boolean equals(MyInteger realone){
		return this.iValue==realone.iValue;
	}

}
