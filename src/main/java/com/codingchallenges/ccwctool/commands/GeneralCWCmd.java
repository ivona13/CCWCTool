package com.codingchallenges.ccwctool.commands;

import com.codingchallenges.ccwctool.util.FileOperations;
import lombok.NoArgsConstructor;

import java.io.IOException;

@NoArgsConstructor
public class GeneralCWCmd extends Command {
    @Override
    public String apply() {
        try {
            return String.format("%d %d %d %s",
                    FileOperations.getNumberOfBytes(filePath),
                    FileOperations.getNumberOfLines(filePath),
                    FileOperations.getNumberOfWords(filePath),
                    filePath
            );
        } catch (IOException e) {
            return String.format("File %s not found!", filePath);
        }
    }
}
