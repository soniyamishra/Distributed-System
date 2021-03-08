import java.net.*; 
import java.io.*;

public class TCPServerChat {
    public static void main(String[] args) {
      try
        {
          ServerSocket ss = new ServerSocket(8001);
          System.out.println("Server is ready for Chat....");
          Socket s = ss.accept();
          BufferedReader infu = new BufferedReader(new InputStreamReader(System.in));
          
          DataOutputStream ot = new DataOutputStream(s.getOutputStream());
          DataInputStream in = new DataInputStream(s.getInputStream());
          String receieve;
          String send;
          while((receieve = in.readLine()) != null )
		  {
              if(receieve.equals("STOP") || receieve.equals("stop") ||
receieve.equals("Stop"))
                  break;
              System.out.println("Client Says: "+receieve); 
			  System.out.print("Server say:)");
              send = infu.readLine();
              ot.writeBytes(send+"\n");
              }
            infu.close();
            in.close();
            ot.close();
          }
      catch(Exception e)
      {
          System.out.println(e.toString());
      }
    }
}


