package io.github.sman;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class GUIclick implements Listener {

    @EventHandler
    public void clickEvent(InventoryClickEvent e){

        Player player = (Player) e.getWhoClicked();

        if (e.getCurrentItem() != null){

            if (e.getView().getTitle().equals("Weapon Particles Config")) {

                e.setCancelled(true);

                // If BARRIER is clicked then close Inventory
                if (e.getCurrentItem().getType().equals(Material.BARRIER)) { player.closeInventory(); }

                // Loop through Config Items and determine what was clicked
                for (ConfigItem CFG : ConfigItem.getConfigItems()){

                    if (e.getCurrentItem().getType().equals(CFG.getGUI_Item())){
                        ParticleSelector.setSelectedWeaponConfig(CFG.getGUI_Item());
                        ParticlesGUI.openSelection(player);
                    }

                }

            }

            if (e.getView().getTitle().equals("Choose Particle Effect: ")){

                e.setCancelled(true);

                // If BARRIER is clicked then return to previous menu
                if (e.getCurrentItem().getType().equals(Material.BARRIER)){
                    player.closeInventory();
                    player.performCommand("WPconfig");
                }

                // Loop through Weapon Particles and determine what was clicked
                for (WeaponParticle WP : WeaponParticle.getParticles()){

                    if (e.getCurrentItem().getType().equals(WP.getGUI_Item())){

                        ParticleSelector.setWeaponParticle(ParticleSelector.getSelectedWeaponConfig(), WP.getParticle_Effect());
                        player.closeInventory();
                        player.sendMessage(ChatColor.GOLD + "Weapon Particle Config Updated");
                    }

                }



            }

        }

    }

}
