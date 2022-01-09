package fr.nokane.tomeconomy.listeners;

import fr.nokane.tomeconomy.TomEconomy;
import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class EntityDeath implements Listener {

    @EventHandler
    public void onEntityDeath(EntityDeathEvent e) {
        Player p = e.getEntity().getKiller();
        Entity entity = e.getEntity();

        //mobs hostiles
        if (entity.getType() == EntityType.SKELETON) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN  +"Tu as recus: 0,4 SaibotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 0.4);
            }
        } else if (entity.getType() == EntityType.BLAZE) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 3 SaiBotCoisn");
                TomEconomy.getInstance().economy.depositPlayer(p, 3.0);
            }
        } else if (entity.getType() == EntityType.CAVE_SPIDER) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 0.70 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 0.7);
            }
        } else if (entity.getType() == EntityType.CREEPER) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 1 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 1.0);
            }
        } else if (entity.getType() == EntityType.ELDER_GUARDIAN) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 200 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 200.0);
            }
        } else if (entity.getType() == EntityType.ENDERMAN) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 2 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 2.0);
            }
        } else if (entity.getType() == EntityType.ENDERMITE) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 0.40 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 0.4);
            }
        } else if (entity.getType() == EntityType.EVOKER) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 2 SaiBotCoin");
                TomEconomy.getInstance().economy.depositPlayer(p, 2.0);
            }
        } else if (entity.getType() == EntityType.GHAST) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 5 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 5.0);
            }
        } else if (entity.getType() == EntityType.GUARDIAN) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 5 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 5.0);
            }
        } else if (entity.getType() == EntityType.HOGLIN) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 5 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 5.0);
            }
        } else if (entity.getType() == EntityType.HUSK) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 0.40 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 0.4);
            }
        } else if (entity.getType() == EntityType.ZOMBIE) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 0.40 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 0.4);
            }
        } else if (entity.getType() == EntityType.MAGMA_CUBE) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 1 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 1.0);
            }
        } else if (entity.getType() == EntityType.PHANTOM) {
            if (TomEconomy.getInstance().setupEconomy()) {
                assert p != null;
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 30 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 4.0);
            }
        } else if (entity.getType() == EntityType.PIGLIN_BRUTE) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 3 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 3.0);
            }
        } else if (entity.getType() == EntityType.PILLAGER) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 3 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 3.0);
            }
        } else if (entity.getType() == EntityType.RAVAGER) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 10 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p,10.0);
            }
        } else if (entity.getType() == EntityType.SHULKER) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 50 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 50.0);
            }
        } else if (entity.getType() == EntityType.SILVERFISH) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 1 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p,1.0);
            }
        } else if (entity.getType() == EntityType.SLIME) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 0.70 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 0.7);
            }
        } else if (entity.getType() == EntityType.SPIDER) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 2 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p,2.0);
            }
        } else if (entity.getType() == EntityType.STRAY) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 3 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 3.0);
            }
        } else if (entity.getType() == EntityType.STRIDER) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 3 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 3.0);
            }
        } else if (entity.getType() == EntityType.VEX) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 10 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 10.0);
            }
        } else if (entity.getType() == EntityType.VINDICATOR) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 20 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 20.0);
            }
        } else if (entity.getType() == EntityType.WITCH) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 10 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 10.0);
            }
        } else if (entity.getType() == EntityType.WITHER_SKELETON) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 10 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 10.0);
            }
        } else if (entity.getType() == EntityType.ZOGLIN) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 10 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 10.0);
            }
        } else if (entity.getType() == EntityType.ZOMBIFIED_PIGLIN) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 10 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 10.0);
            }
        } else if (entity.getType() == EntityType.ENDER_DRAGON) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.AQUA + "Tu as recus: 1000 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 1000.0);
            }
        } else if (entity.getType() == EntityType.WITHER) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.DARK_AQUA + "Tu as recus: 700 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 700.0);
            }

            //Mob Passif
        } else if (entity.getType() == EntityType.BAT) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 0.20 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 0.2);
            }
        } else if (entity.getType() == EntityType.CHICKEN) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 1 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 1.0);
            }
        } else if (entity.getType() == EntityType.TROPICAL_FISH &&
        entity.getType() == EntityType.PUFFERFISH &&
        entity.getType() == EntityType.COD &&
        entity.getType() == EntityType.SALMON) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 1 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 1.0);
            }
        } else if (entity.getType() == EntityType.COW) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 1 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p,1.0);
            }
        } else if (entity.getType() == EntityType.GLOW_SQUID) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 1 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p,1.0);
            }
        } else if (entity.getType() == EntityType.PIG) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 1 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 1.0);
            }
        } else if (entity.getType() == EntityType.RABBIT) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 1 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 1.0);
            }
        } else if (entity.getType() == EntityType.SHEEP) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 1 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p,1.0);
            }
        } else if (entity.getType() == EntityType.SQUID) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Tu as recus: 1 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 1.0);
            }
            // Mobs a ne pas tuer
        } else if (entity.getType() == EntityType.BEE) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.DARK_RED + "Tu as perdu: 1 SaiBotCoins");
                TomEconomy.getInstance().economy.withdrawPlayer(p, 1.0);
            }
        } else if (entity.getType() == EntityType.CAT) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.DARK_RED + "Tu as perdu: 2 SaiBotCoins");
                TomEconomy.getInstance().economy.withdrawPlayer(p,2.0);
            }
        } else if (entity.getType() == EntityType.FOX) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.DARK_RED + "Tu as perdu: 10 SaiBotCoins");
                TomEconomy.getInstance().economy.withdrawPlayer(p, 10.0);
            }
        } else if (entity.getType() == EntityType.HORSE) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.DARK_RED + "Tu as perdu: 200 SaiBotCoins");
                TomEconomy.getInstance().economy.withdrawPlayer(p, 200.0);
            }
        } else if (entity.getType() == EntityType.LLAMA) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.DARK_RED + "Tu as perdu: 10 SaiBotCoins");
                TomEconomy.getInstance().economy.withdrawPlayer(p, 10.0);
            }
        } else if (entity.getType() == EntityType.MULE) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.DARK_RED + "Tu as perdu: 10 SaiBotCoins");
                TomEconomy.getInstance().economy.withdrawPlayer(p, 10.0);
            }
        } else if (entity.getType() == EntityType.OCELOT) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.DARK_RED + "Tu as perdu: 10 SaiBotCoins");
                TomEconomy.getInstance().economy.withdrawPlayer(p, 10.0);
            }
        } else if (entity.getType() == EntityType.WANDERING_TRADER) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.DARK_RED + "Tu as perdu: 20 SaiBotCoins");
                TomEconomy.getInstance().economy.withdrawPlayer(p, 20.0);
            }
        } else if (entity.getType() == EntityType.WOLF) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.DARK_RED + "Tu as perdu: 10 SaiBotCoins");
                TomEconomy.getInstance().economy.withdrawPlayer(p, 10.0);
            }
        } else if (entity.getType() == EntityType.PANDA) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.RED + "Tu as perdu: 1000 SaiBotCoins");
                TomEconomy.getInstance().economy.withdrawPlayer(p, 1000.0);
            }
        } else if (entity.getType() == EntityType.PARROT) {
            if (TomEconomy.getInstance().setupEconomy()){
                p.sendMessage(ChatColor.RED + "Tu as perdu: 100 SaiBotCoins");
                TomEconomy.getInstance().economy.withdrawPlayer(p,100.0);
            }
        } else if (entity.getType() == EntityType.POLAR_BEAR) {
            if (TomEconomy.getInstance().setupEconomy()){
                p.sendMessage(ChatColor.RED + "Tu as perdu: 1000 SaiBotCoins");
                TomEconomy.getInstance().economy.withdrawPlayer(p,1000.0);
            }
        } else if (entity.getType() == EntityType.VILLAGER) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.RED + "Tu as perdu 10000 SaiBotCoins");
                TomEconomy.getInstance().economy.withdrawPlayer(p, 10000.0);
            }
        }
    }
}
