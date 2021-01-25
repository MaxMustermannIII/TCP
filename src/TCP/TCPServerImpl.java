package TCP;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerImpl implements Server {
    public Socket socket = null;

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    @Override
    public Socket getSocket() {
        return socket;
    }

    @Override
    public void acceptConnection(int port) throws IOException {
        ServerSocket srvSocket = new ServerSocket(port);
        Socket socket = srvSocket.accept();
        this.setSocket(socket);
    }

    @Override
    public void closeConnection() throws IOException {
        this.socket.close();
    }
}
