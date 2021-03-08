import io.socket.client.Socket;

import java.util.ArrayList;
import java.util.Scanner;

public class SendMessage {

    private final Socket socket;
    private final String userID;
    private ArrayList<String> ms = new ArrayList<>();

    public SendMessage(Socket socket,String userid) {
        this.socket = socket;
        this.userID = userid;
    }

    public void msgIN()
    {
        // Enter username and press Enter
        System.out.println("Send Message");

        String rawMsg = "";

        while(!rawMsg.equals("/exit"))
        {
            Scanner myObj = new Scanner(System.in);

            rawMsg = myObj.nextLine();

            this.socket.emit("msg", (Object) new String[]{userID, rawMsg});
            System.out.println("message is: " + rawMsg);

            if(ms.size() > 0)
            {
                for(String s : rec())
                {
                    System.out.println(s);
                }

                ms.clear();
            }

        }
    }

    public ArrayList<String> rec()
    {
        socket.on("inboundmsg", args -> {

            for (Object m: args) {
                ms.add(String.valueOf(args));
            }
        });

        return ms;
    }
}
