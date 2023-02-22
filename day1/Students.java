package week3.ass.day1;

public class Students {
	
	private static Students info;


	public void getStudentInfo(int id) {
		System.out.println("student id:" +id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("student id:" +id);
		System.out.println("student name:" +name);
	}
	public void getStudentInfo(String email,long phonenumber) {
		
		System.out.println("student email:" +email);
		System.out.println("student phonenumber:" +phonenumber);
	}
	
	
	public static void main(String[] args) {
		
		Students.info=new Students();
		info.getStudentInfo(144);
		info.getStudentInfo(145,"Nandini");
		info.getStudentInfo("natarunandini@gmail.com",799783304);
	
	
	
	

}
}
