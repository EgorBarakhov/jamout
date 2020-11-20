package ru.kpfu.itis.sabaid;

import ru.kpfu.itis.sabaid.exception.ClientException;
import ru.kpfu.itis.sabaid.message.Message;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class SocketClient implements Client {
    protected final InetAddress address;
    protected final int port;
    protected Socket socket;

    public SocketClient(InetAddress address, int port) {
        this.address = address;
        this.port = port;
    }


    @Override
    public void connect() throws ClientException {
        try {
            socket = new Socket(address, port);
        } catch (IOException ex) {
            throw new ClientException("Can't connect.", ex);
        }
    }

    @Override
    public Message sendMessage() throws ClientException {
        return null;
    }

    @Override
    public void destroy() throws ClientException {
        socket = null;
    }
}
