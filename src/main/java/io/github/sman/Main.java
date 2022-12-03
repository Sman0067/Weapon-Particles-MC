package io.github.sman;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

    @Override
    public void onEnable(){

        new WeaponParticleCreator();

        getServer().getPluginManager().registerEvents(new ParticleSpawner(), this);
        getServer().getPluginManager().registerEvents(new GUIclick(), this);

        getCommand("WPconfig").setExecutor(new CommandListener());

        getLogger().info("Weapon Particles Plugin has been enabled!");

    }

    @Override
    public void onDisable(){

        getLogger().info("Weapon Particles Plugin has been disabled.");

    }


}