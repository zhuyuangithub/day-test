package com.bone.base;

import javax.xml.bind.DataBindingException;
import java.io.File;

/**
 * @author: Zhuyuanyuan47
 * @description
 * @date: 2021/9/9 1:44 PM
 */

public class ExceptionTest {


    public static void main(String[] args) {
        testException(null);
    }


    private static void testException(String str)  {

        if (str  == null) {
            throw new RuntimeException("报错了..");
        }

        try {
            str.split(",");
            int i = 10/0;
        } catch (Exception e) {
            try {
                throw new Exception("报错了..");
            } catch (Exception e1) {
                throw new RuntimeException(e1.getMessage());
            }
        }


    }

}

class MyException extends RuntimeException {

    private String errorCode;

    public MyException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public MyException(String message, Throwable cause, String errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }

}
