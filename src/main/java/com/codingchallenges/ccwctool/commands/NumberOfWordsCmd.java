package com.codingchallenges.ccwctool.commands;

import com.codingchallenges.ccwctool.util.FileOperations;
import lombok.NoArgsConstructor;

import java.io.FileNotFoundException;

@NoArgsConstructor
public class NumberOfWordsCmd extends Command {
    @Override
    public String apply() {
        try {
            return FileOperations.getNumberOfWords(filePath) + " " + filePath;
        } catch (FileNotFoundException e) {
            return String.format("File %s not found!", filePath);
        }
    }
}
