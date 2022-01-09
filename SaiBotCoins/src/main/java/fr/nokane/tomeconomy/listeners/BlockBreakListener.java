package fr.nokane.tomeconomy.listeners;

import fr.nokane.tomeconomy.TomEconomy;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;


public class BlockBreakListener implements Listener {


    @EventHandler
    public void OnBLockBreak(BlockBreakEvent e) {
        Player p = e.getPlayer();
        Block block = e.getBlock();

        // Minerais
        if (block.getType() == Material.COPPER_ORE) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "vous avez recus: 1 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 1.0);
            }
        } else if (block.getType() == Material.COAL_ORE) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.DARK_PURPLE + "Vous avez recus: 1.50 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 1.5);
            }
        } else if (block.getType() == Material.IRON_ORE) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.BOLD + "vous avez recus: 5 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 5.0);
            }
        } else if (block.getType() == Material.REDSTONE_ORE) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.RED + "vous aves recus: 5 SaibotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p,5.0);
            }
        } else if (block.getType() == Material.LAPIS_ORE) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Vous avez perdu: 5 SaiBotCoins");
                 TomEconomy.getInstance().economy.depositPlayer(p, 5.0);
            }
        } else if (block.getType() == Material.GOLD_ORE) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Vous avez recus: 15 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 15.0);
            }
        } else if (block.getType() == Material.DIAMOND_ORE) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.BLUE + "Vous avez recus: 50 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 50.0);
            }
        } else if (block.getType() == Material.QUARTZ) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Vous avez recus: 5 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 5.0);
            }
        } else if (block.getType() == Material.NETHER_GOLD_ORE) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Vous avez recus: 5 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 5.0);
            }
        } else if (block.getType() == Material.ANCIENT_DEBRIS) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.LIGHT_PURPLE + "Vous avez recus: 100 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 100.0);
            }
            // Bois
        } else if (block.getType() == Material.OAK_LOG) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Vous avez recus: 5 SaiBotCoisn");
                TomEconomy.getInstance().economy.depositPlayer(p, 5.0);
            }
        } else if (block.getType() == Material.DARK_OAK_LOG) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Vous avez recus: 2 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 2.0);
            }
        } else if (block.getType() == Material.BIRCH_LOG) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Vous avez recus: 5 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 5.0);
            }
        } else if (block.getType() == Material.JUNGLE_LOG) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Vous avez recus: 2 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 2.0);
            }
        } else if (block.getType() == Material.ACACIA_LOG) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Vous avez recus: 7 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 7.0);
            }
        } else if (block.getType() == Material.SPRUCE_LOG) {
            if (TomEconomy.getInstance().setupEconomy()) {
                p.sendMessage(ChatColor.GREEN + "Vous avez recus: 2 SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 2.0);
            }
        }
    }
}

