
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package dev.xlonia.ostenbotanics.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class OstenBotanicsModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD),

				new ItemStack(OstenBotanicsModBlocks.OSMANTHUS_SAPLING.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD),

				new ItemStack(OstenBotanicsModBlocks.MAPLE_SAPLING.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD),

				new ItemStack(OstenBotanicsModBlocks.GARDENIA.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD),

				new ItemStack(OstenBotanicsModBlocks.LIQUORICE.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD),

				new ItemStack(OstenBotanicsModBlocks.CAMELIA.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD),

				new ItemStack(OstenBotanicsModBlocks.LILY_PINKSZ.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD),

				new ItemStack(OstenBotanicsModBlocks.LILY_WHITESZ.get()), 10, 5, 0.05f));
	}
}
