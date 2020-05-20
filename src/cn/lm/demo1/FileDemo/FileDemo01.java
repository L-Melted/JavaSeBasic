package cn.lm.demo1.FileDemo;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {
    public static void main(String[] args) throws IOException {
        File file = new File("a.txt");
        //当且仅当具有该名称的文件尚不存在时，创建一个新的空文件
//        if(!file.exists()){
//            file.createNewFile();
//        }
        //在工程下创建出b文件夹
//        File file1 = new File("b");
//        if(!file1.exists()){
//            file1.mkdir();
//        }

        File file2 = new File("c");
        //如果使用mkdir方法，如果父路径不存在，那么子文件夹是创建不了的，所以使用mkdirs方法
//        if(!file2.exists()){
//            file2.mkdirs();
//        }

        System.out.println("程序结束！！！");

        File file3 = new File("b");
        boolean delete = file.delete();
    }


}
