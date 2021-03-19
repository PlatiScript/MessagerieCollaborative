package MessagerieCollaborative.src.com.iiam2i;

public class NotificationObserver extends Observer {
	
	public NotificationObserver (Message message, User user) {
		this.message = message;
		this.user = user;
		this.message.attach(this);
	}
	//@Override
	public void update() {
		System.out.println( "NotificationObserver: " + user.getUsername() +" à écrit : "+ message.getContent() );
	}
}
