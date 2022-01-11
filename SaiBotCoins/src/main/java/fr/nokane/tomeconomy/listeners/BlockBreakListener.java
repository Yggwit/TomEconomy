package fr.nokane.tomeconomy.listeners;

import fr.nokane.tomeconomy.TomEconomy;
import java.util.HashMap;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;


public class CoinAttribution {
    float Coins;
    ChatColor ChatColor;

    public CoinAttribution (float coins, ChatColor chatColor)
    {
        Coins = coins;
        ChatColor = chatColor;
    }
}

public static Map<Material, CoinAttribution> CoinAttributionDictionnary = 
    new HashMap<Material, CoinAttribution>(){
        { Material.COPPER_ORE,      new CoinAttribution( 1.0,    ChatColor.GREEN )        },
        { Material.COAL_ORE,        new CoinAttribution( 1.5,    ChatColor.DARK_PURPLE )  },
        { Material.IRON_ORE,        new CoinAttribution( 5.0,    ChatColor.BOLD )         },
        { Material.REDSTONE_ORE,    new CoinAttribution( 5.0,    ChatColor.RED )          },
        { Material.LAPIS_ORE,       new CoinAttribution( 5.0,    ChatColor.GREEN )        },
        { Material.GOLD_ORE,        new CoinAttribution( 15.0,   ChatColor.GREEN )        },
        { Material.DIAMOND_ORE,     new CoinAttribution( 50.0,   ChatColor.BLUE )         },
        { Material.QUARTZ,          new CoinAttribution( 5.0,    ChatColor.GREEN )        },
        { Material.NETHER_GOLD_ORE, new CoinAttribution( 5.0,    ChatColor.GREEN )        },
        { Material.ANCIENT_DEBRIS,  new CoinAttribution( 100.0,  ChatColor.LIGHT_PURPLE ) },
        { Material.OAK_LOG,         new CoinAttribution( 5.0,    ChatColor.GREEN )        },
        { Material.DARK_OAK_LOG,    new CoinAttribution( 2.0,    ChatColor.GREEN )        },
        { Material.BIRCH_LOG,       new CoinAttribution( 5.0,    ChatColor.GREEN )        },
        { Material.JUNGLE_LOG,      new CoinAttribution( 2.0,    ChatColor.GREEN )        },
        { Material.ACACIA_LOG,      new CoinAttribution( 7.0,    ChatColor.GREEN )        },
        { Material.SPRUCE_LOG,      new CoinAttribution( 2.0,    ChatColor.GREEN )        } 
    };

public class BlockBreakListener implements Listener {

    @EventHandler
    public void OnBLockBreak(BlockBreakEvent e) {
        if (TomEconomy.getInstance().setupEconomy()) {
            Player p = e.getPlayer();
            Block block = e.getBlock();

            CoinAttribution coinAttribution = CoinAttributionDictionnary.get(block.getType());
            if(coinAttribution != null) {
                p.sendMessage(coinAttribution.ChatColor + "Vouz avez reçu: " + coinAttribution.Coins + " SaiBotCoins");
                TomEconomy.getInstance().economy.depositPlayer(p, 1.0);
            }
        }
    }
}
