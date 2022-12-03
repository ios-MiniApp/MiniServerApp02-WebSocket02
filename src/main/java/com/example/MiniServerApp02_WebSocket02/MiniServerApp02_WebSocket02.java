package com.example.MiniServerApp02_WebSocket02;


import org.glassfish.tyrus.server.Server;

public class MiniServerApp02_WebSocket02 {
    //private final HttpServer staticServer;
    private final Server socketServer;

    public MiniServerApp02_WebSocket02() {
        this.socketServer = new Server("localhost", 8081, "/websockets", null, WebSocketDemo.class);
    }

    public void run() {
        try {
            //staticServer.start();
            socketServer.start();
            System.out.println( "Press any key to stop the server...");
            //browse();
            System.in.read();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            //staticServer.shutdown();
            socketServer.stop();
        }
    }

//    public void browse() throws Exception {
//        Object headless = System.getProperties().getOrDefault("java.awt.headless", "false");
//        System.getProperties().put("java.awt.headless", "false");
//        Desktop.getDesktop().browse(new URI("http://localhost:8080/index.html"));
//        System.getProperties().put("java.awt.headless", headless);
//    }

    public static void main(String[] args) {
        var miniServerApp02_WebSocket02 = new MiniServerApp02_WebSocket02();
        miniServerApp02_WebSocket02.run();
    }

}
