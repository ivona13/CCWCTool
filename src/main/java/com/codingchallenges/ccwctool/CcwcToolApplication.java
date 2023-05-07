package com.codingchallenges.ccwctool;

import com.codingchallenges.ccwctool.commands.Command;
import com.codingchallenges.ccwctool.commands.CommandFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CcwcToolApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CcwcToolApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("> ");
            input = scanner.nextLine();
            if (input.equals("exit")) break;

            Command cmd = new CommandFactory(input).createCommand();
            String result = cmd.apply();
            System.out.println(result);
        }
    }

}
