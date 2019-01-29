public class method{
	

	static void prob(int x){
		int y = x+1;
		System.out.print("y is:" +y);
	}

	static int cmTom(int m){
		int cm = 100*m;
		return cm;
	}


	public static void main(String[] args){
		int x = 1;
		int y = x+1;

		System.out.print("y is :" +y);

	method.prob(4);
	System.out.print("");

	//method mRef= new method();
	//mRef.cmTom(100);

	System.out.print("100m is:"+cmTom(100)+"cm");



	}
}