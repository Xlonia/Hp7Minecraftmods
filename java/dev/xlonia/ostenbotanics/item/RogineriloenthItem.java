
package dev.xlonia.ostenbotanics.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class RogineriloenthItem extends RecordItem {
	public RogineriloenthItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("osten_botanics:rogineriloenth")), new Item.Properties().stacksTo(1).rarity(Rarity.COMMON), 3080);
	}
}
