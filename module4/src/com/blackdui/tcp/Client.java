package com.blackdui.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.141.1", 8818);

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("good night, shion.".getBytes());

        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes, 0, len));

        inputStream.close();
        outputStream.close();
        socket.close();
    }
}
