package school;

public class student {
	
	String login;
	String studentpsk;
	char answer;
	
	teacher tRef;
	
	void setDataForstudent(String log, String stupsk, char ans){
		login = log;
		studentpsk = stupsk;
		answer = ans;
	}
	void showDataForstudent(){
		System.out.println("**************");
		System.out.println("login\t"+login);
		System.out.println("studentpsk\t"+studentpsk);
		System.out.println("answer\t"+answer);
		System.out.println("************");
		tRef.showDataForteacher();

	}
}
