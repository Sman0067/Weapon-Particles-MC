package io.github.sman;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ConfigItem {

    private static int MAX_CONFIG_ITEMS;
    private final ItemStack itemStack;
    private final Material GUI_Item;
    private static final ArrayList<ConfigItem> configItems = new ArrayList<>();

    public ConfigItem(Material GUI_Item, String Display_Name){

        this.GUI_Item = GUI_Item;

        itemStack = new ItemStack(GUI_Item);
        ItemMeta itemMeta = itemStack.getItemMeta();
        assert itemMeta != null;
        itemMeta.setDisplayName(Display_Name);
        itemStack.setItemMeta(itemMeta);

    }

    public ItemStack getItemStack(){
        return this.itemStack;
    }

    public Material getGUI_Item(){ return this.GUI_Item; }

    public static ArrayList<ConfigItem> getConfigItems(){
        return configItems;
    }

    public static void createConfigItem(ConfigItem CFG){
        configItems.add(CFG);
    }

    public static void setMaxConfigItems(int MaxConfigItems){
        MAX_CONFIG_ITEMS = MaxConfigItems;
    }

    public static int getMaxConfigItems(){
        return MAX_CONFIG_ITEMS;
    }

}
