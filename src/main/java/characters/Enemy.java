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
        int damage = (int) (weapon.getDamage() * playerDefence);
        player.setHp(playerHp - damage);
    }

    public void attack(Character character) {
        int charHp = character.getHp();
        double playerDefence = character.defence();
        int damage = (int) (weapon.getDamage() * playerDefence);
        character.setHp(charHp - damage);
    }

    @Override
    public double defence() {
        return 1.0;
    }
}
