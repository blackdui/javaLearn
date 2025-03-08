package com.blackdui.filestream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.141.1", 8990);
        //创建socket对象
        OutputStream ops = socket.getOutputStream();
        FileInputStream fis = new FileInputStream("1.txt");
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes)) != -1){
            ops.write(bytes,0, len);
        }

        socket.shutdownOutput();
        InputStream ips = socket.getInputStream();
        byte[] bytes1 = new byte[1024];
        int len1 = ips.read(bytes1);
        System.out.println(new String(bytes1, 0, len1));

        //闭流
        socket.close();
        ops.close();
        fis.close();
        ips.close();
    }
}
