public interface IConveyorQueue<T> {
	public void enqueue(T element);
	public T dequeue();
	public T first();
	public int indexOf(T element);
	public boolean isEmpty();
	public int size();
	public boolean isFull();
	public void print();
}
