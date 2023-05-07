package com.codingchallenges.ccwctool.commands;

import com.codingchallenges.ccwctool.util.FileOperations;
import lombok.NoArgsConstructor;

import java.io.IOException;

@NoArgsConstructor
public class NumberOfCharactersCmd extends Command {
    @Override
    public String apply() {
        try {
            return FileOperations.getNumberOfCharacters(filePath) + " " + filePath;
        } catch (IOException e) {
            return String.format("File %s not found!", filePath);
        }
    }
}
