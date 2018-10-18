import items.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    @Before
    public void before() {
    }

    @Test
    public void hasDamage() {
        Weapon sword = new Weapon(WeaponType.SWORD);
        assertEquals(20, sword.getDamage());
    }

    @Test
    public void hasSpellDamage() {
        Spell fire = new Spell(SpellType.FIREBALL);
        assertEquals(20, fire.getDamage());
    }

    @Test
    public void hasDefence() {
        Familiar familiar = new Familiar(FamiliarType.OWL);
        assertEquals(0.9, familiar.getDefence(), 0);
    }

    @Test
    public void hasHp() {
        Healing potion = new Healing(HealingType.POTION);
        assertEquals(10, potion.getHp());
    }
}
