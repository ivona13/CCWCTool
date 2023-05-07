package com.codingchallenges.ccwctool.util;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FileOperations {

    public static Integer getNumberOfBytes(String filePath) throws IOException {
        return Files.readAllBytes(Paths.get(filePath)).length;
    }

    public static Integer getNumberOfWords(String filePath) throws FileNotFoundException {
        int wordsCount = 0;
        Scanner scanner = new Scanner(new File(filePath));

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            StringTokenizer tokenizer = new StringTokenizer(line);
            wordsCount += tokenizer.countTokens();
        }
        return wordsCount;
    }

    public static Integer getNumberOfLines(String filePath) throws IOException {
        int linesCount = 0;
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        while (reader.readLine() != null) linesCount++;
        return linesCount;
    }

    public static Integer getNumberOfCharacters(String filePath) throws IOException {
        int charsCount = 0;
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        while (reader.read() != -1) charsCount++;
        return charsCount;
    }
}
