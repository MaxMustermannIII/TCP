package TCP;

import java.io.IOException;
import java.net.Socket;

public interface Server {
    /**
     * accepts a connection from a client
     * @param port the port for the socket
     */
    public void acceptConnection(int port) throws IOException;

    /**
     * closes the connection
     */
    public void closeConnection() throws IOException;

    /**
     * gets the current Socket
     * @return current Socket
     */
    public Socket getSocket();
}
