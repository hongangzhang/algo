package com.zhg.java8;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class Lambda01Test {

    private Lambda01 lambda01;

    @BeforeEach
    void setUp() {
        lambda01 = new Lambda01();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getHiddenFile() {
        File[] hiddenFiles = lambda01.getHiddenFile();

        for (File hiddenFile : hiddenFiles) {
            System.out.println(hiddenFile);
        }

        Assertions.assertEquals(4, hiddenFiles.length);
    }

    @Test
    void testGetHiddenFile() {
        File[] hiddenFiles = lambda01.getHiddenFilesLambda();

        for (File hiddenFile : hiddenFiles) {
            System.out.println(hiddenFile);
        }

        Assertions.assertEquals(4, hiddenFiles.length);
    }
}