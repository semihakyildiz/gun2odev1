package gun2odev;

public class Main {

	public static void main(String[] args) {
		System.out.println("Kurslar");
		
		Course course1 = new Course();
		course1.yeni=true;
		course1.id=1;
		course1.name="Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)";
		course1.author="Ali Veren";
		course1.detail="Cok degisik seyler var";
		
		Course course2 = new Course(2,false,"Programlamaya Giriþ için Temel Kurs","Ben Ferit","Pek bisey yok");
				
		Course[]courses={course1,course2};
		
		for (Course course:courses) {
			
			if (course.yeni==true) {
				System.out.println("Yesyeni-> "+' '+course.name+' '+course.author+' '+course.detail);
			} else if (course.yeni==false){
				System.out.println("Zamani gecik-> "+' '+course.name+' '+course.author+' '+course.detail);
			}
			
		}
		
		CourseManager coursemanager = new CourseManager();
		coursemanager.addCourse(course1);
		coursemanager.deleteCourse(course2);
		
		Comment comment1= new Comment(1, "127.0.0.1", "Semih Akyildiz", "https://github.com/semihakyildiz/gun2odev1.git", "25/04/2021");
		Comment comment2= new Comment(2, "...", "...", "...", "25/04/2021");
		
		Comment[]comments={comment1,comment2};
		
		System.out.println(comments.length+" Yorum");
		
		CommentManager commentMng=new CommentManager();
		commentMng.addComment(comment1);
		for (Comment comment:comments) {
			System.out.println(comment.createdDate+' '+comment.userName+' '+comment.message);
		}
	}
	

}
