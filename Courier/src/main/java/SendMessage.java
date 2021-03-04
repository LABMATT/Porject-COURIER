import io.socket.client.Socket;
import io.socket.emitter.Emitter;

import java.util.Arrays;
import java.util.Scanner;

public class SendMessage {

    private final Socket socket;
    private final String userID;
    private String[] ms;

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

            String ot = rec();
        }
    }

    public String rec()
    {
        socket.on("details", args -> {ms = (String[]) args;});
        return Arrays.toString(ms);

    }
}
