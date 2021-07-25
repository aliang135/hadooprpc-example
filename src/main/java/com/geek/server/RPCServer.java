package com.geek.server;

import com.geek.service.StudentServiceInterface;
import com.geek.service.impl.StudentServiceImpl;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

import java.io.IOException;

public class RPCServer {
    public static void main(String[] args) throws IOException {
        StudentServiceImpl studentService = new StudentServiceImpl();
        // 创建一个RPC builder
        RPC.Builder builder = new RPC.Builder(new Configuration());

        //指定RPC Server的参数
        builder.setBindAddress("localhost");
        builder.setPort(7788);

        //将自己的程序部署到server上
        builder.setProtocol(StudentServiceInterface.class);
        builder.setInstance(studentService);

        //创建Server
        RPC.Server server = builder.build();

        //启动服务
        server.start();
        System.out.println("server is start");
    }
}
