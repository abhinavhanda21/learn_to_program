package prob1;

public class solution1 {
	

	
	public static void main(String args[] ){
	
		int N =12;
		int mark = 0;
		int count = 0;

	for (int john =1; john<N;john++) {
		
		count = john +count;
		if (count>=N) {
			System.out.print("count is :"+count);
			break;
		}
		
		mark = 2 * john;
		
		count = mark + john;
		
		}
		
	};
		
		
	}

	

}
