package adventuregame;

import java.util.Random;

public abstract class BattleLoc extends Location {
    private Obstacle obstacle;
    private int award;
    private int maxObstacle;

    public BattleLoc(int id, Player player, String name, Obstacle obstacle, int award, int maxObstacle) {
        super(id, player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;
    }

    @Override
    boolean onLocation() {
        int obsNumber = this.randomObstacleNumber();
        String line = "══════════════════════════════════════════════════════";
        System.out.println();
        System.out.println(line);
        System.out.println("🏞️  You are currently at: " + this.getName());
        System.out.println("⚠️  Be careful! There are " + obsNumber + " " + this.getObstacle().getName() + "(s) lurking around!");
        System.out.println(line);
        System.out.print("Do you want to <F>ight or <B>ack away? → ");
        String selectCase = input.nextLine().trim().toUpperCase();

        if (selectCase.equals("F")) {
            combat(obsNumber);
        } else if (selectCase.equals("B")) {
            System.out.println("🏃 You decided to retreat to safety...");
        } else {
            System.out.println("⚠️  Invalid input. Returning to area selection...");
        }
        return true;
    }

    public int randomObstacleNumber() {
        Random r = new Random();
        return r.nextInt(this.getMaxObstacle()) + 1;
    }

    public boolean combat(int obsNumber) {
        for (int i = 1; i <= obsNumber; i++) {
            this.getObstacle().setHealth(this.getObstacle().getDefHealth());
            System.out.println();
            System.out.println("══════════════════════════════════════════════════════");
            System.out.println("⚔️  Battle " + i + " of " + obsNumber + " begins!");
            System.out.println("══════════════════════════════════════════════════════");

            playerStats();
            obstacleStats();

            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0) {
                System.out.print("Choose your action (<A>ttack / <R>un): ");
                String selectCombat = input.nextLine().trim().toUpperCase();

                if (selectCombat.equals("A")) {
                    System.out.println("\n💥 You attacked!");
                    int newObstacleHealth = this.getObstacle().getHealth() - this.getPlayer().getTotalDamage();
                    this.getObstacle().setHealth(Math.max(newObstacleHealth, 0));
                    afterHit();

                    if (this.getObstacle().getHealth() > 0) {
                        System.out.println("\n" + this.getObstacle().getName() + " counterattacked!");
                        int damageTaken = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmors().getBlock();
                        damageTaken = Math.max(damageTaken, 0);
                        this.getPlayer().setHealth(Math.max(this.getPlayer().getHealth() - damageTaken, 0));
                        System.out.println("💢 Damage Taken: " + damageTaken);
                        afterHit();
                    }
                } else if (selectCombat.equals("R")) {
                    System.out.println("🏃 You escaped the fight!");
                    return true;
                } else {
                    System.out.println("⚠️  Invalid input, please choose again.");
                }
            }

            if (this.getObstacle().getHealth() <= 0) {
                System.out.println("\n✅ You defeated the " + this.getObstacle().getName() + "!");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getAward());
                System.out.println("💰 You earned " + this.getAward() + " coins!");
            } else {
                System.out.println("\n☠️  You were defeated by the " + this.getObstacle().getName() + "...");
                return false;
            }
        }
        return true;
    }

    public void playerStats() {
        String line = "══════════════════════════════════════";
        System.out.println();
        System.out.println(line);
        System.out.println("              PLAYER STATS");
        System.out.println(line);

        System.out.printf("%-16s : %d%n", "Health", this.getPlayer().getHealth());
        System.out.printf("%-16s : %d%n", "Total Damage", this.getPlayer().getTotalDamage());
        System.out.printf("%-16s : %d%n", "Block", this.getPlayer().getBlock());

        if (this.getPlayer().getInventory() != null
                && this.getPlayer().getInventory().getWeapons() != null
                && this.getPlayer().getInventory().getWeapons().getDamage() > 0) {
            System.out.printf("%-16s : %s%n", "Weapon",
                    this.getPlayer().getInventory().getWeapons().getName());
        }

        if (this.getPlayer().getInventory() != null
                && this.getPlayer().getInventory().getArmors() != null
                && this.getPlayer().getInventory().getArmors().getBlock() > 0) {
            System.out.printf("%-16s : %s%n", "Armor",
                    this.getPlayer().getInventory().getArmors().getName());
        }

        System.out.println(line);
    }

    public void obstacleStats() {
        String line = "══════════════════════════════════════";
        System.out.println();
        System.out.println(line);
        System.out.println("               ENEMY STATS");
        System.out.println(line);

        System.out.printf("%-14s : %s%n", "Type", this.getObstacle().getName());
        System.out.printf("%-14s : %d%n", "Health", this.getObstacle().getHealth());
        System.out.printf("%-14s : %d%n", "Damage", this.getObstacle().getDamage());
        System.out.printf("%-14s : %d%n", "Reward", this.getAward());

        System.out.println(line);
    }

    public void afterHit() {
        String line = "────────────────────────────────────────────";
        System.out.println();
        System.out.println(line);
        System.out.println("             ⚔️  BATTLE STATUS");
        System.out.println(line);

        System.out.printf("%-20s : %d%n", "Your Health", this.getPlayer().getHealth());
        System.out.printf("%-20s : %d%n", this.getObstacle().getName() + " Health", this.getObstacle().getHealth());

        System.out.println(line);
    }

    // Getters & Setters
    public Obstacle getObstacle() { return obstacle; }
    public void setObstacle(Obstacle obstacle) { this.obstacle = obstacle; }

    public int getAward() { return award; }
    public void setAward(int award) { this.award = award; }

    public int getMaxObstacle() { return maxObstacle; }
    public void setMaxObstacle(int maxObstacle) { this.maxObstacle = maxObstacle; }
}