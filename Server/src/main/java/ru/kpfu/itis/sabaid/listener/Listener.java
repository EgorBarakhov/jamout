package ru.kpfu.itis.sabaid.listener;

import ru.kpfu.itis.sabaid.Server;

public abstract class Listener implements Listenable {

    protected boolean init;
    protected Server server;

    @Override
    public void init(Server server) {
        this.server = server;
        this.init = true;
    }
}
