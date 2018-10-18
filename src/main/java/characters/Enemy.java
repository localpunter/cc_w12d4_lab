package characters;

import characters.Character;

public abstract class Enemy extends Character {

    private EnemyType type;

    public Enemy(int hp, int gold, EnemyType type) {
        super(hp, gold);
        this.type = type;
    }

    public EnemyType getType() {
        return type;
    }
}
