
package dev.xlonia.ostenbotanics.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SakuraFlowerItem extends Item {
	public SakuraFlowerItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
