package characters;

import characters.Character;
import items.Weapon;

public class Enemy extends Character {

    private EnemyType type;
    private Weapon weapon;

    public Enemy(EnemyType type, Weapon weapon) {
        super(type.getHp(), type.getGold());
        this.type = type;
        this.weapon = weapon;
    }

    public EnemyType getType() {
        return type;
    }

    public void attack(Player player) {
        int playerHp = player.getHp();
        double playerDefence = player.defence();
        int damage = weapon.getDamage() * playerDefence;
        player.setHp(playerHp - damage);
    }

    @Override
    public double defence() {
        return 1.0;
    }
}
