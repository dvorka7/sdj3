import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class Crane extends UnicastRemoteObject implements ICrane,IRmiClient{
 
	private static final long serialVersionUID = 1L;

	protected Crane() throws RemoteException {
		super();
		
	}
	
}
