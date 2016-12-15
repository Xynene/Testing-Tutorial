package xynene.tutorialmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import xynene.tutorialmod.item.ModItems;
import xynene.tutorialmod.proxy.CommonProxy;
import xynene.tutorialmod.tab.CreativeTabTutorial;


@Mod(modid = tutorialmod.MODID, version = tutorialmod.VERSION, name = tutorialmod.NAME)
public class tutorialmod {
    public static final String MODID = "tutorialmod";
    public static final String VERSION = "1.0";
    public static final String NAME = "Tutorial Mod";

    @SidedProxy(clientSide = "xynene.tutorialmod.proxy.ClientProxy", serverSide = "xynene.tutorialmod.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static tutorialmod instance;

    public static CreativeTabTutorial tabTutorial;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        tabTutorial = new CreativeTabTutorial(CreativeTabs.getNextID(), "tab_tutorial");
        ModItems.preInit();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }
}
