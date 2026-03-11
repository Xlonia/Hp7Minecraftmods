
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.xlonia.ostenbotanics.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import dev.xlonia.ostenbotanics.OstenBotanicsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OstenBotanicsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OstenBotanicsMod.MODID);
	public static final RegistryObject<CreativeModeTab> OBS_FLORI = REGISTRY.register("obs_flori",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.osten_botanics.obs_flori")).icon(() -> new ItemStack(OstenBotanicsModBlocks.RHODODENDRON.get())).displayItems((parameters, tabData) -> {
				tabData.accept(OstenBotanicsModBlocks.OSMANTHUS_SAPLING.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.GARDENIA.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.HIBISCUS.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.RHODODENDRON.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.RAPSEED.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LOTUS.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.CAMELIA.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LILY_PINKSZ.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LILY_WHITESZ.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.JASMINE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LIQUORICE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.REIMUHANA.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.PALEFLORA.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.TSWASJESKANCA.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.QESZWOJCA.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LYCORIS.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> OSTEN_BOTANICS_TAB = REGISTRY.register("osten_botanics_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.osten_botanics.osten_botanics_tab")).icon(() -> new ItemStack(OstenBotanicsModItems.HOW_DID_YOU_FIND_IT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(OstenBotanicsModBlocks.LEAVES_OSMANTHUS.get().asItem());
				tabData.accept(OstenBotanicsModItems.OSMANTHUS_CLUSTER.get());
				tabData.accept(OstenBotanicsModBlocks.OSMANTHUS_SAPLING.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.GARDENIA.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.HIBISCUS.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LEAVES_HIBISCUS.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.RHODODENDRON.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LEAVES_ARMENIACUS.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.ARMENIACUS_SAPLING.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LEAVES_MAGNOLIUS.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.RAPSEED.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LOTUS.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LEAVES_PEAR.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.CAMELIA.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.PEAR_SAPLING.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.MAPLE_SAPLING.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LILY_PINKSZ.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LILY_WHITESZ.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.JASMINE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LIQUORICE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.MAPLE_WOOD.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.MAPLE_LOG.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.MAPLE_PLANKS.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.MAPLE_STAIRS.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.MAPLE_SLAB.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.MAPLE_FENCE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.MAPLE_FENCE_GATE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.MAPLE_PRESSURE_PLATE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.MAPLE_BUTTON.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LEAVES_MAPLE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.GINKGO_WOOD.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.GINKGO_LOG.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.GINKGO_PLANKS.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.GINKGO_LEAVES.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.GINKGO_STAIRS.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.GINKGO_SLAB.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.GINKGO_FENCE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.GINKGO_FENCE_GATE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.GINKGO_PRESSURE_PLATE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.GINKGO_BUTTON.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.APRICOT_WOOD.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.APRICOT_LOG.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.APRICOT_PLANKS.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.APRICOT_LEAVES.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.APRICOT_STAIRS.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.APRICOT_SLAB.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.APRICOT_FENCE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.APRICOT_FENCE_GATE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.APRICOT_PRESSURE_PLATE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.APRICOT_BUTTON.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.PEACH_WOOD.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.PEACH_LOG.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.PEACH_PLANKS.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.PEACH_LEAVES.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.PEACH_STAIRS.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.PEACH_SLAB.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.PEACH_FENCE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.PEACH_FENCE_GATE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.PEACH_PRESSURE_PLATE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.PEACH_BUTTON.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LAUR_WOOD.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LAUR_LOG.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LAUR_PLANKS.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LAUR_LEAVES.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LAUR_STAIRS.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LAUR_SLAB.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LAUR_FENCE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LAUR_FENCE_GATE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LAUR_PRESSURE_PLATE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LAUR_BUTTON.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.FALLEN_MAPLE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.REIMUHANA.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.PALEFLORA.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.TSWASJESKANCA.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.QESZWOJCA.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.MAPLEPILES_0.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.MAPLEPILES_1.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.MAPLEPILES_2.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.FALLEN_MAPLE_0.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.APRICOT_SAPLING.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.GINKGO_SAPLING.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.PEACH_SAPLING.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LYCORIS.get().asItem());
				tabData.accept(OstenBotanicsModItems.ARMENIACUS_FLOWER.get());
				tabData.accept(OstenBotanicsModItems.HIBISCUS_FLOWER.get());
				tabData.accept(OstenBotanicsModItems.CAMELIA_FLOWER.get());
				tabData.accept(OstenBotanicsModItems.APRICOT_FLOWER.get());
				tabData.accept(OstenBotanicsModItems.GARDENIA_FLOWER.get());
				tabData.accept(OstenBotanicsModItems.JASMINE_FLOWER.get());
				tabData.accept(OstenBotanicsModItems.LILY_FLOWER_WHITE.get());
				tabData.accept(OstenBotanicsModItems.LILY_FLOWER_PINK.get());
				tabData.accept(OstenBotanicsModItems.PEACH_FLOWER.get());
				tabData.accept(OstenBotanicsModItems.PEAR_FLOWER.get());
				tabData.accept(OstenBotanicsModItems.REIMUHANA_FLOWER.get());
				tabData.accept(OstenBotanicsModItems.RHODODENDRON_FLOWER.get());
				tabData.accept(OstenBotanicsModItems.TSWASJESKANCA_FLOWER.get());
				tabData.accept(OstenBotanicsModItems.MAGNOLIUS_FLOWER.get());
				tabData.accept(OstenBotanicsModBlocks.LAUR_SAPLING.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.MAGNOLIUS_SAPLING.get().asItem());
				tabData.accept(OstenBotanicsModItems.SAKURA_FLOWER.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> OBS_MATERIAL = REGISTRY.register("obs_material",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.osten_botanics.obs_material")).icon(() -> new ItemStack(OstenBotanicsModItems.HIBISCUS_FLOWER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(OstenBotanicsModItems.OSMANTHUS_CLUSTER.get());
				tabData.accept(OstenBotanicsModItems.ARMENIACUS_FLOWER.get());
				tabData.accept(OstenBotanicsModItems.HIBISCUS_FLOWER.get());
				tabData.accept(OstenBotanicsModItems.CAMELIA_FLOWER.get());
				tabData.accept(OstenBotanicsModItems.APRICOT_FLOWER.get());
				tabData.accept(OstenBotanicsModItems.GARDENIA_FLOWER.get());
				tabData.accept(OstenBotanicsModItems.JASMINE_FLOWER.get());
				tabData.accept(OstenBotanicsModItems.LILY_FLOWER_WHITE.get());
				tabData.accept(OstenBotanicsModItems.LILY_FLOWER_PINK.get());
				tabData.accept(OstenBotanicsModItems.PEACH_FLOWER.get());
				tabData.accept(OstenBotanicsModItems.PEAR_FLOWER.get());
				tabData.accept(OstenBotanicsModItems.REIMUHANA_FLOWER.get());
				tabData.accept(OstenBotanicsModItems.RHODODENDRON_FLOWER.get());
				tabData.accept(OstenBotanicsModItems.TSWASJESKANCA_FLOWER.get());
				tabData.accept(OstenBotanicsModItems.MAGNOLIUS_FLOWER.get());
				tabData.accept(OstenBotanicsModItems.SAKURA_FLOWER.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> OBS_TREES = REGISTRY.register("obs_trees",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.osten_botanics.obs_trees")).icon(() -> new ItemStack(OstenBotanicsModBlocks.PEACH_LEAVES.get())).displayItems((parameters, tabData) -> {
				tabData.accept(OstenBotanicsModBlocks.LEAVES_OSMANTHUS.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.OSMANTHUS_SAPLING.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.HIBISCUS.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LEAVES_HIBISCUS.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LEAVES_ARMENIACUS.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.ARMENIACUS_SAPLING.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LEAVES_MAGNOLIUS.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LEAVES_PEAR.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.PEAR_SAPLING.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.MAPLE_SAPLING.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.MAPLE_WOOD.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.MAPLE_LOG.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.MAPLE_PLANKS.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.MAPLE_STAIRS.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.MAPLE_SLAB.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.MAPLE_FENCE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.MAPLE_FENCE_GATE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.MAPLE_PRESSURE_PLATE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.MAPLE_BUTTON.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LEAVES_MAPLE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.GINKGO_WOOD.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.GINKGO_LOG.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.GINKGO_PLANKS.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.GINKGO_LEAVES.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.GINKGO_STAIRS.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.GINKGO_SLAB.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.GINKGO_FENCE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.GINKGO_FENCE_GATE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.GINKGO_PRESSURE_PLATE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.GINKGO_BUTTON.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.APRICOT_WOOD.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.APRICOT_LOG.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.APRICOT_PLANKS.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.APRICOT_LEAVES.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.APRICOT_STAIRS.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.APRICOT_SLAB.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.APRICOT_FENCE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.APRICOT_FENCE_GATE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.APRICOT_PRESSURE_PLATE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.APRICOT_BUTTON.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.PEACH_WOOD.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.PEACH_LOG.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.PEACH_PLANKS.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.PEACH_LEAVES.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.PEACH_STAIRS.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.PEACH_SLAB.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.PEACH_FENCE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.PEACH_FENCE_GATE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.PEACH_PRESSURE_PLATE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.PEACH_BUTTON.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LAUR_WOOD.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LAUR_LOG.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LAUR_PLANKS.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LAUR_LEAVES.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LAUR_STAIRS.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LAUR_SLAB.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LAUR_FENCE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LAUR_FENCE_GATE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LAUR_PRESSURE_PLATE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LAUR_BUTTON.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.FALLEN_MAPLE.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.MAPLEPILES_0.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.MAPLEPILES_1.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.MAPLEPILES_2.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.FALLEN_MAPLE_0.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.APRICOT_SAPLING.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.GINKGO_SAPLING.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.PEACH_SAPLING.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.LAUR_SAPLING.get().asItem());
				tabData.accept(OstenBotanicsModBlocks.MAGNOLIUS_SAPLING.get().asItem());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

			tabData.accept(OstenBotanicsModItems.GWEDZRAMY_TNIATH.get());
			tabData.accept(OstenBotanicsModItems.ROGINERILOENTH.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {

			tabData.accept(OstenBotanicsModBlocks.HIBISCUS_UTSOMY.get().asItem());

		}
	}
}
