package com.Techforge.Zenplate.Interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class ResourceReader {

    public String readResource(String filename) {

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        InputStream inputStream = classLoader.getResourceAsStream(filename+".jastra");

        if (inputStream==null){
            throw new RuntimeException("File not found : "+filename);
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))){
            return reader.lines().collect(Collectors.joining("\n"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
