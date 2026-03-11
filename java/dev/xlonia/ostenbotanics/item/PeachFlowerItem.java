
package dev.xlonia.ostenbotanics.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PeachFlowerItem extends Item {
	public PeachFlowerItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
