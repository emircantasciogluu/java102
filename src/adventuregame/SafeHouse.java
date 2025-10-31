package adventuregame;

public class SafeHouse extends NormalLoc {
    public SafeHouse(Player player) {
        super(1, player, "Safe House");
    }

    @Override
    public boolean onLocation() {
        String line = "══════════════════════════════════════════════════════";
        System.out.println();
        System.out.println(line);
        System.out.println("🏠  You’ve entered the Safe House!  🏠");
        System.out.println("This is your sanctuary — no enemies here.");
        System.out.println("✨ Your health has been fully restored! ✨");
        this.getPlayer().setHealth(this.getPlayer().getDefHealth());
        System.out.println(line);
        System.out.println();
        return true;
    }
}