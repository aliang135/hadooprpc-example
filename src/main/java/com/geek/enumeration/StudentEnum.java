package com.geek.enumeration;

public enum StudentEnum {
    STUDENT_MATT("111111111", "Matt"),
    STUDENT_XINXIN("20210123456789", "Xinxin");

    private String studentId;
    private String studentName;

    private StudentEnum(String studentId,String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }

    private String studentId() {
        return this.studentId;
    }

    private String studentName() {
        return this.studentName;
    }

    public static String getStudentName(String studentId) {
        StudentEnum[] studentEnums = values();
        for (StudentEnum studentEnum : studentEnums) {
            if (studentEnum.studentId().equals(studentId)) {
                return studentEnum.studentName();
            }
        }
        return null;
    }
}
