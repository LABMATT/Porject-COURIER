// User propites manger.

import io.socket.client.Socket;

import java.sql.Array;

public class UPM {

    private final Socket socket;

    public UPM(Socket socket) {
        this.socket = socket;
    }

    // Sneds ther server this users basic info
    public void initConnect(String userID,String name)
    {
        socket.emit("userinfo", (Object) new String[]{userID, name});
    }
}
