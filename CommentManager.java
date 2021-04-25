package gun2odev;

public class CommentManager {
	public void addComment(Comment comment) {
		System.out.println("Yeni Yorum Eklendi -> "+comment.userName +" "+ comment.createdDate);
	}
	public void editComment(Comment comment) {
		System.out.println("Yorum  duzenlendi-> "+comment.userName +" "+ comment.createdDate +" "+ comment.message);
	}

}
