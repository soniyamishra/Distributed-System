import java.rmi.*;
import java.io.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class ClientConverter {
    public static void main(String args[]) throws RemoteException, IOException {
        ClientConverter c = new ClientConverter();
        c.connectRemote();
    }

    private void connectRemote() throws RemoteException, IOException {
        try {
            Registry reg = LocateRegistry.getRegistry("localhost", 5678);
            InterfaceConverter h1 = (InterfaceConverter) reg.lookup("Wrd");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a number : \t");
            String no = br.readLine();
            String ans = h1.convertDigit(no);
            System.out.println("The word representation of the entered digit is : " + ans);
            }
        catch (NotBoundException | RemoteException e) {
            System.out.println("exception" + e);
        }
    }
}
