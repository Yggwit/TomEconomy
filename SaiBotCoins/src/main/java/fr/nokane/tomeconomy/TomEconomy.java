package fr.nokane.tomeconomy;

import fr.nokane.tomeconomy.listeners.BlockBreakListener;
import fr.nokane.tomeconomy.listeners.EntityDeath;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.ChatColor;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public final class TomEconomy extends JavaPlugin {

    public Economy economy = null;

    private static TomEconomy instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println(ChatColor.LIGHT_PURPLE + "Le plugin TomEconomy s'est bien demarré !");
        instance = this;
        getServer().getPluginManager().registerEvents(new EntityDeath(), this);
        getServer().getPluginManager().registerEvents(new BlockBreakListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println(ChatColor.RED + "Le Plugin TomEconomy s'est bien arrêté !");
    }

    public static TomEconomy getInstance() {
        return instance;
    }

    public boolean setupEconomy() {
        RegisteredServiceProvider<Economy> eco = getServer().getServicesManager().getRegistration(Economy.class);
        if (eco != null) {
            economy = eco.getProvider();
        }
        return economy != null;
    }
}
