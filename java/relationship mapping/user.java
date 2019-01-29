package relation;

public class user {
	
	String username;
	String email;
	int age;
	String pass;
	
	void setDataForuser(String un, String em, int ag, String psk){
		username = un;
		email = em;
		age = ag;
		pass = psk;

	}
	
	void showDataForuser() {
		System.out.println("**********");
		System.out.println("User\t"+username);
		System.out.println("emailid\t"+email);
		System.out.println("age\t"+age);
		System.out.print("**********");

		
	}

}
