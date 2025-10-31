package adventuregame;

public class Forest extends BattleLoc {
    public Forest(Player player) {
        super(4, player, "🌲  Forest  |  Enemy: Vampire  |  Damage: 4  |  Reward: Reward: 💰 7", new Vampire(), 7, 3);
    }
}