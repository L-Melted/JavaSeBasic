package cn.lm.demo1.网络编程;



import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) throws IOException {
        //1.创建客户端对象
        Socket socket = new Socket("127.0.0.1", 10001);
        //2.获取字节输出流对象，发送请求数据
        OutputStream os = socket.getOutputStream();
        os.write("淘宝的官网".getBytes());
        //请求数据发送结束了，要给服务器来一个通知
        socket.shutdownOutput();

        //3.获取字节输入流对象，获取响应数据
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len;
        while ((len = is.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }
        //4.释放资源
        socket.close();


    }


}
