import io.socket.client.IO;
import io.socket.client.Socket;

public class CourierCore {

    public static void main(String[] args) {
        System.out.println("Starting Courier");

        Socket socket = IO.socket("https://localhost.com"); // OK


    }
}
