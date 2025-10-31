package adventuregame;

import java.util.Scanner;

public class Player extends Game{
    private int damage;
    private int health;
    private int money;
    private String name;
    private String charName;
    private Inventory inventory;
    private int block;
    private int defHealth;
    private Scanner input = new Scanner(System.in);

    public Player(String name){
        this.name = name;
        this.inventory = new Inventory();
    }

    public void chooseChar() {
        GameChar[] charList = { new Samurai(), new Archer(), new Knight() };

        String line = "────────────────────────────────────────────";
        System.out.println();
        System.out.println(line);
        System.out.println("                AVAILABLE CHARACTERS          ");
        System.out.println(line);

        System.out.printf("%-4s %-12s %-10s %-10s %-10s%n", "ID", "Character", "Damage", "Health", "Money");
        System.out.println("---- ------------ ---------- ---------- ----------");

        for (GameChar gameChar : charList) {
            System.out.printf("%-4d %-12s %-10d %-10d %-10d%n",
                    gameChar.getId(),
                    gameChar.getName(),
                    gameChar.getDamage(),
                    gameChar.getHealth(),
                    gameChar.getMoney());
        }

        System.out.println(line);
        System.out.print("Please choose your character: ");
        int selectChar = input.nextInt();

        switch (selectChar) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Samurai...");
                initPlayer(new Samurai());
        }

        System.out.println(line);
        System.out.println("You have selected → " + this.getCharName());
//      System.out.println("Damage: " + this.getDamage() + " | Health: " + this.getHealth() + " | Money: " + this.getMoney());
        System.out.println(line);
    }

    public void printStats(){
        System.out.println("\n══════════════════════════════════════════════════════");
        System.out.println("               🧙‍♂️  PLAYER STATS");
        System.out.println("══════════════════════════════════════════════════════");
        System.out.printf("⚔️  Weapon : %-15s%n", this.getInventory().getWeapons().getName());
        System.out.printf("🛡️  Armor  : %-15s%n", this.getInventory().getArmors().getName());
        System.out.printf("💥 Damage  : %-15d%n", this.getTotalDamage());
        System.out.printf("🧱 Block   : %-15d%n", this.getTotalBlock());
        System.out.printf("❤️ Health  : %-15d%n", this.getHealth());
        System.out.printf("💰 Money   : %-15d%n", this.getMoney());
        System.out.println("══════════════════════════════════════════════════════\n");
    }

    public void initPlayer(GameChar gameChar){
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setDefHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
    }

    public int getTotalDamage(){
        return this.damage + getInventory().getWeapons().getDamage();
    }

    public int getDamage(){
        return this.damage ;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getTotalBlock(){
        return this.block + getInventory().getArmors().getBlock();
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getDefHealth() {
        return defHealth;
    }

    public void setDefHealth(int defHealth) {
        this.defHealth = defHealth;
    }
}

