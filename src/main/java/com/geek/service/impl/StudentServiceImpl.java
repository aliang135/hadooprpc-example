package com.geek.service.impl;

import com.geek.enumeration.StudentEnum;
import com.geek.service.StudentServiceInterface;
import org.apache.hadoop.ipc.ProtocolSignature;

import java.io.IOException;

public class StudentServiceImpl implements StudentServiceInterface {
    @Override
    public String findName(String studentId) {
        return StudentEnum.getStudentName(studentId);
    }

    @Override
    public long getProtocolVersion(String s, long l) throws IOException {
        return StudentServiceInterface.versionID;
    }

    @Override
    public ProtocolSignature getProtocolSignature(String s, long l, int i) throws IOException {
        return null;
    }
}
