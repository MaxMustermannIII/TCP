package TCP;

import java.io.IOException;
import java.net.Socket;

public class TCPClientImpl implements Client{
    Socket socket = null;

    @Override
    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void openConnection(String serverName, int port) throws IOException {
        Socket socket = new Socket(serverName, port);
        this.setSocket(socket);
    }

    @Override
    public void closeConnection() throws IOException {
        this.socket.close();
    }
}
