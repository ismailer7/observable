import java.util.ArrayList;
import java.util.List;


public class ProductA implements Observable{
	
	private List<Observer> subscribers = new ArrayList<>();
	
	private boolean inStock = true;
	
	public boolean inStock() {
		return this.inStock;
	}
	
	// any change to inStock will happen inside this setter.
	public void setInStock(boolean inStock) {
		this.inStock = inStock;
		notifyObserver(); // we are going to notify every subscriber.
	}

	@Override
	public void addObserver(Observer o) {
		this.subscribers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		this.subscribers.remove(o);
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : subscribers) {
			observer.update();
		}
	}
	
	
}
