package school;

public class school {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		teacher t1 = new teacher();
		student s1 = new student();
		
		t1.setDataForteacher("john", "john123", "is this true", 10);
		s1.setDataForstudent("student1", "student123", 'T');
		
		s1.tRef = t1;
		s1.showDataForstudent();
	}

}
