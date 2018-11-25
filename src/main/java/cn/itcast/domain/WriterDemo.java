package cn.itcast.domain;

import java.io.*;

public class WriterDemo {
    /**
     * 字符流:输出流的使用
     * @param args
     */
    public static void main(String[] args) throws Exception {
        //指定文件存储位置及格式
        File file_write = new File("E:\\result.txt");
        //指定字符数组
        byte bt [] = {'1','2','a'};
        //创建写入流
        OutputStream out = new FileOutputStream(file_write);
        //写入到指定的文件中
        out.write(bt,0,bt.length);
        //关闭流
        out.close();
    }
}
