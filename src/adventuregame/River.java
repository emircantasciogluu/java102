package adventuregame;

public class River extends BattleLoc {
    public River(Player player) {
        super(5, player, "🌊  River  |  Enemy: Bear  |  Damage: 7  |  Reward: Reward: 💰 12", new Bear(), 12, 2);
    }
}