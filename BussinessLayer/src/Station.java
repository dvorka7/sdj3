


public abstract class Station implements Runnable{
	
	
	public Station(){
		
	}
	
	public abstract Truck getTruck();
	public abstract void loadCargo();
	public abstract void getAndUnloadCargo();
	public abstract void extractAllPalettes();
	public abstract void print(); //test method

}
