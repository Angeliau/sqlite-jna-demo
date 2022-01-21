package com.test.jna.sqlite;


import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.test.jna.bean.Image;

public interface SqliteClib extends Library{
    SqliteClib INSTANCE = Native.load("/libSQLITE3JNATEST.so",SqliteClib.class);

    Pointer InitDB(String dbName);
    int CloseDB(Pointer pHandle);
    int AddImage(Pointer pHandle, Image img);
}
