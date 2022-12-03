package io.github.sman;

import org.bukkit.Material;
import org.bukkit.Particle;

public class WeaponParticleCreator {

    public WeaponParticleCreator(){

        // MAX Values must be a multiple of 9
        WeaponParticle.setMaxParticles(27);
        ConfigItem.setMaxConfigItems(9);

        // Declare ALL Weapon Particles Here

        // FORMAT:
        // new WeaponParticle ( <NAME> , <MATERIAL> , <PARTICLE> ) ;

        WeaponParticle.createWeaponParticle(new WeaponParticle("Smoke Clouds", Material.CAMPFIRE, Particle.SMOKE_LARGE));
        WeaponParticle.createWeaponParticle(new WeaponParticle("Lightning Sparks", Material.LIGHTNING_ROD, Particle.ELECTRIC_SPARK));
        WeaponParticle.createWeaponParticle(new WeaponParticle("Blue Glow Particles", Material.LAPIS_LAZULI, Particle.GLOW));
        WeaponParticle.createWeaponParticle(new WeaponParticle("Dragon's Breath", Material.DRAGON_BREATH, Particle.DRAGON_BREATH));
        WeaponParticle.createWeaponParticle(new WeaponParticle("Bubbles", Material.WATER_BUCKET, Particle.WATER_BUBBLE));
        WeaponParticle.createWeaponParticle(new WeaponParticle("Flames", Material.LAVA_BUCKET, Particle.FLAME));
        WeaponParticle.createWeaponParticle(new WeaponParticle("Souls", Material.SOUL_LANTERN, Particle.SOUL));
        WeaponParticle.createWeaponParticle(new WeaponParticle("Hearts", Material.POPPY, Particle.HEART));

        // Declare ALL Config Items Here

        // FORMAT:
        // new ConfigItem ( <MATERIAL> , <DISPLAY_NAME> ) ;

        ConfigItem.createConfigItem(new ConfigItem(Material.WOODEN_SWORD, "Change Particles for Wooden Weapons"));
        ConfigItem.createConfigItem(new ConfigItem(Material.STONE_SWORD, "Change Particles for Stone Weapons"));
        ConfigItem.createConfigItem(new ConfigItem(Material.IRON_SWORD, "Change Particles for Iron Weapons"));
        ConfigItem.createConfigItem(new ConfigItem(Material.GOLDEN_SWORD, "Change Particles for Gold Weapons"));
        ConfigItem.createConfigItem(new ConfigItem(Material.DIAMOND_SWORD, "Change Particles for Diamond Weapons"));
        ConfigItem.createConfigItem(new ConfigItem(Material.NETHERITE_SWORD, "Change Particles for Netherite Weapons"));
        ConfigItem.createConfigItem(new ConfigItem(Material.BARRIER, "Exit Config Menu"));

    }

}
