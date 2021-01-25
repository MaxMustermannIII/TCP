package TCP;

import java.io.IOException;
import java.net.Socket;

public interface Client {
    /**
     * tries to connect to a server
     * @param serverName server name you want to connect to
     * @param port the port for the socket
     */
    public void openConnection(String serverName, int port) throws IOException;

    /**
     * closes the connection to the server
     */
    public void closeConnection() throws IOException;

    /**
     * gets current Socket
     * @return current Socket
     */
    public Socket getSocket();
}
