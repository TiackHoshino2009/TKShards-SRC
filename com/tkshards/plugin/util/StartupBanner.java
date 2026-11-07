package com.tkshards.plugin.util;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

public final class StartupBanner {
   private static final String[] TKSHARDS_ART = new String[]{" ###   #  #  #### #                    #        ", "  #    # #   #    #      ###  # ##     #   ###  ", "  #    ##     ##  ###   #  #  ##     ###   #    ", "  #    # #      # #  #  #  #  #     #  #     #  ", "  #    #  # ####  #  #   #### #      ####  ###  "};

   private StartupBanner() {
   }

   public static void print(Plugin plugin, String version, String author) {
      for(String line : TKSHARDS_ART) {
         Bukkit.getConsoleSender().sendMessage(MessageUtil.color("&b" + line));
      }

      Bukkit.getConsoleSender().sendMessage(MessageUtil.color("&7TKShards &fv" + version + " &7| Author: &f" + author + " &7| Supports Paper & Folia"));
      Bukkit.getConsoleSender().sendMessage(MessageUtil.color("&a" + plugin.getName() + " Enabled!"));
   }
}
