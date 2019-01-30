package school;

public class teacher {
	
	
	String admin;
	String adminpsk;
	String question;
	int marks;
	
	
	void setDataForteacher(String ad, String adpsk, String qu, int mar){
		admin = ad;
		adminpsk = adpsk;
		question = qu;
		marks = mar;
	
		
		
	}
	
	void showDataForteacher(){
		System.out.println("**************");
		System.out.println("admin\t"+admin);
		System.out.println("adminpsk\t"+adminpsk);
		System.out.println("question\t"+question);
		System.out.println("marks\t"+marks);
		System.out.println("************");

		
	}


}
