package myQueueApp;

public interface QueueInterface {

	public void add(int n);
	public int delete();
	public boolean isEmpty();
	public boolean isFull();
	void display();
}
