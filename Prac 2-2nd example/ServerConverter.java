import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.*;
public class ServerConverter extends UnicastRemoteObject implements InterfaceConverter {
    public ServerConverter() throws RemoteException {
    }
    public String convertDigit(String no) throws RemoteException {
        String str = "";
        for (int i = 0; i < no.length(); i++) {
        int p = no.charAt(i);
        switch (p) {
            case 48:
                str += "zero ";
                break;
            case 49:
                str += "one ";
                break;
            case 50:
                str += "two ";
                break;
            case 51:
                str += "three ";
                break;
            case 52:
                str += "four ";
                break;
            case 53:
                str += "five ";
                break;
            case 54:
                str += "six ";
                break;
            case 55:
                str += "seven ";
                break;
            case 56:
                str += "eight ";
                break;
            case 57:
                str += "nine ";
                break;
            }
        }
        return str;
        }
        public static void main(String args[]) throws RemoteException {
            try {
                ServerConverter s1 = new ServerConverter();
                Registry reg = LocateRegistry.createRegistry(5678);
                reg.rebind("Wrd", s1);
                System.out.println("Object registered....");
            } catch (RemoteException e) {
                System.out.println("exception" + e);
            }
    }
}
