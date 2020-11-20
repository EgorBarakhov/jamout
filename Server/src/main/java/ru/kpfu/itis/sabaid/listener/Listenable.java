package ru.kpfu.itis.sabaid.listener;

import ru.kpfu.itis.sabaid.Server;
import ru.kpfu.itis.sabaid.exception.ListenerException;
import ru.kpfu.itis.sabaid.message.Message;

public interface Listenable {
    public void init(Server server);
    public void handle(int connectionId, Message message) throws ListenerException;
    public int getType();
}
