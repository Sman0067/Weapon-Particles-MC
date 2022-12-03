package io.github.sman;

import org.bukkit.Material;
import org.bukkit.Particle;

public class ParticleSelector {

    private static Particle WoodenWeapon = Particle.SMOKE_LARGE;
    private static Particle StoneWeapon = Particle.ELECTRIC_SPARK;
    private static Particle IronWeapon = Particle.SOUL;
    private static Particle GoldWeapon = Particle.GLOW;
    private static Particle DiamondWeapon = Particle.DRAGON_BREATH;
    private static Particle NetheriteWeapon = Particle.FALLING_LAVA;
    private static Material selectedWeaponConfig;

    public static void setSelectedWeaponConfig(Material newMaterial){
        selectedWeaponConfig = newMaterial;
    }

    public static Material getSelectedWeaponConfig(){
        return selectedWeaponConfig;
    }

    public static void setWeaponParticle(Material weapon, Particle particle){

        switch (weapon){

            case WOODEN_SWORD -> WoodenWeapon = particle;
            case STONE_SWORD -> StoneWeapon = particle;
            case IRON_SWORD -> IronWeapon = particle;
            case GOLDEN_SWORD -> GoldWeapon = particle;
            case DIAMOND_SWORD -> DiamondWeapon = particle;
            case NETHERITE_SWORD -> NetheriteWeapon = particle;

        }

    }

    public static Particle getWeaponParticle(Material weapon){

        switch (weapon){

            case WOODEN_SWORD -> {
                return WoodenWeapon;
            }
            case STONE_SWORD -> {
                return StoneWeapon;
            }
            case IRON_SWORD -> {
                return IronWeapon;
            }
            case GOLDEN_SWORD -> {
                return GoldWeapon;
            }
            case DIAMOND_SWORD -> {
                return DiamondWeapon;
            }
            case NETHERITE_SWORD -> {
                return NetheriteWeapon;
            }
            default -> {
                return null;
            }
        }

    }

}
