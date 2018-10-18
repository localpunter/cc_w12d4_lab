package characters;

import characters.Character;

public abstract class Player extends Character {

    private PlayerType type;

    public Player(int hp, int gold, PlayerType type) {
        super(hp, gold);
        this.type = type;
    }

    public PlayerType getType() {
        return type;
    }
}
