package ru.kpfu.itis.sabaid;

import ru.kpfu.itis.sabaid.exception.ClientException;
import ru.kpfu.itis.sabaid.message.Message;

public interface Client {

    public void connect() throws ClientException;

    public Message sendMessage() throws ClientException;

    public void destroy() throws ClientException;
}
