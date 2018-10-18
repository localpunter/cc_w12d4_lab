import characters.Enemy;
import characters.EnemyType;
import items.*;
import org.junit.Before;
import org.junit.Test;
import rooms.Room;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RoomTest {

    Room room;
    Enemy orc;
    ILootable loot;
    Weapon sword;
    @Before
    public void before() {
        sword = new Weapon(WeaponType.SWORD);
        orc = new Enemy(EnemyType.ORC, sword);
        loot = new Healing(HealingType.HERB);
        room = new Room(orc, loot);
    }

    @Test
    public void hasLoot() {
        assertNotNull(room.getLoot());
    }

    @Test
    public void hasEnemy() {
        assertEquals(EnemyType.ORC, room.getEnemy().getType());
    }
}
