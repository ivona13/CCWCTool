package com.codingchallenges.ccwctool.commands;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@AllArgsConstructor
@Slf4j
public class CommandFactory {
    static final Map<String, Command> commandsMap = Map.of(
            "-c", new NumberOfBytesCmd(),
            "-l", new NumberOfLinesCmd(),
            "-w", new NumberOfWordsCmd(),
            "-m", new NumberOfCharactersCmd(),
            "", new GeneralCWCmd()
    );

    String input;

    public Command createCommand() {
        String[] stringParts = input.split("\\s+");
        String filePath = stringParts[stringParts.length - 1];

        Command command;

        if (input.startsWith("ccwc")) {
            if (stringParts.length > 2) {
                command = commandsMap.get(stringParts[1]);
            } else {
                // special command ccwc file.txt
                command = commandsMap.get("");
            }
        } else {
            log.error("Command not in supported format!");
            return null;
        }
        command.setFilePath(filePath);
        return command;
    }
}
