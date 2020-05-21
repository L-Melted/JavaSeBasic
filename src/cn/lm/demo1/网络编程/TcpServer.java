package cn.lm.demo1.网络编程;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws IOException {
        //1.创建服务器对象
        ServerSocket serverSocket = new ServerSocket(10001);

        //2.接收请求
        Socket socket = serverSocket.accept();
        System.out.println(socket.getInetAddress());

        //3.获取字节输入流对象，接收请求数据
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len;
        while((len = is.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }

        //4.获取字节输出流对象，发送响应数据
        OutputStream os = socket.getOutputStream();
        os.write("www.taobao.com".getBytes());

        //5.释放资源
        socket.close();
        serverSocket.close();
    }


}
