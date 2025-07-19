public class Fibonacci{
	public static int Fibo (int a){
		if (a>2){
		return Fibo(a-1)+(a-2);
		}else{
		return 1;
		}
	}
	public static void main (String[] args){
        	System.out.println("Fibonacci es: "+Fibo(5));
	}
 }