public class instarel {
	
	
	public static void main(String args[]) {
		
		user u1 = new user();
		post p1 = new post();
		
		u1.setDataForuser("john", "john@emp.com", 12, "j@123");
		p1.setDataForpost(1, "beautiful", 100);
		
		p1.uRef =u1;
		
		p1.showDataForpost();
		
	}

}
