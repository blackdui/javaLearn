package com.blackdui.filestream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8990);

        Socket socket = serverSocket.accept();

        InputStream ips = socket.getInputStream();
        String s = UUID.randomUUID().toString();
        String name = s + System.currentTimeMillis();
        FileOutputStream fos = new FileOutputStream(name + ".txt");
        byte[] bytes = new byte[1024];
        int len;
        while ((len = ips.read(bytes) )!= -1){
            fos.write(bytes, 0, len);
        }//接受数据，写到文件中去

        OutputStream ops = socket.getOutputStream();
        byte[] bytes1 = "receive".getBytes();
        ops.write(bytes1);//向客户端发送消息

        //关流
        ips.close();
        ops.close();
        fos.close();
        socket.close();
        serverSocket.close();
    }
}
