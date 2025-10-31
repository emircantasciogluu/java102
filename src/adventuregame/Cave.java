package adventuregame;

public class Cave extends BattleLoc{
    public Cave(Player player) {
        super(3, player, "🏚️  Cave  |  Enemy: Zombie  |  Damage: 3  |  Reward: 💰 4", new Zombie(), 4, 3);
    }

}
