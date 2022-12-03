package io.github.sman;

import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class WeaponParticle {

    private final Material GUI_Item;
    private final ItemStack Item_Stack;
    private final Particle Particle_Effect;
    private static final ArrayList<WeaponParticle> particles = new ArrayList<>();
    private static int MAX_PARTICLES = 27;
    public WeaponParticle(String Name, Material GUI_Item, Particle Particle_Effect) {

        Item_Stack = new ItemStack(GUI_Item);
        ItemMeta item_Meta = Item_Stack.getItemMeta();
        item_Meta.setDisplayName(Name);
        Item_Stack.setItemMeta(item_Meta);

        this.Particle_Effect = Particle_Effect;
        this.GUI_Item = GUI_Item;

    }

    public ItemStack getItem_Stack(){
        return this.Item_Stack;
    }

    public Material getGUI_Item(){
        return this.GUI_Item;
    }

    public Particle getParticle_Effect(){
        return this.Particle_Effect;
    }

    public static ArrayList<WeaponParticle> getParticles(){
        return particles;
    }

    public static void createWeaponParticle(WeaponParticle WP){
        particles.add(WP);
    }

    public static void setMaxParticles(int maxParticles){
        MAX_PARTICLES = maxParticles;
    }

    public static int getMaxParticles(){
        return MAX_PARTICLES;
    }

}
