package xynene.tutorialmod.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xynene.tutorialmod.tutorialmod;

/**
 * Created by Skiera on 12/15/2016.
 */
public class ModItems {

    public static Item tutorialItem;
    public static Item tutorialSword;

    public static void preInit(){

        tutorialItem = new itemTutorialItem("tutorial_item");
        tutorialSword = new itemTutorialSword(EnumHelper.addToolMaterial("TUTORIAL", 3, 100,8.0F, 10.0F,30),"tutorial_sword");

        registerItems();

    }

    public static void registerItems() {
        GameRegistry.register(tutorialItem, new ResourceLocation(tutorialmod.MODID, "tutorial_item"));
        GameRegistry.register(tutorialSword, new ResourceLocation(tutorialmod.MODID, "tutorial_sword"));
    }

    public static void registerRenders(){
        registerRender(tutorialItem);
        registerRender(tutorialSword);
    }
    public static void registerRender(Item item) {
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(tutorialmod.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));

    }

}
