
package dev.xlonia.ostenbotanics.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CameliaFlowerItem extends Item {
	public CameliaFlowerItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
