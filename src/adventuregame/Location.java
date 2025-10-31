package adventuregame;

import java.util.Scanner;

public abstract class Location {
    private int getId;
    private Player player;
    private String name;
    public static Scanner input = new Scanner(System.in);

    public Location(int getId, Player player, String name) {
        this.getId = getId;
        this.player = player;
        this.name = name;
    }

    abstract boolean onLocation();

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return getId;
    }

    public void setGetId(int getId) {
        this.getId = getId;
    }
}
