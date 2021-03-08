import java.rmi.*;
public interface InterfaceConverter extends Remote {
public String convertDigit(String no) throws RemoteException;
}
