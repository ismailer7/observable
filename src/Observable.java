
public interface Observable {

	// the observable is the subject in which the observers or subscriber for this observable would have been notified if any changes made upon the observable object.
	
	// observable has one or many subscribers its like one to many relation ship.
	
	void addObserver(Observer o); // we can add subscriber/
	
	void removeObserver(Observer o); // we can also remove subscriber.
	
	void notifyObserver(); // here we will broadcast the notification to all observers attached with this observable.
	
}
