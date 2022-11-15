package com.zhg.java8;

import java.io.File;
import java.io.FileFilter;

public class Lambda01 {

    public File[] getHiddenFile() {
        File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isHidden();
            }
        });

        return hiddenFiles;
    }

    public File[] getHiddenFilesLambda() {
        return new File(".").listFiles(File::isHidden);
    }

}
