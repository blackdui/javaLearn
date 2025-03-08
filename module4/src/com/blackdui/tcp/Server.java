package com.blackdui.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建socket,并指定端口号
        ServerSocket server = new ServerSocket(8818);
        //等待客户端响应
        Socket socket = server.accept();

        byte[] bytes = new byte[1024];

        InputStream inputStream = socket.getInputStream();

        int len = inputStream.read(bytes);

        System.out.println(new String(bytes, 0 , len));
        //回应消息
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("goodbye!".getBytes());

        //关闭资源
        server.close();
        socket.close();
        inputStream.close();
        outputStream.close();
    }
}
