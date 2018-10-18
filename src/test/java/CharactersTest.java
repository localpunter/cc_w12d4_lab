import characters.*;
import items.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class CharactersTest {

    Weapon sword;
    Armour steel;
    Warrior knight;
    @Before
    public void before() {
        sword = new Weapon(WeaponType.SWORD);
        steel = new Armour(ArmourType.STEEL);
        knight = new Warrior(WarriorType.KNIGHT, sword, steel);
    }

    @Test
    public void hasGold() {
        assertEquals(25, knight.getGold());
    }

    @Test
    public void hasType() {
        assertEquals(WarriorType.KNIGHT, knight.getType());
    }

    @Test
    public void hasHp() {
        assertEquals(75, knight.getHp());
    }

    @Test
    public void hasWeapon() {
        assertEquals(WeaponType.SWORD, knight.getWeapon().getType());
    }

    @Test
    public void hasArmour() {
        assertEquals(ArmourType.STEEL, knight.getArmour().getType());
    }

    @Test
    public void canEquip() {
        Weapon mace = new Weapon(WeaponType.MACE);
        knight.setWeapon(mace);
        assertEquals(WeaponType.MACE, knight.getWeapon().getType());
    }

    @Test
    public void canAttack() {
        Enemy orc = new Enemy(EnemyType.ORC, sword);
        knight.attack(orc);
        assertEquals(70, orc.getHp());
    }

    @Test
    public void canDefend() {
        Enemy orc = new Enemy(EnemyType.ORC, sword);
        orc.attack(knight);
        assertEquals(61, knight.getHp());
    }

    @Test
    public void canHeal() {
        Healing potion = new Healing(HealingType.POTION);
        Player cleric = new Healer(HealerType.CLERIC, potion);
        cleric.attack(knight);
        assertEquals(85, knight.getHp());
    }
}
