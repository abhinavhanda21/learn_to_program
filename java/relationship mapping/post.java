package relation;

public class post {
	
	int postNum;
	String comments;
	int likes;
	
	user uRef;
	
	void setDataForpost(int num, String comm, int lk){
		postNum = num;
		comments = comm;
		likes = lk;

	}
	
	void showDataForpost() {
		System.out.println("**********");
		System.out.println("postNum\t"+postNum);
		System.out.println("comments\t"+comments);
		System.out.println("likes\t"+likes);
		System.out.print("**********");
		uRef.showDataForuser();
	}
	

}
