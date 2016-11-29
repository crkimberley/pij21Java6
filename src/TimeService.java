import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author crkimberley on 29/11/2016.
 */
public interface TimeService extends Remote {

    String currentTimeAndDate() throws RemoteException;
}