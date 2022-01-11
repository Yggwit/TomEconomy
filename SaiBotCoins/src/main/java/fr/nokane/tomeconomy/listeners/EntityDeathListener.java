package fr.nokane.tomeconomy.listeners;

import fr.nokane.tomeconomy.TomEconomy;
import java.util.HashMap;
import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class CoinAttribution {
    float Coins;
    ChatColor ChatColor;
    boolean IsPositive;

    public CoinAttribution (float coins, ChatColor chatColor, Optional<boolean> isPositive)
    {
        Coins = coins;
        ChatColor = chatColor;
        IsPositive = isPositive.isPresent() ? isPositive.get() : true;
    }

    public string GetMessage(){
        return "Vous avez " + (IsPositive ? "reçu" : "perdu") + coinAttribution.Coins + " SaiBotCoins";
    }
}

public static Map<Entity, CoinAttribution> EntityCoinAttributionDictionnary = 
    new HashMap<Entity, CoinAttribution>(){
        { EntityType.SKELETON,         new CoinAttribution( 0.4,        ChatColor.GREEN,        true) },
        { EntityType.BLAZE,            new CoinAttribution( 3.0,        ChatColor.GREEN,        true) },
        { EntityType.CAVE_SPIDER,      new CoinAttribution( 0.7,        ChatColor.GREEN,        true) },
        { EntityType.CREEPER,          new CoinAttribution( 1.0,        ChatColor.GREEN,        true) },
        { EntityType.ELDER_GUARDIAN,   new CoinAttribution( 200.0,      ChatColor.GREEN,        true) },
        { EntityType.ENDERMAN,         new CoinAttribution( 2.0,        ChatColor.GREEN,        true) },
        { EntityType.ENDERMITE,        new CoinAttribution( 0.4,        ChatColor.GREEN,        true) },
        { EntityType.EVOKER,           new CoinAttribution( 2.0,        ChatColor.GREEN,        true) },
        { EntityType.GHAST,            new CoinAttribution( 5.0,        ChatColor.GREEN,        true) },
        { EntityType.GUARDIAN,         new CoinAttribution( 5.0,        ChatColor.GREEN,        true) },
        { EntityType.HOGLIN,           new CoinAttribution( 5.0,        ChatColor.GREEN,        true) },
        { EntityType.HUSK,             new CoinAttribution( 0.4,        ChatColor.GREEN,        true) },
        { EntityType.ZOMBIE,           new CoinAttribution( 0.4,        ChatColor.GREEN,        true) },
        { EntityType.MAGMA_CUBE,       new CoinAttribution( 1.0,        ChatColor.GREEN,        true) },
        { EntityType.PHANTOM,          new CoinAttribution( 4.0,        ChatColor.GREEN,        true) },
        { EntityType.PIGLIN_BRUTE,     new CoinAttribution( 3.0,        ChatColor.GREEN,        true) },
        { EntityType.PILLAGER,         new CoinAttribution( 3.0,        ChatColor.GREEN,        true) },
        { EntityType.RAVAGER,          new CoinAttribution( 10.0,       ChatColor.GREEN,        true) },
        { EntityType.SHULKER,          new CoinAttribution( 50.0,       ChatColor.GREEN,        true) },
        { EntityType.SILVERFISH,       new CoinAttribution( 1.0,        ChatColor.GREEN,        true) },
        { EntityType.SLIME,            new CoinAttribution( 0.7,        ChatColor.GREEN,        true) },
        { EntityType.SPIDER,           new CoinAttribution( 2.0,        ChatColor.GREEN,        true) },
        { EntityType.STRAY,            new CoinAttribution( 3.0,        ChatColor.GREEN,        true) },
        { EntityType.STRIDER,          new CoinAttribution( 3.0,        ChatColor.GREEN,        true) },
        { EntityType.VEX,              new CoinAttribution( 10.0,       ChatColor.GREEN,        true) },
        { EntityType.VINDICATOR,       new CoinAttribution( 20.0,       ChatColor.GREEN,        true) },
        { EntityType.WITCH,            new CoinAttribution( 10.0,       ChatColor.GREEN,        true) },
        { EntityType.WITHER_SKELETON,  new CoinAttribution( 10.0,       ChatColor.GREEN,        true) },
        { EntityType.ZOGLIN,           new CoinAttribution( 10.0,       ChatColor.GREEN,        true) },
        { EntityType.ZOMBIFIED_PIGLIN, new CoinAttribution( 10.0,       ChatColor.GREEN,        true) },
        { EntityType.ENDER_DRAGON,     new CoinAttribution( 1000.0,     ChatColor.AQUA,         true) },
        { EntityType.WITHER,           new CoinAttribution( 700.0,      ChatColor.DARK_AQUA,    true) },
        { EntityType.BAT,              new CoinAttribution( 0.2,        ChatColor.GREEN,        true) },
        { EntityType.CHICKEN,          new CoinAttribution( 1.0,        ChatColor.GREEN,        true) },
        { EntityType.TROPICAL_FISH,    new CoinAttribution( 1.0,        ChatColor.GREEN,        true) },
        { EntityType.PUFFERFISH,       new CoinAttribution( 1.0,        ChatColor.GREEN,        true) },
        { EntityType.COD,              new CoinAttribution( 1.0,        ChatColor.GREEN,        true) },
        { EntityType.SALMON,           new CoinAttribution( 1.0,        ChatColor.GREEN,        true) },
        { EntityType.COW,              new CoinAttribution( 1.0,        ChatColor.GREEN,        true) },
        { EntityType.GLOW_SQUID,       new CoinAttribution( 1.0,        ChatColor.GREEN,        true) },
        { EntityType.PIG,              new CoinAttribution( 1.0,        ChatColor.GREEN,        true) },
        { EntityType.RABBIT,           new CoinAttribution( 1.0,        ChatColor.GREEN,        true) },
        { EntityType.SHEEP,            new CoinAttribution( 1.0,        ChatColor.GREEN,        true) },
        { EntityType.SQUID,            new CoinAttribution( 1.0,        ChatColor.GREEN,        true) },
        { EntityType.BEE,              new CoinAttribution( 1.0,        ChatColor.DARK_RED,     false) },
        { EntityType.CAT,              new CoinAttribution( 2.0,        ChatColor.DARK_RED,     false) },
        { EntityType.FOX,              new CoinAttribution( 10.0,       ChatColor.DARK_RED,     false) },
        { EntityType.HORSE,            new CoinAttribution( 200.0,      ChatColor.DARK_RED,     false) },
        { EntityType.LLAMA,            new CoinAttribution( 10.0,       ChatColor.DARK_RED,     false) },
        { EntityType.MULE,             new CoinAttribution( 10.0,       ChatColor.DARK_RED,     false) },
        { EntityType.OCELOT,           new CoinAttribution( 10.0,       ChatColor.DARK_RED,     false) },
        { EntityType.WANDERING_TRADER, new CoinAttribution( 20.0,       ChatColor.DARK_RED,     false) },
        { EntityType.WOLF,             new CoinAttribution( 10.0,       ChatColor.DARK_RED,     false) },
        { EntityType.PANDA,            new CoinAttribution( 1000.0,     ChatColor.RED,          false) },
        { EntityType.PARROT,           new CoinAttribution( 100.0,      ChatColor.RED,          false) },
        { EntityType.POLAR_BEAR,       new CoinAttribution( 1000.0,     ChatColor.RED,          false) },
        { EntityType.VILLAGER,         new CoinAttribution( 10000.0,    ChatColor.RED,          false) }
    };

public class EntityDeathListener implements Listener {

    @EventHandler
    public void onEntityDeath(EntityDeathEvent e) {
        if (TomEconomy.getInstance().setupEconomy()) {
            Player p = e.getEntity().getKiller();
            Entity entity = e.getEntity();

            CoinAttribution coinAttribution = MaterialCoinAttributionDictionnary.get(block.getType());

            if(coinAttribution != null) {
                p.sendMessage(coinAttribution.ChatColor + coinAttribution.GetMessage());

                if(coinAttribution.IsPositive)
                    TomEconomy.getInstance().economy.depositPlayer(p, coinAttribution.Coins);
                else
                    TomEconomy.getInstance().economy.withdrawPlayer(p, coinAttribution.Coins);
            }
    }
}
