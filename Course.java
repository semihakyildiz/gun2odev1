package gun2odev;

public class Course {
	
	Boolean yeni;
	int id;
	String name;
	String author;
	String detail;
	
	public  Course() {	
		
	}
	public  Course(int id,boolean yeni, String name,String author,String detail) {
		
		this.yeni=yeni;
		this.id=id;
		this.name=name;
		this.author=author;
		this.detail=detail;
		
		
	}
	
	
}
