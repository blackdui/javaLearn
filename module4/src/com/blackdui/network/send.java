package com.blackdui.network;

import java.io.IOException;
import java.net.*;

public class send {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        byte[] bytes = "good night, shion.".getBytes();

        int port = 19393;

        InetAddress ip = InetAddress.getByName("192.168.141.1");
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, ip, port);

        ds.send(dp);

        ds.close();
    }
}
