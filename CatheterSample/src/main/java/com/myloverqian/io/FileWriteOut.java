package com.myloverqian.io;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.*;

/**
 * Created by dzw on 2016/1/19.
 */
public class FileWriteOut {
    public void writeOut(String filePath,String result) throws IOException {
        File file = new File(filePath);
        if (!file.exists()) {
            file.createNewFile();
        }
        BufferedWriter bufferedWriter=null;
        try {
            bufferedWriter=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file),"utf-8"));
            bufferedWriter.write(result);
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(bufferedWriter);
        }

    }
}
