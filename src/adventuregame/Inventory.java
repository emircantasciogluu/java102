package adventuregame;

public class Inventory {
    private Weapons weapons;
    private Armory armors;

    public Inventory() {
        this.weapons = new Weapons(0, "Punch", 0, 0);
        this.armors = new Armory(0, "Body", 0, 0);
    }

    public Weapons getWeapons() {
        return weapons;
    }

    public void setWeapons(Weapons weapons) {
        this.weapons = weapons;
    }

    public Armory getArmors() {
        return armors;
    }

    public void setArmors(Armory armors) {
        this.armors = armors;
    }
}
