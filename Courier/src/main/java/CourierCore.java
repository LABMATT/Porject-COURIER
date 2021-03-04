import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;

import java.net.URISyntaxException;

public class CourierCore {

    public static void main(String[] args) {
        System.out.println("Starting Courier");

        try {
            Socket socket = IO.socket("http://localhost:8080");
            socket.open();

            // used to send the users info to the server.
            UPM upm = new UPM(socket);

            // Used to send the messages
            SendMessage sm = new SendMessage(socket, "777");

            // Send this clients name to server.
            upm.initConnect("777","Matt");

            sm.msgIN();

        } catch (URISyntaxException e) {
            e.printStackTrace();
        }


    }


}
