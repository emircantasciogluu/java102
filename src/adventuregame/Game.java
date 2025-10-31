package adventuregame;

import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);
    private String playerName;

    public void start() {
        String line = "══════════════════════════════════════════════════════";
        System.out.println(line);
        System.out.println("                WELCOME TO ADVENTURE GAME!");
        System.out.println(line);
        System.out.print("Please enter your name: ");

        playerName = input.nextLine();
        Player player = new Player(playerName);

        System.out.println("\n" + line);
        System.out.println("Welcome to this dark and foggy island, " + playerName + "!");
        System.out.println("Prepare yourself for the challenges ahead...");
        System.out.println(line + "\n");

        player.chooseChar();

        Location selectedLoc = null;

        while (true) {
            Location[] locList = { new SafeHouse(player), new ToolStore(player), new Cave(player), new Forest(player), new River(player) };

            player.printStats();
            System.out.println();
            System.out.println(line);
            System.out.println("                 AVAILABLE AREAS");
            System.out.println(line);

            System.out.printf("%-6s %-25s%n", "ID", "Area Name", "Rewards");
            System.out.println("------ -------------------------");

            for (Location location : locList) {
                System.out.printf("%-6d %-25s%n", location.getId(), location.getName());
            }

            System.out.println("0 - Quit Game");
            System.out.println(line);
            System.out.print("Choose the area you want to go: ");

            int selectLoc = input.nextInt();
            System.out.println();

            switch (selectLoc) {
                case 0:
                    selectedLoc = null;
                    System.out.println("You have chosen to quit the game.");
                    System.out.println("See you next time, adventurer!");
                    return;
                case 1:
                    selectedLoc = new SafeHouse(player);
                    break;
                case 2:
                    selectedLoc = new ToolStore(player);
                    break;
                case 3:
                    selectedLoc = new Cave(player);
                    break;
                case 4:
                    selectedLoc = new Forest(player);
                    break;
                case 5:
                    selectedLoc = new River(player);
                    break;
                default:
                    System.out.println("Invalid choice. Redirecting to Safe House...");
                    selectedLoc = new SafeHouse(player);
                    break;
            }

            System.out.println("\n" + line);
            System.out.println("You have entered: " + selectedLoc.getName());
            System.out.println(line);

            if (!selectedLoc.onLocation()) {
                System.out.println("\n══════════════════════════════════════════════════════");
                System.out.println("                   GAME OVER");
                System.out.println("══════════════════════════════════════════════════════");
                break;
            }
        }
    }
}