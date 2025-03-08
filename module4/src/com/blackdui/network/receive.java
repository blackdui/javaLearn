package com.blackdui.network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class receive {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(19393);//发送端地址

        byte[] bytes = new byte[1024];

        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        socket.receive(dp);
        //接受数据
        byte[] data = dp.getData();

        int len = dp.getLength();

        InetAddress ip = dp.getAddress();//发送端地址
        int port = dp.getPort();

        System.out.println(new String(bytes, 0, len));
        System.out.println(ip + ":" + port);

        socket.close();


    }
}
