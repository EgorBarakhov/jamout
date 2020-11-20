package ru.kpfu.itis.sabaid;

import ru.kpfu.itis.sabaid.exception.ServerException;
import ru.kpfu.itis.sabaid.listener.Listenable;
import ru.kpfu.itis.sabaid.message.Message;

public interface Server {
    public void registerListener(Listenable listener) throws ServerException;
    public void sendMessage(int connectionId, Message message) throws ServerException;
    public void sendBroadcast(Message message) throws ServerException;
    public void start() throws ServerException;
}
