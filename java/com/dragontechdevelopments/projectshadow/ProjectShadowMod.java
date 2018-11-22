package com.dragontechdevelopments.projectshadow;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

import org.apache.logging.log4j.Logger;

import com.dragontechdevelopments.projectshadow.events.ProjectShadowEventHandler;
import com.dragontechdevelopments.projectshadow.gui.ModGuiHandler;
import com.dragontechdevelopments.projectshadow.proxy.CommonProxy;
import com.dragontechdevelopments.projectshadow.tabs.ProjectShadowBlockTab;
import com.dragontechdevelopments.projectshadow.tabs.ProjectShadowItemTab;
import com.dragontechdevelopments.projectshadow.util.RegistryHandler;
import com.dragontechdevelopments.projectshadow.world.ModWorldGen;

@Mod(modid = ProjectShadowMod.MODID, name = ProjectShadowMod.NAME, version = ProjectShadowMod.VERSION, acceptedMinecraftVersions = ProjectShadowMod.MC_VERSION)
public class ProjectShadowMod
{
    public static final String MODID = "projectshadow";
    public static final String NAME = "Project Shadow v0.1 alpha";
    public static final String VERSION = "0.1a";
    public static final String MC_VERSION = "[1.12.2]";
    
    public static final String CLIENT = "com.dragontechdevelopments.projectshadow.proxy.ClientProxy";
    public static final String SERVER = "com.dragontechdevelopments.projectshadow.proxy.CommonProxy";
 
	public static final CreativeTabs PROJECTSHADOWBLOCK_TAB = new ProjectShadowBlockTab("PSBlockTab");
	public static final CreativeTabs PROJECTSHADOWITEM_TAB = new ProjectShadowItemTab("PSItemTab");
    
	@Mod.Instance(MODID)
	public static ProjectShadowMod instance;
	
	
    @SidedProxy(clientSide = ProjectShadowMod.CLIENT, serverSide = ProjectShadowMod.SERVER)
    public static CommonProxy proxy;

    public static Logger logger;
    
    public static SimpleNetworkWrapper network;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);

    }
 
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	/// Announce Mod is loaded.
    	logger.info("=======0================");
        logger.info(ProjectShadowMod.NAME);
        logger.info("=======================");

        // Handle Custom Events
    	MinecraftForge.EVENT_BUS.register(new ProjectShadowEventHandler());
    	
    	RegistryHandler.initRegistries(event);
        
        //proxy.init(event);
    }
 
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	logger.info("=======================");
        logger.info("=  Finished Loading   =");
        logger.info("=======================");    	
    	
    	//proxy.postInit(event);
    }
}
