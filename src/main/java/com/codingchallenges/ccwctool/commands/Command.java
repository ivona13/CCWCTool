package com.codingchallenges.ccwctool.commands;

import lombok.Data;

@Data
public abstract class Command {
    protected String filePath;

    public abstract String apply();
}
