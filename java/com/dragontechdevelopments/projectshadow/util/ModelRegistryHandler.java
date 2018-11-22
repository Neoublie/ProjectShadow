package com.dragontechdevelopments.projectshadow.util;

import com.dragontechdevelopments.projectshadow.init.ProjectShadowBlocks;
import com.dragontechdevelopments.projectshadow.init.ProjectShadowItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
 
@EventBusSubscriber(Side.CLIENT)
public class ModelRegistryHandler {
 
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        registerModel(ProjectShadowItems.BASIC_ITEM);
        registerModel(ProjectShadowItems.INGOT_BRONZE);
        registerModel(ProjectShadowItems.INGOT_COPPER);
        registerModel(ProjectShadowItems.INGOT_LEAD);
        registerModel(ProjectShadowItems.INGOT_MITHRIL);
        registerModel(ProjectShadowItems.INGOT_SILVER);
        registerModel(ProjectShadowItems.INGOT_TIN);

        registerModel(ProjectShadowItems.CHUNK_COPPER);
        registerModel(ProjectShadowItems.CHUNK_LEAD);
        registerModel(ProjectShadowItems.CHUNK_MITHRIL);
        registerModel(ProjectShadowItems.CHUNK_SILVER);
        registerModel(ProjectShadowItems.CHUNK_TIN);
        registerModel(ProjectShadowItems.CHUNK_IRON);
        
        registerModel(ProjectShadowItems.NUGGET_COPPER);
        registerModel(ProjectShadowItems.NUGGET_LEAD);
        registerModel(ProjectShadowItems.NUGGET_MITHRIL);
        registerModel(ProjectShadowItems.NUGGET_SILVER);
        registerModel(ProjectShadowItems.NUGGET_TIN);
        
        
        registerModel(Item.getItemFromBlock(ProjectShadowBlocks.BLOCK_BLACKSMITHFORGE));
        registerModel(Item.getItemFromBlock(ProjectShadowBlocks.BLOCK_BLACKSMITHSMELTER));
        registerModel(Item.getItemFromBlock(ProjectShadowBlocks.ORE_COPPER));
        registerModel(Item.getItemFromBlock(ProjectShadowBlocks.ORE_LEAD));
        registerModel(Item.getItemFromBlock(ProjectShadowBlocks.ORE_MITHRIL));
        registerModel(Item.getItemFromBlock(ProjectShadowBlocks.ORE_SILVER));
        registerModel(Item.getItemFromBlock(ProjectShadowBlocks.ORE_TIN));
    }
 
    private static void registerModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
 
}