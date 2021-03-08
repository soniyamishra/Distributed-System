import java.net.*;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class SCServer {
	public static void main(String[] args) {
    try
    {
        ServerSocket ss = new ServerSocket(8001);
        System.out.println("Server is accept message....");
        Socket s = ss.accept();
        DataInputStream in = new DataInputStream(s.getInputStream());
        String receieve;
        DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss.SSSS");
        while((receieve = in.readLine()) != null)
        {
            String[] mesaage = receieve.split(",");
            if(mesaage[0].equals("stop") || mesaage[0].equals("STOP") || mesaage[0].equals("Stop"))
                break;
            Date date = new Date();
            Long clienttime = Long.parseLong(mesaage[1]);
            Long timeMilli = date.getTime();
            Long requiretime =timeMilli-clienttime;
            System.out.println("This is the message: "+mesaage[0]);
            System.out.println("Server will not accept the message if its taken more than 2 milisecond.");
            if(clienttime.equals(timeMilli))
            {
                String strDate = dateFormat.format(timeMilli);
                System.out.println("Message sending time and receving time is same:"+strDate);
            }
            else if(requiretime > 2)
            {
                String clinttim = dateFormat.format(clienttime);
                System.out.println("Messange sending time from client:"+ clinttim+"\n");
                String strDate = dateFormat.format(timeMilli);
                System.out.println("Messange received from client to:"+strDate+"\n");
                System.out.println("This message is rejected.");
            }
            else
            {
                String clinttim = dateFormat.format(clienttime);
                System.out.println("Messange sending time from client:"+ clinttim+"\n");
                String strDate = dateFormat.format(timeMilli);
                System.out.println("Messange received from client to:"+strDate+"\n");
                System.out.println("This message is accepted.");
            }
            }
            in.close();
    }
    catch(Exception e)
    {
        System.out.println(e.toString());
    }
    }
}