package com.dragontechdevelopments.projectshadow.util;

import com.dragontechdevelopments.projectshadow.ProjectShadowMod;
import com.dragontechdevelopments.projectshadow.block.BlockOreCopper;
import com.dragontechdevelopments.projectshadow.block.BlockOreLead;
import com.dragontechdevelopments.projectshadow.block.BlockOreMithril;
import com.dragontechdevelopments.projectshadow.block.BlockOreSilver;
import com.dragontechdevelopments.projectshadow.block.BlockOreTin;
import com.dragontechdevelopments.projectshadow.block.blacksmithforge.BlockBlacksmithForge;
import com.dragontechdevelopments.projectshadow.block.blacksmithsmelter.BlockBlacksmithSmelter;
import com.dragontechdevelopments.projectshadow.gui.ModGuiHandler;
import com.dragontechdevelopments.projectshadow.init.ProjectShadowBlocks;
import com.dragontechdevelopments.projectshadow.item.ItemBasic;
import com.dragontechdevelopments.projectshadow.item.ItemChunkCopper;
import com.dragontechdevelopments.projectshadow.item.ItemChunkIron;
import com.dragontechdevelopments.projectshadow.item.ItemChunkLead;
import com.dragontechdevelopments.projectshadow.item.ItemChunkMithril;
import com.dragontechdevelopments.projectshadow.item.ItemChunkSilver;
import com.dragontechdevelopments.projectshadow.item.ItemChunkTin;
import com.dragontechdevelopments.projectshadow.item.ItemIngotBronze;
import com.dragontechdevelopments.projectshadow.item.ItemIngotCopper;
import com.dragontechdevelopments.projectshadow.item.ItemIngotLead;
import com.dragontechdevelopments.projectshadow.item.ItemIngotMithril;
import com.dragontechdevelopments.projectshadow.item.ItemIngotSilver;
import com.dragontechdevelopments.projectshadow.item.ItemIngotTin;
import com.dragontechdevelopments.projectshadow.item.ItemNuggetCopper;
import com.dragontechdevelopments.projectshadow.item.ItemNuggetLead;
import com.dragontechdevelopments.projectshadow.item.ItemNuggetMithril;
import com.dragontechdevelopments.projectshadow.item.ItemNuggetSilver;
import com.dragontechdevelopments.projectshadow.item.ItemNuggetTin;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
 
@EventBusSubscriber
public class RegistryHandler {
	
	// INIT BLOCKS
	public static BlockBlacksmithForge blockBlacksmithForge = new BlockBlacksmithForge(Material.IRON, "blockBlacksmithForge", "block_blacksmithforge");
	public static BlockBlacksmithSmelter blockBlacksmithSmelter = new BlockBlacksmithSmelter(Material.IRON, "blockBlacksmithSmelter", "block_blacksmithsmelter");
	public static BlockOreCopper blockOreCopper = new BlockOreCopper(Material.ROCK, "blockOreCopper", "ore_copper");
	public static BlockOreLead blockOreLead = new BlockOreLead(Material.ROCK, "blockOreLead", "ore_lead");
	public static BlockOreMithril blockOreMithril = new BlockOreMithril(Material.ROCK, "blockOreMithril", "ore_mithril");
	public static BlockOreSilver blockOreSilver = new BlockOreSilver(Material.ROCK, "blockOreSilver", "ore_silver");
	public static BlockOreTin blockOreTin = new BlockOreTin(Material.ROCK, "blockOreTin", "ore_tin");
		
	@SubscribeEvent
	public static void registerBlocks(Register<Block> event) {
		final Block[] blocks = {
				blockBlacksmithForge,
				blockBlacksmithSmelter,
				blockOreCopper,
				blockOreLead,
				blockOreMithril,
				blockOreSilver,
				blockOreTin
		};
		event.getRegistry().registerAll(blocks);
		
		TileEntityHandler.registerTileEntities();
	}
 
    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
        final Item[] items = {
				new ItemBasic("itemBasic", "basic_item"),
                new ItemIngotBronze("itemIngotBronze", "ingot_bronze"),
                new ItemIngotCopper("itemIngotCopper", "ingot_copper"),
                new ItemIngotLead("itemIngotLead", "ingot_lead"),
                new ItemIngotMithril("itemIngotMithril", "ingot_mithril"),
                new ItemIngotSilver("itemIngotSilver", "ingot_silver"),
                new ItemIngotTin("itemIngotTin", "ingot_tin"),

                new ItemChunkCopper("itemChunkCopper", "chunk_copper"),
                new ItemChunkLead("itemChunkLead", "chunk_lead"),
                new ItemChunkMithril("itemChunkMithril", "chunk_mithril"),
                new ItemChunkSilver("itemChunkSilver", "chunk_silver"),
                new ItemChunkTin("itemChunkTin", "chunk_tin"),
                new ItemChunkIron("itemChunkIron", "chunk_iron"),
                
                new ItemNuggetCopper("itemNuggetCopper", "nugget_copper"),
                new ItemNuggetLead("itemNuggetLead", "nugget_lead"),
                new ItemNuggetMithril("itemNuggetMithril", "nugget_mithril"),
                new ItemNuggetSilver("itemNuggetSilver", "nugget_silver"),
                new ItemNuggetTin("itemNuggetTin", "nugget_tin")
        };
        
		final Item[] itemBlocks = {
				new ItemBlock(ProjectShadowBlocks.BLOCK_BLACKSMITHFORGE).setRegistryName(ProjectShadowBlocks.BLOCK_BLACKSMITHFORGE.getRegistryName()),
				new ItemBlock(ProjectShadowBlocks.BLOCK_BLACKSMITHSMELTER).setRegistryName(ProjectShadowBlocks.BLOCK_BLACKSMITHSMELTER.getRegistryName()),
				
				new ItemBlock(ProjectShadowBlocks.ORE_COPPER).setRegistryName(ProjectShadowBlocks.ORE_COPPER.getRegistryName()),
				new ItemBlock(ProjectShadowBlocks.ORE_LEAD).setRegistryName(ProjectShadowBlocks.ORE_LEAD.getRegistryName()),
				new ItemBlock(ProjectShadowBlocks.ORE_MITHRIL).setRegistryName(ProjectShadowBlocks.ORE_MITHRIL.getRegistryName()),
				new ItemBlock(ProjectShadowBlocks.ORE_SILVER).setRegistryName(ProjectShadowBlocks.ORE_SILVER.getRegistryName()),
				new ItemBlock(ProjectShadowBlocks.ORE_TIN).setRegistryName(ProjectShadowBlocks.ORE_TIN.getRegistryName())
		};
		
        event.getRegistry().registerAll(items);
		event.getRegistry().registerAll(itemBlocks);
    }
    
    public static void initRegistries(FMLInitializationEvent event) {
    	
    	NetworkRegistry.INSTANCE.registerGuiHandler(ProjectShadowMod.instance, new ModGuiHandler());
    	
    }
    
    
    
    
    
    
 

    
}