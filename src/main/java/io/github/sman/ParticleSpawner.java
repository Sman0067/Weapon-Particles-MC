package io.github.sman;

import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class ParticleSpawner implements Listener {

    @EventHandler
    public void onAttack(EntityDamageByEntityEvent e){

        if (e.getDamager() instanceof Player){

            Player attacker = (Player) e.getDamager();
            Entity victim = e.getEntity();

            switch (attacker.getInventory().getItemInMainHand().getType()) {

                case WOODEN_SWORD, WOODEN_AXE -> attacker.spawnParticle(ParticleSelector.getWeaponParticle(Material.WOODEN_SWORD), victim.getLocation(), 50, 1, 0.5, 1);
                case STONE_SWORD, STONE_AXE -> attacker.spawnParticle(ParticleSelector.getWeaponParticle(Material.STONE_SWORD), victim.getLocation(), 50, 1, 0.5, 1);
                case IRON_SWORD, IRON_AXE -> attacker.spawnParticle(ParticleSelector.getWeaponParticle(Material.IRON_SWORD), victim.getLocation(), 50, 1, 0.5,1);
                case GOLDEN_SWORD, GOLDEN_AXE -> attacker.spawnParticle(ParticleSelector.getWeaponParticle(Material.GOLDEN_SWORD), victim.getLocation(), 50, 1, 0.5,  1);
                case DIAMOND_SWORD, DIAMOND_AXE -> attacker.spawnParticle(ParticleSelector.getWeaponParticle(Material.DIAMOND_SWORD), victim.getLocation(), 50, 1, 0.5, 1);
                case NETHERITE_SWORD, NETHERITE_AXE -> attacker.spawnParticle(ParticleSelector.getWeaponParticle(Material.NETHERITE_SWORD), victim.getLocation(), 50, 1, 0.5, 1);

            }

        }

    }

}
