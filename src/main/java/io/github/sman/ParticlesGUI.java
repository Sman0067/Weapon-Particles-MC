package io.github.sman;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ParticlesGUI {

    public static void openConfig(Player player){

        // Create GUI
        Inventory GUI = Bukkit.createInventory(player, 9, "Weapon Particles Config");

        ItemStack[] configMenu = new ItemStack[ConfigItem.getMaxConfigItems()];

        // Add Config Items to GUI
        int i=0;
        for (ConfigItem cfg : ConfigItem.getConfigItems()){

            configMenu[i] = cfg.getItemStack();
            i++;
        }

        GUI.setContents(configMenu);
        // Open GUI
        player.openInventory(GUI);

    }

    public static void openSelection(Player player){

        // Create GUI
        Inventory GUI = Bukkit.createInventory(player, WeaponParticle.getMaxParticles(), "Choose Particle Effect: ");

        // Create Back/Cancel Button
        ConfigItem Barrier = new ConfigItem(Material.BARRIER, "Return to Previous Menu");

        ItemStack[] particleOptions = new ItemStack[WeaponParticle.getMaxParticles()];

        // Adds all Weapon Particles to GUI
        int i=0;
        for (WeaponParticle WP : WeaponParticle.getParticles()){

            particleOptions[i] = WP.getItem_Stack();
            i++;
        }

        // Sets the Last GUI Item to the Back Button
        particleOptions[WeaponParticle.getMaxParticles() - 1] = Barrier.getItemStack();

        // Add Particle Options to GUI
        GUI.setContents(particleOptions);

        // Open GUI
        player.openInventory(GUI);
    }

}
