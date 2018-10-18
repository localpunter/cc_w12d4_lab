package rooms;

import characters.Enemy;
import items.ILootable;

public class Room {
    private Enemy enemy;
    private ILootable loot;

    public Room(Enemy enemy, ILootable loot) {
        this.enemy = enemy;
        this.loot = loot;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public ILootable getLoot() {
        return loot;
    }
}
