package com.geek.service;


import org.apache.hadoop.ipc.VersionedProtocol;

public interface StudentServiceInterface extends VersionedProtocol {
    public static final long versionID = 1L;

    public String findName(String studentId);
}
