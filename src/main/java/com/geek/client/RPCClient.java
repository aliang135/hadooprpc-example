package com.geek.client;

import com.geek.server.RPCServer;
import com.geek.service.StudentServiceInterface;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

import java.io.IOException;
import java.net.InetSocketAddress;

public class RPCClient {
    public static void main(String[] args) throws IOException {
        StudentServiceInterface proxy = RPC.getProxy(StudentServiceInterface.class, 123L, new InetSocketAddress("localhost", 7788), new Configuration());
        String studentName = proxy.findName("20210123456789");
        System.out.println("The name is： "+studentName);
    }
}
