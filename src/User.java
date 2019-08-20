
public class User implements Observer {

	private Observable observable = null;

	public User(Observable observable) {
		this.observable = observable;
	}

	@Override
	public void update() {
		sendEmail();
	}

	private void sendEmail() {
		System.out.println("send email contain product offer.");
	}
	
	// methods
	
	// the user(observer) kep the reference of observable object so he can unsubscribe whenever he want to.
	public void unsubscribe() {
		observable.removeObserver(this);
	}

}
