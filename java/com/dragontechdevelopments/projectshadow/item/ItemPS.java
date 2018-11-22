package com.dragontechdevelopments.projectshadow.item;

import com.dragontechdevelopments.projectshadow.ProjectShadowMod;

import net.minecraft.item.Item;

public class ItemPS extends Item {

    public ItemPS(String unlocalizedName, String registryName) {
        setUnlocalizedName(ProjectShadowMod.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(ProjectShadowMod.PROJECTSHADOWITEM_TAB);
    }

}
