
package dev.xlonia.ostenbotanics.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LilyFlowerWhiteItem extends Item {
	public LilyFlowerWhiteItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
