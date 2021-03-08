//The DataInputStream works with the binary data, while the BufferedReader work with character data. DataInputStream consumes less amount of memory space being it is a binary stream, whereas BufferedReader consumes more memory space being it is character stream.

import java.net.*; 
import java.io.*;
public class TCPClientChat {
    public static void main(String[] args) {
    try
        {
          Socket cs = new Socket("LocalHost",8001);
          BufferedReader infu = new BufferedReader(new InputStreamReader(System.in));
          DataOutputStream ot = new DataOutputStream(cs.getOutputStream());
          DataInputStream in = new DataInputStream(cs.getInputStream());
          String send;
		  
          System.out.println("Type STOP/Stop/stop  if want to close Chat!");
          System.out.println("Client say:)");
          while((send = infu.readLine()) != null )
          {
            ot.writeBytes(send+"\n");
            if(send.equals("stop") || send.equals("STOP") || send.equals("Stop"))
            break;
            System.out.println("Server say:) "+in.readLine());
            System.out.print("Client say:)");
          }
               
        infu.close();
        in.close();
        ot.close();
        cs.close();
        }
	catch(Exception e)
      {
          System.out.println(e.toString());
      }
    }
}
