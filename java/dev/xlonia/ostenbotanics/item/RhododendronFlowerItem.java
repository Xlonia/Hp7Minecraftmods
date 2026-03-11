
package dev.xlonia.ostenbotanics.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RhododendronFlowerItem extends Item {
	public RhododendronFlowerItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
