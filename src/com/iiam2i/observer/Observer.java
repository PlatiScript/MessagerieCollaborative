package MessagerieCollaborative.src.com.iiam2i;

public abstract class Observer {
	protected Message message;
	protected User user;
	public abstract void update();

}
