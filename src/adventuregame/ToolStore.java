package adventuregame;

public class ToolStore extends NormalLoc {

    public ToolStore(Player player) {
        super(2, player, "Tool Store");
    }

    @Override
    public boolean onLocation() {
        String line = "══════════════════════════════════════════════════════";
        System.out.println("\n" + line);
        System.out.println("🛒  WELCOME TO THE TOOL STORE");
        boolean showMenu = true;
        while(showMenu){
            System.out.println("Here you can buy powerful weapons and protective armors!");
            System.out.println(line);
            System.out.println("1 - Weapons");
            System.out.println("2 - Armors");
            System.out.println("3 - Exit Store");
            System.out.println(line);
            System.out.print("Your choice: ");

            int selectCase = Location.input.nextInt();
            while (selectCase < 1 || selectCase > Weapons.weapons().length) {
                System.out.print("⚠️  Invalid choice, please try again: ");
                selectCase = Location.input.nextInt();
            }

            switch (selectCase) {
                case 1:
                    printWeapons();
                    buyWeapon();
                    break;
                case 2:
                    printArmors();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("\n🚪 Exiting the store... Come again!");
                    showMenu = false;
                    break;
            }
        }

        System.out.println(line + "\n");
        return true;
    }

    public void printWeapons() {
        String line = "───────────────────────────────────────────────";
        System.out.println("\n" + line);
        System.out.println("🔫  AVAILABLE WEAPONS");
        System.out.println(line);
        System.out.printf("%-4s %-15s %-10s %-10s%n", "ID", "Name", "Damage", "Price");
        System.out.println("---- --------------- ---------- ----------");

        for (Weapons w : Weapons.weapons()) {
            System.out.printf("%-4d %-15s %-10d %-10d%n",
                    w.getId(), w.getName(), w.getDamage(), w.getPrice());
        }

        System.out.println("0 - Back");
        System.out.println(line + "\n");
    }

    private void buyWeapon() {
        System.out.print("💰  Select a weapon by its ID to purchase: ");
        int selectWeaponId = Location.input.nextInt();
        while (selectWeaponId < 0 || selectWeaponId > Weapons.weapons().length) {
            System.out.print("⚠️  Invalid choice, please try again: ");
            selectWeaponId = Location.input.nextInt();
        }

        if (selectWeaponId != 0) {
            Weapons selectedWeapon = Weapons.getWeaponObjById(selectWeaponId);
            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("⚠️  Insufficient balance!");
                } else {
                    System.out.println("\n✅  You purchased: " + selectedWeapon.getName());
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("💵  Remaining money: " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setWeapons(selectedWeapon);
                }
            }
        }
    }

    public void printArmors() {
        String line = "───────────────────────────────────────────────";
        System.out.println("\n" + line);
        System.out.println("🛡️  AVAILABLE ARMORS");
        System.out.println(line);
        System.out.printf("%-4s %-15s %-10s %-10s%n", "ID", "Name", "Block", "Price");
        System.out.println("---- --------------- ---------- ----------");

        for (Armory a : Armory.armors()) {
            System.out.printf("%-4d %-15s %-10d %-10d%n",
                    a.getId(), a.getName(), a.getBlock(), a.getPrice());
        }

        System.out.println("0 - Back");
        System.out.println(line + "\n");
    }

    private void buyArmor() {
        System.out.print("💰  Select an armor by its ID to purchase: ");
        int selectArmorId = Location.input.nextInt();
        while (selectArmorId < 0 || selectArmorId > Armory.armors().length) {
            System.out.print("⚠️  Invalid choice, please try again: ");
            selectArmorId = Location.input.nextInt();
        }

        if (selectArmorId != 0) {
            Armory selectedArmory = Armory.getArmoryObjById(selectArmorId);
            if (selectedArmory != null) {
                if (selectedArmory.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("⚠️  Insufficient balance!");
                } else {
                    System.out.println("\n✅  You purchased: " + selectedArmory.getName());
                    int balance = this.getPlayer().getMoney() - selectedArmory.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("💵  Remaining money: " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setArmors(selectedArmory);
                }
            }
        }
    }
}