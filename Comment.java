package gun2odev;

public class Comment {
	int id;
	String ipAddress;
	String userName;
	String message;
	String createdDate;
	
	public Comment(int id,String ipaddress,String username,String message, String createddate) {
		this.id=id;
		this.ipAddress=ipaddress;
		this.userName=username;
		this.message=message;
		this.createdDate=createddate;
		
	} 
}
