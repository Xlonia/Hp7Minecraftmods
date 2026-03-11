
package dev.xlonia.ostenbotanics.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class GwedzramyTniathItem extends RecordItem {
	public GwedzramyTniathItem() {
		super(9, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("osten_botanics:gvedzramytniath")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2220);
	}
}
