package net.cwjn.ordis.alterant;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class AlterantItem extends Item {

    private int level;
    private int maxLevel;

    public AlterantItem(Rarity r) {
        super(new Properties().fireResistant().rarity(r).stacksTo(64));
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public int getLevel() {
        return level;
    }

}
