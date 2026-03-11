
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.xlonia.ostenbotanics.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import dev.xlonia.ostenbotanics.item.TswasjeskancaFlowerItem;
import dev.xlonia.ostenbotanics.item.SakuraFlowerItem;
import dev.xlonia.ostenbotanics.item.RogineriloenthItem;
import dev.xlonia.ostenbotanics.item.RhododendronFlowerItem;
import dev.xlonia.ostenbotanics.item.ReimuhanaFlowerItem;
import dev.xlonia.ostenbotanics.item.PearFlowerItem;
import dev.xlonia.ostenbotanics.item.PeachFlowerItem;
import dev.xlonia.ostenbotanics.item.OsmanthusClusterItem;
import dev.xlonia.ostenbotanics.item.MagnoliusFlowerItem;
import dev.xlonia.ostenbotanics.item.LilyFlowerWhiteItem;
import dev.xlonia.ostenbotanics.item.LilyFlowerPinkItem;
import dev.xlonia.ostenbotanics.item.JasmineFlowerItem;
import dev.xlonia.ostenbotanics.item.HowDidYouFindItItem;
import dev.xlonia.ostenbotanics.item.HibiscusFlowerItem;
import dev.xlonia.ostenbotanics.item.GwedzramyTniathItem;
import dev.xlonia.ostenbotanics.item.GardeniaFlowerItem;
import dev.xlonia.ostenbotanics.item.CameliaFlowerItem;
import dev.xlonia.ostenbotanics.item.ArmeniacusFlowerItem;
import dev.xlonia.ostenbotanics.item.ApricotFlowerItem;
import dev.xlonia.ostenbotanics.OstenBotanicsMod;

public class OstenBotanicsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OstenBotanicsMod.MODID);
	public static final RegistryObject<Item> GWEDZRAMY_TNIATH = REGISTRY.register("gwedzramy_tniath", () -> new GwedzramyTniathItem());
	public static final RegistryObject<Item> LEAVES_OSMANTHUS = block(OstenBotanicsModBlocks.LEAVES_OSMANTHUS);
	public static final RegistryObject<Item> OSMANTHUS_CLUSTER = REGISTRY.register("osmanthus_cluster", () -> new OsmanthusClusterItem());
	public static final RegistryObject<Item> OSMANTHUS_SAPLING = block(OstenBotanicsModBlocks.OSMANTHUS_SAPLING);
	public static final RegistryObject<Item> GARDENIA = block(OstenBotanicsModBlocks.GARDENIA);
	public static final RegistryObject<Item> HIBISCUS = block(OstenBotanicsModBlocks.HIBISCUS);
	public static final RegistryObject<Item> LEAVES_HIBISCUS = block(OstenBotanicsModBlocks.LEAVES_HIBISCUS);
	public static final RegistryObject<Item> HIBISCUS_UTSOMY = block(OstenBotanicsModBlocks.HIBISCUS_UTSOMY);
	public static final RegistryObject<Item> RHODODENDRON = block(OstenBotanicsModBlocks.RHODODENDRON);
	public static final RegistryObject<Item> LEAVES_ARMENIACUS = block(OstenBotanicsModBlocks.LEAVES_ARMENIACUS);
	public static final RegistryObject<Item> ARMENIACUS_SAPLING = block(OstenBotanicsModBlocks.ARMENIACUS_SAPLING);
	public static final RegistryObject<Item> LEAVES_MAGNOLIUS = block(OstenBotanicsModBlocks.LEAVES_MAGNOLIUS);
	public static final RegistryObject<Item> RAPSEED = block(OstenBotanicsModBlocks.RAPSEED);
	public static final RegistryObject<Item> LOTUS = block(OstenBotanicsModBlocks.LOTUS);
	public static final RegistryObject<Item> LEAVES_PEAR = block(OstenBotanicsModBlocks.LEAVES_PEAR);
	public static final RegistryObject<Item> CAMELIA = block(OstenBotanicsModBlocks.CAMELIA);
	public static final RegistryObject<Item> PEAR_SAPLING = block(OstenBotanicsModBlocks.PEAR_SAPLING);
	public static final RegistryObject<Item> MAPLE_SAPLING = block(OstenBotanicsModBlocks.MAPLE_SAPLING);
	public static final RegistryObject<Item> LILY_PINKSZ = block(OstenBotanicsModBlocks.LILY_PINKSZ);
	public static final RegistryObject<Item> MOPEMOPE = block(OstenBotanicsModBlocks.MOPEMOPE);
	public static final RegistryObject<Item> LILY_WHITESZ = block(OstenBotanicsModBlocks.LILY_WHITESZ);
	public static final RegistryObject<Item> JASMINE = block(OstenBotanicsModBlocks.JASMINE);
	public static final RegistryObject<Item> LIQUORICE = block(OstenBotanicsModBlocks.LIQUORICE);
	public static final RegistryObject<Item> MAPLE_WOOD = block(OstenBotanicsModBlocks.MAPLE_WOOD);
	public static final RegistryObject<Item> MAPLE_LOG = block(OstenBotanicsModBlocks.MAPLE_LOG);
	public static final RegistryObject<Item> MAPLE_PLANKS = block(OstenBotanicsModBlocks.MAPLE_PLANKS);
	public static final RegistryObject<Item> MAPLE_STAIRS = block(OstenBotanicsModBlocks.MAPLE_STAIRS);
	public static final RegistryObject<Item> MAPLE_SLAB = block(OstenBotanicsModBlocks.MAPLE_SLAB);
	public static final RegistryObject<Item> MAPLE_FENCE = block(OstenBotanicsModBlocks.MAPLE_FENCE);
	public static final RegistryObject<Item> MAPLE_FENCE_GATE = block(OstenBotanicsModBlocks.MAPLE_FENCE_GATE);
	public static final RegistryObject<Item> MAPLE_PRESSURE_PLATE = block(OstenBotanicsModBlocks.MAPLE_PRESSURE_PLATE);
	public static final RegistryObject<Item> MAPLE_BUTTON = block(OstenBotanicsModBlocks.MAPLE_BUTTON);
	public static final RegistryObject<Item> LEAVES_MAPLE = block(OstenBotanicsModBlocks.LEAVES_MAPLE);
	public static final RegistryObject<Item> GINKGO_WOOD = block(OstenBotanicsModBlocks.GINKGO_WOOD);
	public static final RegistryObject<Item> GINKGO_LOG = block(OstenBotanicsModBlocks.GINKGO_LOG);
	public static final RegistryObject<Item> GINKGO_PLANKS = block(OstenBotanicsModBlocks.GINKGO_PLANKS);
	public static final RegistryObject<Item> GINKGO_LEAVES = block(OstenBotanicsModBlocks.GINKGO_LEAVES);
	public static final RegistryObject<Item> GINKGO_STAIRS = block(OstenBotanicsModBlocks.GINKGO_STAIRS);
	public static final RegistryObject<Item> GINKGO_SLAB = block(OstenBotanicsModBlocks.GINKGO_SLAB);
	public static final RegistryObject<Item> GINKGO_FENCE = block(OstenBotanicsModBlocks.GINKGO_FENCE);
	public static final RegistryObject<Item> GINKGO_FENCE_GATE = block(OstenBotanicsModBlocks.GINKGO_FENCE_GATE);
	public static final RegistryObject<Item> GINKGO_PRESSURE_PLATE = block(OstenBotanicsModBlocks.GINKGO_PRESSURE_PLATE);
	public static final RegistryObject<Item> GINKGO_BUTTON = block(OstenBotanicsModBlocks.GINKGO_BUTTON);
	public static final RegistryObject<Item> APRICOT_WOOD = block(OstenBotanicsModBlocks.APRICOT_WOOD);
	public static final RegistryObject<Item> APRICOT_LOG = block(OstenBotanicsModBlocks.APRICOT_LOG);
	public static final RegistryObject<Item> APRICOT_PLANKS = block(OstenBotanicsModBlocks.APRICOT_PLANKS);
	public static final RegistryObject<Item> APRICOT_LEAVES = block(OstenBotanicsModBlocks.APRICOT_LEAVES);
	public static final RegistryObject<Item> APRICOT_STAIRS = block(OstenBotanicsModBlocks.APRICOT_STAIRS);
	public static final RegistryObject<Item> APRICOT_SLAB = block(OstenBotanicsModBlocks.APRICOT_SLAB);
	public static final RegistryObject<Item> APRICOT_FENCE = block(OstenBotanicsModBlocks.APRICOT_FENCE);
	public static final RegistryObject<Item> APRICOT_FENCE_GATE = block(OstenBotanicsModBlocks.APRICOT_FENCE_GATE);
	public static final RegistryObject<Item> APRICOT_PRESSURE_PLATE = block(OstenBotanicsModBlocks.APRICOT_PRESSURE_PLATE);
	public static final RegistryObject<Item> APRICOT_BUTTON = block(OstenBotanicsModBlocks.APRICOT_BUTTON);
	public static final RegistryObject<Item> PEACH_WOOD = block(OstenBotanicsModBlocks.PEACH_WOOD);
	public static final RegistryObject<Item> PEACH_LOG = block(OstenBotanicsModBlocks.PEACH_LOG);
	public static final RegistryObject<Item> PEACH_PLANKS = block(OstenBotanicsModBlocks.PEACH_PLANKS);
	public static final RegistryObject<Item> PEACH_LEAVES = block(OstenBotanicsModBlocks.PEACH_LEAVES);
	public static final RegistryObject<Item> PEACH_STAIRS = block(OstenBotanicsModBlocks.PEACH_STAIRS);
	public static final RegistryObject<Item> PEACH_SLAB = block(OstenBotanicsModBlocks.PEACH_SLAB);
	public static final RegistryObject<Item> PEACH_FENCE = block(OstenBotanicsModBlocks.PEACH_FENCE);
	public static final RegistryObject<Item> PEACH_FENCE_GATE = block(OstenBotanicsModBlocks.PEACH_FENCE_GATE);
	public static final RegistryObject<Item> PEACH_PRESSURE_PLATE = block(OstenBotanicsModBlocks.PEACH_PRESSURE_PLATE);
	public static final RegistryObject<Item> PEACH_BUTTON = block(OstenBotanicsModBlocks.PEACH_BUTTON);
	public static final RegistryObject<Item> LAUR_WOOD = block(OstenBotanicsModBlocks.LAUR_WOOD);
	public static final RegistryObject<Item> LAUR_LOG = block(OstenBotanicsModBlocks.LAUR_LOG);
	public static final RegistryObject<Item> LAUR_PLANKS = block(OstenBotanicsModBlocks.LAUR_PLANKS);
	public static final RegistryObject<Item> LAUR_LEAVES = block(OstenBotanicsModBlocks.LAUR_LEAVES);
	public static final RegistryObject<Item> LAUR_STAIRS = block(OstenBotanicsModBlocks.LAUR_STAIRS);
	public static final RegistryObject<Item> LAUR_SLAB = block(OstenBotanicsModBlocks.LAUR_SLAB);
	public static final RegistryObject<Item> LAUR_FENCE = block(OstenBotanicsModBlocks.LAUR_FENCE);
	public static final RegistryObject<Item> LAUR_FENCE_GATE = block(OstenBotanicsModBlocks.LAUR_FENCE_GATE);
	public static final RegistryObject<Item> LAUR_PRESSURE_PLATE = block(OstenBotanicsModBlocks.LAUR_PRESSURE_PLATE);
	public static final RegistryObject<Item> LAUR_BUTTON = block(OstenBotanicsModBlocks.LAUR_BUTTON);
	public static final RegistryObject<Item> FALLEN_MAPLE = block(OstenBotanicsModBlocks.FALLEN_MAPLE);
	public static final RegistryObject<Item> FALLEN_MAPLE_2 = block(OstenBotanicsModBlocks.FALLEN_MAPLE_2);
	public static final RegistryObject<Item> REIMUHANA = block(OstenBotanicsModBlocks.REIMUHANA);
	public static final RegistryObject<Item> PALEFLORA = block(OstenBotanicsModBlocks.PALEFLORA);
	public static final RegistryObject<Item> TSWASJESKANCA = block(OstenBotanicsModBlocks.TSWASJESKANCA);
	public static final RegistryObject<Item> QESZWOJCA = block(OstenBotanicsModBlocks.QESZWOJCA);
	public static final RegistryObject<Item> MAPLEPILES_0 = block(OstenBotanicsModBlocks.MAPLEPILES_0);
	public static final RegistryObject<Item> MAPLEPILES_1 = block(OstenBotanicsModBlocks.MAPLEPILES_1);
	public static final RegistryObject<Item> MAPLEPILES_2 = block(OstenBotanicsModBlocks.MAPLEPILES_2);
	public static final RegistryObject<Item> FALLEN_MAPLE_0 = block(OstenBotanicsModBlocks.FALLEN_MAPLE_0);
	public static final RegistryObject<Item> ROGINERILOENTH = REGISTRY.register("rogineriloenth", () -> new RogineriloenthItem());
	public static final RegistryObject<Item> APRICOT_SAPLING = block(OstenBotanicsModBlocks.APRICOT_SAPLING);
	public static final RegistryObject<Item> GINKGO_SAPLING = block(OstenBotanicsModBlocks.GINKGO_SAPLING);
	public static final RegistryObject<Item> PEACH_SAPLING = block(OstenBotanicsModBlocks.PEACH_SAPLING);
	public static final RegistryObject<Item> LYCORIS = block(OstenBotanicsModBlocks.LYCORIS);
	public static final RegistryObject<Item> ARMENIACUS_FLOWER = REGISTRY.register("armeniacus_flower", () -> new ArmeniacusFlowerItem());
	public static final RegistryObject<Item> HIBISCUS_FLOWER = REGISTRY.register("hibiscus_flower", () -> new HibiscusFlowerItem());
	public static final RegistryObject<Item> CAMELIA_FLOWER = REGISTRY.register("camelia_flower", () -> new CameliaFlowerItem());
	public static final RegistryObject<Item> APRICOT_FLOWER = REGISTRY.register("apricot_flower", () -> new ApricotFlowerItem());
	public static final RegistryObject<Item> GARDENIA_FLOWER = REGISTRY.register("gardenia_flower", () -> new GardeniaFlowerItem());
	public static final RegistryObject<Item> HOW_DID_YOU_FIND_IT = REGISTRY.register("how_did_you_find_it", () -> new HowDidYouFindItItem());
	public static final RegistryObject<Item> JASMINE_FLOWER = REGISTRY.register("jasmine_flower", () -> new JasmineFlowerItem());
	public static final RegistryObject<Item> LILY_FLOWER_WHITE = REGISTRY.register("lily_flower_white", () -> new LilyFlowerWhiteItem());
	public static final RegistryObject<Item> LILY_FLOWER_PINK = REGISTRY.register("lily_flower_pink", () -> new LilyFlowerPinkItem());
	public static final RegistryObject<Item> PEACH_FLOWER = REGISTRY.register("peach_flower", () -> new PeachFlowerItem());
	public static final RegistryObject<Item> PEAR_FLOWER = REGISTRY.register("pear_flower", () -> new PearFlowerItem());
	public static final RegistryObject<Item> REIMUHANA_FLOWER = REGISTRY.register("reimuhana_flower", () -> new ReimuhanaFlowerItem());
	public static final RegistryObject<Item> RHODODENDRON_FLOWER = REGISTRY.register("rhododendron_flower", () -> new RhododendronFlowerItem());
	public static final RegistryObject<Item> TSWASJESKANCA_FLOWER = REGISTRY.register("tswasjeskanca_flower", () -> new TswasjeskancaFlowerItem());
	public static final RegistryObject<Item> MAGNOLIUS_FLOWER = REGISTRY.register("magnolius_flower", () -> new MagnoliusFlowerItem());
	public static final RegistryObject<Item> LAUR_SAPLING = block(OstenBotanicsModBlocks.LAUR_SAPLING);
	public static final RegistryObject<Item> MAGNOLIUS_SAPLING = block(OstenBotanicsModBlocks.MAGNOLIUS_SAPLING);
	public static final RegistryObject<Item> SAKURA_FLOWER = REGISTRY.register("sakura_flower", () -> new SakuraFlowerItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
